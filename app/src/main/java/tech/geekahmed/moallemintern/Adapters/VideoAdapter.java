package tech.geekahmed.moallemintern.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import tech.geekahmed.moallemintern.R;
import tech.geekahmed.moallemintern.Models.Video;

public class VideoAdapter extends RecyclerView.Adapter<VideoAdapter.ViewHolder> {

    private ArrayList<Video> videos;
    private onVideoCLickListener mOnVideoCLickListener;
    public VideoAdapter(ArrayList<Video> videos, onVideoCLickListener onVideoCLickListener){
        this.videos = videos;
        this.mOnVideoCLickListener = onVideoCLickListener;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder( LayoutInflater.from(parent.getContext()).inflate(R.layout.videos_item, parent, false), mOnVideoCLickListener);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
    }

    @Override
    public int getItemCount() {
        return videos.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public ImageButton playBtn;
        public ImageView videoImage;
        onVideoCLickListener onVideoCLickListener;

        public ViewHolder(@NonNull View itemView, onVideoCLickListener onVideoCLickListener) {
            super(itemView);
            playBtn = itemView.findViewById(R.id.play);
            videoImage = itemView.findViewById(R.id.videoThumbnail);
            this.onVideoCLickListener = onVideoCLickListener;
            itemView.setOnClickListener(this);
            playBtn.setOnClickListener(this);
        }


        @Override
        public void onClick(View v) {
            onVideoCLickListener.onVideoClick(getAdapterPosition());

        }
    }

    public interface onVideoCLickListener {
        void onVideoClick(int position);
    }
}
