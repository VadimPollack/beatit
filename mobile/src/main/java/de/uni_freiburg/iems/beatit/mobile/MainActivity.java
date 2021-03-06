package de.uni_freiburg.iems.beatit.mobile;

import android.Manifest;
import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Environment;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.wearable.CapabilityClient;
import com.google.android.gms.wearable.CapabilityInfo;
import com.google.android.gms.wearable.DataClient;
import com.google.android.gms.wearable.DataEvent;
import com.google.android.gms.wearable.DataEventBuffer;
import com.google.android.gms.wearable.DataItem;
import com.google.android.gms.wearable.DataMap;
import com.google.android.gms.wearable.DataMapItem;
import com.google.android.gms.wearable.MessageClient;
import com.google.android.gms.wearable.MessageEvent;
import com.google.android.gms.wearable.PutDataMapRequest;
import com.google.android.gms.wearable.PutDataRequest;
import com.google.android.gms.wearable.Wearable;

import java.io.File;
import java.text.ParseException;
import java.util.Date;
import java.util.LinkedList;
import java.util.Scanner;

import de.uni_freiburg.iems.beatit.DiaryDataManager;
import de.uni_freiburg.iems.beatit.DiaryRecord;

public class MainActivity extends AppCompatActivity implements
        DataClient.OnDataChangedListener,
        MessageClient.OnMessageReceivedListener,
        CapabilityClient.OnCapabilityChangedListener {

    LinkedList<String> SmokeList;

    private DataClient mDataclient;
    private static final int REQUEST_EXTERNAL_STORAGE = 1;
    private static SyncDataAsyncTask task;
    private Context context;
    File file;
    private static String[] PERMISSIONS_STORAGE = {
            Manifest.permission.READ_EXTERNAL_STORAGE,
            Manifest.permission.WRITE_EXTERNAL_STORAGE
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        String dirName = "SmkFiles";
        String fileName = "diary.txt";
        context = getApplicationContext();
        File dir = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS), dirName);


        mDataclient = Wearable.getDataClient(this);
        mDataclient.addListener(this);

        Log.v("Connect", "Constructor");

        if (!dir.exists()) {
            dir.mkdirs();
        }
        file = new File(dir, fileName);
        SmokeList = new LinkedList<>();
        try {
            Scanner s = new Scanner(file);

            while (s.hasNext()) {
                SmokeList.add(s.nextLine());
            }
            s.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        final Fragment startFragment = DiaryView.newInstance();
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragment_container, startFragment)
                .commit();


