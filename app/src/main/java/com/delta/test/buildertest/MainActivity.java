package com.delta.test.buildertest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Computer computer = new Computer.Builder()
                .buildBoard("键盘")
                .buildOS("系统")
                .buildmDisplay("显示器")
                .build();
        System.out.println(computer.toString());
    }
}
