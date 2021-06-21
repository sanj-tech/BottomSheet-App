package com.jsstech.bottomsheetapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import static java.lang.Thread.sleep;

public class SplashAct extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);





new Thread(new Runnable() {
    @Override
    public void run() {
        try {
            sleep(3000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Intent intent=new Intent(SplashAct.this,MainActivity.class);
        startActivity(intent);
    }
}).start();
    }
}