package de.uni_freiburg.iems.beatit;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.wear.widget.WearableLinearLayoutManager;
import android.support.wear.widget.WearableRecyclerView;
import android.view.Window;

import java.util.List;

public class DiaryView extends AppCompatActivity {
    private DiaryViewModel diaryViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);//will hide the title
        getSupportActionBar().hide();
        setContentView(R.layout.diary_view);


        WearableRecyclerView recyclerView = findViewById(R.id.diary_recycler_view);
        // To align the edge children (first and last) with the center of the screen
        recyclerView.setEdgeItemsCenteringEnabled(true);

        recyclerView.setLayoutManager(new WearableLinearLayoutManager(this));
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
    }
}
