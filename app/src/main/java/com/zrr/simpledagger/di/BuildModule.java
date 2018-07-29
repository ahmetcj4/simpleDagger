package com.zrr.simpledagger.di;

import com.zrr.simpledagger.di.qualifier.Model;

import dagger.Module;
import dagger.Provides;

import static android.os.Build.MODEL;

@Module
final class BuildModule {
    @Provides
    @Model
    static String provideModel() {
        return MODEL;
    }
}