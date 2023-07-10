package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Snack1Activity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.snack1);
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out);

        Button button_finish = (Button) findViewById(R.id.finish);
        button_finish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("tag","Finish button is pressed");
                // code to be executed when button is clicked
                Intent intent = new Intent(Snack1Activity.this, MainActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                startActivity(new Intent(Snack1Activity.this, MainActivity.class));
            }
        });

        Button button_food = (Button) findViewById(R.id.food);
        button_food.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("tag","Food button is pressed");
                // code to be executed when button is clicked
            }
        });

        Button button_drinks = (Button) findViewById(R.id.drinks);
        button_drinks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("tag","Drinks button is pressed");
                // code to be executed when button is clicked
            }
        });

        Button button_add = (Button) findViewById(R.id.add);
        button_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("tag","Add button is pressed");
                // code to be executed when button is clicked
            }
        });
    }

}
