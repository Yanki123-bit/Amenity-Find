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

public class Deladem_Pharmacy extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deladem_pharmacy);

        TextView textViewLiveLocation = findViewById(R.id.textView5);
        textViewLiveLocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.google.com/maps/place/Deladem+pharmacy/@6.6066981,0.4701097,17z/data=!3m1!4b1!4m6!3m5!1s0x10272562d7a59dab:0x907726b2e2039f09!8m2!3d6.6066928!4d0.47269!16s%2Fg%2F11qm3h545q?entry=ttu&g_ep=EgoyMDI0MDgyOC4wIKXMDSoASAFQAw%3D%3D";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
    }
}