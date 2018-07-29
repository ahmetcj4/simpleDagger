package com.zrr.simpledagger.di;

import com.zrr.simpledagger.App;
import com.zrr.simpledagger.main.MainActivityModule;

import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;

@Component(modules = {
        AndroidSupportInjectionModule.class,
        MainActivityModule.class,
        BuildModule.class
})
        /* @ApplicationScoped and/or @Singleton */
interface AppComponent extends AndroidInjector<App> {
    @Component.Builder
    abstract class Builder extends AndroidInjector.Builder<App> {
    }
}
