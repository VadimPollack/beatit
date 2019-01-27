package de.uni_freiburg.iems.beatit;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.arch.lifecycle.ViewModelProviders;
import android.icu.util.Calendar;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.helper.ItemTouchHelper;
import android.support.wear.widget.WearableLinearLayoutManager;
import android.support.wear.widget.WearableRecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;
import android.widget.TimePicker;
import android.widget.Toast;

import java.util.Date;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

public class DiaryView extends Fragment
        implements TimePickerDialog.OnTimeSetListener, DatePickerDialog.OnDateSetListener, NumberPickerFragment.onNumberSetListener {
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
        diaryViewModel.getDiary().observe(this, diaryRecords -> {
            // update RecyclerView
            adapter.setDiary(diaryRecords);
        });

        new ItemTouchHelper(new ItemTouchHelper.SimpleCallback(0,ItemTouchHelper.LEFT) {
            @Override
            public boolean onMove(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder target) {
                return false;
            }

            @Override
            public void onSwiped(RecyclerView.ViewHolder viewHolder, int direction) {
                diaryViewModel.delete(adapter.getDiaryRecordAt(viewHolder.getAdapterPosition()));
                Toast.makeText(getActivity(), "Note deleted", Toast.LENGTH_SHORT).show();
            }
        }).attachToRecyclerView(recyclerView);

        //set listener for date and time clicked
        adapter.setOnDateClickListener(record -> {
            mSelectedRecord = record;
            showDatePickerDialog();
        });
        adapter.setOnDurationClickListener(record -> {
            mSelectedRecord = record;
            showDurationPickerDialog();
        });
        adapter.setOnLabelClickListener(record -> {
            mSelectedRecord = record;
            rotateLabel();
        });

        FloatingActionButton fab = getActivity().findViewById(R.id.diary_action_button);
        fab.setOnClickListener(v -> {
            Date currentDate = Calendar.getInstance().getTime();
            String timeZone = TimeZone.getDefault().getID();
            int duration = (int) TimeUnit.MINUTES.toMillis(3);
            diaryViewModel.insert(new DiaryRecord(currentDate, timeZone, duration));
        });
    }

    private void rotateLabel(){
        switch (mSelectedRecord.userLabel){
            case UNLABELED:
                mSelectedRecord.userLabel = DiaryRecord.Label.NOT_SMOKING;
                break;
            case NOT_SMOKING:
                mSelectedRecord.userLabel = DiaryRecord.Label.SMOKING;
                break;
            case SMOKING:
                mSelectedRecord.userLabel = DiaryRecord.Label.UNLABELED;
                break;
        }
        diaryViewModel.update(mSelectedRecord);
    }

    //---------------------------------DurationPickerDialog-----------------------------------
    private void showDurationPickerDialog() {
        if (mSelectedRecord == null) return;
        NumberPickerFragment newFragment = new NumberPickerFragment();
        Bundle args = new Bundle();
        args.putInt("count", (int) TimeUnit.MILLISECONDS.toMinutes((mSelectedRecord.duration)));
        args.putString("title", "Select Duration:");
        args.putInt("min", 1);
        args.putInt("max", 60);
        newFragment.setArguments(args);
        newFragment.setOnNumberSetListener(this);
        newFragment.show(getActivity().getSupportFragmentManager(), "durationPicker");
    }

    @Override
    public void onNumberSet(int number) {
        mSelectedRecord.duration = (int) TimeUnit.MINUTES.toMillis((long) number);
        diaryViewModel.update(mSelectedRecord);
    }

    //---------------------------------DatePickerDialog-----------------------------------
    private void showDatePickerDialog() {
        if (mSelectedRecord == null) return;
        final Calendar c = Calendar.getInstance();
        c.setTime(mSelectedRecord.startDateAndTime);
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH);
        int dayOfMonth = c.get(Calendar.DAY_OF_MONTH);

        DatePickerFragment newFragment = new DatePickerFragment();
        Bundle args = new Bundle();
        args.putInt("year", year);
        args.putInt("month", month);
        args.putInt("dayOfMonth", dayOfMonth);
        args.putString("title", "Select Date:");
        newFragment.setArguments(args);
        newFragment.setOnDateSetListener(this);
        newFragment.show(getActivity().getSupportFragmentManager(), "datePicker");
    }

    @Override
    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(mSelectedRecord.startDateAndTime);
        cal.set(year, month, dayOfMonth);
        mSelectedRecord.startDateAndTime.setTime(cal.getTimeInMillis());
        diaryViewModel.update(mSelectedRecord);
        showTimePickerDialog();
    }

    //---------------------------------TimePickerDialog-----------------------------------
    private void showTimePickerDialog() {
        if (mSelectedRecord == null) return;
        final Calendar c = Calendar.getInstance();
        c.setTime(mSelectedRecord.startDateAndTime);
        int hours = c.get(Calendar.HOUR_OF_DAY);
        int minutes = c.get(Calendar.MINUTE);

        TimePickerFragment newFragment = new TimePickerFragment();
        Bundle args = new Bundle();
        args.putInt("hours", hours);
        args.putInt("minutes", minutes);
        args.putString("title", "Select Time:");
        newFragment.setArguments(args);
        newFragment.setOnTimeSetListener(this);
        newFragment.show(getActivity().getSupportFragmentManager(), "timePicker");
    }

    @Override
    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(mSelectedRecord.startDateAndTime);
        cal.set(Calendar.HOUR_OF_DAY, hourOfDay);
        cal.set(Calendar.MINUTE, minute);
        mSelectedRecord.startDateAndTime.setTime(cal.getTimeInMillis());
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
