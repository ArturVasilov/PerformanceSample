package ru.arturvasilov.performance.sample.lib;

import android.content.Context;
import android.support.annotation.NonNull;

import ru.arturvasilov.performance.sample.App;
import ru.arturvasilov.performance.sample.utils.PerformanceUtils;

/**
 * @author Artur Vasilov
 */
public final class Lib2 {

    private static volatile boolean initialized = false;

    private Lib2() {
    }

    public static void init(@NonNull Context context) {
        PerformanceUtils.sleepRandom(100, 200);
        initialized = true;
    }

    public static void start() {
        if (!initialized) {
            throw new IllegalStateException("You have to initialize Lib2 first");
        }
        App.getAppComponent().getLib2Class().doSomeAction();
        PerformanceUtils.logMessage(Lib2.class.getSimpleName() + " started");
    }
}
