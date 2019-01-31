package de.uni_freiburg.iems.beatit;

import android.content.Context;

public class SensorDataManagerInstanceProvider {

    private static SensorDataManager instance;

    public static synchronized SensorDataManager getInstance(Context context) {
        if (instance == null) {
            return new SensorDataManager(context);
        }
        return instance;
    }
}
