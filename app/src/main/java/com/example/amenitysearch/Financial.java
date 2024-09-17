package com.example.amenitysearch;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Financial extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_financial);

        CardView access = findViewById(R.id.accesscard);
        CardView gcbmarket = findViewById(R.id.gcbCard);
        CardView nib = findViewById(R.id.nibcard);
        CardView sg = findViewById(R.id.sgbankcard);
        CardView barclays = findViewById(R.id.barclayscard);
        CardView zenith = findViewById(R.id.zenithcard);
        CardView stanbic = findViewById(R.id.stanbiccard);

        Button accessbutt = findViewById(R.id.accessbutton);
        Button gcbmarketbutt = findViewById(R.id.gcbbutton);
        Button nibbutt = findViewById(R.id.nibbutton);
        Button sgbutt = findViewById(R.id.sgbutton);
        Button barclaysbutt = findViewById(R.id.barclaysbutton);
        Button senitbut = findViewById(R.id.senithbutton);
        Button stanbicbut = findViewById(R.id.stanbicbutton);

        stanbicbut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.google.com/maps/place/Stanbic+Bank+-+Ho+Branch/@6.6073983,0.4701751,17z/data=!3m1!4b1!4m6!3m5!1s0x102725172014f39b:0xe50c4ef0c7250bce!8m2!3d6.607393!4d0.4727554!16s%2Fg%2F1ptzdfybb?entry=ttu&g_ep=EgoyMDI0MDkwOS4wIKXMDSoASAFQAw%3D%3D";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });



        senitbut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.google.com/maps/place/Zenith+Bank+-+Ho+Agency/@6.5917175,0.4663205,17z/data=!3m1!4b1!4m6!3m5!1s0x102725152a227ba1:0x9d7472edd4d771b3!8m2!3d6.5917122!4d0.4689008!16s%2Fg%2F124yd53ns?entry=ttu&g_ep=EgoyMDI0MDkwOS4wIKXMDSoASAFQAw%3D%3D";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });


        barclaysbutt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.google.com/maps/place/Barclays+Bank/@6.610843,0.4681709,16.68z/data=!4m6!3m5!1s0x10272522a732dd2b:0x7342481af4410a53!8m2!3d6.6111538!4d0.4690248!16s%2Fg%2F11cn9tbbhd?entry=ttu&g_ep=EgoyMDI0MDgyOC4wIKXMDSoASAFQAw%3D%3D";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });

        sgbutt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.google.com/maps/place/SG+SSB/@6.6096573,0.47144,16.28z/data=!4m10!1m2!2m1!1sSG+Bank+!3m6!1s0x10272517730389a3:0x2c4b1b47e7fd1415!8m2!3d6.6089595!4d0.4718939!15sCgdTRyBCYW5rkgEEYmFua-ABAA!16s%2Fg%2F11g72fypgl?entry=ttu&g_ep=EgoyMDI0MDgyOC4wIKXMDSoASAFQAw%3D%3D";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });

        nibbutt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "\n" +
                        "https://www.google.com/maps/place/National+Invesment+Bank+(NIB)+-+Ho/@6.6121091,0.4654618,17z/data=!3m1!4b1!4m6!3m5!1s0x102725152a227ba1:0x99ad3b6ac06cf78!8m2!3d6.6121038!4d0.4703274!16s%2Fg%2F1262llkzg?entry=ttu&g_ep=EgoyMDI0MDgyOC4wIKXMDSoASAFQAw%3D%3D";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });

        gcbmarketbutt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.google.com/maps/place/GCB+Bank+Ho+market/@6.6139582,0.4695085,14.37z/data=!4m10!1m2!2m1!1sGhana+Commercial+bank+ho!3m6!1s0x102724e22024cfb7:0xa7547c425e5f6693!8m2!3d6.6222473!4d0.473959!15sChhHaGFuYSBDb21tZXJjaWFsIGJhbmsgaG8iA4gBAZIBBGJhbmvgAQA!16s%2Fg%2F11c7606rfc?entry=ttu&g_ep=EgoyMDI0MDgyOC4wIKXMDSoASAFQAw%3D%3D";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });

        accessbutt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.google.com/maps/place/Access+Bank+Ho/@6.61531,0.4655295,17z/data=!3m1!4b1!4m6!3m5!1s0x102725221e8ece61:0x24271e19b9d0083e!8m2!3d6.6153047!4d0.4681098!16s%2Fg%2F11c2nprgr8?entry=ttu&g_ep=EgoyMDI0MDgyOC4wIKXMDSoASAFQAw%3D%3D";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });

        access.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Financial.this, Access_Bank.class);
                startActivity(intent);
            }
        });

        stanbic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Financial.this, Stanbic_Bank.class);
                startActivity(intent);
            }
        });


        zenith.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Financial.this, Zenith_Bank.class);
                startActivity(intent);
            }
        });


        barclays.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Financial.this, Barclays_Bank.class);
                startActivity(intent);
            }
        });


        sg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Financial.this, SG_Bank.class);
                startActivity(intent);
            }
        });


        nib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Financial.this, NIB.class);
                startActivity(intent);
            }
        });


        gcbmarket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Financial.this, GCB.class);
                startActivity(intent);
            }
        });



    }
}