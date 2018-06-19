package com.sayeedul.musicplayerapp;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.support.annotation.Nullable;

public class MusicService extends Service {

    MediaPlayer mp1;

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate() {
        super.onCreate();

        mp1 = MediaPlayer.create(getApplicationContext(),R.raw.song);
    }

    @Override
    public void onStart(Intent intent, int startId) {
        super.onStart(intent, startId);
        if(mp1.isPlaying())
        {
            mp1.pause();
        }
        else
        {
            mp1.start();
        }
    }


    @Override
    public void onDestroy() {
        super.onDestroy();

        if(mp1.isPlaying())
        {
            mp1.stop();
        }
    }



}
