package ru.arturvasilov.performance.sample.lib;

import android.content.Context;
import android.support.annotation.NonNull;

import ru.arturvasilov.performance.sample.App;
import ru.arturvasilov.performance.sample.utils.PerformanceUtils;

/**
 * @author Artur Vasilov
 */
public final class Lib3 {

    private static volatile boolean initialized = false;

    private Lib3() {
    }

    public static void init(@NonNull Context context) {
        PerformanceUtils.sleepRandom(100, 200);
        initialized = true;
    }

    public static void start() {
        if (!initialized) {
            throw new IllegalStateException("You have to initialize Lib3 first");
        }
        App.getAppComponent().getLib3Class().doSomeAction();
        PerformanceUtils.logMessage(Lib3.class.getSimpleName() + " started");
    }
}
