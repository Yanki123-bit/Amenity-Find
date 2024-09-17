package com.example.amenitysearch;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Vichales_hotel extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vichales_hotel);

        TextView textViewLiveLocation = findViewById(R.id.textView5);

        Button bookNow = findViewById(R.id.button2);

        bookNow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://voltavicharleshotel.com/"));
                startActivity(intent);
            }
        });


        textViewLiveLocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.google.com/maps/place/Volta+Vicharles+Hotel/@6.5973837,0.4659071,15z/data=!4m18!1m6!2m5!1sHotels!5m2!5m1!1s2024-09-13!6e3!3m10!1s0x10272543f1252907:0xd96f5445b773bf15!5m3!1s2024-09-13!4m1!1i2!8m2!3d6.592883!4d0.465933!15sCgZIb3RlbHOSAQVob3RlbOABAA!16s%2Fg%2F11bwh9v_rn?entry=ttu&g_ep=EgoyMDI0MDkwNC4wIKXMDSoASAFQAw%3D%3D";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });

    }
}