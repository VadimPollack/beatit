package de.uni_freiburg.iems.beatit;

import android.app.TimePickerDialog;
import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.icu.util.Calendar;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.support.wear.widget.WearableLinearLayoutManager;
import android.support.wear.widget.WearableRecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TimePicker;

import java.util.List;

public class DiaryView extends Fragment
        implements TimePickerDialog.OnTimeSetListener {
    private DiaryViewModel diaryViewModel;
    private DiaryRecord mSelectedRecord;

    public static DiaryView newInstance() {
        return new DiaryView();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        getContext().deleteDatabase("diary_database");
        return inflater.inflate(R.layout.diary_view, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        WearableRecyclerView recyclerView = getActivity().findViewById(R.id.diary_recycler_view);
        // To align the edge children (first and last) with the center of the screen
        recyclerView.setEdgeItemsCenteringEnabled(true);

        CustomScrollingLayoutCallback customScrollingLayoutCallBack =
                new CustomScrollingLayoutCallback();
        recyclerView.setLayoutManager(new WearableLinearLayoutManager(getActivity(), customScrollingLayoutCallBack));
        recyclerView.setHasFixedSize(true);

        final DiaryAdapter adapter = new DiaryAdapter();
        recyclerView.setAdapter(adapter);

        diaryViewModel = ViewModelProviders.of(this).get(DiaryViewModel.class);
        diaryViewModel.getDiary().observe(this, new Observer<List<DiaryRecord>>() {
            @Override
            public void onChanged(@Nullable List<DiaryRecord> diaryRecords) {
                // update RecyclerView
                adapter.setDiary(diaryRecords);
            }
        });

        //set listener for item clicked
        adapter.setOnItemClickListener(record -> {
            mSelectedRecord = record;
            final Calendar c = Calendar.getInstance();
            c.setTime(record.startDateAndTime);
            int hours = c.get(Calendar.HOUR_OF_DAY);
            int minutes = c.get(Calendar.MINUTE);

            DialogFragment newFragment = new TimePickerFragment();
            Bundle args = new Bundle();
            args.putInt("hours", hours);
            args.putInt("minutes", minutes);
            newFragment.setArguments(args);
            newFragment.show(getActivity().getSupportFragmentManager(), "timePicker");
        });

        FloatingActionButton fab = getActivity().findViewById(R.id.diary_action_button);

        fab.setOnClickListener(v -> {

            // Toast.makeText(getActivity(), "yes", Toast.LENGTH_LONG).show();
        });
    }

    //---------------------------------TimePickerDialog-----------------------------------
    @Override
    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
        mSelectedRecord.startDateAndTime.setHours(hourOfDay);
        mSelectedRecord.startDateAndTime.setMinutes(minute);
        diaryViewModel.update(mSelectedRecord);
    }



    private class CustomScrollingLayoutCallback extends WearableLinearLayoutManager.LayoutCallback {

        // How much should we scale the icon at most.
        private static final float MAX_ICON_PROGRESS = 0.65f;

        private float mProgressToCenter;

        @Override
        public void onLayoutFinished(View child, RecyclerView parent) {

            // Figure out % progress from top to bottom
            float centerOffset = ((float) child.getHeight() / 2.0f) / (float) parent.getHeight();
            float yRelativeToCenterOffset = (child.getY() / parent.getHeight()) + centerOffset;

            // Normalize for center
            mProgressToCenter = Math.abs(0.5f - yRelativeToCenterOffset);
            // Adjust to the maximum scale
            mProgressToCenter = Math.min(mProgressToCenter, MAX_ICON_PROGRESS);

            child.setScaleX(1 - mProgressToCenter);
            child.setScaleY(1 - mProgressToCenter);
        }
    }
}