/*
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(view -> {

            DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm");
            dateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
            Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
            String currentTime = dateFormat.format(cal.getTime());
            SmokeList.push(currentTime);

            Snackbar.make(view, "Added: \"" + currentTime + "\"" , Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show();

            // todo need to be moved to the right place
            sendData();
            verifyStoragePermissions(this);
            //write file
            if(isExternalStorageWritable())
            {
                FileOutputStream outputStream;
                try {
                    file.createNewFile();
                    outputStream = new FileOutputStream(file,true);
                    outputStream.write((currentTime + "\n").getBytes());
                    outputStream.close();
                    Log.v("INFO", file.getAbsolutePath());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        */
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_event_diary, menu);
        //sendData();
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        if (id == R.id.action_sync) {
            sendData(DiaryDataManager.getInstance(context));
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    /* Checks if external storage is available for read and write */
    public boolean isExternalStorageWritable() {
        String state = Environment.getExternalStorageState();
        if (Environment.MEDIA_MOUNTED.equals(state)) {
            return true;
        }
        return false;
    }

    /**
     * Checks if the app has permission to write to device storage
     * <p>
     * If the app does not has permission then the user will be prompted to grant permissions
     *
     * @param activity
     */
    public static void verifyStoragePermissions(Activity activity) {
        // Check if we have write permission
        int permission = ActivityCompat.checkSelfPermission(activity, Manifest.permission.WRITE_EXTERNAL_STORAGE);

        if (permission != PackageManager.PERMISSION_GRANTED) {
            // We don't have permission so prompt the user
            ActivityCompat.requestPermissions(
                    activity,
                    PERMISSIONS_STORAGE,
                    REQUEST_EXTERNAL_STORAGE
            );
        }
    }

    @Override
    public void onDataChanged(@NonNull DataEventBuffer dataEventBuffer) {
        final String DURATION_KEY = "com.example.duration.record";
        final String RECORDID_KEY = "com.example.recordId.record";
        final String TIMEZONE_KEY = "com.example.timeZone.record";
        final String STARTDAT_KEY = "com.example.startDateAndTime.record";
        final String LABEL_KEY = "com.example.userLabel.record";
        final String RECORD_KEY = "com.example.record.record";


        Log.v("Mobile", "DataChanged");
        for (DataEvent event : dataEventBuffer) {
            if (event.getType() == DataEvent.TYPE_CHANGED) {
                // DataItem changed
                DataItem item = event.getDataItem();
                DataMapItem dataMapItem = DataMapItem.fromDataItem(event.getDataItem());
                if (item.getUri().getPath().compareTo("/recordWear") == 0) {
                    final int duration;
                    final String recordId;
                    final String timeZone;
                    final String startDateAndTime;
                    final String userLabel;
                    Log.v("Mobile", "DataReceived");
                    DataMap dataMap = dataMapItem.getDataMap().getDataMap(RECORD_KEY);
                    duration = dataMap.getInt(DURATION_KEY);
                    recordId = dataMap.getString(RECORDID_KEY);
                    timeZone = dataMap.getString(TIMEZONE_KEY);
                    startDateAndTime = dataMap.getString(STARTDAT_KEY);
                    userLabel = dataMap.getString(LABEL_KEY);
                    Log.v("Mobile", "DataReceived");
                    SmokeList.push(startDateAndTime);

                    android.icu.text.SimpleDateFormat format = new android.icu.text.SimpleDateFormat("dd-MM-yy HH':'mm"); //new SimpleDateFormat("ddd MMM dd HH':'mm':'ss 'GTM+01:00' yy");
                    final Date date;
                    Date date1;
                    try {
                        date1 = format.parse(startDateAndTime);
                    } catch (ParseException e) {
                        Log.v("Connect", e.toString());
                        date1 = android.icu.util.Calendar.getInstance().getTime();
                    }
                    // need to be add to the Diary
                    date = date1;
                    final DiaryRecord.Label label;
                    if (userLabel.equals(DiaryRecord.Label.SMOKING.toString())) {
                        label = DiaryRecord.Label.SMOKING;
                    } else if (userLabel.equals(DiaryRecord.Label.NOT_SMOKING.toString())) {
                        label = DiaryRecord.Label.NOT_SMOKING;
                    } else {
                        label = DiaryRecord.Label.UNLABELED;
                    }

                    AsyncTask.execute(new Runnable() {
                        @Override
                        public void run() {
                            try {
                                DiaryDataManager.getInstance(context).insert(new DiaryRecord(recordId, DiaryRecord.Source.USER, label, date, timeZone, new Integer(duration)));
                            } catch (Exception e) {
                                Log.v("Connect", e.toString());
                            }
                        }
                    });


                } else if (event.getType() == DataEvent.TYPE_DELETED) {
                    // DataItem deleted
                }
            }
        }
    }

    public void sendData(DiaryDataManager mDatamanager) {
        task = new SyncDataAsyncTask(mDatamanager);
        task.execute();
    }

    private class SyncDataAsyncTask extends AsyncTask<DiaryRecord, Void, Void> {
        private DiaryDataManager mDatamanager;

        private SyncDataAsyncTask(DiaryDataManager mDatamanager) {
            this.mDatamanager = mDatamanager;
        }

        @Override
        protected Void doInBackground(DiaryRecord... diaryRecords) {
            final String DURATION_KEY = "com.example.duration.record";
            final String RECORDID_KEY = "com.example.recordId.record";
            final String TIMEZONE_KEY = "com.example.timeZone.record";
            final String STARTDAT_KEY = "com.example.startDateAndTime.record";
            final String LABEL_KEY = "com.example.userLabel.record";
            final String RECORD_KEY = "com.example.record.record";
            //final String COUNT_KEY = "com.example.key.count";

            Log.v("Connect", "SendData");

            PutDataMapRequest putDataMapReq = PutDataMapRequest.create("/recordMobile");
            try {
                for (DiaryRecord mRecord : mDatamanager.getDiarySync()) {
                    Thread.sleep(100);
                    DataMap map = new DataMap();
                    map.putInt(DURATION_KEY, mRecord.duration);
                    map.putString(RECORDID_KEY, mRecord.recordId);
                    map.putString(TIMEZONE_KEY, mRecord.timeZone);
                    android.icu.text.SimpleDateFormat format = new android.icu.text.SimpleDateFormat("dd-MM-yy HH':'mm");
                    map.putString(STARTDAT_KEY, format.format(mRecord.startDateAndTime));
                    map.putString(LABEL_KEY, mRecord.userLabel.toString());
                    putDataMapReq.getDataMap().putDataMap(RECORD_KEY, map);
                    PutDataRequest putDataReq = putDataMapReq.asPutDataRequest();
                    putDataReq.setUrgent();
                    Task<DataItem> putDataTask = Wearable.getDataClient(context).putDataItem(putDataReq);
                    putDataTask.addOnSuccessListener(

                            new OnSuccessListener<DataItem>() {
                                @Override
                                public void onSuccess(DataItem dataItem) {
                                    Log.v("Connection", "DataSend");
                                }
                            });

                }
            } catch (Exception e) {
                Log.v("Connection", e.toString());
            }
            return null;
        }
    }

    @Override
    public void onCapabilityChanged(@NonNull CapabilityInfo capabilityInfo) {

    }

    @Override
    public void onMessageReceived(@NonNull MessageEvent messageEvent) {

    }
}