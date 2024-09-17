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

public class Zoomlion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zoomlion);

        TextView textViewLiveLocation = findViewById(R.id.textView5);

        textViewLiveLocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.google.com/maps/place/Zoomlion+Ghana+Ltd,+Ho/@6.618216,0.4848607,16z/data=!4m10!1m2!2m1!1sservice+ho!3m6!1s0x1027256ae1c9b5cd:0xef01720049695de9!8m2!3d6.618216!4d0.4938729!15sCgpzZXJ2aWNlIGhvWgwiCnNlcnZpY2UgaG-SARh3YXN0ZV9tYW5hZ2VtZW50X3NlcnZpY2WaASRDaGREU1VoTk1HOW5TMFZKUTBGblNVUjVNa3Q1TlMxblJSQULgAQA!16s%2Fg%2F11h3thgj0f?entry=ttu&g_ep=EgoyMDI0MDkxMS4wIKXMDSoASAFQAw%3D%3D";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });

    }
}