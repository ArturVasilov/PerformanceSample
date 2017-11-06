package ru.arturvasilov.performance.sample.lib;

import android.content.Context;
import android.support.annotation.NonNull;

import ru.arturvasilov.performance.sample.App;
import ru.arturvasilov.performance.sample.utils.PerformanceUtils;

/**
 * @author Artur Vasilov
 */
public final class Lib5 {

    private static volatile boolean initialized = false;

    private Lib5() {
    }

    public static void init(@NonNull Context context) {
        PerformanceUtils.sleepRandom(100, 200);
        initialized = true;
    }

    public static void start() {
        if (!initialized) {
            throw new IllegalStateException("You have to initialize Lib5 first");
        }
        App.getAppComponent().getLib5Class().doSomeAction();
        PerformanceUtils.logMessage(Lib5.class.getSimpleName() + " started");
    }
}
