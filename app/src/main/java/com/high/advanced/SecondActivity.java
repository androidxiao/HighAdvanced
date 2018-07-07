package com.high.advanced;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

/**
 * Created by chawei on 2018/7/7.
 */

public class SecondActivity extends AppCompatActivity {


    public static final String TAG = "ez";

    int a=100;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        a=2;

        Log.d(TAG, "onCreate: 为了测试 打一个 log111111111");
    }
}
