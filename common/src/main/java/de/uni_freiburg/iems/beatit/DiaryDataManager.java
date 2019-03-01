package de.uni_freiburg.iems.beatit;

import android.app.Application;
import android.arch.lifecycle.LiveData;
import android.content.Context;
import android.os.AsyncTask;
import android.support.annotation.NonNull;

import java.util.List;

public class DiaryDataManager {
    private DiaryRecordDao recordDao;
    private LiveData<List<DiaryRecord>> diary;

    private static DiaryDataManager instance;

    public static synchronized DiaryDataManager getInstance(Context context) {
        if (instance == null) {
            return new DiaryDataManager(context);
        }
        return instance;
    }

    private DiaryDataManager(@NonNull Context context) {
        DiaryDatabase diaryDatabase = DiaryDatabase.getInstance(context);
        recordDao = diaryDatabase.diaryRecordDao();
        diary = recordDao.getAllRecords();
    }

    public void insert(DiaryRecord record) {
        new InsertNoteAsyncTask(recordDao).execute(record);
    }

    public void update(DiaryRecord record) {
        new UpdateNoteAsyncTask(recordDao).execute(record);

    }

    public void delete(DiaryRecord record) {
        new DeleteNoteAsyncTask(recordDao).execute(record);

    }

    public LiveData<List<DiaryRecord>> getDiary() {
        return diary;
    }

    public List<DiaryRecord> getDiarySync() {

        return recordDao.getDiarySyncRecord();
    }

    public DiaryRecord getRecordById(long id) {

        return recordDao.getRecordById(id);
    }

    private static class InsertNoteAsyncTask extends AsyncTask<DiaryRecord, Void, Void> {
        private DiaryRecordDao diaryRecordDao;

        private InsertNoteAsyncTask(DiaryRecordDao recordDao) {
            this.diaryRecordDao = recordDao;
        }

        @Override
        protected Void doInBackground(DiaryRecord... diaryRecords) {
            this.diaryRecordDao.insert(diaryRecords[0]);
            return null;
        }
    }

    private static class UpdateNoteAsyncTask extends AsyncTask<DiaryRecord, Void, Void> {
        private DiaryRecordDao diaryRecordDao;

        private UpdateNoteAsyncTask(DiaryRecordDao recordDao) {
            this.diaryRecordDao = recordDao;
        }

        @Override
        protected Void doInBackground(DiaryRecord... diaryRecords) {
            this.diaryRecordDao.update(diaryRecords[0]);
            return null;
        }
    }

    private static class DeleteNoteAsyncTask extends AsyncTask<DiaryRecord, Void, Void> {
        private DiaryRecordDao diaryRecordDao;

        private DeleteNoteAsyncTask(DiaryRecordDao recordDao) {
            this.diaryRecordDao = recordDao;
        }

        @Override
        protected Void doInBackground(DiaryRecord... diaryRecords) {
            this.diaryRecordDao.delete(diaryRecords[0]);
            return null;
        }
    }
}
