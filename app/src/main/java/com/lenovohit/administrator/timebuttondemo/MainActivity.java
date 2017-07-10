package com.lenovohit.administrator.timebuttondemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TimeButton timeButton= (TimeButton) findViewById(R.id.time);
        timeButton.initTime();
    }
}
