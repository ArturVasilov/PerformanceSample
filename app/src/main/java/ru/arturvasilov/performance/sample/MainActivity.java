package ru.arturvasilov.performance.sample;

import android.os.Handler;
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

        Handler handler = new Handler();

        handler.postDelayed(Lib1::start, 100);
        handler.postDelayed(Lib2::start, 200);
        handler.postDelayed(Lib3::start, 300);
        handler.postDelayed(Lib4::start, 400);
        handler.postDelayed(Lib5::start, 500);
        handler.postDelayed(Lib6::start, 600);
        handler.postDelayed(Lib7::start, 700);
        handler.postDelayed(Lib8::start, 800);
        handler.postDelayed(Lib9::start, 900);
        handler.postDelayed(Lib10::start, 1000);
    }
}
