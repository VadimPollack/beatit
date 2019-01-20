package de.uni_freiburg.iems.beatit.notifications;

import android.app.IntentService;
import android.content.Intent;
import android.support.v4.app.NotificationManagerCompat;
import android.util.Log;

import de.uni_freiburg.iems.beatit.MainActivity;

/**
 * Asynchronously handles snooze and dismiss actions for reminder app (and active Notification).
 * Notification for for reminder app uses BigTextStyle.
 */
public class SmokeEventDetectedIntentService extends IntentService {

    private static final String TAG = "BigTextService";

    public static final String ACTION_YES =
            "de.uni_freiburg.iems.beatit.notifications.action.YES";
    public static final String ACTION_NO =
            "de.uni_freiburg.iems.beatit.notifications.action.NO";

    public SmokeEventDetectedIntentService() {
        super("SmokeEventDetectedIntentService");
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        Log.d(TAG, "onHandleIntent(): " + intent);

        if (intent != null) {
            final String action = intent.getAction();
            if (ACTION_YES.equals(action)) {
                handleActionYes();
            } else if (ACTION_NO.equals(action)) {
                handleActionNo();
            }
        }
    }

    /**
     * Handles action Dismiss in the provided background thread.

     private void handleActionDismiss() {
     Log.d(TAG, "handleActionDismiss()");

     NotificationManagerCompat notificationManagerCompat =
     NotificationManagerCompat.from(getApplicationContext());
     notificationManagerCompat.cancel(MainActivity.NOTIFICATION_ID);
     }*/

    /**
     * Handles action Snooze in the provided background thread.
     */
    private void handleActionYes() {
        Log.d(TAG, "handleActionYes()");
        NotificationManagerCompat notificationManagerCompat =
                NotificationManagerCompat.from(getApplicationContext());
        notificationManagerCompat.cancel(MainActivity.NOTIFICATION_ID);
    }

    /**
     * Handles action Snooze in the provided background thread.
     */
    private void handleActionNo() {
        Log.d(TAG, "handleActionNo()");
        NotificationManagerCompat notificationManagerCompat =
                NotificationManagerCompat.from(getApplicationContext());
        notificationManagerCompat.cancel(MainActivity.NOTIFICATION_ID);
    }
}
