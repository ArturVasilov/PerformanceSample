package ru.arturvasilov.performance.sample.dagger;

import android.support.annotation.NonNull;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import ru.arturvasilov.performance.sample.lib.Lib8Class;

/**
 * @author Artur Vasilov
 */
@Module
public class Module8 {

    @NonNull
    @Singleton
    @Provides
    Lib8Class provideLib8Class() {
        return new Lib8Class();
    }
}
