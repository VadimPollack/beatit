package de.uni_freiburg.iems.beatit;

import android.arch.persistence.room.TypeConverter;

import static de.uni_freiburg.iems.beatit.DiaryRecord.Label.NOT_SMOKING;
import static de.uni_freiburg.iems.beatit.DiaryRecord.Label.SMOKING;
import static de.uni_freiburg.iems.beatit.DiaryRecord.Label.UNLABELED;

public class LabelConverter {
    @TypeConverter
    public static DiaryRecord.Label toLabel(int label) {
        if (label == UNLABELED.getCode()) {
            return UNLABELED;
        } else if (label == SMOKING.getCode()) {
            return SMOKING;
        } else if (label == NOT_SMOKING.getCode()) {
            return NOT_SMOKING;
        } else {
            throw new IllegalArgumentException("Could not recognize status");
        }
    }

    @TypeConverter
    public static Integer toInt(DiaryRecord.Label label ) {
        return label.getCode();
    }
}