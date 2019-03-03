package de.uni_freiburg.iems.beatit;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.support.annotation.NonNull;

public class MainActivityViewModel extends AndroidViewModel {

    private SensorDataManager mSensorDataManager;

    public MainActivityViewModel(@NonNull Application application) {
        super(application);
        mSensorDataManager = SensorDataManager.getInstance(application);
    }

    public void simulateSmokingEventDetected() {
        mSensorDataManager.simulateSmokingEventDetected();
    }


}
