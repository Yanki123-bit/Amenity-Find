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

public class StMichaelCatholic extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_st_michael_catholic);

        TextView textViewLiveLocation = findViewById(R.id.textView5);
        textViewLiveLocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.google.com/maps/place/St.+Micheal+Catholic+Church/@6.5990813,0.4445467,14z/data=!4m13!1m5!2m4!1sSt+Michael+Roman+Catholic+Church+ho!5m2!5m1!1s2024-09-13!3m6!1s0x1027253bdabf2db1:0x5eddf37a51df16d!8m2!3d6.6022693!4d0.4923028!15sCiNTdCBNaWNoYWVsIFJvbWFuIENhdGhvbGljIENodXJjaCBob5IBD2NhdGhvbGljX2NodXJjaOABAA!16s%2Fg%2F11fvlnwjml?entry=ttu&g_ep=EgoyMDI0MDkwOS4wIKXMDSoASAFQAw%3D%3D";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });

    }
}