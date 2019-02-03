package de.uni_freiburg.iems.beatit;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LiveData;
import android.support.annotation.NonNull;

public class MonitoringViewModel extends AndroidViewModel {

    private SensorDataManager mSensorDataManager;
    private ConnectionClass mDataSync;
    private DiaryDataManager mdataManager;

    public MonitoringViewModel(@NonNull Application application) {
        super(application);
        mSensorDataManager = SensorDataManager.getInstance(application);
        mDataSync = new ConnectionClass(application);
        mdataManager = DiaryDataManager.getInstance(application);
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
}
