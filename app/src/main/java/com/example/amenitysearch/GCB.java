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

public class GCB extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gcb);

        TextView textViewLiveLocation = findViewById(R.id.textView5);
        textViewLiveLocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.google.com/maps/place/GCB+Bank+Ho+market/@6.6139582,0.4695085,14.37z/data=!4m10!1m2!2m1!1sGhana+Commercial+bank+ho!3m6!1s0x102724e22024cfb7:0xa7547c425e5f6693!8m2!3d6.6222473!4d0.473959!15sChhHaGFuYSBDb21tZXJjaWFsIGJhbmsgaG8iA4gBAZIBBGJhbmvgAQA!16s%2Fg%2F11c7606rfc?entry=ttu&g_ep=EgoyMDI0MDgyOC4wIKXMDSoASAFQAw%3D%3D";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
    }
}