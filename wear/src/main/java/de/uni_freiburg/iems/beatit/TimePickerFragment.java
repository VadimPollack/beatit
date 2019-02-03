package de.uni_freiburg.iems.beatit;

import android.app.Dialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.text.format.DateFormat;
import android.widget.TimePicker;

public class TimePickerFragment extends DialogFragment
        implements TimePickerDialog.OnTimeSetListener {

    TimePickerDialog.OnTimeSetListener mListener;

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Bundle bundle = getArguments();
        int hour = bundle.getInt("hours");
        int minute = bundle.getInt("minutes");

        String title = bundle.getString("title");

        Dialog d = new TimePickerDialog(getActivity(), R.style.MyTimePickerDialogTheme, this, hour, minute,
                DateFormat.is24HourFormat(getActivity()));
        d.setTitle(title);
        return d;
    }

    public void setOnTimeSetListener(TimePickerDialog.OnTimeSetListener listener) {
        mListener = listener;
    }

    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
        if(mListener == null) return;
        mListener.onTimeSet(view, hourOfDay, minute);
    }
}