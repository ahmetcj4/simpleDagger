package com.zrr.simpledagger.di;

import com.zrr.simpledagger.ui.MainActivity;
import com.zrr.simpledagger.ui.SecondActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
abstract class ActivityBindingModule {
    @ContributesAndroidInjector(/*modules = ....class*/)
    abstract MainActivity mainActivity();

    @ContributesAndroidInjector
    abstract SecondActivity secondActivity();
}
