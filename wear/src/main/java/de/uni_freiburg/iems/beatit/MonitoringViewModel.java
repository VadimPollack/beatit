package de.uni_freiburg.iems.beatit;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.support.annotation.NonNull;

public class MonitoringViewModel extends AndroidViewModel {


    private MutableLiveData<String> startTime;
    private SensorDataManager mSensorDataManager;

    public MonitoringViewModel(@NonNull Application application) {
        super(application);
        mSensorDataManager = new SensorDataManager(application);
    }

    public LiveData<Boolean> getIsMonitoringStarted() {
        return mSensorDataManager.isMonitoringStarted;
    }

    public void startMonitoring() {
        if (mSensorDataManager.isMonitoringStarted.getValue()) {
            mSensorDataManager.stopSensorMonitoring();
        } else {
            mSensorDataManager.startSensorMonitoring();
        }
    }
}
