package de.uni_freiburg.iems.beatit.mobile;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Intent;
import android.icu.util.Calendar;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.helper.ItemTouchHelper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.Date;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

import de.uni_freiburg.iems.beatit.DiaryRecord;
import de.uni_freiburg.iems.beatit.DiaryViewModel;

import static android.app.Activity.RESULT_OK;


public class DiaryView extends Fragment {
    private DiaryViewModel diaryViewModel;
    public static final int UPDATE_DURATION_REQUEST = 1;
    private DiaryRecord mSelectedRecord;

    public static DiaryView newInstance() {
        return new DiaryView();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.diary_view, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        RecyclerView rv = (RecyclerView) getActivity().findViewById(R.id.smokeList);
        rv.setLayoutManager(new LinearLayoutManager(getContext()));
        final DiaryAdapter adapter = new DiaryAdapter();
        rv.setAdapter(adapter);

        diaryViewModel = ViewModelProviders.of(this).get(DiaryViewModel.class);
        diaryViewModel.getDiary().observe(this, diaryRecords -> {
            // update RecyclerView
            adapter.submitList(diaryRecords);
        });

        new ItemTouchHelper(new ItemTouchHelper.SimpleCallback(0, ItemTouchHelper.LEFT) {
            @Override
            public boolean onMove(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder target) {
                return false;
            }

            @Override
            public void onSwiped(RecyclerView.ViewHolder viewHolder, int direction) {
                diaryViewModel.delete(adapter.getDiaryRecordAt(viewHolder.getAdapterPosition()));
                Toast.makeText(getActivity(), "Record deleted", Toast.LENGTH_SHORT).show();
            }
        }).attachToRecyclerView(rv);

        adapter.setOnDateClickListener(recordClicked -> {
            Calendar inputCal = Calendar.getInstance();
            inputCal.setTime(recordClicked.startDateAndTime);

            // get date from dialog
            new DatePickerDialog(getContext(), (view, year, month, dayOfMonth) -> {
                Calendar returnedCal = Calendar.getInstance();
                returnedCal.set(year, month, dayOfMonth);

                // get time from dialog
                new TimePickerDialog(getContext(), (timeView, hourOfDay, minute) -> {
                    returnedCal.set(Calendar.HOUR_OF_DAY, hourOfDay);
                    returnedCal.set(Calendar.MINUTE, minute);
                    // update date and time
                    recordClicked.startDateAndTime = returnedCal.getTime();
                    diaryViewModel.update(recordClicked);
                }, inputCal.get(Calendar.HOUR_OF_DAY), inputCal.get(Calendar.MINUTE), true).show();

            }, inputCal.get(Calendar.YEAR), inputCal.get(Calendar.MONTH), inputCal.get(Calendar.DAY_OF_MONTH)).show();
        });

        adapter.setOnDurationClickListener(recordClicked -> {
            Intent intent = new Intent(getContext(), UpdatedDurationView.class);
            intent.putExtra(UpdatedDurationView.EXTRA_DURATION, (int) TimeUnit.MILLISECONDS.toMinutes(recordClicked.duration));
            mSelectedRecord = recordClicked;
            startActivityForResult(intent, UPDATE_DURATION_REQUEST);
        });

        adapter.setOnLabelClickListener(record -> {
            mSelectedRecord = record;
            rotateLabel();
        });

        FloatingActionButton fab = getActivity().findViewById(R.id.fab);
        fab.setOnClickListener(v -> {
            Date currentDate = Calendar.getInstance().getTime();
            String timeZone = TimeZone.getDefault().getID();
            int duration = (int) TimeUnit.MINUTES.toMillis(3);
            diaryViewModel.insert(new DiaryRecord(DiaryRecord.Source.USER, currentDate, timeZone, duration));
        });

    }

    private void rotateLabel() {

        switch (mSelectedRecord.userLabel) {
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

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == UPDATE_DURATION_REQUEST && resultCode == RESULT_OK) {
            int durationInMinutes = data.getIntExtra(UpdatedDurationView.EXTRA_DURATION, 0);
            mSelectedRecord.duration = (int) TimeUnit.MINUTES.toMillis(durationInMinutes);
            diaryViewModel.update(mSelectedRecord);
        } else {
            Toast.makeText(getContext(), "Update failed", Toast.LENGTH_SHORT);
        }
    }
}
