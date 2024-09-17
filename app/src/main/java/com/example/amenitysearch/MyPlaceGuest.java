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

public class MyPlaceGuest extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_place_guest);

        TextView textViewLiveLocation = findViewById(R.id.textView5);
        textViewLiveLocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.google.com/maps/place/MY+Place+Guest+House+Ho/@6.5878572,0.4326134,16z/data=!4m17!1m5!2m4!1sHotels!5m2!5m1!1s2024-09-13!3m10!1s0x10273b87529033b1:0xcef01a6dc3125162!5m3!1s2024-09-13!4m1!1i2!8m2!3d6.5878572!4d0.442275!15sCgZIb3RlbHOSAQtndWVzdF9ob3VzZeABAA!16s%2Fg%2F11t61y3ck6?entry=ttu&g_ep=EgoyMDI0MDkwNC4wIKXMDSoASAFQAw%3D%3D";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });

    }
}