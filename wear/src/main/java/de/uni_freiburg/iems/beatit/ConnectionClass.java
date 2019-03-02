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


public class ConnectionClass implements
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

            PutDataMapRequest putDataMapReq = PutDataMapRequest.create("/record");
            try {
                for (DiaryRecord mRecord : mDatamanager.getDiarySync()) {
                    DataMap map = new DataMap();
                    map.putInt(DURATION_KEY, mRecord.duration);
                    map.putString(RECORDID_KEY, mRecord.recordId);
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


}