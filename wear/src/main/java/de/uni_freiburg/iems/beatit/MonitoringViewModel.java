package de.uni_freiburg.iems.beatit;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LiveData;
import android.content.Context;
import android.content.IntentFilter;
import android.support.annotation.NonNull;

public class MonitoringViewModel extends AndroidViewModel {

    private SensorDataManager mSensorDataManager;
    private ConnectionClass mDataSync;
    private DiaryDataManager mdataManager;
    private ModelHandler mModelHandler;

    public MonitoringViewModel(@NonNull Application application) {
        super(application);
        mModelHandler = ModelHandler.getInstance();
        mSensorDataManager = SensorDataManager.getInstance(application);
        mDataSync = new ConnectionClass(application);
        mdataManager = DiaryDataManager.getInstance(application);
        IntentFilter filter = new IntentFilter("de.uni_freiburg.iems.beatit");

        application.registerReceiver(mDataSync, filter);

    }

    public LiveData<Boolean> getIsMonitoringStarted() {
        return mSensorDataManager.isMonitoringStarted;
    }

    public void startMonitoring() {
        mDataSync.sendData(mdataManager);
        if (mSensorDataManager.isMonitoringStarted.getValue()) return;
        mSensorDataManager.startSensorMonitoring();

    }

    public void stopMonitoring() {
        if (!mSensorDataManager.isMonitoringStarted.getValue()) return;
        mSensorDataManager.stopSensorMonitoring();
    }

    public void selectMLModellMonitoring(Context modelContext, int position){
        String ModelName;
        switch(position){
            case 0:
                ModelName = "RF__6Attr.model";
                break;
            case 1:
                ModelName = "RF__3Attr.model";
                break;
            case 2:
                ModelName = "Handwashing.model";
                break;
            default:
                ModelName = "RF__6Attr.model";
        }
        mModelHandler.changeModel(modelContext,ModelName);
    }
}
