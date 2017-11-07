package ru.arturvasilov.performance.sample.lib;

import android.os.Trace;

import ru.arturvasilov.performance.sample.utils.PerformanceUtils;

/**
 * @author Artur Vasilov
 */
public class Lib4Class {

    public Lib4Class() {
        Trace.beginSection("Lib4Class constructor");
        PerformanceUtils.sleepRandom(40, 100);
        Trace.endSection();
    }

    public void doSomeAction() {
        PerformanceUtils.logMessage("Do some action called from Lib4Class");
    }
}
