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

public class Police_Head extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_police_head);

        TextView textViewLiveLocation = findViewById(R.id.textView5);

        textViewLiveLocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.google.com/maps/place/District+Police+Headquarters/@6.6095165,0.468124,15z/data=!4m10!1m2!2m1!1sho+district!3m6!1s0x10272518271b6a7f:0x37c46fddc419a1e2!8m2!3d6.6103265!4d0.4707848!15sCgtobyBkaXN0cmljdJIBDGNpdmlsX3BvbGljZeABAA!16s%2Fg%2F11f0y5bjwm?entry=ttu&g_ep=EgoyMDI0MDkxMS4wIKXMDSoASAFQAw%3D%3D";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });

    }
}