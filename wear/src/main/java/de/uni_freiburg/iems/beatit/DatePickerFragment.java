package de.uni_freiburg.iems.beatit;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.widget.DatePicker;

public class DatePickerFragment extends DialogFragment implements DatePickerDialog.OnDateSetListener {
    private DatePickerDialog.OnDateSetListener mListener;

    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Bundle bundle = getArguments();
        int year = bundle.getInt("year");
        int month = bundle.getInt("month");
        int dayOfMonth = bundle.getInt("dayOfMonth");

        String title = bundle.getString("title");

        Dialog d = new DatePickerDialog(getActivity(), R.style.MyTimePickerDialogTheme, this, year, month, dayOfMonth);
        d.setTitle(title);
        return d;
    }

    public void setOnDateSetListener(DatePickerDialog.OnDateSetListener listener) {
        mListener = listener;
    }

    @Override
    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
        if(mListener == null) return;
        mListener.onDateSet(view, year, month, dayOfMonth);
    }
}
