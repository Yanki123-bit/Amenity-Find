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

public class Woesor_hotel extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_woesor_hotel);

        TextView textViewLiveLocation = findViewById(R.id.textView5);
        textViewLiveLocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.google.com/maps/place/Woezor+Hotel/@6.6092448,0.4412824,15z/data=!4m18!1m6!2m5!1sHotels!5m2!5m1!1s2024-09-13!6e3!3m10!1s0x1027253abb6aa421:0xb186e5227f85a8ea!5m3!1s2024-09-13!4m1!1i2!8m2!3d6.6092448!4d0.4603368!15sCgZIb3RlbHOSAQVob3RlbOABAA!16s%2Fg%2F1tg_06b3?entry=ttu&g_ep=EgoyMDI0MDkwNC4wIKXMDSoASAFQAw%3D%3D";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });

    }
}