package de.uni_freiburg.iems.beatit;

import android.Manifest;
import android.app.Activity;
import android.arch.lifecycle.LiveData;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Environment;
import android.provider.SyncStateContract;
import android.support.annotation.NonNull;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
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
import java.io.FileOutputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.LinkedList;
import java.util.Calendar;
import java.util.Scanner;
import java.util.TimeZone;



public class EventDiary extends AppCompatActivity implements
        DataClient.OnDataChangedListener,
        MessageClient.OnMessageReceivedListener,
        CapabilityClient.OnCapabilityChangedListener{

    LinkedList<String> SmokeList;

    private DataClient mDataclient;
    private static final int REQUEST_EXTERNAL_STORAGE = 1;
    File file;
    private static String[] PERMISSIONS_STORAGE = {
            Manifest.permission.READ_EXTERNAL_STORAGE,
            Manifest.permission.WRITE_EXTERNAL_STORAGE
    };

   //private LiveData<DiaryRecord> mRecord;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_diary);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        String dirName = "SmkFiles";
        String fileName = "diary.txt";
        File dir = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS), dirName);


        mDataclient = Wearable.getDataClient(this);
        mDataclient.addListener(this);

        Log.v("Connect","Constructor");

        if(!dir.exists()){ dir.mkdirs();}
        file = new File(dir, fileName);
        SmokeList = new LinkedList<>();
        try{
            Scanner s = new Scanner(file);

            while (s.hasNext()){
                SmokeList.add(s.nextLine());
            }
            s.close();
        }
        catch(Exception e){ e.printStackTrace();}


        RecyclerView rv = (RecyclerView) findViewById(R.id.smokeList);
        rv.setLayoutManager(new LinearLayoutManager(this));
        MyRecyclerViewAdapter adapter = new MyRecyclerViewAdapter(this, SmokeList);
        rv.setAdapter(adapter);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(view -> {

            DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm");
            dateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
            Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
            String currentTime = dateFormat.format(cal.getTime());
            SmokeList.push(currentTime);

            Snackbar.make(view, "Added: \"" + currentTime + "\"" , Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show();
            adapter.notifyDataSetChanged();
            // need to be moved to the right place
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
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_event_diary, menu);
        sendData();
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
        sendData();
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
     *
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

        int duration;
        String recordId;
        String timeZone;
        String startDateAndTime;
        String userLabel;

        Log.v("Mobile", "DataChanged");
        for (DataEvent event : dataEventBuffer) {
            if (event.getType() == DataEvent.TYPE_CHANGED) {
                // DataItem changed
                DataItem item = event.getDataItem();
                DataMapItem dataMapItem = DataMapItem.fromDataItem(event.getDataItem());
                if (item.getUri().getPath().compareTo("/recordWear") == 0) {
                    Log.v("Mobile", "DataReceived");
                    DataMap dataMap = dataMapItem.getDataMap().getDataMap(RECORD_KEY);
                    duration = dataMap.getInt(DURATION_KEY);
                    recordId = dataMap.getString(RECORDID_KEY);
                    timeZone = dataMap.getString(TIMEZONE_KEY);
                    startDateAndTime = dataMap.getString(STARTDAT_KEY);
                    userLabel = dataMap.getString(LABEL_KEY);
                    Log.v("Mobile", "DataReceived");
                    SmokeList.push(startDateAndTime);


                    verifyStoragePermissions(this);
                    if (isExternalStorageWritable()) {
                        FileOutputStream outputStream;
                        try {
                            file.createNewFile();
                            outputStream = new FileOutputStream(file, true);
                            outputStream.write((startDateAndTime + "\n").getBytes());
                            outputStream.close();
                            Log.v("INFO", file.getAbsolutePath());
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }

                } else if (event.getType() == DataEvent.TYPE_DELETED) {
                    // DataItem deleted
                }
            }
        }
    }

    public void sendData() {

        final String DURATION_KEY = "com.example.duration.record";
        final String RECORDID_KEY = "com.example.recordId.record";
        final String TIMEZONE_KEY = "com.example.timeZone.record";
        final String STARTDAT_KEY = "com.example.startDateAndTime.record";
        final String LABEL_KEY = "com.example.userLabel.record";
        final String RECORD_KEY = "com.example.record.record";

        PutDataMapRequest putDataMapReq = PutDataMapRequest.create("/recordMobile");
        for (String startDateAndTime : SmokeList) {
            DataMap map = new DataMap();
            map.putInt(DURATION_KEY, 3);
            map.putString(RECORDID_KEY, "mobile");
            map.putString(TIMEZONE_KEY, TimeZone.getDefault().getID());
            map.putString(STARTDAT_KEY, startDateAndTime);
            map.putString(LABEL_KEY, "smoking");
            putDataMapReq.getDataMap().putDataMap(RECORD_KEY, map);
            PutDataRequest putDataReq = putDataMapReq.asPutDataRequest();
            Task<DataItem> putDataTask = Wearable.getDataClient(this).putDataItem(putDataReq);

        putDataTask.addOnSuccessListener(

                new OnSuccessListener<DataItem>() {
                    @Override
                    public void onSuccess(DataItem dataItem) {
                        Log.v("Mobile", "DataSend");
                    }
                });
        }
        Log.v("Mobile", "DataSend");
    }

    @Override
    public void onCapabilityChanged(@NonNull CapabilityInfo capabilityInfo) {

    }

    @Override
    public void onMessageReceived(@NonNull MessageEvent messageEvent) {

    }
}