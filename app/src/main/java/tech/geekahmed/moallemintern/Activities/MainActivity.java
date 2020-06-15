package tech.geekahmed.moallemintern.Activities;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.Objects;

import tech.geekahmed.moallemintern.Models.DummyData;
import tech.geekahmed.moallemintern.R;
import tech.geekahmed.moallemintern.Adapters.SubjectsAdapter;
import tech.geekahmed.moallemintern.Models.Video;
import tech.geekahmed.moallemintern.Adapters.VideoAdapter;
public class MainActivity extends AppCompatActivity implements VideoAdapter.onVideoCLickListener {
    private RecyclerView subjectsRV, videoRV; // Reference Variables for subjects recycler view and video recycler view.
    private ArrayList<String> namesSubjects; // Reference variable for subjects' names array list.
    private ArrayList<Video> videos; // Reference variable for videos' array list.
    private DummyData dummyData; // Reference variable for Dummy data generator.
    private SubjectsAdapter subjectsAdapter; // Reference variable for the adapter of subjects.
    private VideoAdapter videoAdapter; // Reference variable for the video adapter.
    private Toolbar toolbar; // Toolbar reference variables.
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initMembers(); // Invoking the method that is responsible for initializing the reference variables.
        setSupportActionBar(toolbar); // Setting the action bar to the custom toolbar that is defined before.
        Objects.requireNonNull(getSupportActionBar()).setDisplayShowTitleEnabled(false); // Hiding the app title from the customized action bar.
        // Filling the array list of subjects and videos with dummy data.
        dummyData.fillSubjects();
        dummyData.fillVideos();
        // Setting the layout of the recycler views to horizontal.
        subjectsRV.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        videoRV.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
    }
    /*
     * When the user clicks on the video in its recycler view, this method will create an intent and sends it to the video player activity.
     */
    @Override
    public void onVideoClick(int position) {
        Intent intent = new Intent(this, VideoPlayer.class);
        intent.putExtra("video", videos.get(position));
        startActivity(intent);
    }
    /*
     * This Method is used to initialize the reference variables defined above.
     */
    private void initMembers(){
        toolbar = findViewById(R.id.toolbar);
        subjectsRV = findViewById(R.id.subjectsRV);
        videoRV = findViewById(R.id.videosRV);
        namesSubjects = new ArrayList<>();
        videos = new ArrayList<>();
        dummyData = new DummyData(videos, namesSubjects);
        subjectsAdapter = new SubjectsAdapter(namesSubjects);
        videoAdapter = new VideoAdapter(videos, this);
        subjectsRV.setAdapter(subjectsAdapter);
        videoRV.setAdapter(videoAdapter);
    }
}