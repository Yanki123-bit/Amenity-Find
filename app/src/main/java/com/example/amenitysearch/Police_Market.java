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

public class Police_Market extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_police_market);

        TextView textViewLiveLocation = findViewById(R.id.textView5);

        textViewLiveLocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.google.com/maps/place/Ho+central+market+police+station/@6.6172069,0.4696739,15.93z/data=!4m10!1m2!2m1!1sho+district!3m6!1s0x10272560608eef89:0xe41e4a1237f4c27c!8m2!3d6.619753!4d0.4734246!15sCgtobyBkaXN0cmljdJIBEWdvdmVybm1lbnRfb2ZmaWNl4AEA!16s%2Fg%2F11pwxmfrrr?entry=ttu&g_ep=EgoyMDI0MDkxMS4wIKXMDSoASAFQAw%3D%3D";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });

    }
}