package com.example.fragmentlife;

import android.app.Fragment;
import android.media.MediaPlayer;
import android.os.Bundle;

import android.app.FragmentManager;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class FirstFragment extends Fragment {
    MediaPlayer song;
    private static  final String TAG  = "Fragment A";


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e(TAG, "onCreate A()");
        song = MediaPlayer.create(getContext(),R.raw.ex_3);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_first, container, false);
    }

    public void onStart(){
        super.onStart();
        song.start();
        Log.e(TAG, "onStart A");

    }
   public void onResume(){
        super.onResume();
        Log.e(TAG, "onResume A");

    }
    public void onPause(){
        super.onPause();
        Log.e(TAG, "onPause A");
    }
    public void onStop(){
        super.onStop();
        song.pause();
        Log.e(TAG, "onStop A");
    }
    public void onDestroy(){
        super.onDestroy();
        song.release();
        Log.e(TAG, "onDestroy A");
    }

}