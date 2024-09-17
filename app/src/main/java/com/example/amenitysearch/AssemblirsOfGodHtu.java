package com.example.amenitysearch;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;


public class AssemblirsOfGodHtu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assemblirs_of_god_htu);

        TextView textViewLiveLocation = findViewById(R.id.textView5);
        textViewLiveLocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.google.com/maps/place/Assemblies+of+God+Campus+Ministry+HTU+Chapter/@6.6101546,0.4759692,17z/data=!3m1!4b1!4m10!3m9!1s0x10272573e66944bb:0xd8d8eb4d19d1135!5m3!1s2024-09-13!4m1!1i2!8m2!3d6.6101493!4d0.4785495!16s%2Fg%2F11ns3mj4s4?entry=ttu&g_ep=EgoyMDI0MDkwOS4wIKXMDSoASAFQAw%3D%3D";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
    }
}