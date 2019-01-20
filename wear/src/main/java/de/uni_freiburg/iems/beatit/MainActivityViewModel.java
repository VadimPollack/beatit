package de.uni_freiburg.iems.beatit;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.support.annotation.NonNull;

public class MainActivityViewModel extends AndroidViewModel {
    private OnSmokingEventDetectedListener mListener;

    public MainActivityViewModel(@NonNull Application application) {
        super(application);
    }

    public void onSmokingEventDetected(){
        mListener.onSmokingEventDetected();
    }

    public void setOnSmokingEventDetectedListener(OnSmokingEventDetectedListener listener) {
        mListener = listener;
    }

    public interface OnSmokingEventDetectedListener {
        void onSmokingEventDetected();
    }
}
