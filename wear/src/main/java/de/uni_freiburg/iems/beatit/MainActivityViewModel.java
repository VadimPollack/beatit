package de.uni_freiburg.iems.beatit;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LiveData;
import android.support.annotation.NonNull;

import java.util.TimeZone;

public class MainActivityViewModel extends AndroidViewModel {

    private SensorDataManager mSensorDataManager;
    private SyncManager mSyncManager;
    private DiaryDataManager mDataManager;
    private MonitoringViewModel.onSmokingEventDetectedListener mSmokingEventListener;

    public MainActivityViewModel(@NonNull Application application) {
        super(application);
        mSensorDataManager = SensorDataManager.getInstance(application);
        mSyncManager = new SyncManager(application);
        mDataManager = DiaryDataManager.getInstance(application);
        startMonitoring();

    }

    public void sync(){
        mSyncManager.sendData(mDataManager);
    }

    public void simulateSmokingEventDetected() {
        mSensorDataManager.simulateSmokingEventDetected();
    }

    public LiveData<Boolean> getIsMonitoringStarted() {
        return mSensorDataManager.isMonitoringStarted;
    }

    public void startMonitoring() {
        if (mSensorDataManager.isMonitoringStarted.getValue()) return;
        mSensorDataManager.setOnSmokingEventDetectedListener((startDateAndTime, durationInMilliseconds) -> {
            DiaryRecord newRecord = new DiaryRecord(
                    DiaryRecord.Source.MACHINE,
                    startDateAndTime,
                    TimeZone.getDefault().getID(),
                    durationInMilliseconds);
            mDataManager.insert(newRecord);
            mSmokingEventListener.onSmokingEventDetected(newRecord);
        });

        mSensorDataManager.startSensorMonitoring();
    }

    public void stopMonitoring() {
        if (!mSensorDataManager.isMonitoringStarted.getValue()) return;
        mSensorDataManager.removeOnSmokingEventDetectedListener();
        mSensorDataManager.stopSensorMonitoring();
    }
    public void setOnSmokingEventDetectedListener(MonitoringViewModel.onSmokingEventDetectedListener listener) {
        mSmokingEventListener = listener;
    }

    interface onSmokingEventDetectedListener {
        void onSmokingEventDetected(DiaryRecord record);
    }

}
