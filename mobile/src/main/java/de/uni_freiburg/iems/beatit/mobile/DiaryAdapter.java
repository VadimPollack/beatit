package de.uni_freiburg.iems.beatit.mobile;

import android.icu.text.DateFormat;
import android.icu.text.SimpleDateFormat;
import android.support.annotation.NonNull;
import android.support.v7.recyclerview.extensions.ListAdapter;
import android.support.v7.util.DiffUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Locale;

import de.uni_freiburg.iems.beatit.DiaryRecord;

public class DiaryAdapter extends ListAdapter<DiaryRecord, DiaryAdapter.DiaryHolder> {
    private OnDateClickListener onDateClickListener;
    private OnDurationClickListener onDurationClickListener;
    private OnLabelClickListener onLabelClickListener;

    public DiaryAdapter() {
        super(DIFF_CALLBACK);
    }

    private static final DiffUtil.ItemCallback<DiaryRecord> DIFF_CALLBACK = new DiffUtil.ItemCallback<DiaryRecord>() {
        @Override
        public boolean areItemsTheSame(DiaryRecord oldItem, DiaryRecord newItem) {
            return (oldItem.recordId.equals(newItem.recordId));
        }

        @Override
        public boolean areContentsTheSame(DiaryRecord oldItem, DiaryRecord newItem) {
            if (oldItem.duration != newItem.duration) return false;
            if (oldItem.startDateAndTime.compareTo(newItem.startDateAndTime) != 0) return false;
            if (oldItem.userLabel.compareTo(newItem.userLabel) != 0) return false;
            if (!oldItem.timeZone.equals(newItem.timeZone)) return false;
            return true;
        }
    };

    @NonNull
    @Override
    public DiaryHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.diary_item, parent, false);
        return new DiaryHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull DiaryHolder holder, int position) {
        DiaryRecord currentRecord = getItem(position);
        DateFormat df = new SimpleDateFormat("EEEE, d MMM, HH:mm", Locale.ENGLISH);
        holder.textViewTime.setText(df.format(currentRecord.startDateAndTime));
        holder.textViewDuration.setText(String.valueOf((currentRecord.duration / (1000 * 60))));
        holder.imageViewLabel.setImageResource(chooseImageSource(currentRecord.userLabel));
    }

    private int chooseImageSource(DiaryRecord.Label userLabel) {
        switch (userLabel) {
            case UNLABELED:
                return R.drawable.ic_diary_label_unlabeled_50dp;
            case NOT_SMOKING:
                return R.drawable.ic_diary_label_not_smoking_50dp;
            case SMOKING:
                return R.drawable.ic_diary_label_smoking_50dp;
            default:
                return 0;
        }
    }

    public DiaryRecord getDiaryRecordAt(int position) {
        return getItem(position);
    }

    class DiaryHolder extends RecyclerView.ViewHolder {
        private TextView textViewTime;
        private TextView textViewDuration;
        private TextView textViewMinutesLabel;
        private ImageView imageViewLabel;

        public DiaryHolder(View itemView) {
            super(itemView);
            textViewTime = itemView.findViewById(de.uni_freiburg.iems.beatit.mobile.R.id.text_view_diary_item_time);
            textViewMinutesLabel = itemView.findViewById(de.uni_freiburg.iems.beatit.mobile.R.id.text_view_diary_item_minutes_label);
            textViewDuration = itemView.findViewById(de.uni_freiburg.iems.beatit.mobile.R.id.text_view_diary_item_minutes);
            imageViewLabel = itemView.findViewById(de.uni_freiburg.iems.beatit.mobile.R.id.image_view_diary_label);
            imageViewLabel.setOnClickListener(l -> {
                int position = getAdapterPosition();
                if (onLabelClickListener != null && position != RecyclerView.NO_POSITION) {
                    onLabelClickListener.onLabelClick(getItem(position));
                }
            });
            TextView.OnClickListener onClickListener = v -> {
                int position = getAdapterPosition();
                if (onDurationClickListener != null && position != RecyclerView.NO_POSITION) {
                    onDurationClickListener.onDurationClick(getItem(position));
                }
            };
            textViewMinutesLabel.setOnClickListener(onClickListener);
            textViewDuration.setOnClickListener(onClickListener);

            textViewTime.setOnClickListener(v -> {
                int position = getAdapterPosition();
                if (onDateClickListener != null && position != RecyclerView.NO_POSITION) {
                    onDateClickListener.onDateClick(getItem(position));
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

    public interface OnLabelClickListener {
        void onLabelClick(DiaryRecord record);
    }

    public void setOnDateClickListener(OnDateClickListener listener) {
        this.onDateClickListener = listener;
    }

    public void setOnDurationClickListener(OnDurationClickListener listener) {
        this.onDurationClickListener = listener;
    }

    public void setOnLabelClickListener(OnLabelClickListener listener) {
        this.onLabelClickListener = listener;
    }
}