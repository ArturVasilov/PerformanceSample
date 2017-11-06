package ru.arturvasilov.performance.sample.utils;

import android.os.SystemClock;
import android.support.annotation.NonNull;
import android.util.Log;

import java.security.SecureRandom;
import java.util.Random;

/**
 * @author Artur Vasilov
 *
 * Stupid class for universal mocks, don't mind
 */
public final class PerformanceUtils {

    private static final Random RANDOM = new SecureRandom();

    private PerformanceUtils() {
    }

    public static void logMessage(@NonNull String message) {
        Log.i("PerformanceSample", message);
    }

    public static void sleepRandom(long minimum, long maximum) {
        minimum = Math.max(1, minimum);
        maximum = Math.max(minimum, maximum);
        long time = RANDOM.nextInt((int) (maximum - minimum) + 1) + minimum;
        SystemClock.sleep(time);
    }
}
