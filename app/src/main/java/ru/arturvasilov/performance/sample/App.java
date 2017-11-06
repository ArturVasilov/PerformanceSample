package ru.arturvasilov.performance.sample;

import android.app.Application;
import android.support.annotation.NonNull;

import ru.arturvasilov.performance.sample.dagger.AppComponent;
import ru.arturvasilov.performance.sample.dagger.DaggerAppComponent;
import ru.arturvasilov.performance.sample.dagger.Module1;
import ru.arturvasilov.performance.sample.lib.Lib1;

/**
 * @author Artur Vasilov
 */
public class App extends Application {

    private static App app;

    private AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        app = this;

        initInjector();

        Lib1.init(this);
    }

    private void initInjector() {
        appComponent = DaggerAppComponent.builder()
                .module1(new Module1())
                .build();
    }

    @NonNull
    public static AppComponent getAppComponent() {
        return app.appComponent;
    }
}
