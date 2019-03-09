package de.uni_freiburg.iems.beatit.notifications;

import android.app.IntentService;
import android.content.Intent;
import android.support.v4.app.NotificationManagerCompat;
import android.util.Log;

import de.uni_freiburg.iems.beatit.DiaryDataManager;
import de.uni_freiburg.iems.beatit.DiaryRecord;

/**
 * Asynchronously handles yes and no actions for smoking detected notification.
 */
public class SmokeEventDetectedIntentService extends IntentService {

    private static final String TAG = "BigTextService";

    public static final String ACTION_YES =
            "de.uni_freiburg.iems.beatit.notifications.action.YES";
    public static final String ACTION_DELETE =
            "de.uni_freiburg.iems.beatit.notifications.action.DELETE";

    public SmokeEventDetectedIntentService() {
        super("SmokeEventDetectedIntentService");
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        Log.d(TAG, "onHandleIntent(): " + intent);

        String id = intent.getStringExtra("ID");
        DiaryDataManager dataManager = DiaryDataManager.getInstance(getApplication());
        DiaryRecord currentRecord = dataManager.getRecordById(id);

        try {
            if (intent != null) {
                final String action = intent.getAction();
                if (ACTION_YES.equals(action)) {
                    currentRecord.userLabel = DiaryRecord.Label.SMOKING;
                } else if (ACTION_DELETE.equals(action)) {
                    currentRecord.userLabel = DiaryRecord.Label.NOT_SMOKING;
                }
            }

        dataManager.update(currentRecord);
        dismissNotification(SmokingEventDetectedNotification.getNotificationIdFromUUID(id));
        } catch (Exception e) {
            Log.d(TAG, "Didn't find element with ID = " + id);
        }
    }

    private void dismissNotification(int id) {
        Log.d(TAG, "dismissNotification(" + id + ")");
        NotificationManagerCompat notificationManagerCompat =
                NotificationManagerCompat.from(getApplicationContext());
        notificationManagerCompat.cancel(id);
    }
}
