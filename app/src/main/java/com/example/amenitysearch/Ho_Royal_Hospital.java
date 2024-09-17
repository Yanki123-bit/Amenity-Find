package com.example.amenitysearch;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Ho_Royal_Hospital extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ho_royal_hospital);

        TextView textViewLiveLocation = findViewById(R.id.textView5);


        textViewLiveLocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.google.com/maps/place/HO+ROYAL+HOSPITAL/@6.6308274,0.4750502,17z/data=!3m1!4b1!4m6!3m5!1s0x102724e558d1e8d3:0x4259bc81754c43ac!8m2!3d6.6308221!4d0.4776305!16s%2Fg%2F11c43bxwms?entry=ttu&g_ep=EgoyMDI0MDkwOS4wIKXMDSoASAFQAw%3D%3D";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });


    }
}