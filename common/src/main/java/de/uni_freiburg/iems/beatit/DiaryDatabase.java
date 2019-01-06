package de.uni_freiburg.iems.beatit;

import android.arch.persistence.db.SupportSQLiteDatabase;
import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;
import android.icu.util.Calendar;
import android.icu.util.TimeZone;
import android.os.AsyncTask;
import android.support.annotation.NonNull;

import java.util.Date;


@Database(entities = {DiaryRecord.class}, version = 1)
public abstract class DiaryDatabase extends RoomDatabase {

    private static DiaryDatabase instance;

    public abstract DiaryRecordDao diaryRecordDao();

    public static synchronized DiaryDatabase getInstance(Context context) {
        if (instance == null) {
            instance = Room.databaseBuilder(context.getApplicationContext(),
                    DiaryDatabase.class, "diary_database")
                    .fallbackToDestructiveMigration()
                    .addCallback(roomCallback)
                    .build();
        }
        return instance;
    }

    private static RoomDatabase.Callback roomCallback = new RoomDatabase.Callback() {
        @Override
        public void onCreate(@NonNull SupportSQLiteDatabase db) {
            super.onCreate(db);
            new PopulateDbAsyncTask(instance).execute();
        }
    };

    private static class PopulateDbAsyncTask extends AsyncTask<Void, Void, Void> {
        private DiaryRecordDao recordDao;

        private PopulateDbAsyncTask(DiaryDatabase db) {
            recordDao = db.diaryRecordDao();
        }

        @Override
        protected Void doInBackground(Void... voids) {
            Calendar cal = Calendar.getInstance();
            recordDao.insert(new DiaryRecord(
                    new Date(cal.getTimeInMillis()),
                    TimeZone.getDefault().getID(),
                    300000));
            cal.add(Calendar.HOUR_OF_DAY, -1);
            recordDao.insert(new DiaryRecord(
                    new Date(cal.getTimeInMillis()),
            TimeZone.getDefault().getID(),
                    600000));
            cal.add(Calendar.HOUR_OF_DAY, -1);
            cal.add(Calendar.MINUTE, 30);
            recordDao.insert(new DiaryRecord(
                    new Date(cal.getTimeInMillis()),
                    TimeZone.getDefault().getID(),
                    30000));
            return null;
        }
    }
}
