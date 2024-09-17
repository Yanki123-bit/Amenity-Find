package com.example.amenitysearch;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;


public class AmenityType extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_amenity_type);

        CardView eduCard = findViewById(R.id.Educard);
        CardView housing = findViewById(R.id.Housingcard);
        CardView dining = findViewById(R.id.Shoppingcard);

        eduCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AmenityType.this, EducationalAmenities.class);
                startActivity(intent);
            }
        });

        housing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AmenityType.this, Housing.class);
                startActivity(intent);
            }
        });

        dining.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AmenityType.this, ShoppingDinning.class);
                startActivity(intent);
            }
        });




    }
}