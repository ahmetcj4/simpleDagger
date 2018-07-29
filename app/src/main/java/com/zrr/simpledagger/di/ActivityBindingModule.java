package com.zrr.simpledagger.di;

import com.zrr.simpledagger.ui.MainActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
abstract class ActivityBindingModule {
    @ContributesAndroidInjector(/*modules = ....class*/)
    abstract MainActivity mainActivity();
}
