package de.uni_freiburg.iems.beatit;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LiveData;
import android.support.annotation.NonNull;

public class MonitoringViewModel extends AndroidViewModel {

    private SensorDataManager mSensorDataManager;

    public MonitoringViewModel(@NonNull Application application) {
        super(application);
        mSensorDataManager = SensorDataManagerInstanceProvider.getInstance(application);
    }

    public LiveData<Boolean> getIsMonitoringStarted() {
        return mSensorDataManager.isMonitoringStarted;
    }

    public void startMonitoring() {
        if (mSensorDataManager.isMonitoringStarted.getValue()) return;
        mSensorDataManager.startSensorMonitoring();

    }

    public void stopMonitoring() {
        if (!mSensorDataManager.isMonitoringStarted.getValue()) return;
        mSensorDataManager.stopSensorMonitoring();
    }
}
