package com.zrr.simpledagger;

import com.zrr.simpledagger.di.DaggerAppComponent;

import dagger.android.AndroidInjector;
import dagger.android.support.DaggerApplication;

public class App extends DaggerApplication {
    @Override
    protected AndroidInjector<App> applicationInjector() {
        return DaggerAppComponent.builder().create(this);
    }
}