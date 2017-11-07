package ru.arturvasilov.performance.sample.lib;

import android.content.Context;
import android.os.Trace;
import android.support.annotation.NonNull;

import ru.arturvasilov.performance.sample.App;
import ru.arturvasilov.performance.sample.utils.PerformanceUtils;

/**
 * @author Artur Vasilov
 */
public final class Lib9 {

    private static volatile boolean initialized = false;

    private Lib9() {
    }

    public static void init(@NonNull Context context) {
        Trace.beginSection("Init Lib9");
        PerformanceUtils.sleepRandom(100, 200);
        initialized = true;
        Trace.endSection();
    }

    public static void start() {
        if (!initialized) {
            throw new IllegalStateException("You have to initialize Lib9 first");
        }
        App.getAppComponent().getLib9Class().doSomeAction();
        PerformanceUtils.logMessage(Lib9.class.getSimpleName() + " started");
    }
}
