package de.uni_freiburg.iems.beatit.mobile;

import android.arch.lifecycle.ViewModelProviders;
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


public class DiaryView extends Fragment {
    private DiaryViewModel diaryViewModel;

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

        new ItemTouchHelper(new ItemTouchHelper.SimpleCallback(0,ItemTouchHelper.LEFT) {
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

        FloatingActionButton fab = getActivity().findViewById(R.id.fab);
        fab.setOnClickListener(v -> {
            Date currentDate = Calendar.getInstance().getTime();
            String timeZone = TimeZone.getDefault().getID();
            int duration = (int) TimeUnit.MINUTES.toMillis(3);
            diaryViewModel.insert(new DiaryRecord(DiaryRecord.Source.USER, currentDate, timeZone, duration));
        });

    }


}
