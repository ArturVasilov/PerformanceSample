package ru.arturvasilov.performance.sample.dagger;

import android.support.annotation.NonNull;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import ru.arturvasilov.performance.sample.lib.Lib9Class;

/**
 * @author Artur Vasilov
 */
@Module
public class Module9 {

    @NonNull
    @Singleton
    @Provides
    Lib9Class provideLib9Class() {
        return new Lib9Class();
    }
}
