package ru.arturvasilov.performance.sample.dagger;

import javax.inject.Singleton;

import dagger.Component;
import ru.arturvasilov.performance.sample.lib.Lib1Class;

/**
 * @author Artur Vasilov
 */
@Singleton
@Component(modules = {Module1.class})
public interface AppComponent {

    Lib1Class getLib1Class();
}
