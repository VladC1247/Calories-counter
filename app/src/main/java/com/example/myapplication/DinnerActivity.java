package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class DinnerActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dinner);
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out);

        Button button_finish = (Button) findViewById(R.id.finish);
        button_finish.setOnClickListener(v -> {
            Log.d("tag","Finish button is pressed");
            // code to be executed when button is clicked
            Intent intent = new Intent(DinnerActivity.this, HomeActivity.class);
            startActivity(intent);
            overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
            startActivity(new Intent(DinnerActivity.this, HomeActivity.class));
        });

        Button button_food = (Button) findViewById(R.id.food);
        button_food.setOnClickListener(v -> {
            Log.d("tag","Food button is pressed");
            // code to be executed when button is clicked
        });

        Button button_drinks = (Button) findViewById(R.id.drinks);
        button_drinks.setOnClickListener(v -> {
            Log.d("tag","Drinks button is pressed");
            // code to be executed when button is clicked
        });

        Button button_add = (Button) findViewById(R.id.add);
        button_add.setOnClickListener(v -> {
            Log.d("tag","Add button is pressed");
            // code to be executed when button is clicked
        });
    }

}
