package de.uni_freiburg.iems.beatit;

import android.app.Dialog;
import android.app.TimePickerDialog;
import android.os.Bundle;;
import android.support.v4.app.DialogFragment;
import android.text.format.DateFormat;
import android.widget.TimePicker;

public class TimePickerFragment extends DialogFragment
        implements TimePickerDialog.OnTimeSetListener {

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Bundle bundle = getArguments();
        int hour = bundle.getInt("hours");
        int minute = bundle.getInt("minutes");

        Dialog d = new TimePickerDialog(getActivity(), this, hour, minute,
                DateFormat.is24HourFormat(getActivity()));
        d.setTitle("Test");
        return d;
    }

    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
        // Do something with the time chosen by the user
    }
}
/*package de.uni_freiburg.iems.beatit;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class DiaryAddRecordView extends Fragment {

    public static DiaryAddRecordView newInstance() {
        return new DiaryView();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.diary_add_record_view, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        TextView instruction = getActivity().findViewById(R.id.diary_add_record_text_view);
        FloatingActionButton fab =  getActivity().findViewById(R.id.diary_action_button);

        fab.setOnClickListener(v -> {

            // Toast.makeText(getActivity(), "yes", Toast.LENGTH_LONG).show();
        });
    }
}
*/