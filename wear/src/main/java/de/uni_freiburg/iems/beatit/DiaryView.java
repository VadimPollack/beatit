package de.uni_freiburg.iems.beatit;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import java.util.List;

public class DiaryView extends AppCompatActivity {
    private DiaryViewModel diaryViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.diary_view);

        diaryViewModel = ViewModelProviders.of(this).get(DiaryViewModel.class);
        diaryViewModel.getDiary().observe(this, new Observer<List<DiaryRecord>>() {
            @Override
            public void onChanged(@Nullable List<DiaryRecord> diaryRecords) {
                // update RecyclerView
            }
        });
    }
}
