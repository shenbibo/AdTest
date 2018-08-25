package com.sky.adtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import cn.waps.AppConnect;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AppConnect.getInstance(this);
        AppConnect.getInstance(this).showAppOffers(this);
    }

    @Override
    protected void onDestroy() {
        AppConnect.getInstance(this).close();
        super.onDestroy();
    }
}
