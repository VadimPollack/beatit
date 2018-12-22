package de.uni_freiburg.iems.beatit;

import android.Manifest;
import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.icu.text.SimpleDateFormat;
import android.nfc.Tag;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.support.v4.app.ActivityCompat;
import android.support.wearable.activity.WearableActivity;
import android.util.Log;
import android.widget.TextView;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Calendar;

public class EcologicalMomentaryAssesmentActivity extends WearableActivity
        implements SensorEventListener {

    private TextView mTextView;
    private SensorManager mSensorManager;
    private Sensor mSensorGyroscope;
    private Sensor mSensorAccelerometer;
    private FileOutputStream fileStream;
    private File file;
    private SimpleDateFormat format;
    private Calendar calendar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ecological_momentary_assesment);

        mTextView = (TextView) findViewById(R.id.text);

        mSensorManager = (SensorManager) getSystemService(Context.SENSOR_SERVICE);

        mSensorGyroscope = mSensorManager.getDefaultSensor(Sensor.TYPE_GYROSCOPE);
        mSensorManager.registerListener(this, mSensorGyroscope, SensorManager.SENSOR_DELAY_NORMAL);

        mSensorAccelerometer = mSensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
        mSensorManager.registerListener(this, mSensorAccelerometer, SensorManager.SENSOR_DELAY_NORMAL);

        // Create an File in an external storage
        String result = Environment.getExternalStorageState();
        if (Environment.MEDIA_MOUNTED.equals(result)) {
            file = new File(Environment.getExternalStoragePublicDirectory(
                    Environment.DIRECTORY_MOVIES), "beatit.txt");
            this.isStoragePermissionGranted();
            file.setWritable(true);
            mTextView.setText(file.getAbsolutePath());
            try {
                file.createNewFile();
            } catch (IOException e) {
                //e.printStackTrace();
                mTextView.setText(e.getMessage());
            }

        }
        // getting the device Time.
        calendar = Calendar.getInstance();
        format = new SimpleDateFormat("HH:mm:ss");


        // Enables Always-on
        setAmbientEnabled();
    }

    @Override
    public void onSensorChanged(SensorEvent event) {
        if(event.sensor.getType() == Sensor.TYPE_ACCELEROMETER) {
            String time = format.format(calendar.getTime());
            String value = "" + time + ";" +(int)event.values[0] + ";" +
                    (int)event.values[1] + ";" + (int)event.values[2] + "\n";
            //mTextView.setText(value);
            writeToFile(value);
        }
        else if (event.sensor.getType() == Sensor.TYPE_GYROSCOPE) {

        }
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {

    }

    @Override
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if(grantResults[0]== PackageManager.PERMISSION_GRANTED){
           // Log.v(TAG,"Permission: "+permissions[0]+ "was "+grantResults[0]);
            //resume tasks needing this permission
        }
    }

    private void writeToFile (String line) {
        try {
            fileStream = new FileOutputStream(file, true);
            //fileStream = openFileOutput("beatit.txt", MODE_APPEND);
            fileStream.write(line.getBytes());
            fileStream.close();
        } catch (Exception e) {
           mTextView.setText(e.getMessage());
        }
    }
    public  boolean isStoragePermissionGranted() {

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            if (checkSelfPermission(android.Manifest.permission.WRITE_EXTERNAL_STORAGE)
                    == PackageManager.PERMISSION_GRANTED) {
                //Log.v(TAG,"Permission is granted");
                return true;
            } else {
                //Log.v(TAG,"Permission is revoked");
                ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE}, 1);
                return false;
            }
        }
        else { //permission is automatically granted on sdk<23 upon installation
            //Log.v(TAG,"Permission is granted");
            return true;
        }
    }
}
