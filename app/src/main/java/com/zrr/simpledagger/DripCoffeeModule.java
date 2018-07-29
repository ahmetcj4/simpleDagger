package com.zrr.simpledagger;

import dagger.Module;
import dagger.Provides;

@Module
class DripCoffeeModule {
    @Provides
    static Heater provideHeater() {
        return new ElectricHeater();
    }

    @Provides
    static Pump providePump(Thermosiphon pump) {
        return pump;
    }
}