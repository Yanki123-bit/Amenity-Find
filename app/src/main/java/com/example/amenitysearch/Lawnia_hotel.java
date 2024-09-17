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

public class Lawnia_hotel extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lawnia_hotel);

        TextView textViewLiveLocation = findViewById(R.id.textView5);
        textViewLiveLocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.google.com/maps/place/Lawnia+Hotel,+Ho/@6.5851914,0.4593702,16z/data=!4m18!1m6!2m5!1sHotels!5m2!5m1!1s2024-09-13!6e3!3m10!1s0x10272562102911f7:0x8da1dfcfc8cc5d6b!5m3!1s2024-09-13!4m1!1i2!8m2!3d6.5847651!4d0.4621382!15sCgZIb3RlbHOSAQVob3RlbOABAA!16s%2Fg%2F11cjnh00vr?entry=ttu&g_ep=EgoyMDI0MDkwNC4wIKXMDSoASAFQAw%3D%3D";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
    }
}