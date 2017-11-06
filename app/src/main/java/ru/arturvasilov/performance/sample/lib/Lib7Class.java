package ru.arturvasilov.performance.sample.lib;

import ru.arturvasilov.performance.sample.utils.PerformanceUtils;

/**
 * @author Artur Vasilov
 */
public class Lib7Class {

    public Lib7Class() {
        PerformanceUtils.sleepRandom(40, 100);
    }

    public void doSomeAction() {
        PerformanceUtils.logMessage("Do some action called from Lib7Class");
    }

}
