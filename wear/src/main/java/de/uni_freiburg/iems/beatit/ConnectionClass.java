package de.uni_freiburg.iems.beatit;

import android.app.Application;
import android.app.Notification;
import android.app.PendingIntent;
import android.arch.lifecycle.LiveData;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.icu.text.DateFormat;
import android.icu.text.SimpleDateFormat;
import android.os.AsyncTask;
import android.support.annotation.NonNull;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.NotificationManagerCompat;
import android.support.v4.content.ContextCompat;
import android.util.Log;

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

import java.util.Date;
import java.util.List;
import java.util.Locale;

import de.uni_freiburg.iems.beatit.notifications.NotificationUtil;
import de.uni_freiburg.iems.beatit.notifications.SmokeEventDetectedIntentService;
//import weka.core.pmml.jaxbbindings.True;


public class ConnectionClass extends BroadcastReceiver implements
        DataClient.OnDataChangedListener,
        MessageClient.OnMessageReceivedListener,
        CapabilityClient.OnCapabilityChangedListener {

    private Application context;
    private static SyncDataAsyncTask task;


    public ConnectionClass(Application context) {
        this.context = context;
        Wearable.getDataClient(context).addListener(this);
    }

    int count = 0;
    public void sendData(DiaryDataManager mDatamanager) {
        task =  new SyncDataAsyncTask(mDatamanager);
        task.execute();
    }

    @Override
    public void onReceive(Context context, Intent intent) {

        Log.v("Intent", intent.getAction().toString());
        String StartTime = intent.getStringExtra("StartTime");
        String StopTime = intent.getStringExtra("StopTime");
        String SenderInfo = intent.getStringExtra("SenderInfo");
        DiaryRecord record = new DiaryRecord(new Date(), "Hallo", 5);
        if ( SenderInfo.equals("Team2_smoking") ) {
            showOnSmokingEventDetectedNotification(record);
        }
        Log.v("StartTime", StartTime);
        Log.v("StopTime", StopTime);
        Log.v("SenderInfo", SenderInfo);

    }

    private class SyncDataAsyncTask extends AsyncTask<DiaryRecord, Void, Void> {
        private DiaryDataManager mDatamanager;

        private SyncDataAsyncTask( DiaryDataManager mDatamanager) {
            this.mDatamanager = mDatamanager;
        }

        @Override
        protected Void doInBackground(DiaryRecord... diaryRecords) {
            final String DURATION_KEY = "com.example.duration.record";
            final String RECORDID_KEY = "com.example.recordId.record";
            final String TIMEZONE_KEY = "com.example.timeZone.record";
            final String STARTDAT_KEY = "com.example.startDateAndTime.record";
            final String LABEL_KEY    = "com.example.userLabel.record";
            final String RECORD_KEY    = "com.example.record.record";
            //final String COUNT_KEY = "com.example.key.count";

            Log.v("Connect","SendData");

            PutDataMapRequest putDataMapReq = PutDataMapRequest.create("/record");
            try
            {
                for (DiaryRecord mRecord : mDatamanager.getDiarySync()) {
                    DataMap map = new DataMap();
                    map.putInt(DURATION_KEY, mRecord.duration);
                    map.putLong(RECORDID_KEY, mRecord.recordId);
                    map.putString(TIMEZONE_KEY, mRecord.timeZone);
                    map.putString(STARTDAT_KEY, mRecord.startDateAndTime.toString());
                    map.putString(LABEL_KEY, mRecord.userLabel.toString());
                    putDataMapReq.getDataMap().putDataMap(RECORD_KEY, map);
                    PutDataRequest putDataReq = putDataMapReq.asPutDataRequest();
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

    private static class GetDiaryAsyncTask extends AsyncTask<DiaryRecord, Void, Void> {
        private DiaryRecordDao diaryRecordDao;

        private GetDiaryAsyncTask(DiaryRecordDao recordDao) {
            this.diaryRecordDao = recordDao;
        }

        @Override
        protected Void doInBackground(DiaryRecord... diaryRecords) {
            this.diaryRecordDao.getDiarySyncRecord();
            return null;
        }
    }

    @Override
    public void onDataChanged(@NonNull DataEventBuffer dataEventBuffer) {
        Log.v("Connection", "DataReceived");
        for (DataEvent event : dataEventBuffer) {
            if (event.getType() == DataEvent.TYPE_CHANGED) {
                // DataItem changed
                DataItem item = event.getDataItem();
                if (item.getUri().getPath().compareTo("/count1") == 0) {
                    Log.v("Connection", "DataReceived");
                    DataMap dataMap = DataMapItem.fromDataItem(item).getDataMap();
                    Log.v("Mobile", "DataReceived");
                }
            } else if (event.getType() == DataEvent.TYPE_DELETED) {
                // DataItem deleted
            }
        }
    }

    @Override
    public void onCapabilityChanged(@NonNull CapabilityInfo capabilityInfo) {

    }

    @Override
    public void onMessageReceived(@NonNull MessageEvent messageEvent) {
    }



    private void showOnSmokingEventDetectedNotification(DiaryRecord record) {

        // Build intent for notification content
        Intent viewIntent = new Intent(context, ConnectionClass.class);
        PendingIntent viewPendingIntent =
                PendingIntent.getActivity(
                        context,
                        0,
                        viewIntent,
                        0); // nachschauen!

        // Build intent for "Yes" action button
        Intent yesIntent = new Intent(context, SmokeEventDetectedIntentService.class);
        yesIntent.setAction(SmokeEventDetectedIntentService.ACTION_YES);
        yesIntent.putExtra("ID", record.recordId);
        PendingIntent yesPendingIntent = PendingIntent.getService(context, 0, yesIntent, PendingIntent.FLAG_UPDATE_CURRENT);
        NotificationCompat.Action yesAction =
                new NotificationCompat.Action.Builder(
                        R.drawable.ic_cigarette_black_24dp,
                        "Yes",
                        yesPendingIntent)
                        .build();

        // Build intent for "No" action button
        Intent noIntent = new Intent(context, SmokeEventDetectedIntentService.class);
        yesIntent.putExtra("ID", record.recordId);
        noIntent.setAction(SmokeEventDetectedIntentService.ACTION_NO);
        PendingIntent noPendingIntent = PendingIntent.getService(context, 0, noIntent, PendingIntent.FLAG_UPDATE_CURRENT);
        NotificationCompat.Action noAction =
                new NotificationCompat.Action.Builder(
                        R.drawable.ic_crossed_cigarette_black_24dp,
                        "No",
                        noPendingIntent)
                        .build();

        // 2. Build the BIG_TEXT_STYLE
        DateFormat df = new SimpleDateFormat("EEEE, d MMM, HH:mm", Locale.ENGLISH);
        NotificationCompat.BigTextStyle bigTextStyle = new NotificationCompat.BigTextStyle()
                // Overrides ContentText in the big form of the template.
                .bigText("@ " + df.format(record.startDateAndTime) + " ?")
                // Overrides ContentTitle in the big form of the template.
                .setBigContentTitle("Did you smoke ")
                // Summary line after the detail section in the big form of the template
                // Note: To improve readability, don't overload the user with info. If Summary Text
                // doesn't add critical information, you should skip it.
                .setSummaryText("Summary");

        //Building notification layout
        NotificationCompat.Builder notificationBuilder =
                new NotificationCompat.Builder(context, NotificationUtil.createNotificationChannel(context))
                        .setStyle(bigTextStyle)
                        .setSmallIcon(R.drawable.ic_cigarette_black_24dp)
                        //.setContentTitle("Smoking?")
                        //.setContentText("We detected that you're smoking. Is this correct?")
                        .setDefaults(NotificationCompat.DEFAULT_ALL)
                        .setCategory(Notification.CATEGORY_REMINDER)
                        .setPriority(NotificationCompat.PRIORITY_MAX)
                        .setColor(ContextCompat.getColor(context.getApplicationContext(), R.color.colorPrimaryDark))
                        .setVisibility(NotificationCompat.VISIBILITY_PRIVATE)
                        //.setContentIntent(viewPendingIntent)
                        .addAction(yesAction)
                        .addAction(noAction);

        // Enables launching app in Wear 2.0 while keeping the old Notification Style behavior.
        NotificationCompat.Action mainAction = new NotificationCompat.Action.Builder(
                R.drawable.open_on_phone,
                "Open",
                viewPendingIntent)
                .build();

        notificationBuilder.addAction(mainAction);

        // instance of the NotificationManager service
        NotificationManagerCompat notificationManager =
                NotificationManagerCompat.from(context);

        // Build the notification and notify it using notification manager.
        notificationManager.notify((int) record.recordId, notificationBuilder.build());
    }
}