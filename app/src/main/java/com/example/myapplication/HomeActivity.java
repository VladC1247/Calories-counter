package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import java.text.SimpleDateFormat;
import java.util.Date;

public class HomeActivity extends AppCompatActivity {
    String layoutName;

    @Override
    protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        this.layoutName = getResources().getResourceEntryName(R.layout.activity_menu);
        Log.d("TAG", layoutName);

        TextView tv = findViewById(R.id.calories_am);
        tv.setText("Calories gained today:");

        TextView textView=findViewById(R.id.date);
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyy   HH:mm");
        String currentDateandTime = sdf.format(new Date());
        textView.setText(currentDateandTime);

        Button button_breakfast = (Button) findViewById(R.id.breakfast_am);
        button_breakfast.setOnClickListener(v -> {
            Log.d("tag","Breakfast button is pressed");
            // code to be executed when button is clicked
            Intent intent = new Intent(HomeActivity.this, BreakfastActivity.class);
            startActivity(intent);
            overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
            startActivity(new Intent(HomeActivity.this, BreakfastActivity.class));
        });

        Button button_snack1 = findViewById(R.id.snack1_am);
        button_snack1.setOnClickListener(v -> {
            Log.d("tag","Snack1 button is pressed");
            // code to be executed when button is clicked
            Intent intent = new Intent(HomeActivity.this, Snack1Activity.class);
            startActivity(intent);
            overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
            startActivity(new Intent(HomeActivity.this, Snack1Activity.class));
        });

        Button button_lunch = findViewById(R.id.lunch_am);
        button_lunch.setOnClickListener(v -> {
            Log.d("tag","Lunch button is pressed");
            // code to be executed when button is clicked
            Intent intent = new Intent(HomeActivity.this, LunchActivity.class);
            startActivity(intent);
            overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
            startActivity(new Intent(HomeActivity.this, LunchActivity.class));
        });

        Button button_snack2 = findViewById(R.id.snack2_am);
        button_snack2.setOnClickListener(v -> {
            Log.d("tag","Snack2 button is pressed");
            // code to be executed when button is clicked
            Intent intent = new Intent(HomeActivity.this, Snack2Activity.class);
            startActivity(intent);
            overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
            startActivity(new Intent(HomeActivity.this, Snack2Activity.class));
        });

        Button button_dinner = findViewById(R.id.dinner_am);
        button_dinner.setOnClickListener(v -> {
            Log.d("tag","Dinner button is pressed");
            // code to be executed when button is clicked
            Intent intent = new Intent(HomeActivity.this, DinnerActivity.class);
            startActivity(intent);
            overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
            startActivity(new Intent(HomeActivity.this, DinnerActivity.class));
        });

        Button button_view = findViewById(R.id.view_am);
        button_view.setOnClickListener(v -> {
            Log.d("tag","View button is pressed");
            // code to be executed when button is clicked
            Intent intent = new Intent(HomeActivity.this, ViewActivity.class);
            startActivity(intent);
            overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
            startActivity(new Intent(HomeActivity.this, ViewActivity.class));
        });
    }


}
