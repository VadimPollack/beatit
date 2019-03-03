package de.uni_freiburg.iems.beatit;

import android.arch.lifecycle.MutableLiveData;
import android.content.Context;
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

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Date;
import java.util.StringJoiner;


public class SensorDataManager
        implements SensorEventListener {

    public MutableLiveData<Boolean> isMonitoringStarted;

    private OnSmokingEventDetectedListener onSmokingEventDetectedListener;

    private SensorManager mSensorManager;
    private Sensor mSensorGyroscope;
    private Sensor mSensorAccelerometer;

    private Sensor mSensorMagneticField;
    private Sensor mSensorPressure;
    private Sensor mSensorRoatationVector;

    private FileOutputStream fileStream;
    private FileOutputStream fileStream2;
    private File file;
    private File file2;
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
    private SegFeatWear segFeat = null;
    private Integer windowlength = 1000;
    private long SensorTimeStamp = 0;
    private long StartTimeStamp = 0;
    private long StopTimeStamp = 0;

    private ModelHandler gModelHandler;
    private String ClassificationsBufferString[] = new String[18];
    private boolean[] ClassificationsBuffer = new boolean[18];
    private int ClasBufInd = 0;
    private boolean SmokingDetected = false;

    public static synchronized SensorDataManager getInstance(Context context) {
        if (instance == null) {
            instance = new SensorDataManager(context);
        }
        return instance;
    }

    private SensorDataManager(@NonNull Context context) {
        this.context = context;
        formatTime = new SimpleDateFormat("HH:mm:ss");
        isMonitoringStarted = new MutableLiveData<>();
        isMonitoringStarted.setValue(false);
        onSmokingEventDetectedListener = null;
        gModelHandler = ModelHandler.getInstance();
        gModelHandler.changeModel(context, "RF__6Attr.model");
    }

    /**
     * Starts recording of sensor data
     *
     * @return true if start was successful.
     */
    public boolean startSensorMonitoring() {
        mSensorManager = (SensorManager) this.context.getApplicationContext().getSystemService(Context.SENSOR_SERVICE);

        mSensorAccelerometer = mSensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
        mSensorManager.registerListener(this, mSensorAccelerometer, 20000);

        mSensorGyroscope = mSensorManager.getDefaultSensor(Sensor.TYPE_GYROSCOPE);
        mSensorManager.registerListener(this, mSensorGyroscope, 20000);

        mSensorMagneticField = mSensorManager.getDefaultSensor(Sensor.TYPE_MAGNETIC_FIELD);
        mSensorManager.registerListener(this, mSensorMagneticField, 20000);

       /*
        mSensorPressure = mSensorManager.getDefaultSensor(Sensor.TYPE_PRESSURE);
        mSensorManager.registerListener(this, mSensorPressure,20000);

        mSensorRoatationVector = mSensorManager.getDefaultSensor(Sensor.TYPE_ROTATION_VECTOR);
        mSensorManager.registerListener(this, mSensorRoatationVector, 20000);
        */

        try {
            segFeat = new SegFeatWear.Builder()
                    .setWindowSize(windowlength)
                    .setSampleSize(9)
                    .build();
        } catch (Exception e) {
            //doSomething
        }
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

            file2 = new File(Environment.getExternalStoragePublicDirectory(
                    Environment.DIRECTORY_MOVIES), DayTime + "__FEAT.txt");
            //this.isStoragePermissionGranted();
            file2.setWritable(true);
            Log.v("INFO", file2.getAbsolutePath());
            try {
                file2.createNewFile();
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

        long timeInMillis = (new Date()).getTime()
                + (event.timestamp - System.nanoTime()) / 1000000L;
        Timestamp stamp = new Timestamp(timeInMillis);

        timeInMillis = timeInMillis / 10;

        if (0 == SensorTimeStamp) {
            SensorTimeStamp = timeInMillis;
            StartTimeStamp = timeInMillis;
        }

        Log.v("SensorTimeStamp1", stamp.toString());
        Log.v("SensorTimeStamp2", (new Long(timeInMillis)).toString());
        Log.v("Sensor", event.sensor.getName());

        if (timeInMillis > SensorTimeStamp) {

            try {
                segFeat.write(new double[]{ACX, ACY, ACZ, GYX, GYY, GYZ, MGX, MGY, MGZ});
            } catch (Exception e) {
                //doSomething
            }

            String value = "" + formatter.format(ACX) + " " + formatter.format(ACY) + " "
                    + formatter.format(ACZ) + " "
                    + formatter.format(GYX) + " " + formatter.format(GYY) + " "
                    + formatter.format(GYZ) + " "
                    + formatter.format(MGX) + " " + formatter.format(MGY) + " "
                    + formatter.format(MGZ) + "\n";

            Log.v("INFO", value);
            writeToFile(value);
            SensorTimeStamp = timeInMillis;
        }

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

        SegFeatWear.FeatureVector featureVector = segFeat.read();
        if (featureVector != null) {
            ModelHandler.MLModel lMLModel;
            String Ausgabe, Ausgabe2;
            Integer ClassifiedAs = 0;

            lMLModel = gModelHandler.getActiveMLModel();
            Ausgabe = lMLModel.predictSmoking(featureVector.mVector);

            String FeatureString = Ausgabe + " " + dblarr2str(featureVector.mVector) + "\n";
            writeToFile2(FeatureString);

            ClassificationsBufferString[ClasBufInd] = Ausgabe;
            ClassificationsBuffer[ClasBufInd] = !Ausgabe.equals("NULL");
            for (boolean b : ClassificationsBuffer) {
                ClassifiedAs += b ? 1 : 0;
            }
            if (ClassifiedAs > 7 && !SmokingDetected) {
                StartTimeStamp = SensorTimeStamp;
                SmokingDetected = true;
            }
            if (ClassifiedAs <= 7 && SmokingDetected) {
                StopTimeStamp = SensorTimeStamp;
                SmokingDetected = false;

                smokingEventDetected(new Date(SensorTimeStamp), (int) (StartTimeStamp - SensorTimeStamp));
            }

            ClasBufInd++;
            ClasBufInd %= 18;
        }




        /*String Label = "Null";
        Integer rand = ((int) (Math.random() * 10)) % 2;
        if (0 == rand) {
            Label = "smoking";
        }
        value = Label + " " + value;*/
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

    private void writeToFile2(String line) {
        try {
            fileStream2 = new FileOutputStream(file2, true);
            fileStream2.write(line.getBytes());
            fileStream2.close();
        } catch (Exception e) {
            Log.v("INFO", e.getMessage());
        }
    }

    private void smokingEventDetected(Date startDateAndTime, int duration) {
        if (onSmokingEventDetectedListener != null)
            onSmokingEventDetectedListener.onSmokingEventDetected(startDateAndTime, duration);
    }

    public void simulateSmokingEventDetected() {
       smokingEventDetected(new Date(), 120000);
    }

    public void setOnSmokingEventDetectedListener(OnSmokingEventDetectedListener listener) {
        onSmokingEventDetectedListener = listener;
    }

    public void removeOnSmokingEventDetectedListener() {
        onSmokingEventDetectedListener = null;
    }


    public interface OnSmokingEventDetectedListener {
        void onSmokingEventDetected(Date startDateAndTime, int durationInMiliseconds);
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
    private String dblarr2str(double[] featureVector) {
        StringJoiner sj = new StringJoiner(" ");

        for (double feature : featureVector)
            sj.add(Double.toString(feature));

        return sj.toString();
    }
}
