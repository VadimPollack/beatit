package de.uni_freiburg.iems.beatit;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

@Dao
public interface DiaryRecordDao {

    @Insert
    void insert(DiaryRecord record);

    @Update
    void update(DiaryRecord record);

    @Delete
    void delete(DiaryRecord record);

    @Query("SELECT * FROM diary_table ORDER BY start_date_and_time DESC")
    LiveData<List<DiaryRecord>> getAllRecords();
}
