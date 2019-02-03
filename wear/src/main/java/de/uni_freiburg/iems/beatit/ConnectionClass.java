package de.uni_freiburg.iems.beatit;

import android.app.Application;
import android.support.annotation.NonNull;
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

    public ConnectionClass(Application context) {
        this.context = context;
        Wearable.getDataClient(context).addListener(this);
    }

    int count = 0;
    public void sendData() {
        final String COUNT_KEY = "com.example.key.count";

        Log.v("Connect","SendData");

        PutDataMapRequest putDataMapReq = PutDataMapRequest.create("/count1");
        putDataMapReq.getDataMap().putInt(COUNT_KEY, count++);
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