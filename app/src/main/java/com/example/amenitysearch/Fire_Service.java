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

public class Fire_Service extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fire_service);

        TextView textViewLiveLocation = findViewById(R.id.textView5);

        textViewLiveLocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.google.com/maps/place/Municipal+Fire+Office/@6.6057735,0.4556909,15.88z/data=!4m10!1m2!2m1!1sfire+station+ho!3m6!1s0x102725d56a1f9dff:0x7383ea6fa86b0f8c!8m2!3d6.6081943!4d0.4613094!15sCg9maXJlIHN0YXRpb24gaG-SAQxmaXJlX3N0YXRpb27gAQA!16s%2Fg%2F11g1pq2c24?entry=ttu&g_ep=EgoyMDI0MDkxMS4wIKXMDSoASAFQAw%3D%3D";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });

    }
}