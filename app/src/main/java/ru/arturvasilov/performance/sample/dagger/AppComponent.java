package ru.arturvasilov.performance.sample.dagger;

import javax.inject.Singleton;

import dagger.Component;
import ru.arturvasilov.performance.sample.lib.Lib1Class;
import ru.arturvasilov.performance.sample.lib.Lib2Class;
import ru.arturvasilov.performance.sample.lib.Lib3Class;
import ru.arturvasilov.performance.sample.lib.Lib4Class;
import ru.arturvasilov.performance.sample.lib.Lib5Class;
import ru.arturvasilov.performance.sample.lib.Lib6Class;
import ru.arturvasilov.performance.sample.lib.Lib7Class;
import ru.arturvasilov.performance.sample.lib.Lib8Class;
import ru.arturvasilov.performance.sample.lib.Lib9Class;
import ru.arturvasilov.performance.sample.lib.Lib10Class;

/**
 * @author Artur Vasilov
 */
@Singleton
@Component(modules = {
        Module1.class,
        Module2.class,
        Module3.class,
        Module4.class,
        Module5.class,
        Module6.class,
        Module7.class,
        Module8.class,
        Module9.class,
        Module10.class
})
public interface AppComponent {

    Lib1Class getLib1Class();

    Lib2Class getLib2Class();

    Lib3Class getLib3Class();

    Lib4Class getLib4Class();

    Lib5Class getLib5Class();

    Lib6Class getLib6Class();

    Lib7Class getLib7Class();

    Lib8Class getLib8Class();

    Lib9Class getLib9Class();

    Lib10Class getLib10Class();
}
