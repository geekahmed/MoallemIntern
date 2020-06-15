package tech.geekahmed.moallemintern.Models;

import java.util.ArrayList;

public class DummyData {
    private ArrayList<Video> videos;
    private ArrayList<String> subjects;

    public DummyData(ArrayList<Video> videos, ArrayList<String> subjects) {
        this.videos = videos;
        this.subjects = subjects;
    }

    public void fillVideos(){
        videos.add(new Video("Big Buck Bunny", "https://firebasestorage.googleapis.com/v0/b/videoview-247213.appspot.com/o/Video.mp4?alt=media&token=d049cc83-5635-487d-ac48-1a36d5b64844"));
        videos.add(new Video("haha", "http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/ForBiggerEscapes.mp4"));
        videos.add(new Video("Big Buck Bunny", "http://techslides.com/demos/sample-videos/small.mp4"));
        videos.add(new Video("haha", "http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/ForBiggerEscapes.mp4"));
        videos.add(new Video("Big Buck Bunny", "https://firebasestorage.googleapis.com/v0/b/videoview-247213.appspot.com/o/Video.mp4?alt=media&token=d049cc83-5635-487d-ac48-1a36d5b64844"));
        videos.add(new Video("haha", "http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/ForBiggerEscapes.mp4"));
        videos.add(new Video("Big Buck Bunny", "https://firebasestorage.googleapis.com/v0/b/videoview-247213.appspot.com/o/Video.mp4?alt=media&token=d049cc83-5635-487d-ac48-1a36d5b64844"));
        videos.add(new Video("haha", "http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/ForBiggerEscapes.mp4"));
        videos.add(new Video("Big Buck Bunny", "https://firebasestorage.googleapis.com/v0/b/videoview-247213.appspot.com/o/Video.mp4?alt=media&token=d049cc83-5635-487d-ac48-1a36d5b64844"));
        videos.add(new Video("haha", "http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/ForBiggerEscapes.mp4"));

    }
    public void fillSubjects(){
        subjects.add("Physics");
        subjects.add("Mathematics");
        subjects.add("History");
        subjects.add("Arabic");
        subjects.add("English");
        subjects.add("Physics");
        subjects.add("Mathematics");
        subjects.add("History");
        subjects.add("Arabic");
        subjects.add("English");
        subjects.add("Physics");
        subjects.add("Mathematics");
        subjects.add("History");
        subjects.add("Arabic");
        subjects.add("English");
        subjects.add("Physics");
        subjects.add("Mathematics");
        subjects.add("History");
        subjects.add("Arabic");
        subjects.add("English");

    }
}
