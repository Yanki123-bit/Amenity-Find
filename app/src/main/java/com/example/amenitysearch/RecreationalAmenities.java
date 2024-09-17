package com.example.amenitysearch;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;


public class RecreationalAmenities extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recreational_amenities);

        Button mtnoffice = findViewById(R.id.mtnbutton);
        Button newstadium = findViewById(R.id.newstadiumbutton);
        Button tsfitness = findViewById(R.id.tsbutton);
        Button tillys = findViewById(R.id.tillysbutton);
        Button ghanapost = findViewById(R.id.ghanapostbutton);
        Button uptown = findViewById(R.id.uptownfitnessbutton);
        Button dvla = findViewById(R.id.dvlabutton);
        Button coordinating = findViewById(R.id.coordinatingbutton);
        Button westec = findViewById(R.id.westecbutton);
        Button ghanawater = findViewById(R.id.ghanawaterbutton);
        Button mawulipost = findViewById(R.id.mawulipostbutton);


        CardView mtncard = findViewById(R.id.mtnofficecard);
        CardView newstadiumcardd = findViewById(R.id.newstadiumCard);
        CardView tsfitnesscardd = findViewById(R.id.tsfitnesscard);
        CardView tillycardd = findViewById(R.id.tillyseventcard);
        CardView ghanapostcardd = findViewById(R.id.ghanapostcard);
        CardView uptowncardd = findViewById(R.id.uptownfitnesscard);
        CardView dvlacardd = findViewById(R.id.dvlahocard);
        CardView cordinatingcarddd = findViewById(R.id.voltaregionalcoordinatingcard);
        CardView westeccardd = findViewById(R.id.westecsecuritycard);
        CardView ghanawatercardd = findViewById(R.id.ghanawatercard);
        CardView mawulipostcardd = findViewById(R.id.mawulipostcard);

        mawulipostcardd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RecreationalAmenities.this, Mawuli_Post.class);
                startActivity(intent);
            }
        });


        ghanawatercardd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RecreationalAmenities.this, Ghana_Water.class);
                startActivity(intent);
            }
        });


        westeccardd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RecreationalAmenities.this, Westec_security.class);
                startActivity(intent);
            }
        });


        cordinatingcarddd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RecreationalAmenities.this, Coordinating.class);
                startActivity(intent);
            }
        });


        dvlacardd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RecreationalAmenities.this, DVLA.class);
                startActivity(intent);
            }
        });


        uptowncardd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RecreationalAmenities.this, Uptown_Fitness.class);
                startActivity(intent);
            }
        });


        ghanapostcardd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RecreationalAmenities.this, Ghana_Post.class);
                startActivity(intent);
            }
        });


        tillycardd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RecreationalAmenities.this, Tilly_event.class);
                startActivity(intent);
            }
        });


        tsfitnesscardd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RecreationalAmenities.this, TS_Fitness.class);
                startActivity(intent);
            }
        });


        newstadiumcardd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RecreationalAmenities.this, NEW_STADIUM.class);
                startActivity(intent);
            }
        });


        mtncard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RecreationalAmenities.this, MTN_office.class);
                startActivity(intent);
            }
        });


        mawulipost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.google.com/maps/place/Mawuli+Post+Office/@6.5998408,0.4699545,17z/data=!3m1!4b1!4m6!3m5!1s0x102725d6e9ec1e2d:0xef55287d8c8a0e2f!8m2!3d6.5998355!4d0.4725348!16s%2Fg%2F11g1ly366_?entry=ttu&g_ep=EgoyMDI0MDkwNC4wIKXMDSoASAFQAw%3D%3D";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });


        ghanawater.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.google.com/maps/place/Ghana+Water+Company+Limited/@6.610254,0.4572496,17z/data=!3m1!4b1!4m6!3m5!1s0x1027252555140837:0x542808f07a732039!8m2!3d6.6102487!4d0.4598299!16s%2Fg%2F11c0vnwnc_?entry=ttu&g_ep=EgoyMDI0MDkwNC4wIKXMDSoASAFQAw%3D%3D";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });


        westec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.google.com/maps/place/Westec+Security/@6.60167,0.4575195,17z/data=!4m6!3m5!1s0x102725382efe61a1:0x5652460f99f6529b!8m2!3d6.6016647!4d0.4600998!16s%2Fg%2F11cntd36rp?entry=ttu&g_ep=EgoyMDI0MDkwNC4wIKXMDSoASAFQAw%3D%3D";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });


        coordinating.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.google.com/maps/place/Volta+Regional+Coordinating+Council+(+RCC)/@6.6097566,0.4639655,17z/data=!3m1!4b1!4m6!3m5!1s0x1027253cd69484c7:0x5573536aea09d3a5!8m2!3d6.6097513!4d0.4665458!16s%2Fg%2F11c74j9yw9?entry=ttu&g_ep=EgoyMDI0MDkwNC4wIKXMDSoASAFQAw%3D%3D";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });


        dvla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.google.com/maps/place/DVLA+Ho+Office/@6.5982965,0.4446349,17z/data=!3m1!4b1!4m6!3m5!1s0x10273ab68b985c1d:0xca8f7cdf7e82561d!8m2!3d6.5982912!4d0.4472152!16s%2Fg%2F12m93p_jl?entry=ttu&g_ep=EgoyMDI0MDkwNC4wIKXMDSoASAFQAw%3D%3D";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });


        uptown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.google.com/maps/place/Uptown+Fitness+Club/@6.611041,0.4638688,17z/data=!3m1!4b1!4m6!3m5!1s0x1027253929c46447:0x7c6399654bd4deb6!8m2!3d6.6110357!4d0.4664491!16s%2Fg%2F11fx7p2_rs?entry=ttu&g_ep=EgoyMDI0MDkwNC4wIKXMDSoASAFQAw%3D%3D";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });


        ghanapost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.google.com/maps/place/Ghana+Post/@6.6107901,0.4670729,17z/data=!3m1!4b1!4m6!3m5!1s0x102725181a79b4fd:0xb0afcdf2b82e69fa!8m2!3d6.6107848!4d0.4696532!16s%2Fg%2F11c1rfrt1d?entry=ttu&g_ep=EgoyMDI0MDkwNC4wIKXMDSoASAFQAw%3D%3D";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });


        tillys.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.google.com/maps/place/Tilly's+playground/@6.6019428,0.4941072,17z/data=!3m1!4b1!4m6!3m5!1s0x102725d268697281:0x6690f271a31ec835!8m2!3d6.6019375!4d0.4966875!16s%2Fg%2F11j204p0wf?entry=ttu&g_ep=EgoyMDI0MDkwNC4wIKXMDSoASAFQAw%3D%3D";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });


        tsfitness.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.google.com/maps/place/TS+fitness+gym/@6.5925607,0.4678543,17z/data=!3m1!4b1!4m6!3m5!1s0x10272598add787a3:0x6d02ac2e3a2d9891!8m2!3d6.5925554!4d0.4704346!16s%2Fg%2F11r5dwn56z?entry=ttu&g_ep=EgoyMDI0MDkwNC4wIKXMDSoASAFQAw%3D%3D";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });


        newstadium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.google.com/maps/place/Multi-purpose+Youth+Resource+Centre/@6.5723059,0.484716,13.43z/data=!4m6!3m5!1s0x10272f9aaf9e2a9d:0x46f10330878d23f6!8m2!3d6.5545353!4d0.4884712!16s%2Fg%2F11sjcvz_dk?entry=ttu&g_ep=EgoyMDI0MDkwNC4wIKXMDSoASAFQAw%3D%3D";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });


        mtnoffice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.google.com/maps/place/MTN,+Ho+office/@6.6076461,0.4701376,17z/data=!3m1!4b1!4m6!3m5!1s0x102725172035a081:0x11b1cc47a6a9f2c8!8m2!3d6.6076408!4d0.4727179!16s%2Fg%2F1ptzzm8vs?entry=ttu&g_ep=EgoyMDI0MDkwNC4wIKXMDSoASAFQAw%3D%3D";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });

    }
}