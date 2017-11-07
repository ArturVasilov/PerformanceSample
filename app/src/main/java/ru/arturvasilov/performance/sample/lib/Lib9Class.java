package ru.arturvasilov.performance.sample.lib;

import android.os.Trace;

import ru.arturvasilov.performance.sample.utils.PerformanceUtils;

/**
 * @author Artur Vasilov
 */
public class Lib9Class {

    public Lib9Class() {
        Trace.beginSection("Lib9Class constructor");
        PerformanceUtils.sleepRandom(40, 100);
        Trace.endSection();
    }

    public void doSomeAction() {
        PerformanceUtils.logMessage("Do some action called from Lib9Class");
    }

}
