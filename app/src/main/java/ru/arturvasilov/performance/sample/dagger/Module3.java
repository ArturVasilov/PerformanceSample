package ru.arturvasilov.performance.sample.dagger;

import android.support.annotation.NonNull;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import ru.arturvasilov.performance.sample.lib.Lib3Class;

/**
 * @author Artur Vasilov
 */
@Module
public class Module3 {

    @NonNull
    @Singleton
    @Provides
    Lib3Class provideLib3Class() {
        return new Lib3Class();
    }
}
