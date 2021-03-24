package com.ossovita.dagger2example;

import android.util.Log;

import javax.inject.Inject;

public class Engine {
    private static final String TAG = "Engine";
    @Inject
    public Engine(){

    }

    public void bagir(){
        Log.d(TAG, "bagir: babababaaaaaam ");
    }
}
