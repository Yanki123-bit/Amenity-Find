package com.example.amenitysearch;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;


public class Housing extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_housing);

        CardView sky = findViewById(R.id.skyplus);
        CardView freedom = findViewById(R.id.freedomCard);
        CardView serene = findViewById(R.id.serenecard);
        CardView steven = findViewById(R.id.stevencard);
        CardView myplace = findViewById(R.id.myplaceguest);
        CardView ebenser = findViewById(R.id.ebenesercard);
        CardView lawnia = findViewById(R.id.lawniacard);


        lawnia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Housing.this, Lawnia_hotel.class);
                startActivity(intent);
            }
        });



        Button bookNow = findViewById(R.id.skyplusbutton);
        Button freedombut = findViewById(R.id.freedomhotelbutton);
        Button stevenbut = findViewById(R.id.stevenbutton);
        Button myplacebut = findViewById(R.id.myplacebutton);
        Button ebenbut = findViewById(R.id.ebenerserbutton);
        Button serenebut = findViewById(R.id.voltaserenbutton);
        Button lawniabut = findViewById(R.id.lawniabutton);
        Button rocklyn = findViewById(R.id.rocklynebutton);
        Button chances = findViewById(R.id.chancesbutton);
        Button vichales = findViewById(R.id.vicharlesbutton);
        Button malisa = findViewById(R.id.maliselbutton);
        Button woesor = findViewById(R.id.woezorbutton);

        vichales.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.google.com/maps/place/Volta+Vicharles+Hotel/@6.5973837,0.4659071,15z/data=!4m18!1m6!2m5!1sHotels!5m2!5m1!1s2024-09-13!6e3!3m10!1s0x10272543f1252907:0xd96f5445b773bf15!5m3!1s2024-09-13!4m1!1i2!8m2!3d6.592883!4d0.465933!15sCgZIb3RlbHOSAQVob3RlbOABAA!16s%2Fg%2F11bwh9v_rn?entry=ttu&g_ep=EgoyMDI0MDkwNC4wIKXMDSoASAFQAw%3D%3D";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });

        woesor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.google.com/maps/place/Woezor+Hotel/@6.6092448,0.4412824,15z/data=!4m18!1m6!2m5!1sHotels!5m2!5m1!1s2024-09-13!6e3!3m10!1s0x1027253abb6aa421:0xb186e5227f85a8ea!5m3!1s2024-09-13!4m1!1i2!8m2!3d6.6092448!4d0.4603368!15sCgZIb3RlbHOSAQVob3RlbOABAA!16s%2Fg%2F1tg_06b3?entry=ttu&g_ep=EgoyMDI0MDkwNC4wIKXMDSoASAFQAw%3D%3D";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });

        rocklyn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.google.com/maps/place/Rocklyne+Hotel/@6.5994508,0.4550785,16z/data=!4m18!1m6!2m5!1sHotels!5m2!5m1!1s2024-09-13!6e3!3m10!1s0x1027253f5587dd1b:0x2e52fb023d97c3d4!5m3!1s2024-09-13!4m1!1i2!8m2!3d6.5994508!4d0.4646057!15sCgZIb3RlbHOSAQVob3RlbOABAA!16s%2Fg%2F11c5hw2qh3?entry=ttu&g_ep=EgoyMDI0MDkwNC4wIKXMDSoASAFQAw%3D%3D";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });

        myplacebut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.google.com/maps/place/MY+Place+Guest+House+Ho/@6.5878572,0.4326134,16z/data=!4m17!1m5!2m4!1sHotels!5m2!5m1!1s2024-09-13!3m10!1s0x10273b87529033b1:0xcef01a6dc3125162!5m3!1s2024-09-13!4m1!1i2!8m2!3d6.5878572!4d0.442275!15sCgZIb3RlbHOSAQtndWVzdF9ob3VzZeABAA!16s%2Fg%2F11t61y3ck6?entry=ttu&g_ep=EgoyMDI0MDkwNC4wIKXMDSoASAFQAw%3D%3D";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });

        malisa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.google.com/maps/place/Malisel+Hotel/@6.6072032,0.4669895,15z/data=!4m18!1m6!2m5!1sHotels!5m2!5m1!1s2024-09-13!6e3!3m10!1s0x10272517a68682a5:0x2fbeb542a705b99f!5m3!1s2024-09-13!4m1!1i2!8m2!3d6.608951!4d0.4713239!15sCgZIb3RlbHOSAQVob3RlbOABAA!16s%2Fg%2F1th5fllw?entry=ttu&g_ep=EgoyMDI0MDkwNC4wIKXMDSoASAFQAw%3D%3D";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });


        lawniabut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.google.com/maps/place/Lawnia+Hotel,+Ho/@6.5851914,0.4593702,16z/data=!4m18!1m6!2m5!1sHotels!5m2!5m1!1s2024-09-13!6e3!3m10!1s0x10272562102911f7:0x8da1dfcfc8cc5d6b!5m3!1s2024-09-13!4m1!1i2!8m2!3d6.5847651!4d0.4621382!15sCgZIb3RlbHOSAQVob3RlbOABAA!16s%2Fg%2F11cjnh00vr?entry=ttu&g_ep=EgoyMDI0MDkwNC4wIKXMDSoASAFQAw%3D%3D";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });



        ebenbut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.google.com/maps/place/Ebenezer+Lodge/@6.6128445,0.451994,16z/data=!4m17!1m5!2m4!1sHotels!5m2!5m1!1s2024-09-13!3m10!1s0x10272525a83eb481:0x7f89de2d8aa0e551!5m3!1s2024-09-13!4m1!1i2!8m2!3d6.6128445!4d0.4615212!15sCgZIb3RlbHOSAQVob3RlbOABAA!16s%2Fg%2F11f0xwmz2l?entry=ttu&g_ep=EgoyMDI0MDkwNC4wIKXMDSoASAFQAw%3D%3D";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });

        chances.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.google.com/maps/place/Chances+hotel/@6.6010926,0.4515304,15z/data=!4m18!1m6!2m5!1sHotels!5m2!5m1!1s2024-09-13!6e3!3m10!1s0x10272534da8a56bf:0xae82dae06080d1b8!5m3!1s2024-09-13!4m1!1i2!8m2!3d6.6012205!4d0.4472704!15sCgZIb3RlbHOSAQVob3RlbOABAA!16s%2Fg%2F11clyzlx5j?entry=ttu&g_ep=EgoyMDI0MDkwNC4wIKXMDSoASAFQAw%3D%3D";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });

        bookNow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://skyplushotel.com.gh/"));
                startActivity(intent);
            }
        });

        serenebut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.voltaserenehotel.com/"));
                startActivity(intent);
            }
        });

        ebenbut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(""));
                startActivity(intent);
            }
        });

        myplacebut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.booking.com/hotel/gh/my-place-guest-house.html"));
                startActivity(intent);
            }
        });

        stevenbut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.hotelstevens.com/"));
                startActivity(intent);
            }
        });

        freedombut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://freedomhotel.com.gh/"));
                startActivity(intent);
            }
        });

        sky.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Housing.this, SkyPlus.class);
                startActivity(intent);
            }
        });


        serene.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Housing.this, VoltaSerene.class);
                startActivity(intent);
            }
        });

        freedom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Housing.this, FreedomHotel.class);
                startActivity(intent);
            }
        });

        steven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Housing.this, HotelSteven.class);
                startActivity(intent);
            }
        });

        myplace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Housing.this, MyPlaceGuest.class);
                startActivity(intent);
            }
        });

        ebenser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Housing.this, EbeneserLodge.class);
                startActivity(intent);
            }
        });
    }
}