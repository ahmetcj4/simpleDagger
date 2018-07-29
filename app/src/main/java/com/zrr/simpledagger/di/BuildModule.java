package com.zrr.simpledagger.di;

import com.zrr.simpledagger.di.qualifier.Model;
import com.zrr.simpledagger.di.scope.AppScope;

import dagger.Module;
import dagger.Provides;

import static android.os.Build.MODEL;

@Module
final class BuildModule {
    @Provides
    @AppScope
    @Model
    static String provideModel() {
        return MODEL;
    }
}