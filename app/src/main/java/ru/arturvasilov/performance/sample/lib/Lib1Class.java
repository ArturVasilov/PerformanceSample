package ru.arturvasilov.performance.sample.lib;

import android.os.Trace;

import ru.arturvasilov.performance.sample.utils.PerformanceUtils;

/**
 * @author Artur Vasilov
 */
public class Lib1Class {

    public Lib1Class() {
        Trace.beginSection("Lib1Class constructor");
        PerformanceUtils.sleepRandom(40, 100);
        Trace.endSection();
    }

    public void doSomeAction() {
        PerformanceUtils.logMessage("Do some action called from Lib1Class");
    }

}
