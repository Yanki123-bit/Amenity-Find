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

public class Prison extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prison);

        TextView textViewLiveLocation = findViewById(R.id.textView5);


        textViewLiveLocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.google.com/maps/place/Ho+central+prisons+service/@6.6088951,0.4636556,16.18z/data=!4m10!1m2!2m1!1sservice+ho!3m6!1s0x102725623e20df83:0xc3cfc5dd58de69fe!8m2!3d6.6108231!4d0.46829!15sCgpzZXJ2aWNlIGhvkgEGcHJpc29u4AEA!16s%2Fg%2F11j53m3v_d?entry=ttu&g_ep=EgoyMDI0MDkxMS4wIKXMDSoASAFQAw%3D%3D";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });

    }
}