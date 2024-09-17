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

public class Lena_Pharmacy extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lena_pharmacy);

        TextView textViewLiveLocation = findViewById(R.id.textView5);
        textViewLiveLocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.google.com/maps/place/LENA+PHARMACY/@6.6022482,0.461137,17z/data=!3m1!4b1!4m6!3m5!1s0x1027257979ec5abf:0xdde88cb0e87c626!8m2!3d6.6022429!4d0.4637173!16s%2Fg%2F11fr34x_k6?entry=ttu&g_ep=EgoyMDI0MDkwOS4wIKXMDSoASAFQAw%3D%3D";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });


    }
}