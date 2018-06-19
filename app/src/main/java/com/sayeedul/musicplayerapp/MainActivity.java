package com.sayeedul.musicplayerapp;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    MediaPlayer mp;
    Button pause;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pause= (Button)findViewById(R.id.pauseBTN);

    }



    public void startBtnClicked(View v)
    {
        Intent i = new Intent(MainActivity.this,MusicService.class);
        startService(i);
    }


    public void stopBtnClicked(View v)
    {
        Intent i = new Intent(MainActivity.this,MusicService.class);
        stopService(i);
    }


    public void pauseBtnClicked(View v)
    {
        Intent i = new Intent(MainActivity.this,MusicService.class);
        startService(i);
    }


}
