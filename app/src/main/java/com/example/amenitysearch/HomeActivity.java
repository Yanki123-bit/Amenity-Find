package com.example.amenitysearch;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        ImageSlider imageSlider = findViewById(R.id.imageSlider);

        ArrayList<SlideModel> slideModels = new ArrayList<>();

        slideModels.add(new SlideModel(R.drawable.asogli_block, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.assemblies_of_god_church_central_chapel, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.access, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.africanhill, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.genius_it_brainery, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.holy_spirit_teaching_training_college, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.rolizpizzaarrestaurant, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.class_house_electronics_ho, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.mothersinnrestaurant, ScaleTypes.FIT));

        imageSlider.setImageList(slideModels, ScaleTypes.FIT);

        CardView menu = findViewById(R.id.menucard);
        CardView logout = findViewById(R.id.signoutcard);
        CardView home = findViewById(R.id.homecard);

        ImageView bed = findViewById(R.id.bedwinimg);
        ImageView uhasss = findViewById(R.id.uhasimg);
        ImageView htuu = findViewById(R.id.htuimg);
        ImageView mawulisch = findViewById(R.id.mawuliimg);
        ImageView ntcc = findViewById(R.id.ntcimg);
        ImageView accesss = findViewById(R.id.accessbankimg);
        ImageView ep = findViewById(R.id.epchurchheadimg);
        ImageView kcs = findViewById(R.id.kcsimg);
        ImageView ts = findViewById(R.id.tsfitnessimg);

        bed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, Bedwin_Wine.class);
                startActivity(intent);
            }
        });


        ts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, TS_Fitness.class);
                startActivity(intent);
            }
        });


        kcs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, KCS_Restaurant.class);
                startActivity(intent);
            }
        });


        ep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, EpChurchHead.class);
                startActivity(intent);
            }
        });


        accesss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, Access_Bank.class);
                startActivity(intent);
            }
        });


        ntcc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, HoNTC.class);
                startActivity(intent);
            }
        });


        mawulisch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, Mawuli.class);
                startActivity(intent);
            }
        });


        htuu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, HTU.class);
                startActivity(intent);
            }
        });


        uhasss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, UHAS.class);
                startActivity(intent);
            }
        });



        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, scrollview.class);
                startActivity(intent);
            }
        });

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, HomeActivity.class);
                startActivity(intent);
            }
        });


        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, Login.class);
                startActivity(intent);
            }
        });


    }
}