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

import java.util.List;
import java.util.Locale;

import de.uni_freiburg.iems.beatit.DiaryRecord;

public class DiaryAdapter extends ListAdapter<DiaryRecord, DiaryAdapter.DiaryHolder> {
    private OnItemClickListener listener;

    public DiaryAdapter() {
        super(DIFF_CALLBACK);
    }

    private static final DiffUtil.ItemCallback<DiaryRecord> DIFF_CALLBACK = new DiffUtil.ItemCallback<DiaryRecord>() {
        @Override
        public boolean areItemsTheSame(DiaryRecord oldItem, DiaryRecord newItem) {
            if(!oldItem.recordId.equals(newItem.recordId)) return false;
            return true;
        }

        @Override
        public boolean areContentsTheSame(DiaryRecord oldItem, DiaryRecord newItem) {
            if(oldItem.duration != newItem.duration) return false;
            if(oldItem.startDateAndTime != newItem.startDateAndTime) return false;
            if(oldItem.userLabel != newItem.userLabel) return false;
            if(oldItem.timeZone != newItem.timeZone) return false;
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
                return R.drawable.ic_diary_label_unlabeled_24dp;
            case NOT_SMOKING:
                return R.drawable.ic_diary_label_not_smoking_24dp;
            case SMOKING:
                return R.drawable.ic_diary_label_smoking_24dp;
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
        private ImageView imageViewLabel;

        public DiaryHolder(View itemView) {
            super(itemView);
            textViewTime = itemView.findViewById(de.uni_freiburg.iems.beatit.mobile.R.id.text_view_diary_item_time);
            textViewDuration = itemView.findViewById(de.uni_freiburg.iems.beatit.mobile.R.id.text_view_diary_item_minutes);
            imageViewLabel = itemView.findViewById(de.uni_freiburg.iems.beatit.mobile.R.id.image_view_diary_label);
            itemView.setOnClickListener(v -> {
                int position = getAdapterPosition();
                if (listener != null && position != RecyclerView.NO_POSITION) {
                    listener.onItemClick(getItem(position));
                }
            });
        }
    }

    public interface OnItemClickListener {
        void onItemClick(DiaryRecord record);
    }


    public void setOnItemClickListener(OnItemClickListener listener) {
        this.listener = listener;
    }


}