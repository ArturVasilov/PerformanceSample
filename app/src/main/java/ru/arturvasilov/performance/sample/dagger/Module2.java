package ru.arturvasilov.performance.sample.dagger;

import android.support.annotation.NonNull;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import ru.arturvasilov.performance.sample.lib.Lib2Class;

/**
 * @author Artur Vasilov
 */
@Module
public class Module2 {

    @NonNull
    @Singleton
    @Provides
    Lib2Class provideLib2Class() {
        return new Lib2Class();
    }
}
