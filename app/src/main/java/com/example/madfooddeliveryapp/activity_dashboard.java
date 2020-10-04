package com.example.madfooddeliveryapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class activity_dashboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);


        ImageView imageView = (ImageView)findViewById(R.id.itempic);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent act2 = new Intent(view.getContext(), activity_edit_items.class);
                startActivity(act2);
            }
        });

        ImageView imageView1 = (ImageView)findViewById(R.id.additempic);
        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent act2 = new Intent(view.getContext(),activity_add_items.class);
                startActivity(act2);
            }
        });

    }}