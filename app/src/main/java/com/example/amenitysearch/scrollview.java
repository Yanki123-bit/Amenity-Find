package com.example.amenitysearch;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class scrollview extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_scrollview);

        CardView eduCard = findViewById(R.id.Educard);
        CardView housing = findViewById(R.id.Housingcard);
        CardView dining = findViewById(R.id.Shoppingcard);
        CardView finance = findViewById(R.id.Financialcard);
        CardView health = findViewById(R.id.Healthcard);
        CardView religious = findViewById(R.id.Religiouscard);
        CardView recreational = findViewById(R.id.Recreationalcard);


        eduCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(scrollview.this, EducationalAmenities.class);
                startActivity(intent);
            }
        });

        recreational.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(scrollview.this, RecreationalAmenities.class);
                startActivity(intent);
            }
        });

        religious.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(scrollview.this, ReligiousAmenities.class);
                startActivity(intent);
            }
        });

        health.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(scrollview.this, HealthAndWelness.class);
                startActivity(intent);
            }
        });

        housing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(scrollview.this, Housing.class);
                startActivity(intent);
            }
        });

        dining.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(scrollview.this, ShoppingDinning.class);
                startActivity(intent);
            }
        });

        finance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(scrollview.this, Financial.class);
                startActivity(intent);
            }
        });
    }
}