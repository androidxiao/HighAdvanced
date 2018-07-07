package com.high.advanced;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by chawei on 2018/7/7.
 */

public class SecondActivity extends AppCompatActivity {


    int a=100;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        a=2;
    }
}
