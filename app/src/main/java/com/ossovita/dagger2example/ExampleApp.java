package com.ossovita.dagger2example;

import android.app.Application;

import com.ossovita.dagger2example.dagger.ActivityComponent;
import com.ossovita.dagger2example.dagger.AppComponent;
import com.ossovita.dagger2example.dagger.DaggerAppComponent;

public class ExampleApp extends Application {
    private AppComponent component;

    @Override
    public void onCreate() {
        super.onCreate();

        component = DaggerAppComponent.create();

    }

    public AppComponent getAppComponent(){
        return component;
    }
}
