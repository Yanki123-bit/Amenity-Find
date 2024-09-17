package com.example.amenitysearch;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;


public class VoltaSerene extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_volta_serene);

        Button bookNow = findViewById(R.id.button2);
        bookNow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.voltaserenehotel.com/"));
                startActivity(intent);
            }
        });

        TextView textViewLiveLocation = findViewById(R.id.textView5);
        textViewLiveLocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.google.com/maps/place/Volta+Serene+Hotel/@6.6142261,0.4509399,15.98z/data=!4m16!1m5!2m4!1sHotels!5m2!5m1!1s2024-09-13!3m9!1s0x1027252c1d961c25:0xeb58bd63e1592e7a!5m3!1s2024-09-13!4m1!1i2!8m2!3d6.614448!4d0.4544482!16s%2Fg%2F11ckfqzrrq?entry=ttu&g_ep=EgoyMDI0MDkwNC4wIKXMDSoASAFQAw%3D%3D";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });

    }
}