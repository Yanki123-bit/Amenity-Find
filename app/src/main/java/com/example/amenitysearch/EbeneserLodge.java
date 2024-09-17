package com.example.amenitysearch;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class EbeneserLodge extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ebeneser_lodge);

        Button bookNow = findViewById(R.id.button2);

        bookNow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://smartbizpromo.com/listing/ebenezer-lodge-2/"));
                startActivity(intent);
            }
        });

        TextView textViewLiveLocation = findViewById(R.id.textView5);
        textViewLiveLocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.google.com/maps/place/Ebenezer+Lodge/@6.6128445,0.451994,16z/data=!4m17!1m5!2m4!1sHotels!5m2!5m1!1s2024-09-13!3m10!1s0x10272525a83eb481:0x7f89de2d8aa0e551!5m3!1s2024-09-13!4m1!1i2!8m2!3d6.6128445!4d0.4615212!15sCgZIb3RlbHOSAQVob3RlbOABAA!16s%2Fg%2F11f0xwmz2l?entry=ttu&g_ep=EgoyMDI0MDkwNC4wIKXMDSoASAFQAw%3D%3D";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });



    }
}