package ru.arturvasilov.performance.sample.dagger;

import android.support.annotation.NonNull;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import ru.arturvasilov.performance.sample.lib.Lib1Class;

/**
 * @author Artur Vasilov
 */
@Module
public class Module1 {

    @NonNull
    @Singleton
    @Provides
    Lib1Class provideLib1Class() {
        return new Lib1Class();
    }
}
