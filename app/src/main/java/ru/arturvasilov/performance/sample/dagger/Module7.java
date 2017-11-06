package ru.arturvasilov.performance.sample.dagger;

import android.support.annotation.NonNull;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import ru.arturvasilov.performance.sample.lib.Lib7Class;

/**
 * @author Artur Vasilov
 */
@Module
public class Module7 {

    @NonNull
    @Singleton
    @Provides
    Lib7Class provideLib7Class() {
        return new Lib7Class();
    }
}
