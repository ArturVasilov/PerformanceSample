package ru.arturvasilov.performance.sample.dagger;

import android.support.annotation.NonNull;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import ru.arturvasilov.performance.sample.lib.Lib10Class;

/**
 * @author Artur Vasilov
 */
@Module
public class Module10 {

    @NonNull
    @Singleton
    @Provides
    Lib10Class provideLib10Class() {
        return new Lib10Class();
    }
}
