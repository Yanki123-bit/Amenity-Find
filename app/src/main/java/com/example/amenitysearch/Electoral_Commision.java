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

public class Electoral_Commision extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_electoral_commision);

        TextView textViewLiveLocation = findViewById(R.id.textView5);


        textViewLiveLocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.google.com/maps/place/Electoral+Commission+Ho/@6.619753,0.4554002,15z/data=!4m10!1m2!2m1!1sho+district!3m6!1s0x102725d6d0a3ed29:0x6b49799a5fbd90e0!8m2!3d6.6084871!4d0.4700185!15sCgtobyBkaXN0cmljdJIBEWdvdmVybm1lbnRfb2ZmaWNl4AEA!16s%2Fg%2F11t61v0gts?entry=ttu&g_ep=EgoyMDI0MDkxMS4wIKXMDSoASAFQAw%3D%3D";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });

    }
}