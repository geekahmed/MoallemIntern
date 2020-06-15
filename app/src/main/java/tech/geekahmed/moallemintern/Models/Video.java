package tech.geekahmed.moallemintern.Models;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;


public class Video implements Parcelable {
    private String videoName;
    private String videoSource;

    public Video(String videoName, String videoSource) {
        this.videoName = videoName;
        this.videoSource = videoSource;
    }
    public Video(Parcel in){
        this.videoName = in.readString();
        this.videoSource = in.readString();
    }

    public String getVideoName() {
        return videoName;
    }

    public void setVideoName(String videoName) {
        this.videoName = videoName;
    }

    public String getVideoSource() {
        return videoSource;
    }

    public void setVideoSource(Uri videoSourceURI) {
        this.videoSource = videoSource;
    }

    @Override
    public String toString() {
        return "Video{" +
                "videoName='" + videoName + '\'' +
                ", videoSourceURI=" + videoSource +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.videoName);
        dest.writeString(this.videoSource);

    }
    public static final Parcelable.Creator<Video> CREATOR = new Parcelable.Creator<Video>() {

        public Video createFromParcel(Parcel in) {
            return new Video(in);
        }

        public Video[] newArray(int size) {
            return new Video[size];
        }
    };
}
