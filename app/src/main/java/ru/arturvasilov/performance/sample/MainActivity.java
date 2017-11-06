package ru.arturvasilov.performance.sample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import ru.arturvasilov.performance.sample.lib.Lib1;
import ru.arturvasilov.performance.sample.lib.Lib2;
import ru.arturvasilov.performance.sample.lib.Lib3;
import ru.arturvasilov.performance.sample.lib.Lib4;
import ru.arturvasilov.performance.sample.lib.Lib5;
import ru.arturvasilov.performance.sample.lib.Lib6;
import ru.arturvasilov.performance.sample.lib.Lib7;
import ru.arturvasilov.performance.sample.lib.Lib8;
import ru.arturvasilov.performance.sample.lib.Lib9;
import ru.arturvasilov.performance.sample.lib.Lib10;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Lib1.start();
        Lib2.start();
        Lib3.start();
        Lib4.start();
        Lib5.start();
        Lib6.start();
        Lib7.start();
        Lib8.start();
        Lib9.start();
        Lib10.start();
    }
}
