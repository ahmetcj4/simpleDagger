package com.zrr.simpledagger.di;

import com.zrr.simpledagger.di.scope.ActivityScope;

import dagger.Module;
import dagger.Provides;

@Module
final class RandomDoubleModule {
    @Provides
    @ActivityScope
    static Double provideRandomDouble() {
        return Math.random();
    }
}