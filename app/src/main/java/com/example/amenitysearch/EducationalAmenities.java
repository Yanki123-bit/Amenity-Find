package com.example.amenitysearch;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class EducationalAmenities extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_educational_amenities);

        CardView education = findViewById(R.id.cardViewNtc);
        CardView mawuli = findViewById(R.id.mawuliCard);
        CardView ola = findViewById(R.id.OlaCard);
        CardView uhas = findViewById(R.id.uhascard);
        CardView htu = findViewById(R.id.htucard);
        CardView adonai = findViewById(R.id.adonaiunicard);
        CardView agape = findViewById(R.id.agapeharvestcard);
        CardView epPrimary = findViewById(R.id.epprimarycard);
        CardView futureTech = findViewById(R.id.futechfuturecard);
        CardView genisIt = findViewById(R.id.geniusitcard);
        CardView hoDomeEp = findViewById(R.id.hodomeschoolcard);
        CardView instrumentsofcard = findViewById(R.id.intrumentsofvictorycard);
        CardView holycarddd = findViewById(R.id.holyspiritcard);
        CardView pearlscardd = findViewById(R.id.pearlsofwisdomcard);

        Button ntc = findViewById(R.id.ntcbutton);
        Button mawulisch = findViewById(R.id.mawulischbtn);
        Button olaSch = findViewById(R.id.olasch);
        Button uhasSch = findViewById(R.id.uhassch);
        Button htuSch = findViewById(R.id.htusch);
        Button adonaiSch = findViewById(R.id.adonaisch);
        Button agapeSch = findViewById(R.id.agapesch);
        Button epPrimarySch = findViewById(R.id.epprimarysch);
        Button futureTechSch = findViewById(R.id.futuretechsch);
        Button genisItSch = findViewById(R.id.geniusitsch);
        Button hoDomeEpSch = findViewById(R.id.hodomeepsch);
        Button instruments = findViewById(R.id.instrumentsbutton);
        Button holy = findViewById(R.id.holyspiritbutton);
        Button pearls = findViewById(R.id.pearlsbutton);

        pearlscardd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EducationalAmenities.this, Pearls.class);
                startActivity(intent);
            }
        });

        holycarddd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EducationalAmenities.this, Holy_Spirit.class);
                startActivity(intent);
            }
        });

        instrumentsofcard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EducationalAmenities.this, Instrument.class);
                startActivity(intent);
            }
        });

        hoDomeEp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EducationalAmenities.this, Ho_Dome_school.class);
                startActivity(intent);
            }
        });

        genisIt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EducationalAmenities.this, Genius_IT_map.class);
                startActivity(intent);
            }
        });

        futureTech.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EducationalAmenities.this, Futech.class);
                startActivity(intent);
            }
        });

        epPrimary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EducationalAmenities.this, epschool_bankoe.class);
                startActivity(intent);
            }
        });

        agape.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EducationalAmenities.this, Agape_Harvest.class);
                startActivity(intent);
            }
        });

        adonai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EducationalAmenities.this, Adonai_University.class);
                startActivity(intent);
            }
        });

        pearls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.google.com/maps/place/Pearls+Of+Wisdom+International+School/@6.630975,0.4831463,17z/data=!3m1!4b1!4m6!3m5!1s0x102725874a364535:0xdaac2d13d954f444!8m2!3d6.6309697!4d0.4857266!16s%2Fg%2F11qb4znnsf?entry=ttu&g_ep=EgoyMDI0MDkwOS4wIKXMDSoASAFQAw%3D%3D";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });

        holy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.google.com/maps/place/Holy+Spirit+Teacher+Training+College/@6.5976762,0.4638555,17z/data=!3m1!4b1!4m6!3m5!1s0x10272565214f1c1b:0xab54942e1ba86179!8m2!3d6.5976709!4d0.4664358!16s%2Fg%2F11g2xnj2vf?entry=ttu&g_ep=EgoyMDI0MDkwOS4wIKXMDSoASAFQAw%3D%3D";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });

        hoDomeEpSch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.google.com/maps/place/Ho-Dome+E.+P.+Basic+SCHOOLS/@6.6060676,0.4709315,17z/data=!3m1!4b1!4m6!3m5!1s0x102725e2f43c3dc7:0x1c7ce4d50226bccc!8m2!3d6.6060623!4d0.4735118!16s%2Fg%2F11hds5zk_g?entry=ttu&g_ep=EgoyMDI0MDkwOS4wIKXMDSoASAFQAw%3D%3D";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });

        genisItSch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.google.com/maps/place/Genius+I.T+Brainery/@6.6101578,0.4790265,17z/data=!3m1!4b1!4m6!3m5!1s0x102725c9b865f62b:0xed09778e460f57b2!8m2!3d6.6101525!4d0.4816068!16s%2Fg%2F11fkcdtpg6?entry=ttu&g_ep=EgoyMDI0MDkwOS4wIKXMDSoASAFQAw%3D%3D";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });

        futureTechSch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.google.com/maps/place/FUTECH+(Future+Generation+Tech+Program)/@6.6102685,0.4789551,17z/data=!3m1!4b1!4m6!3m5!1s0x102725ba371b82c5:0xf89b817646c70499!8m2!3d6.6102632!4d0.4815354!16s%2Fg%2F11n0lwd0b3?entry=ttu&g_ep=EgoyMDI0MDkwOS4wIKXMDSoASAFQAw%3D%3D";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });

        epPrimarySch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.google.com/maps/place/E.P.+Primary+School-Ho+Bankoe/@6.6136613,0.462779,17z/data=!3m1!4b1!4m6!3m5!1s0x10272523c79286c7:0xfc2c270c66be4e2c!8m2!3d6.613656!4d0.4653593!16s%2Fg%2F11cr_27cwf?entry=ttu&g_ep=EgoyMDI0MDkwOS4wIKXMDSoASAFQAw%3D%3D";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });


        agapeSch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.google.com/maps/place/Agape+Harvest+Institute+(AHI),+Ho/@6.6163533,0.4743806,17z/data=!3m1!4b1!4m6!3m5!1s0x102725886b42d61d:0xccd5f7c1e8dbdd43!8m2!3d6.616348!4d0.4769609!16s%2Fg%2F11f8bzxwny?entry=ttu&g_ep=EgoyMDI0MDkwOS4wIKXMDSoASAFQAw%3D%3D";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });

        adonaiSch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.google.com/maps/place/ADONAI+UNIVERSITY+COLLEGE+OF+RESEARCH+AND+ENTREPRENEURSHIP/@6.604468,0.4635576,17z/data=!3m1!4b1!4m6!3m5!1s0x102725c522798c7d:0xe61572103a40a94!8m2!3d6.6044627!4d0.4661379!16s%2Fg%2F11s9q1bwy0?entry=ttu&g_ep=EgoyMDI0MDkwOS4wIKXMDSoASAFQAw%3D%3D";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });



        ntc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.google.com/maps/place/Nursing+Training+College,+Ho/@6.5998814,0.4787964,15z/data=!4m6!3m5!1s0x1027250d46decb67:0xdf5d9b114b62100b!8m2!3d6.5998814!4d0.4787964!16s%2Fm%2F0h3scfn?entry=ttu";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });

        mawulisch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://en.wikipedia.org/wiki/Mawuli_School#/map/0";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });

        olaSch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.google.com/maps/place/OLA+Senior+High+School/@6.619031,0.4664473,15.23z/data=!4m6!3m5!1s0x10272521b157ae55:0x6d50f1bbd6cb1d3b!8m2!3d6.6178293!4d0.4676056!16s%2Fg%2F11c59x1dng?entry=ttu";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });

        uhasSch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.google.com/maps/place/University+of+Health+and+Allied+Sciences/@6.6032343,0.4758539,15z/data=!4m6!3m5!1s0x1027252b26bf17b7:0xa7322fab358f6d12!8m2!3d6.6032343!4d0.4758539!16s%2Fg%2F11fs_jx74h?entry=ttu";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
        htuSch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.google.com/maps/place/Ho+Technical+University/@6.5895722,0.4672545,16z/data=!4m6!3m5!1s0x102725ba9f8eed05:0xea69d50b3494d4d1!8m2!3d6.5901051!4d0.4674691!16s%2Fm%2F0h3sccb?entry=ttu";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });

        instruments.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.google.com/maps/place/Instruments+of+Victory+International+School/@6.6027176,0.4605627,17z/data=!3m1!4b1!4m6!3m5!1s0x102725c032d4ddd9:0xba8e8c49e46742dd!8m2!3d6.6027123!4d0.463143!16s%2Fg%2F11ts4hg12v?entry=ttu&g_ep=EgoyMDI0MDkwOS4wIKXMDSoASAFQAw%3D%3D";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });












        education.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EducationalAmenities.this, HoNTC.class);
                startActivity(intent);
            }
        });

        mawuli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EducationalAmenities.this, Mawuli.class);
                startActivity(intent);
            }
        });

        ola.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EducationalAmenities.this, OLA.class);
                startActivity(intent);
            }
        });

        uhas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EducationalAmenities.this, UHAS.class);
                startActivity(intent);
            }
        });

        htu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EducationalAmenities.this, HTU.class);
                startActivity(intent);
            }
        });


    }
}
