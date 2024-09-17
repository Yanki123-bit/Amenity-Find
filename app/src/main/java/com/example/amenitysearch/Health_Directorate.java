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

public class Health_Directorate extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_health_directorate);

        TextView textViewLiveLocation = findViewById(R.id.textView5);
        textViewLiveLocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.google.com/maps/place/Volta+Regional+Health+Directorate/@6.6084864,0.4491001,15z/data=!4m10!1m2!2m1!1sho+district!3m6!1s0x1027253d1bdf942b:0xb38afd0726098d96!8m2!3d6.6084864!4d0.4671245!15sCgtobyBkaXN0cmljdFoNIgtobyBkaXN0cmljdJIBEGNvcnBvcmF0ZV9vZmZpY2WaASRDaGREU1VoTk1HOW5TMFZKUTBGblNVTnpibDh5UWpOQlJSQULgAQA!16s%2Fg%2F11cs3z85zs?entry=ttu&g_ep=EgoyMDI0MDkxMS4wIKXMDSoASAFQAw%3D%3D";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });

    }
}