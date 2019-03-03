package de.uni_freiburg.iems.beatit;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.support.annotation.NonNull;

public class MainActivityViewModel extends AndroidViewModel {

    private SensorDataManager mSensorDataManager;
    private SyncManager mSyncManager;
    private DiaryDataManager mDataManager;

    public MainActivityViewModel(@NonNull Application application) {
        super(application);
        mSensorDataManager = SensorDataManager.getInstance(application);
        mSyncManager = new SyncManager(application);
        mDataManager = DiaryDataManager.getInstance(application);
    }

    public void sync(){
        mSyncManager.sendData(mDataManager);
    }

    public void simulateSmokingEventDetected() {
        mSensorDataManager.simulateSmokingEventDetected();
    }


}
