package de.uni_freiburg.iems.beatit;

import android.Manifest;
import android.app.Notification;
import android.app.PendingIntent;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.icu.text.DateFormat;
import android.icu.text.SimpleDateFormat;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.Fragment;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.NotificationManagerCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.wear.ambient.AmbientModeSupport;
import android.support.wear.widget.drawer.WearableNavigationDrawerView;
import android.view.Window;

import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

import de.uni_freiburg.iems.beatit.notifications.NotificationUtil;
import de.uni_freiburg.iems.beatit.notifications.SmokeEventDetectedIntentService;

public class MainActivity extends AppCompatActivity implements
        AmbientModeSupport.AmbientCallbackProvider, WearableNavigationDrawerView.OnItemSelectedListener {

    public static final int NOTIFICATION_ID = 1;

    private MainActivityViewModel viewModel;

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

    private static final NavigationSection DEFAULT_SECTION = NavigationSection.MotionMonitor;

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

        //initialize notification manager
        viewModel = ViewModelProviders.of(this).get(MainActivityViewModel.class);
        viewModel.setOnSmokingEventDetectedListener((record) -> {
            showOnSmokingEventDetectedNotification(record);
            //generateBigTextStyleNotification();
        });


        final Fragment startFragment = MonitoringView.newInstance();
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragment_container, startFragment)
                .commit();
    }

    private void generateBigTextStyleNotification() {

        // Main steps for building a BIG_TEXT_STYLE notification:
        //      0. Get your data
        //      1. Create/Retrieve Notification Channel for O and beyond devices (26+)
        //      2. Build the BIG_TEXT_STYLE
        //      3. Set up main Intent for notification
        //      4. Create additional Actions for the Notification
        //      5. Build and issue the notification

        // 0. Get your data (everything unique per Notification).
//        MockDatabase.BigTextStyleReminderAppData bigTextStyleReminderAppData =
//                MockDatabase.getBigTextStyleData();

        // 1. Create/Retrieve Notification Channel for O and beyond devices (26+).
        String notificationChannelId =
                NotificationUtil.createNotificationChannel(this);

        // 2. Build the BIG_TEXT_STYLE
        NotificationCompat.BigTextStyle bigTextStyle = new NotificationCompat.BigTextStyle()
                // Overrides ContentText in the big form of the template.
                .bigText("BigText")
                // Overrides ContentTitle in the big form of the template.
                .setBigContentTitle("BigContentTitle")
                // Summary line after the detail section in the big form of the template
                // Note: To improve readability, don't overload the user with info. If Summary Text
                // doesn't add critical information, you should skip it.
                .setSummaryText("BigSummary");


        // 3. Set up main Intent for notification.
        Intent mainIntent = new Intent(this, MainActivity.class);

        PendingIntent mainPendingIntent =
                PendingIntent.getActivity(
                        this,
                        0,
                        mainIntent,
                        PendingIntent.FLAG_UPDATE_CURRENT
                );


        // 4. Create additional Actions (Intents) for the Notification.

        // In our case, we create two additional actions: a Snooze action and a Dismiss action.

        // Snooze Action.
        Intent snoozeIntent = new Intent(this, SmokeEventDetectedIntentService.class);
        snoozeIntent.setAction(SmokeEventDetectedIntentService.ACTION_YES);

        PendingIntent snoozePendingIntent = PendingIntent.getService(this, 1, snoozeIntent, 0);
        NotificationCompat.Action snoozeAction =
                new NotificationCompat.Action.Builder(
                        R.drawable.ic_cigarette_black_24dp,
                        "Snooze",
                        snoozePendingIntent)
                        .build();

        // Dismiss Action.
        Intent dismissIntent = new Intent(this, SmokeEventDetectedIntentService.class);
        dismissIntent.setAction(SmokeEventDetectedIntentService.ACTION_NO);

        PendingIntent dismissPendingIntent = PendingIntent.getService(this, 2, dismissIntent, 0);
        NotificationCompat.Action dismissAction =
                new NotificationCompat.Action.Builder(
                        R.drawable.ic_diary_black_24dp,
                        "Dismiss",
                        dismissPendingIntent)
                        .build();

        // 5. Build and issue the notification.

        // Because we want this to be a new notification (not updating a previous notification), we
        // create a new Builder. Later, we use the same global builder to get back the notification
        // we built here for the snooze action, that is, canceling the notification and relaunching
        // it several seconds later.

        // Notification Channel Id is ignored for Android pre O (26).
        NotificationCompat.Builder notificationCompatBuilder =
                new NotificationCompat.Builder(
                        getApplicationContext(), notificationChannelId);

        //GlobalNotificationBuilder.setNotificationCompatBuilderInstance(notificationCompatBuilder);

        notificationCompatBuilder
                // BIG_TEXT_STYLE sets title and content.
                .setStyle(bigTextStyle)
                .setContentTitle("ContentTitle")
                .setContentText("getContentText")
                .setSmallIcon(R.drawable.action_item_icon_background)
                .setLargeIcon(BitmapFactory.decodeResource(
                        getResources(),
                        R.drawable.accept_deny_dialog_positive_bg))
                .setDefaults(NotificationCompat.DEFAULT_ALL)
                // Set primary color (important for Wear 2.0 Notifications).
                .setColor(ContextCompat.getColor(getApplicationContext(), R.color.colorPrimary))

                .setCategory(Notification.CATEGORY_REMINDER)

                // Sets priority for 25 and below. For 26 and above, 'priority' is deprecated for
                // 'importance' which is set in the NotificationChannel. The integers representing
                // 'priority' are different from 'importance', so make sure you don't mix them.
                .setPriority(NotificationCompat.PRIORITY_DEFAULT)

                // Sets lock-screen visibility for 25 and below. For 26 and above, lock screen
                // visibility is set in the NotificationChannel.
                .setVisibility(NotificationCompat.VISIBILITY_PUBLIC)

                // Adds additional actions specified above.
                .addAction(snoozeAction)
                .addAction(dismissAction);

        /* REPLICATE_NOTIFICATION_STYLE_CODE:
         * You can replicate Notification Style functionality on Wear 2.0 (24+) by not setting the
         * main content intent, that is, skipping the call setContentIntent(). However, you need to
         * still allow the user to open the native Wear app from the Notification itself, so you
         * add an action to launch the app.
         */
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {

            // Enables launching app in Wear 2.0 while keeping the old Notification Style behavior.
            NotificationCompat.Action mainAction = new NotificationCompat.Action.Builder(
                    R.drawable.ic_diary_black_24dp,
                    "Open",
                    mainPendingIntent)
                    .build();

            notificationCompatBuilder.addAction(mainAction);

        } else {
            // Wear 1.+ still functions the same, so we set the main content intent.
            notificationCompatBuilder.setContentIntent(mainPendingIntent);
        }


        Notification notification = notificationCompatBuilder.build();
        NotificationManagerCompat mNotificationManagerCompat = NotificationManagerCompat.from(getApplicationContext());
        mNotificationManagerCompat.notify(NOTIFICATION_ID, notification);

        // Close app to demonstrate notification in steam.
        finish();
    }

    //----------------------------SmokingEventDetectedNotificatoin------------------------
    private void showOnSmokingEventDetectedNotification(DiaryRecord record) {

        // Build intent for notification content
        Intent viewIntent = new Intent(this, MainActivity.class);
        PendingIntent viewPendingIntent =
                PendingIntent.getActivity(
                        this,
                        0,
                        viewIntent,
                        0); // nachschauen!

        // Build intent for "Yes" action button
        Intent yesIntent = new Intent(this, SmokeEventDetectedIntentService.class);
        yesIntent.setAction(SmokeEventDetectedIntentService.ACTION_YES);
        yesIntent.putExtra("ID", record.recordId);
        PendingIntent yesPendingIntent = PendingIntent.getService(this, 0, yesIntent, PendingIntent.FLAG_UPDATE_CURRENT);
        NotificationCompat.Action yesAction =
                new NotificationCompat.Action.Builder(
                        R.drawable.ic_cigarette_black_24dp,
                        "Yes",
                        yesPendingIntent)
                        .build();

        // Build intent for "No" action button
        Intent noIntent = new Intent(this, SmokeEventDetectedIntentService.class);
        yesIntent.putExtra("ID", record.recordId);
        noIntent.setAction(SmokeEventDetectedIntentService.ACTION_NO);
        PendingIntent noPendingIntent = PendingIntent.getService(this, 0, noIntent, PendingIntent.FLAG_UPDATE_CURRENT);
        NotificationCompat.Action noAction =
                new NotificationCompat.Action.Builder(
                        R.drawable.ic_crossed_cigarette_black_24dp,
                        "No",
                        noPendingIntent)
                        .build();

        // 2. Build the BIG_TEXT_STYLE
        DateFormat df = new SimpleDateFormat("EEEE, d MMM, HH:mm", Locale.ENGLISH);
        NotificationCompat.BigTextStyle bigTextStyle = new NotificationCompat.BigTextStyle()
                // Overrides ContentText in the big form of the template.
                .bigText("@ " + df.format(record.startDateAndTime) + " ?")
                // Overrides ContentTitle in the big form of the template.
                .setBigContentTitle("Did you smoke ")
                // Summary line after the detail section in the big form of the template
                // Note: To improve readability, don't overload the user with info. If Summary Text
                // doesn't add critical information, you should skip it.
                .setSummaryText("Summary");

        //Building notification layout
        NotificationCompat.Builder notificationBuilder =
                new NotificationCompat.Builder(this, NotificationUtil.createNotificationChannel(this))
                        .setStyle(bigTextStyle)
                        .setSmallIcon(R.drawable.ic_cigarette_black_24dp)
                        //.setContentTitle("Smoking?")
                        //.setContentText("We detected that you're smoking. Is this correct?")
                        .setDefaults(NotificationCompat.DEFAULT_ALL)
                        .setCategory(Notification.CATEGORY_REMINDER)
                        .setPriority(NotificationCompat.PRIORITY_MAX)
                        .setColor(ContextCompat.getColor(getApplicationContext(), R.color.colorPrimaryDark))
                        .setVisibility(NotificationCompat.VISIBILITY_PRIVATE)
                        //.setContentIntent(viewPendingIntent)
                        .addAction(yesAction)
                        .addAction(noAction);

        // Enables launching app in Wear 2.0 while keeping the old Notification Style behavior.
        NotificationCompat.Action mainAction = new NotificationCompat.Action.Builder(
                R.drawable.open_on_phone,
                "Open",
                viewPendingIntent)
                .build();

        notificationBuilder.addAction(mainAction);

        // instance of the NotificationManager service
        NotificationManagerCompat notificationManager =
                NotificationManagerCompat.from(this);

        // Build the notification and notify it using notification manager.
        notificationManager.notify((int) record.recordId, notificationBuilder.build());
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
                viewModel.simulateSmokingEventDetected();
                selectedSection = NavigationSection.Diary;
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
    public void onRequestPermissionsResult(int requestCode, String[] permissions,
                                           int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (grantResults[0] == PackageManager.PERMISSION_GRANTED) {
        }
    }

    public boolean isStoragePermissionGranted() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            if (checkSelfPermission(android.Manifest.permission.WRITE_EXTERNAL_STORAGE)
                    == PackageManager.PERMISSION_GRANTED) {
                return true;
            } else {
                ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE}, 1);
                return false;
            }
        } else { //permission is automatically granted on sdk<23 upon installation
            return true;
        }
    }
}
