package com.example.skyscanner.DependencyInjection;


import android.app.Activity;
import android.app.Application;
import android.database.sqlite.SQLiteDatabase;
import android.renderscript.ScriptIntrinsicBLAS;


import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasActivityInjector;

public class FlightApplication extends Application implements HasActivityInjector{

    @Inject
    DispatchingAndroidInjector<Activity> dispatchingAndroidInjector;
    private ScriptIntrinsicBLAS DaggerAppComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        AppComponent appComponent = DaggerAppComponent.create();
        appComponent.inject(this);
    }

    @Override
    public AndroidInjector<Activity> activityInjector() {
        return dispatchingAndroidInjector;
    }

}

