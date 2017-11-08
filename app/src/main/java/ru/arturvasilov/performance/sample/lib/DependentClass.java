package ru.arturvasilov.performance.sample.lib;

import android.support.annotation.NonNull;

import javax.inject.Provider;

/**
 * @author Artur Vasilov
 */
public class DependentClass {

    @NonNull
    private final Provider<Lib1Class> lib1ClassProvider;

    @NonNull
    private final Provider<Lib8Class> lib8ClassProvider;

    public DependentClass(@NonNull Provider<Lib1Class> lib1ClassProvider,
                          @NonNull Provider<Lib8Class> lib8ClassProvider) {
        this.lib1ClassProvider = lib1ClassProvider;
        this.lib8ClassProvider = lib8ClassProvider;
    }
}
