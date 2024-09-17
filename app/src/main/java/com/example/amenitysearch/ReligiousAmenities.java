package com.example.amenitysearch;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import android.view.WindowManager;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ReligiousAmenities extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_religious_amenities);

        View decorView = getWindow().getDecorView();
        int uiOptions = View.SYSTEM_UI_FLAG_HIDE_NAVIGATION | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY;
        decorView.setSystemUiVisibility(uiOptions);

        CardView aseembliescentral = findViewById(R.id.assembliesofgodcard);
        CardView paradise = findViewById(R.id.paradiseintCard);
        CardView firstlove = findViewById(R.id.firstlovecard);
        CardView epchurch = findViewById(R.id.epchurchheadcard);
        CardView pente = findViewById(R.id.pentecostcard);
        CardView francis = findViewById(R.id.stfranciscard);
        CardView asemblieshtu = findViewById(R.id.assemblieshtucard);
        CardView mick = findViewById(R.id.stmickcard);
        CardView ep = findViewById(R.id.ep_churchcard);
        CardView love = findViewById(R.id.loveeconscard);
        CardView jesus = findViewById(R.id.jesusthewaycard);
        CardView hall = findViewById(R.id.hallofstrenghtcard);
        CardView sacred = findViewById(R.id.sacredheartcard);

        sacred.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ReligiousAmenities.this, Sacred_Heart_Cathedral.class);
                startActivity(intent);
            }
        });

        hall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ReligiousAmenities.this, Hall_of_Stregnth.class);
                startActivity(intent);
            }
        });

        jesus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ReligiousAmenities.this, Jesus_The_Way.class);
                startActivity(intent);
            }
        });

        love.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ReligiousAmenities.this, Love_Economy.class);
                startActivity(intent);
            }
        });

        ep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ReligiousAmenities.this, EP_Church.class);
                startActivity(intent);
            }
        });

        mick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ReligiousAmenities.this, StMichaelCatholic.class);
                startActivity(intent);
            }
        });

        asemblieshtu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( ReligiousAmenities.this, AssemblirsOfGodHtu.class);
                startActivity(intent);
            }
        });

        aseembliescentral.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ReligiousAmenities.this, AssembliesOfGodCentral.class);
                startActivity(intent);
            }
        });

        epchurch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ReligiousAmenities.this, EpChurchHead.class);
                startActivity(intent);
            }
        });

        francis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ReligiousAmenities.this, SaintFrancis.class);
                startActivity(intent);
            }
        });

        pente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ReligiousAmenities.this, Pentecostchurch.class);
                startActivity(intent);
            }
        });

        firstlove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ReligiousAmenities.this, FirstLove.class);
                startActivity(intent);
            }
        });

        paradise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ReligiousAmenities.this, ParadiseInternational.class);
                Vibrate();
                startActivity(intent);
            }
        });

    }

    private void Vibrate(){
        Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        if (vibrator != null){
            vibrator.vibrate(50);
        }
    }

}