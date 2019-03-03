package de.uni_freiburg.iems.beatit.notifications;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.icu.text.DateFormat;
import android.icu.text.SimpleDateFormat;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.NotificationManagerCompat;
import android.support.v4.content.ContextCompat;

import java.util.Locale;
import java.util.UUID;

import de.uni_freiburg.iems.beatit.DiaryRecord;
import de.uni_freiburg.iems.beatit.R;

public class SmokingEventDetectedNotification {
    Context mContext;
    DiaryRecord mDiaryRecord;

    public SmokingEventDetectedNotification(Context context, DiaryRecord record){
        mContext = context.getApplicationContext();
        mDiaryRecord = record;
    }

    public void show() {
        // Build intent for notification content
        Intent viewIntent = new Intent(mContext, SmokingEventDetectedNotification.class);
        PendingIntent viewPendingIntent =
                PendingIntent.getActivity(
                        mContext,
                        0,
                        viewIntent,
                        0); // nachschauen!

        // Build intent for "Yes" action button
        Intent yesIntent = new Intent(mContext, SmokeEventDetectedIntentService.class);
        yesIntent.setAction(SmokeEventDetectedIntentService.ACTION_YES);
        yesIntent.putExtra("ID", mDiaryRecord.recordId);
        PendingIntent yesPendingIntent = PendingIntent.getService(mContext, 0, yesIntent, PendingIntent.FLAG_UPDATE_CURRENT);
        NotificationCompat.Action yesAction =
                new NotificationCompat.Action.Builder(
                        R.drawable.ic_cigarette_black_24dp,
                        "Yes",
                        yesPendingIntent)
                        .build();

        // Build intent for "No" action button
        Intent noIntent = new Intent(mContext, SmokeEventDetectedIntentService.class);
        noIntent.putExtra("ID", mDiaryRecord.recordId);
        noIntent.setAction(SmokeEventDetectedIntentService.ACTION_NO);
        PendingIntent noPendingIntent = PendingIntent.getService(mContext, 0, noIntent, PendingIntent.FLAG_UPDATE_CURRENT);
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
                .bigText("@ " + df.format(mDiaryRecord.startDateAndTime) + " ?")
                // Overrides ContentTitle in the big form of the template.
                .setBigContentTitle("Did you smoke ")
                // Summary line after the detail section in the big form of the template
                // Note: To improve readability, don't overload the user with info. If Summary Text
                // doesn't add critical information, you should skip it.
                .setSummaryText("Summary");

        //Building notification layout
        NotificationCompat.Builder notificationBuilder =
                new NotificationCompat.Builder(mContext, NotificationUtil.createNotificationChannel(mContext))
                        .setStyle(bigTextStyle)
                        .setSmallIcon(R.drawable.ic_cigarette_black_24dp)
                        //.setContentTitle("Smoking?")
                        //.setContentText("We detected that you're smoking. Is this correct?")
                        .setDefaults(NotificationCompat.DEFAULT_ALL)
                        .setCategory(Notification.CATEGORY_REMINDER)
                        .setPriority(NotificationCompat.PRIORITY_MAX)
                        .setColor(ContextCompat.getColor(mContext, R.color.colorPrimaryDark))
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
                NotificationManagerCompat.from(mContext);

        // Build the notification and notify it using notification manager.
        notificationManager.notify(getNotificationIdFromUUID(mDiaryRecord.recordId), notificationBuilder.build());
    }
    public static int getNotificationIdFromUUID(String str){
        return UUID.fromString(str).hashCode();
    }
}
