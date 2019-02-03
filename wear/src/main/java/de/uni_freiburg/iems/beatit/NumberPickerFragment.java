package de.uni_freiburg.iems.beatit;

import android.app.Dialog;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.NumberPicker;

public class NumberPickerFragment extends DialogFragment {
    private onNumberSetListener listener;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setStyle(DialogFragment.STYLE_NO_FRAME, R.style.MyTimePickerDialogTheme);
    }

    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        return super.onCreateDialog(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.numberpicker, container, false);
        Bundle bundle = getArguments();
        int number = bundle.getInt("count");
        int min = bundle.getInt("min");
        int max = bundle.getInt("max");
        String title = bundle.getString("title");

        getDialog().setTitle(title);
        NumberPicker picker = rootView.findViewById(R.id.picker);
        picker.setMinValue(min);
        picker.setMaxValue(max);
        picker.setValue(number);
        Button b = rootView.findViewById(R.id.numberpicker_button);
        b.setOnClickListener(v -> {
            dismiss();
            listener.onNumberSet(picker.getValue());
        });
        return rootView;
    }

    public void setOnNumberSetListener(onNumberSetListener listener) {
        this.listener = listener;
    }

    public interface onNumberSetListener {
        void onNumberSet(int number);
    }
}
