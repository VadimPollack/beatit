package de.uni_freiburg.iems.beatit;

import android.app.DatePickerDialog;
import android.icu.text.DateFormat;
import android.icu.text.SimpleDateFormat;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.support.wear.widget.WearableRecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class DiaryAdapter extends WearableRecyclerView.Adapter<DiaryAdapter.DiaryHolder> {
    private List<DiaryRecord> diary = new ArrayList<>();
    private OnDateClickListener onDateClickListener;
    private OnDurationClickListener onDurationClickListener;

    @NonNull
    @Override
    public DiaryHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.diary_item, parent, false);
        return new DiaryHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull DiaryHolder holder, int position) {
        DiaryRecord currentRecord = diary.get(position);
        DateFormat df = new SimpleDateFormat("EEEE, d MMM, HH:mm", Locale.ENGLISH);
        holder.textViewTime.setText(df.format(currentRecord.startDateAndTime));
        holder.textViewDuration.setText(String.valueOf((currentRecord.duration / (1000 * 60))));
    }

    @Override
    public int getItemCount() {
        return diary.size();
    }

    public void setDiary(List<DiaryRecord> diary) {
        this.diary = diary;
        notifyDataSetChanged();
    }

    class DiaryHolder extends WearableRecyclerView.ViewHolder {
        private TextView textViewTime;
        private TextView textViewDuration;

        public DiaryHolder(View itemView) {
            super(itemView);
            textViewTime = itemView.findViewById(R.id.text_view_diary_item_time);
            textViewDuration = itemView.findViewById(R.id.text_view_diary_item_minutes);
            textViewDuration.setOnClickListener(l -> {
                int position = getAdapterPosition();
                if (onDurationClickListener != null && position != RecyclerView.NO_POSITION) {
                    onDurationClickListener.onDurationClick(diary.get(position));
                }
            });

            textViewTime.setOnClickListener(v -> {
                int position = getAdapterPosition();
                if (onDateClickListener != null && position != RecyclerView.NO_POSITION) {
                    onDateClickListener.onDateClick(diary.get(position));
                }
            });
        }
    }

    public interface OnDateClickListener {
        void onDateClick(DiaryRecord record);
    }

    public interface OnDurationClickListener {
        void onDurationClick(DiaryRecord record);
    }

    public void setOnDateClickListener(OnDateClickListener listener) {
        this.onDateClickListener = listener;
    }

    public void setOnDurationClickListener(OnDurationClickListener listener) {
        this.onDurationClickListener = listener;
    }
}
