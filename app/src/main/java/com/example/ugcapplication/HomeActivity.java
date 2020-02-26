package com.example.ugcapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {

    private Button aboutUGC_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        aboutUGC_btn = (Button) findViewById(R.id.about_UGC_Button_Id);

        aboutUGC_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent aboutIntent = new Intent(HomeActivity.this , UniversityDetailsActivity.class);
                startActivity(aboutIntent);
            }
        });
    }
}
