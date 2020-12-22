package com.example.lab_assignment_02;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button play= findViewById(R.id.play);
        Button stop= findViewById(R.id.stop);
        final MediaPlayer media = MediaPlayer.create(MainActivity.this,R.raw.audiofile);

        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                media.pause();
            }
        });
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                media.start();
            }
        });

    }
}