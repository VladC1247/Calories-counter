package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.ArrayList;
import com.example.myapplication.DatabaseManager;

import androidx.appcompat.app.AppCompatActivity;

public class BreakfastActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.breakfast);
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out);

        // ...

        Button buttonFood = findViewById(R.id.food);
        TextView textViewFoodList = findViewById(R.id.foodListTextView);

        buttonFood.setOnClickListener(v -> {
            ArrayList<String> foodList = DatabaseManager.getFoodList();
            StringBuilder foodListString = new StringBuilder();

            // Construiește un șir de caractere cu elementele din lista de alimente
            for (String food : foodList) {
                foodListString.append(food).append("\n");
            }

            // Afișează lista de alimente în TextView
            textViewFoodList.setText(foodListString.toString());
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

        Button buttonfood = findViewById(R.id.food);
        Button buttonDrinks = findViewById(R.id.drinks);

        buttonFood.setOnClickListener(v -> {
            ArrayList<String> foodList = DatabaseManager.getFoodList();
            // Afișați lista de alimente în logcat
            for (String food : foodList) {
                Log.d("Food", food);
            }
        });

        buttonDrinks.setOnClickListener(v -> {
            ArrayList<String> drinkList = DatabaseManager.getDrinkList();
            // Afișați lista de băuturi în logcat
            for (String drink : drinkList) {
                Log.d("Drink", drink);
            }
        });

    }

}
