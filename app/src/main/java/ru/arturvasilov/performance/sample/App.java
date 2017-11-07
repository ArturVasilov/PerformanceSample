package ru.arturvasilov.performance.sample;

import android.app.Application;
import android.os.Trace;
import android.support.annotation.NonNull;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

import ru.arturvasilov.performance.sample.dagger.AppComponent;
import ru.arturvasilov.performance.sample.dagger.DaggerAppComponent;
import ru.arturvasilov.performance.sample.dagger.Module1;
import ru.arturvasilov.performance.sample.dagger.Module10;
import ru.arturvasilov.performance.sample.dagger.Module2;
import ru.arturvasilov.performance.sample.dagger.Module3;
import ru.arturvasilov.performance.sample.dagger.Module4;
import ru.arturvasilov.performance.sample.dagger.Module5;
import ru.arturvasilov.performance.sample.dagger.Module6;
import ru.arturvasilov.performance.sample.dagger.Module7;
import ru.arturvasilov.performance.sample.dagger.Module8;
import ru.arturvasilov.performance.sample.dagger.Module9;
import ru.arturvasilov.performance.sample.lib.Lib1;
import ru.arturvasilov.performance.sample.lib.Lib10;
import ru.arturvasilov.performance.sample.lib.Lib2;
import ru.arturvasilov.performance.sample.lib.Lib3;
import ru.arturvasilov.performance.sample.lib.Lib4;
import ru.arturvasilov.performance.sample.lib.Lib5;
import ru.arturvasilov.performance.sample.lib.Lib6;
import ru.arturvasilov.performance.sample.lib.Lib7;
import ru.arturvasilov.performance.sample.lib.Lib8;
import ru.arturvasilov.performance.sample.lib.Lib9;

/**
 * @author Artur Vasilov
 */
public class App extends Application {

    private static App app;

    private AppComponent appComponent;

    private ExecutorService executorService;

    @NonNull
    public static AppComponent getAppComponent() {
        return app.appComponent;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        app = this;

        Trace.beginSection("Init injector");
        initInjector();
        Trace.endSection();

        Trace.beginSection("Init libraries");
        executorService = Executors.newFixedThreadPool(3);

        executorService.execute(() -> Lib5.init(this));
        executorService.execute(() -> Lib6.init(this));
        executorService.execute(() -> Lib7.init(this));
        executorService.execute(() -> Lib8.init(this));
        executorService.execute(() -> Lib9.init(this));
        executorService.execute(() -> Lib10.init(this));

        Lib1.init(this);
        Lib2.init(this);
        Lib3.init(this);
        Lib4.init(this);
        Trace.endSection();
    }

    private void initInjector() {
        appComponent = DaggerAppComponent.builder()
                .module1(new Module1())
                .module2(new Module2())
                .module3(new Module3())
                .module4(new Module4())
                .module5(new Module5())
                .module6(new Module6())
                .module7(new Module7())
                .module8(new Module8())
                .module9(new Module9())
                .module10(new Module10())
                .build();
    }
}
