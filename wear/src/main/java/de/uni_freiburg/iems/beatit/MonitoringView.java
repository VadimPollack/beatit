package de.uni_freiburg.iems.beatit;

import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

public class MonitoringView extends Fragment {

    private MonitoringViewModel monitoringViewModel;
    private ImageButton startStopButton;
    private TextView startTimeTextView;
    private Boolean isChecked = false;

    public static MonitoringView newInstance() {
        return new MonitoringView();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.monitoring_view, container, false);
        startStopButton = rootView.findViewById(R.id.monitoring_start_stop_button);
        startTimeTextView = rootView.findViewById(R.id.monitoring_start_time_text_view);
        return rootView;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        monitoringViewModel = ViewModelProviders.of(this).get(MonitoringViewModel.class);
        startStopButton.setOnClickListener(view -> monitoringViewModel.startMonitoring());
        monitoringViewModel.getIsMonitoringStarted().observe(this, isMonitoringStarted -> {
            MainActivityViewModel vm = ViewModelProviders.of(getActivity()).get(MainActivityViewModel.class);
            vm.onSmokingEventDetected();
            isChecked = !isChecked;
            if (isChecked) {
                startStopButton.setImageResource(R.drawable.ic_stop_white_24dp);
            } else {
                startStopButton.setImageResource(R.drawable.ic_monitoring_white_24dp);
            }
        });
    }


}
