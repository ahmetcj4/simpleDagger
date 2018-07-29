package com.zrr.simpledagger.di;

import com.zrr.simpledagger.di.scope.AppScope;

import dagger.Module;
import dagger.Provides;

@Module
final class RandomDoubleModule {
    @Provides
    @AppScope
    static Double provideRandomDouble() {
        return Math.random();
    }
}