package ru.arturvasilov.performance.sample.dagger;

import android.support.annotation.NonNull;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import ru.arturvasilov.performance.sample.lib.Lib6Class;

/**
 * @author Artur Vasilov
 */
@Module
public class Module6 {

    @NonNull
    @Singleton
    @Provides
    Lib6Class provideLib6Class() {
        return new Lib6Class();
    }
}
