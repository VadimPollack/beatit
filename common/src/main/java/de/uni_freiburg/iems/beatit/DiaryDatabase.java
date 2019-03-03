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


@Database(entities = {DiaryRecord.class}, version = 2)
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
            recordDao.insert(new DiaryRecord(DiaryRecord.Source.MACHINE,
                    DiaryRecord.Label.SMOKING,
                    new Date(cal.getTimeInMillis()),
                    TimeZone.getDefault().getID(),
                    300000));
            cal.add(Calendar.HOUR_OF_DAY, -1);
            recordDao.insert(new DiaryRecord(DiaryRecord.Source.USER,
                    DiaryRecord.Label.NOT_SMOKING,
                    new Date(cal.getTimeInMillis()),
            TimeZone.getDefault().getID(),
                    600000));
            cal.add(Calendar.HOUR_OF_DAY, -1);
            cal.add(Calendar.MINUTE, 27);
            recordDao.insert(new DiaryRecord(DiaryRecord.Source.USER,
                    new Date(cal.getTimeInMillis()),
                    TimeZone.getDefault().getID(),
                    30000));
            cal.add(Calendar.HOUR_OF_DAY, -2);
            cal.add(Calendar.MINUTE, 30);
            recordDao.insert(new DiaryRecord(DiaryRecord.Source.MACHINE,
                    new Date(cal.getTimeInMillis()),
                    TimeZone.getDefault().getID(),
                    490000));
            cal.add(Calendar.DAY_OF_MONTH, -1);
            cal.add(Calendar.MINUTE, 36);
            recordDao.insert(new DiaryRecord(DiaryRecord.Source.USER,
                    new Date(cal.getTimeInMillis()),
                    TimeZone.getDefault().getID(),
                    80000));
            cal.add(Calendar.HOUR_OF_DAY, -10);
            cal.add(Calendar.MINUTE, 14);
            recordDao.insert(new DiaryRecord(DiaryRecord.Source.USER,
                    new Date(cal.getTimeInMillis()),
                    TimeZone.getDefault().getID(),
                    110000));
            cal.add(Calendar.MONTH, -1);
            cal.add(Calendar.MINUTE, 30);
            recordDao.insert(new DiaryRecord(DiaryRecord.Source.MACHINE,
                    new Date(cal.getTimeInMillis()),
                    TimeZone.getDefault().getID(),
                    260000));
            return null;
        }
    }
}
