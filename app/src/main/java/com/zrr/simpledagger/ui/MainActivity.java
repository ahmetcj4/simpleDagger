package com.zrr.simpledagger.ui;

import android.os.Bundle;
import android.util.Log;

import com.zrr.simpledagger.R;
import com.zrr.simpledagger.di.qualifier.Model;

import javax.inject.Inject;

import dagger.android.support.DaggerAppCompatActivity;

public class MainActivity extends DaggerAppCompatActivity {
    private static final String TAG = MainActivity.class.getSimpleName();

    @Inject
    @Model
    String model;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i(TAG, "onCreate: model: " + model);
    }
}