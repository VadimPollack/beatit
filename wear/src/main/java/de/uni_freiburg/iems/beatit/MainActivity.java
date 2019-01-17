package de.uni_freiburg.iems.beatit;

import android.Manifest;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.wear.ambient.AmbientModeSupport;
import android.support.wear.widget.drawer.WearableNavigationDrawerView;
import android.view.Window;

public class MainActivity extends AppCompatActivity implements
        AmbientModeSupport.AmbientCallbackProvider, WearableNavigationDrawerView.OnItemSelectedListener {

    private enum NavigationSection {
        MotionMonitor(R.string.navigation_drawer_monitoring_title, R.drawable.ic_monitoring_black_24dp),
        Diary(R.string.navigation_drawer_diary_title, R.drawable.ic_diary_black_24dp),
        //Earth(R.string.earth_title, R.drawable.ic_earth_black_24dp),
        Settings(R.string.navigation_drawer_settings_title, R.drawable.ic_settings_black_24dp);

        final int titleRes;
        final int drawableRes;

        NavigationSection(final int titleRes, final int drawableRes) {
            this.titleRes = titleRes;
            this.drawableRes = drawableRes;
        }
    }

    private static final NavigationSection DEFAULT_SECTION = NavigationSection.Diary;

    private NavigationSection mCurrentSection = DEFAULT_SECTION;

    private WearableNavigationDrawerView mWearableNavigationDrawer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.isStoragePermissionGranted();
        requestWindowFeature(Window.FEATURE_NO_TITLE);//will hide the title
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);

        //Enable AmbientMode (Always-On)
        AmbientModeSupport.attach(this);

        mWearableNavigationDrawer = (WearableNavigationDrawerView) findViewById(R.id.top_navigation_drawer);
        mWearableNavigationDrawer.setAdapter(new NavigationAdapter(this));
        mWearableNavigationDrawer.addOnItemSelectedListener(this);

        final Fragment diaryFragment = DiaryView.newInstance();
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragment_container, diaryFragment)
                .commit();
    }

    //---------------------Navigation Drawer--------------------------------------
    private final class NavigationAdapter
            extends WearableNavigationDrawerView.WearableNavigationDrawerAdapter {
        private final Context mContext;

        NavigationAdapter(final Context context) {
            mContext = context;
        }

        @Override
        public String getItemText(int index) {
            return mContext.getString(NavigationSection.values()[index].titleRes);
        }

        @Override
        public Drawable getItemDrawable(int index) {
            return mContext.getDrawable(NavigationSection.values()[index].drawableRes);
        }

        @Override
        public int getCount() {
            return NavigationSection.values().length;
        }
    }

    @Override
    public void onItemSelected(int index) {
        NavigationSection selectedSection = NavigationSection.values()[index];

        // Only replace the fragment if the section is changing.
        if (selectedSection == mCurrentSection) {
            return;
        }


        Fragment selectedFragment = null;
        switch (selectedSection) {
            case MotionMonitor:
                selectedFragment = MonitoringView.newInstance();
                break;
            case Diary:
                selectedFragment = DiaryView.newInstance();
                break;
            case Settings:
                break;
            default:
                selectedFragment = DiaryView.newInstance();
        }
        final Fragment selectedFragmentFinal = selectedFragment;
        mCurrentSection = selectedSection;
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragment_container, selectedFragmentFinal)
                .commit();
    }

    //----------------------Ambient Mode----------------------------------------
    @Override
    public AmbientModeSupport.AmbientCallback getAmbientCallback() {
        return new MyAmbientCallback();
    }

    private class MyAmbientCallback extends AmbientModeSupport.AmbientCallback {
        @Override
        public void onEnterAmbient(Bundle ambientDetails) {
            // Handle entering ambient mode
        }

        @Override
        public void onExitAmbient() {
            // Handle exiting ambient mode
        }

        @Override
        public void onUpdateAmbient() {
            // Update the content
        }
    }
    @Override
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if(grantResults[0]== PackageManager.PERMISSION_GRANTED){
        }
    }

    public  boolean isStoragePermissionGranted() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            if (checkSelfPermission(android.Manifest.permission.WRITE_EXTERNAL_STORAGE)
                    == PackageManager.PERMISSION_GRANTED) {
                return true;
            } else {
                ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE}, 1);
                return false;
            }
        }
        else { //permission is automatically granted on sdk<23 upon installation
            return true;
        }
    }
}
