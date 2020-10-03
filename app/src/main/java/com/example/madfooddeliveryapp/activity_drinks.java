package com.example.madfooddeliveryapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class activity_drinks extends AppCompatActivity {
    Button b1,b2,b3,b4,b5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drinks);


        b1 = findViewById(R.id.rice_button);
        b2 = findViewById(R.id.Pizza_button);
        b3 = findViewById(R.id.kottu_button);
        b4 = findViewById(R.id.pasta_button);
        b5 = findViewById(R.id.Drinks_button);

        //navigation
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent newI = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(newI);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent newI = new Intent(getApplicationContext(), pizza.class);
                startActivity(newI);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent newI = new Intent(getApplicationContext(), activity_kottu.class);
                startActivity(newI);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent newI = new Intent(getApplicationContext(), activity_pasta.class);
                startActivity(newI);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent newI = new Intent(getApplicationContext(), activity_drinks.class);
                startActivity(newI);
            }
        });
    }
}