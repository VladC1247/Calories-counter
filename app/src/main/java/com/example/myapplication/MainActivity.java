package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    private String layoutName;

    @Override
    protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        this.layoutName = getResources().getResourceEntryName(R.layout.activity_menu);

        Log.d("TAG", layoutName);

        Button button_breakfast = (Button) findViewById(R.id.breakfast_am);
        button_breakfast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("tag","Breakfast button is pressed");
                // code to be executed when button is clicked
                Intent intent = new Intent(MainActivity.this, BreakfastActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                startActivity(new Intent(MainActivity.this, BreakfastActivity.class));
            }
        });

        Button button_snack1 = (Button) findViewById(R.id.snack1_am);
        button_snack1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("tag","Snack1 button is pressed");
                // code to be executed when button is clicked
                Intent intent = new Intent(MainActivity.this, Snack1Activity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                startActivity(new Intent(MainActivity.this, Snack1Activity.class));
            }
        });

        Button button_lunch = (Button) findViewById(R.id.lunch_am);
        button_lunch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("tag","Lunch button is pressed");
                // code to be executed when button is clicked
                Intent intent = new Intent(MainActivity.this, LunchActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                startActivity(new Intent(MainActivity.this, LunchActivity.class));
            }
        });

        Button button_snack2 = (Button) findViewById(R.id.snack2_am);
        button_snack2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("tag","Snack2 button is pressed");
                // code to be executed when button is clicked
                Intent intent = new Intent(MainActivity.this, Snack2Activity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                startActivity(new Intent(MainActivity.this, Snack2Activity.class));
            }
        });

        Button button_dinner = (Button) findViewById(R.id.dinner_am);
        button_dinner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("tag","Dinner button is pressed");
                // code to be executed when button is clicked
                Intent intent = new Intent(MainActivity.this, DinnerActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                startActivity(new Intent(MainActivity.this, DinnerActivity.class));
            }
        });

        Button button_view = (Button) findViewById(R.id.view_am);
        button_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("tag","View button is pressed");
                // code to be executed when button is clicked
                Intent intent = new Intent(MainActivity.this, ViewActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                startActivity(new Intent(MainActivity.this, ViewActivity.class));
            }
        });

    }


}
