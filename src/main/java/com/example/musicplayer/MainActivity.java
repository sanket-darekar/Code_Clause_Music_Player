package com.example.musicplayer;

import static android.media.MediaPlayer.create;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.media.MediaPlayer;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    MediaPlayer music;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Adding the music file to our
        // newly created object music
        music = create(
         this, R.raw.sound);

    }
    // Playing the music
    public void musicplay(View v)
    {
        music.start();
    }

    // Pausing the music
    public void musicpause(View v)
    {
        music.pause();
    }

    // Stopping the music
    public void musicstop(View v)
    {
        music.stop();
        music = MediaPlayer.create(
                this, R.raw.sound);
    }
}



