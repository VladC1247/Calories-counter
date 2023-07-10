package com.example.myapplication;

import static com.example.myapplication.R.*;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {
    String layoutName;

    @Override
    protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
<<<<<<< HEAD
        setContentView(layout.activity_menu);
        this.layoutName = getResources().getResourceEntryName(layout.activity_menu);
=======
        setContentView(R.layout.activity_menu);
        this.layoutName = getResources().getResourceEntryName(R.layout.activity_menu);
>>>>>>> 1b45bcd83cb75729ed866c8576bfe05d59f3ed17
        Log.d("TAG", layoutName);

        TextView tv = findViewById(R.id.calories_am);
        tv.setText("Calories gained today:");

        TextView textView=findViewById(R.id.date);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd   HH:mm");
        String currentDateandTime = sdf.format(new Date());
        textView.setText(currentDateandTime);

        Button button_breakfast = (Button) findViewById(R.id.breakfast_am);
        button_breakfast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("tag","Breakfast button is pressed");
                // code to be executed when button is clicked
                Intent intent = new Intent(MainActivity.this, BreakfastActivity.class);
                startActivity(intent);
                overridePendingTransition(anim.fade_in, anim.fade_out);
                startActivity(new Intent(MainActivity.this, BreakfastActivity.class));
            }
        });

<<<<<<< HEAD
        Button button_snack1 = findViewById(id.snack1_am);
=======
        Button button_snack1 = findViewById(R.id.snack1_am);
>>>>>>> 1b45bcd83cb75729ed866c8576bfe05d59f3ed17
        button_snack1.setOnClickListener(v -> {
            Log.d("tag","Snack1 button is pressed");
            // code to be executed when button is clicked
            Intent intent = new Intent(MainActivity.this, Snack1Activity.class);
            startActivity(intent);
<<<<<<< HEAD
            overridePendingTransition(anim.fade_in, anim.fade_out);
            startActivity(new Intent(MainActivity.this, Snack1Activity.class));
        });

        Button button_lunch = findViewById(id.lunch_am);
=======
            overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
            startActivity(new Intent(MainActivity.this, Snack1Activity.class));
        });

        Button button_lunch = findViewById(R.id.lunch_am);
>>>>>>> 1b45bcd83cb75729ed866c8576bfe05d59f3ed17
        button_lunch.setOnClickListener(v -> {
            Log.d("tag","Lunch button is pressed");
            // code to be executed when button is clicked
            Intent intent = new Intent(MainActivity.this, LunchActivity.class);
            startActivity(intent);
<<<<<<< HEAD
            overridePendingTransition(anim.fade_in, anim.fade_out);
            startActivity(new Intent(MainActivity.this, LunchActivity.class));
        });

        Button button_snack2 = findViewById(id.snack2_am);
=======
            overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
            startActivity(new Intent(MainActivity.this, LunchActivity.class));
        });

        Button button_snack2 = findViewById(R.id.snack2_am);
>>>>>>> 1b45bcd83cb75729ed866c8576bfe05d59f3ed17
        button_snack2.setOnClickListener(v -> {
            Log.d("tag","Snack2 button is pressed");
            // code to be executed when button is clicked
            Intent intent = new Intent(MainActivity.this, Snack2Activity.class);
            startActivity(intent);
<<<<<<< HEAD
            overridePendingTransition(anim.fade_in, anim.fade_out);
            startActivity(new Intent(MainActivity.this, Snack2Activity.class));
        });

        Button button_dinner = findViewById(id.dinner_am);
=======
            overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
            startActivity(new Intent(MainActivity.this, Snack2Activity.class));
        });

        Button button_dinner = findViewById(R.id.dinner_am);
>>>>>>> 1b45bcd83cb75729ed866c8576bfe05d59f3ed17
        button_dinner.setOnClickListener(v -> {
            Log.d("tag","Dinner button is pressed");
            // code to be executed when button is clicked
            Intent intent = new Intent(MainActivity.this, DinnerActivity.class);
            startActivity(intent);
<<<<<<< HEAD
            overridePendingTransition(anim.fade_in, anim.fade_out);
            startActivity(new Intent(MainActivity.this, DinnerActivity.class));
        });

        Button button_view = findViewById(id.view_am);
=======
            overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
            startActivity(new Intent(MainActivity.this, DinnerActivity.class));
        });

        Button button_view = findViewById(R.id.view_am);
>>>>>>> 1b45bcd83cb75729ed866c8576bfe05d59f3ed17
        button_view.setOnClickListener(v -> {
            Log.d("tag","View button is pressed");
            // code to be executed when button is clicked
            Intent intent = new Intent(MainActivity.this, ViewActivity.class);
            startActivity(intent);
<<<<<<< HEAD
            overridePendingTransition(anim.fade_in, anim.fade_out);
=======
            overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
>>>>>>> 1b45bcd83cb75729ed866c8576bfe05d59f3ed17
            startActivity(new Intent(MainActivity.this, ViewActivity.class));
        });
    }


}
