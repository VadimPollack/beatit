package de.uni_freiburg.iems.beatit;

import android.Manifest;
import android.app.Application;
import android.arch.lifecycle.MutableLiveData;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.icu.text.DecimalFormat;
import android.icu.text.NumberFormat;
import android.icu.text.SimpleDateFormat;
import android.os.Environment;
import android.support.annotation.NonNull;
import android.util.Log;
import android.widget.TextView;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class SensorDataManager
        implements SensorEventListener {

    public MutableLiveData<Boolean> isMonitoringStarted;
    
    private List<OnSmokingEventDetectedListener> onSmokingEventDetectedListeners;

    private SensorManager mSensorManager;
    private Sensor mSensorGyroscope;
    private Sensor mSensorAccelerometer;

    private Sensor mSensorMagneticField;
    private Sensor mSensorPressure;
    private Sensor mSensorRoatationVector;

    private FileOutputStream fileStream;
    private File file;
    private SimpleDateFormat formatTime;

    private double ACX;
    private double ACY;
    private double ACZ;

    private double GYX;
    private double GYY;
    private double GYZ;

    private double MGX;
    private double MGY;
    private double MGZ;
    private Context context;
    private NumberFormat formatter = new DecimalFormat("#0.000000");

    private static SensorDataManager instance;

    public static synchronized SensorDataManager getInstance(Context context) {
        if (instance == null) {
            return new SensorDataManager(context);
        }
        return instance;
    }

    private SensorDataManager(@NonNull Context context) {
        this.context = context;
        formatTime = new SimpleDateFormat("HH:mm:ss");
        isMonitoringStarted = new MutableLiveData<>();
        isMonitoringStarted.setValue(false);
        onSmokingEventDetectedListeners = new ArrayList<>();
    }

    /**
     * Starts recording of sensor data
     *
     * @return true if start was successful.
     */
    public boolean startSensorMonitoring() {
        mSensorManager = (SensorManager) this.context.getApplicationContext().getSystemService(Context.SENSOR_SERVICE);

        mSensorAccelerometer = mSensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
        mSensorManager.registerListener(this, mSensorAccelerometer, SensorManager.SENSOR_DELAY_NORMAL);

        mSensorGyroscope = mSensorManager.getDefaultSensor(Sensor.TYPE_GYROSCOPE);
        mSensorManager.registerListener(this, mSensorGyroscope, SensorManager.SENSOR_DELAY_NORMAL);

        mSensorMagneticField = mSensorManager.getDefaultSensor(Sensor.TYPE_MAGNETIC_FIELD);
        mSensorManager.registerListener(this, mSensorMagneticField, SensorManager.SENSOR_DELAY_NORMAL);

        mSensorPressure = mSensorManager.getDefaultSensor(Sensor.TYPE_PRESSURE);
        mSensorManager.registerListener(this, mSensorPressure, SensorManager.SENSOR_DELAY_NORMAL);

        mSensorRoatationVector = mSensorManager.getDefaultSensor(Sensor.TYPE_ROTATION_VECTOR);
        mSensorManager.registerListener(this, mSensorRoatationVector, SensorManager.SENSOR_DELAY_NORMAL);

        // Create an File in an external storage
        SimpleDateFormat format = new SimpleDateFormat("dd_MM_YY_HH_mm_ss");
        Calendar calendar = Calendar.getInstance();
        String DayTime = format.format(calendar.getTime());
        String result = Environment.getExternalStorageState();
        if (Environment.MEDIA_MOUNTED.equals(result)) {
            file = new File(Environment.getExternalStoragePublicDirectory(
                    Environment.DIRECTORY_MOVIES), DayTime + ".txt");
            //this.isStoragePermissionGranted();
            file.setWritable(true);
            Log.v("INFO", file.getAbsolutePath());
            try {
                file.createNewFile();
            } catch (IOException e) {

                Log.v("INFO", e.getMessage());
            }
        }
        isMonitoringStarted.setValue(true);
        return true;
    }

    public boolean stopSensorMonitoring() {
        mSensorManager.unregisterListener(this);
        isMonitoringStarted.setValue(false);
        return true;
    }

    @Override
    public void onSensorChanged(SensorEvent event) {
        // getting the device Time.
        Calendar calendar = Calendar.getInstance();
        String time = formatTime.format(calendar.getTime());
        time = formatTime.format(event.timestamp);
        if (event.sensor.getType() == Sensor.TYPE_ACCELEROMETER) {
            ACY = (double) event.values[1];
            ACZ = (double) event.values[2];
            ACX = (double) event.values[0];
        } else if (event.sensor.getType() == Sensor.TYPE_GYROSCOPE) {
            GYY = (double) event.values[1];
            GYZ = (double) event.values[2];
            GYX = (double) event.values[0];
        } else if (event.sensor.getType() == Sensor.TYPE_MAGNETIC_FIELD) {
            MGY = (double) event.values[1];
            MGZ = (double) event.values[2];
            MGX = (double) event.values[0];
        } else if (event.sensor.getType() == Sensor.TYPE_PRESSURE) {

        } else if (event.sensor.getType() == Sensor.TYPE_ROTATION_VECTOR) {

        }

        String value = "" + formatter.format(ACX) + " " + formatter.format(ACY) + " "
                + formatter.format(ACZ) + " "
                + formatter.format(GYX) + " " + formatter.format(GYY) + " "
                + formatter.format(GYZ) + " "
                + formatter.format(MGX) + " " + formatter.format(MGY) + " "
                + formatter.format(MGZ) + "\n";

        String Label = "Null";
        Integer rand = ((int) (Math.random() * 10)) % 2;
        if (0 == rand) {
            Label = "smoking";
        }
        value = Label + " " + value;


        Log.v("INFO", value);
        writeToFile(value);
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {

    }

 /*   @Override
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if(grantResults[0]== PackageManager.PERMISSION_GRANTED){
            Log.v("INFO", "Permission");
        }
    }*/

    private void writeToFile(String line) {
        try {
            fileStream = new FileOutputStream(file, true);
            fileStream.write(line.getBytes());
            fileStream.close();
        } catch (Exception e) {
            Log.v("INFO", e.getMessage());
        }
    }

    public void SimulateSmokingEventDetected() {
        for (OnSmokingEventDetectedListener listener:onSmokingEventDetectedListeners) {
            listener.onSmokingEventDetected( 3000);
        }
    }
    public void addOnSmokingEventDetectedListener(OnSmokingEventDetectedListener listener){
        onSmokingEventDetectedListeners.add(listener);
    }

    public interface OnSmokingEventDetectedListener {
        void onSmokingEventDetected(int durationInMiliseconds);
    }
    
/*    public  boolean isStoragePermissionGranted() {

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            if (context.getApplicationContext().checkSelfPermission(android.Manifest.permission.WRITE_EXTERNAL_STORAGE)
                    == PackageManager.PERMISSION_GRANTED) {
                Log.v("INFO","Permission is granted");
                return true;
            } else {
                Log.v("INFO","Permission is revoked");
                ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE}, 1);
                return false;
            }
        }
        else { //permission is automatically granted on sdk<23 upon installation
            Log.v("INFO","Permission is granted");
            return true;
        }
    }*/
}
