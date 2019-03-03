package de.uni_freiburg.iems.beatit;

import android.arch.persistence.room.TypeConverter;
import static de.uni_freiburg.iems.beatit.DiaryRecord.Source.MACHINE;
import static de.uni_freiburg.iems.beatit.DiaryRecord.Source.USER;

public class SourceConverter {
    @TypeConverter
    public static DiaryRecord.Source toSource(int source) {
        if (source == USER.getCode()) {
            return USER;
        } else if (source == MACHINE.getCode()) {
            return MACHINE;
        } else {
            throw new IllegalArgumentException("Could not recognize status");
        }
    }

    @TypeConverter
    public static Integer toInt(DiaryRecord.Source source ) {
        return source.getCode();
    }
}