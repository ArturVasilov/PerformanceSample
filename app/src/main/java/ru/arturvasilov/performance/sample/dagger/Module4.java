package ru.arturvasilov.performance.sample.dagger;

import android.support.annotation.NonNull;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import ru.arturvasilov.performance.sample.lib.Lib4Class;

/**
 * @author Artur Vasilov
 */
@Module
public class Module4 {

    @NonNull
    @Singleton
    @Provides
    Lib4Class provideLib4Class() {
        return new Lib4Class();
    }
}
