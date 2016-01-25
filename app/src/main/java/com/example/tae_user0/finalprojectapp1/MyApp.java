package com.example.tae_user0.finalprojectapp1;

import android.app.Application;

import com.crashlytics.android.Crashlytics;

import io.fabric.sdk.android.Fabric;

/**
 * Created by TAE_user0 on 22/01/2016.
 */
public class MyApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

//Fabrics
        Fabric.with(this, new Crashlytics());
    }
}
