package com.zrr.simpledagger.di;

import com.zrr.simpledagger.di.scope.ActivityScope;
import com.zrr.simpledagger.ui.MainActivity;
import com.zrr.simpledagger.ui.SecondActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
abstract class ActivityBindingModule {
    @ContributesAndroidInjector(modules = RandomDoubleModule.class)
    @ActivityScope
    abstract MainActivity mainActivity();

    @ContributesAndroidInjector(modules = RandomDoubleModule.class)
    @ActivityScope
    abstract SecondActivity secondActivity();
}
