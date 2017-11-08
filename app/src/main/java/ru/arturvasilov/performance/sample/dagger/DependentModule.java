package ru.arturvasilov.performance.sample.dagger;

import android.support.annotation.NonNull;

import javax.inject.Provider;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import ru.arturvasilov.performance.sample.lib.DependentClass;
import ru.arturvasilov.performance.sample.lib.Lib1Class;
import ru.arturvasilov.performance.sample.lib.Lib8Class;

/**
 * @author Artur Vasilov
 */
@Module(includes = {Module1.class, Module8.class})
public class DependentModule {

    @NonNull
    @Singleton
    @Provides
    DependentClass provideDependentClass(@NonNull Provider<Lib1Class> lib1ClassProvider,
                                         @NonNull Provider<Lib8Class> lib8ClassProvider) {
        return new DependentClass(lib1ClassProvider, lib8ClassProvider);
    }
}
