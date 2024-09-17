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

public class HealthAndWelness extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_health_and_welness);

        CardView municipal = findViewById(R.id.municipalhospitalcard);
        CardView lena = findViewById(R.id.lenapharmCard);
        CardView xornam = findViewById(R.id.xornamcard);
        CardView milirary = findViewById(R.id.milirarycard);
        CardView royalhospital = findViewById(R.id.royalhospitalcard);
        CardView polyclinic = findViewById(R.id.polycliniccard);
        CardView ernestche = findViewById(R.id.ernestchecard);
        CardView citipharm = findViewById(R.id.citipharmcard);
        CardView deladempharm = findViewById(R.id.deladempharmcard);
        CardView topuppharm = findViewById(R.id.topuppharmcard);
        CardView dominionpharm = findViewById(R.id.dominionpharmcard);
        CardView carthurpharm = findViewById(R.id.carthurpharmcard);
        CardView victoriouspharm = findViewById(R.id.victoriouspharmcard);
        CardView hoteachinghos = findViewById(R.id.hoteachinghoscard);

        Button municipalbut = findViewById(R.id.municipalbuttton);
        Button lenabut = findViewById(R.id.lenabutton);
        Button xornambut = findViewById(R.id.sornambutton);
        Button milirarybut = findViewById(R.id.militarybutton);
        Button royalhospitalbut = findViewById(R.id.royalhospitalbutton);
        Button polyclinicbut = findViewById(R.id.polyclinicbutton);
        Button ernestchebut = findViewById(R.id.ernestchemistbutton);
        Button citipharmbut = findViewById(R.id.citipharmbutton);
        Button deladempharmbut = findViewById(R.id.deladembutton);
        Button topuppharmbut = findViewById(R.id.topupbutton);
        Button dominionpharmbut = findViewById(R.id.dominionbutton);
        Button carthurpharmbut = findViewById(R.id.carthurbutton);
        Button victoriouspharmbut = findViewById(R.id.victoriousbutton);
        Button hoteachinghosbut = findViewById(R.id.hoteachinghosbutton);
        Button nhisbut = findViewById(R.id.nhisbutton);

        nhisbut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.google.com/maps/place/Volta+Regional+NHIS/@6.609122,0.4648406,17z/data=!4m6!3m5!1s0x1027253ca11fc52f:0x7ab074e8bf5972c1!8m2!3d6.6090703!4d0.4645405!16s%2Fg%2F11cjkcq87k?entry=ttu&g_ep=EgoyMDI0MDkxMS4wIKXMDSoASAFQAw%3D%3D";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });


        hoteachinghosbut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.google.com/maps/place/Ho+Teaching+Hospital-+Blood+Bank/@6.6018339,0.4820816,17z/data=!3m1!4b1!4m6!3m5!1s0x1027259c35d2c1b3:0x3affa6b54b2b9ef!8m2!3d6.6018286!4d0.4846619!16s%2Fg%2F11fl88d70q?entry=ttu&g_ep=EgoyMDI0MDkwOS4wIKXMDSoASAFQAw%3D%3D";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });


        victoriouspharmbut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url =
                        "https://www.google.com/maps/place/Victorious+Mount+Zion+Pharmacy/@6.6146163,0.4650735,17z/data=!3m1!4b1!4m6!3m5!1s0x10272522237657dd:0x4be743e56dc79b0a!8m2!3d6.614611!4d0.4676538!16s%2Fg%2F11g9nlpkmd?entry=ttu&g_ep=EgoyMDI0MDkwOS4wIKXMDSoASAFQAw%3D%3D";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });


        carthurpharmbut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.google.com/maps/place/CARTHUR+PHARMACY/@6.6215764,0.4937916,17z/data=!3m1!4b1!4m6!3m5!1s0x1027256567e08feb:0xa21de785ebe4e0d!8m2!3d6.6215711!4d0.4963719!16s%2Fg%2F11td_8ph3g?entry=ttu&g_ep=EgoyMDI0MDkwOS4wIKXMDSoASAFQAw%3D%3D";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });


        dominionpharmbut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.google.com/maps/place/Dominion+Care+Pharmacy/@6.6082304,0.4655504,17z/data=!3m1!4b1!4m6!3m5!1s0x102725708e1a9be5:0x8242c2c757319051!8m2!3d6.6082251!4d0.4681307!16s%2Fg%2F11j37hwkk0?entry=ttu&g_ep=EgoyMDI0MDkwOS4wIKXMDSoASAFQAw%3D%3D";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });


        topuppharmbut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url =
                        "https://www.google.com/maps/place/Top-Up+Pharmacy+-+Ho/@6.6023824,0.4855922,17z/data=!3m1!4b1!4m6!3m5!1s0x102725406da80f3b:0x62cfb8c1644897c4!8m2!3d6.6023771!4d0.4881725!16s%2Fg%2F11qq9p5c75?entry=ttu&g_ep=EgoyMDI0MDkwOS4wIKXMDSoASAFQAw%3D%3D";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });


        deladempharmbut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.google.com/maps/place/Deladem+pharmacy/@6.6066981,0.4701097,17z/data=!3m1!4b1!4m6!3m5!1s0x10272562d7a59dab:0x907726b2e2039f09!8m2!3d6.6066928!4d0.47269!16s%2Fg%2F11qm3h545q?entry=ttu&g_ep=EgoyMDI0MDkwOS4wIKXMDSoASAFQAw%3D%3D";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });


        citipharmbut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.google.com/maps/place/Citi+Pharmacy/@6.6103788,0.4724193,17z/data=!3m1!4b1!4m6!3m5!1s0x102725111f3f5f9f:0xe01d422c24287c2d!8m2!3d6.6103735!4d0.4749996!16s%2Fg%2F11hbn9n3wb?entry=ttu&g_ep=EgoyMDI0MDkwOS4wIKXMDSoASAFQAw%3D%3D";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });


        ernestchebut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url =
                        "https://www.google.com/maps/place/Ernest+Chemists+Limited+-+Ho+Wholesale/@6.6116646,0.4606087,17z/data=!3m1!4b1!4m6!3m5!1s0x10272522320347d1:0x460fd0679b9a25ed!8m2!3d6.6116593!4d0.463189!16s%2Fg%2F11fk1d8jdl?entry=ttu&g_ep=EgoyMDI0MDkwOS4wIKXMDSoASAFQAw%3D%3D";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });


        polyclinicbut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.google.com/maps/place/Ho+Polyclinic/@6.6027193,0.4900524,17z/data=!3m1!4b1!4m6!3m5!1s0x102725a162d5a7ab:0x501875a7e0f1ab6d!8m2!3d6.602714!4d0.4926327!16s%2Fg%2F11c1pt9hcm?entry=ttu&g_ep=EgoyMDI0MDkwOS4wIKXMDSoASAFQAw%3D%3D";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });


        royalhospitalbut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.google.com/maps/place/HO+ROYAL+HOSPITAL/@6.6308274,0.4750502,17z/data=!3m1!4b1!4m6!3m5!1s0x102724e558d1e8d3:0x4259bc81754c43ac!8m2!3d6.6308221!4d0.4776305!16s%2Fg%2F11c43bxwms?entry=ttu&g_ep=EgoyMDI0MDkwOS4wIKXMDSoASAFQAw%3D%3D";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });


        milirarybut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.google.com/maps/place/Volta+Military+Hospital/@6.6175018,0.4849358,17z/data=!3m1!4b1!4m6!3m5!1s0x102725e8e672ae03:0x17106a9788a9c89d!8m2!3d6.6174965!4d0.4875161!16s%2Fg%2F11qq0dwt8x?entry=ttu&g_ep=EgoyMDI0MDkwOS4wIKXMDSoASAFQAw%3D%3D";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });


        xornambut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.google.com/maps/place/Xornam+360+Pharmacy+Ltd+(A+Mutti+Pharmacy)/@6.6272371,0.4730856,17z/data=!3m1!4b1!4m6!3m5!1s0x1027253f0afbc611:0xe43d96b10a5b4c50!8m2!3d6.6272318!4d0.4756659!16s%2Fg%2F11rkmnvys4?entry=ttu&g_ep=EgoyMDI0MDkwOS4wIKXMDSoASAFQAw%3D%3D";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });


        lenabut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.google.com/maps/place/LENA+PHARMACY/@6.6022482,0.461137,17z/data=!3m1!4b1!4m6!3m5!1s0x1027257979ec5abf:0xdde88cb0e87c626!8m2!3d6.6022429!4d0.4637173!16s%2Fg%2F11fr34x_k6?entry=ttu&g_ep=EgoyMDI0MDkwOS4wIKXMDSoASAFQAw%3D%3D";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });


        municipalbut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.google.com/maps/place/Ho+Municipal+Hospital/@6.6097084,0.4657549,17z/data=!3m1!4b1!4m6!3m5!1s0x1027253d4eefe28b:0x2b002b9cc50a81e4!8m2!3d6.6097031!4d0.4683352!16s%2Fg%2F12m9lq0l8?entry=ttu&g_ep=EgoyMDI0MDkwOS4wIKXMDSoASAFQAw%3D%3D";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });


        hoteachinghos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HealthAndWelness.this, Ho_Teaching_Hospital.class);
                startActivity(intent);
            }
        });

        victoriouspharm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HealthAndWelness.this, Victorious_Mt_Sion_Pharmacy.class);
                startActivity(intent);
            }
        });

        carthurpharm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HealthAndWelness.this, Carthur_pharmacy.class);
                startActivity(intent);
            }
        });

        dominionpharm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HealthAndWelness.this, Dominion_care_pharmacy.class);
                startActivity(intent);
            }
        });

        topuppharm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HealthAndWelness.this, Top_up_Pharmacy.class);
                startActivity(intent);
            }
        });


        deladempharm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HealthAndWelness.this, Deladem_Pharmacy.class);
                startActivity(intent);
            }
        });

        citipharm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HealthAndWelness.this, Citi_Pharmacy.class);
                startActivity(intent);
            }
        });


        ernestche.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HealthAndWelness.this, Ernest_Chemist.class);
                startActivity(intent);
            }
        });

        polyclinic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HealthAndWelness.this, Ho_Poly_Clinic.class);
                startActivity(intent);
            }
        });

        royalhospital.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HealthAndWelness.this, Ho_Royal_Hospital.class);
                startActivity(intent);
            }
        });

        xornam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HealthAndWelness.this, Xornam_Pharmacy.class);
                startActivity(intent);
            }
        });

        milirary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HealthAndWelness.this, Ho_Military_Hospital.class);
                startActivity(intent);
            }
        });

        municipal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HealthAndWelness.this, Ho_Municipal_Hospital.class);
                startActivity(intent);
            }
        });

        lena.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HealthAndWelness.this, Lena_Pharmacy.class);
                startActivity(intent);
            }
        });

    }
}