package com.example.ntguser.fisrtandroidapplication;

import android.app.Activity;
import android.os.Bundle;

public class FirstActivity extends Activity{

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();

    }

    public void onCreate(Bundle savedInstanceState){

        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);
    }
}
