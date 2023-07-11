package com.example.myapplication;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ViewActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view);
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out);

        TextView tv = findViewById(R.id.date_calories);
        tv.setText("Calories gained today:");

        Button button_back = (Button) findViewById(R.id.back);
        button_back.setOnClickListener(v -> {
            Log.d("tag","Back button is pressed");
            // code to be executed when button is clicked
            ViewActivity.super.onBackPressed();
        });

    }

}
