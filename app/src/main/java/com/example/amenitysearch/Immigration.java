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

public class Immigration extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_immigration);

        TextView textViewLiveLocation = findViewById(R.id.textView5);


        textViewLiveLocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.google.com/maps/place/Ghana+Immigration+Service/@6.6106646,0.4582761,16z/data=!4m10!1m2!2m1!1sservice+ho!3m6!1s0x10272522d02b46a1:0x8c04a18a8bf9c08f!8m2!3d6.6106646!4d0.4672883!15sCgpzZXJ2aWNlIGhvkgERZ292ZXJubWVudF9vZmZpY2XgAQA!16s%2Fg%2F11dy1ljjws?entry=ttu&g_ep=EgoyMDI0MDkxMS4wIKXMDSoASAFQAw%3D%3D";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });

    }
}