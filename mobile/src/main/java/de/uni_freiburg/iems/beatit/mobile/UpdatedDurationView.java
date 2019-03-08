package de.uni_freiburg.iems.beatit.mobile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.NumberPicker;

public class UpdatedDurationView extends AppCompatActivity {
    public static final String EXTRA_DURATION =
            "de.uni_freiburg.iems.beatit.mobile.EXTRA_DURATION";

    private NumberPicker numberPicker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_duration);
        numberPicker = findViewById(R.id.number_picker_duration);
        numberPicker.setMinValue(1);
        numberPicker.setMaxValue(60);

        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_clear_white_24dp);
        setTitle("Update Duration");
        int val = getIntent().getIntExtra(EXTRA_DURATION, 1);
        numberPicker.setValue(val);
    }

    private void saveRecord() {
        int duration = numberPicker.getValue();

        Intent data = new Intent();
        data.putExtra(EXTRA_DURATION, duration);

        setResult(RESULT_OK, data);
        finish();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_add_diary_record, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.save_record:
                saveRecord();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
