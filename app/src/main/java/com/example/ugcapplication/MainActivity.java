package com.example.ugcapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Thread th = new Thread(){
            @Override
            public void run() {
                try {
                    sleep(4000);

                    Intent homeIntent = new Intent(MainActivity.this , HomeActivity.class);
                    startActivity(homeIntent);
                    finish();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        th.start();
    }

    @Override
    protected void onStart() {
        super.onStart();
    }
}
