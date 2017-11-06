package ru.arturvasilov.performance.sample.dagger;

import android.support.annotation.NonNull;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import ru.arturvasilov.performance.sample.lib.Lib5Class;

/**
 * @author Artur Vasilov
 */
@Module
public class Module5 {

    @NonNull
    @Singleton
    @Provides
    Lib5Class provideLib5Class() {
        return new Lib5Class();
    }
}
