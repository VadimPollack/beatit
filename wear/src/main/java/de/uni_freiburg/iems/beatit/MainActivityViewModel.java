package de.uni_freiburg.iems.beatit;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.support.annotation.NonNull;

import java.util.Calendar;
import java.util.TimeZone;

public class MainActivityViewModel extends AndroidViewModel {

    private SensorDataManager mSensorDataManager;
    private onSmokingEventDetectedListener mListener;

    public MainActivityViewModel(@NonNull Application application) {
        super(application);
        mSensorDataManager = SensorDataManager.getInstance(application);
        mSensorDataManager.addOnSmokingEventDetectedListener(durationInMilliseconds -> {
            DiaryRecord newRecord = new DiaryRecord(Calendar.getInstance().getTime(),
                    TimeZone.getDefault().getID(),
                    durationInMilliseconds);
            DiaryDataManager.getInstance(application).insert(newRecord );
            mListener.onSmokingEventDetected(newRecord);
        });

    }

    public void simulateSmokingEventDetected(){
        mSensorDataManager.SimulateSmokingEventDetected();
    }

    public void setOnSmokingEventDetectedListener(onSmokingEventDetectedListener listener){
        mListener = listener;
    }

    interface onSmokingEventDetectedListener{
        void onSmokingEventDetected(DiaryRecord record);
    }
}
