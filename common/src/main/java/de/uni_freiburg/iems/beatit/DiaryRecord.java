package de.uni_freiburg.iems.beatit;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.Ignore;
import android.arch.persistence.room.PrimaryKey;

import android.arch.persistence.room.TypeConverters;

import java.util.Date;

@Entity(tableName = "diary_table")
public class DiaryRecord {

    public enum Label {
        UNLABELED(0),
        SMOKING(1),
        NOT_SMOKING(2);

        private int code;

        Label(int code) {
            this.code = code;
        }

        public int getCode() {
            return code;
        }
    }

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "record_id")
    public long recordId;

    @ColumnInfo(name = "user_label")
    @TypeConverters(LabelConverter.class)
    public Label userLabel;

    @ColumnInfo(name = "start_date_and_time")
    @TypeConverters(TimeStampConverter.class)
    public Date startDateAndTime;

    @ColumnInfo(name = "time_zone")
    public String timeZone;

    // duration in milliseconds
    @ColumnInfo(name = "duration")
    public int duration;

    @Ignore
    public DiaryRecord(Date startDateAndTime, String timeZone, int duration){
        this.startDateAndTime = startDateAndTime;
        this.timeZone = timeZone;
        this.duration = duration;
        this.userLabel = Label.UNLABELED;
    }

    public DiaryRecord(Label userLabel, Date startDateAndTime, String timeZone, int duration) {
        this(startDateAndTime, timeZone, duration);
        this.userLabel = userLabel;
    }
}
