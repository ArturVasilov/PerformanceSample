package ru.arturvasilov.performance.sample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import ru.arturvasilov.performance.sample.lib.Lib1;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Lib1.start();
    }
}
