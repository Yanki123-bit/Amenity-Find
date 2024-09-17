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

public class Public_Services extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_public_services2);

        Button municipalbut = findViewById(R.id.municipalbuttton);
        Button policebut = findViewById(R.id.policeheadbutton);
        Button marketbut = findViewById(R.id.marketbutton);
        Button forestbut = findViewById(R.id.forestbutton);
        Button electoralbut = findViewById(R.id.electoralbutton);
        Button nppbut = findViewById(R.id.nppbutton);
        Button healthbut = findViewById(R.id.healthdirectbutton);
        Button auditbut = findViewById(R.id.auditbutton);
        Button prisonbut = findViewById(R.id.prisonbutton);
        Button nssbut = findViewById(R.id.nssbutton);
        Button statbut = findViewById(R.id.statbutton);
        Button gesbut = findViewById(R.id.gesbutton);
        Button immigrationbut = findViewById(R.id.immigrationbutton);
        Button soomlion = findViewById(R.id.soomlionbutton);
        Button ambulancebut = findViewById(R.id.ambulancebutton);
        Button firebut = findViewById(R.id.firebutton);

        CardView municipal = findViewById(R.id.municipalhospitalcard);
        CardView police = findViewById(R.id.policeheadCard);
        CardView market = findViewById(R.id.centralmarketcard);
        CardView forest = findViewById(R.id.forestcard);
        CardView electoral = findViewById(R.id.electoralcard);
        CardView npp = findViewById(R.id.nppcard);
        CardView health = findViewById(R.id.healthdirectoratecard);
        CardView audit = findViewById(R.id.auditcard);
        CardView prison = findViewById(R.id.prisoncard);
        CardView nss = findViewById(R.id.nsscard);
        CardView stat = findViewById(R.id.statisticalcard);
        CardView ges = findViewById(R.id.gescard);
        CardView immigration = findViewById(R.id.immgrationcard);
        CardView soomlioncc = findViewById(R.id.soomlioncard);
        CardView ambulance = findViewById(R.id.ambulancecard);
        CardView fire = findViewById(R.id.firecard);

        fire.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Public_Services.this, Fire_Service.class);
                startActivity(intent);
            }
        });


        ambulance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Public_Services.this, Ambulance.class);
                startActivity(intent);
            }
        });


        soomlioncc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Public_Services.this, Zoomlion.class);
                startActivity(intent);
            }
        });


        immigration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Public_Services.this, Immigration.class);
                startActivity(intent);
            }
        });


        ges.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Public_Services.this, GES.class);
                startActivity(intent);
            }
        });


        stat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Public_Services.this, Statistical.class);
                startActivity(intent);
            }
        });


        nss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Public_Services.this, NSS.class);
                startActivity(intent);
            }
        });


        prison.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Public_Services.this, Prison.class);
                startActivity(intent);
            }
        });


        audit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Public_Services.this, Audit.class);
                startActivity(intent);
            }
        });


        health.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Public_Services.this, Health_Directorate.class);
                startActivity(intent);
            }
        });


        npp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Public_Services.this, NPP.class);
                startActivity(intent);
            }
        });


        electoral.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Public_Services.this, Electoral_Commision.class);
                startActivity(intent);
            }
        });


        forest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Public_Services.this, Forest.class);
                startActivity(intent);
            }
        });


        market.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Public_Services.this, Police_Market.class);
                startActivity(intent);
            }
        });


        police.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Public_Services.this, Police_Head.class);
                startActivity(intent);
            }
        });


        municipal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Public_Services.this, Ho_Municipal_Assembly.class);
                startActivity(intent);
            }
        });


        firebut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.google.com/maps/place/Municipal+Fire+Office/@6.6057735,0.4556909,15.88z/data=!4m10!1m2!2m1!1sfire+station+ho!3m6!1s0x102725d56a1f9dff:0x7383ea6fa86b0f8c!8m2!3d6.6081943!4d0.4613094!15sCg9maXJlIHN0YXRpb24gaG-SAQxmaXJlX3N0YXRpb27gAQA!16s%2Fg%2F11g1pq2c24?entry=ttu&g_ep=EgoyMDI0MDkxMS4wIKXMDSoASAFQAw%3D%3D";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });


        ambulancebut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.google.com/maps/place/National+Ambulance+Service,+Volta+Regional+Secretariat/@6.6085074,0.4573267,16z/data=!4m10!1m2!2m1!1sservice+ho!3m6!1s0x1027250040341981:0xba69ebe2af2f8b6d!8m2!3d6.6085074!4d0.4663389!15sCgpzZXJ2aWNlIGhvkgERZ292ZXJubWVudF9vZmZpY2XgAQA!16s%2Fg%2F11vpf847dx?entry=ttu&g_ep=EgoyMDI0MDkxMS4wIKXMDSoASAFQAw%3D%3D";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });


        soomlion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.google.com/maps/place/Zoomlion+Ghana+Ltd,+Ho/@6.618216,0.4848607,16z/data=!4m10!1m2!2m1!1sservice+ho!3m6!1s0x1027256ae1c9b5cd:0xef01720049695de9!8m2!3d6.618216!4d0.4938729!15sCgpzZXJ2aWNlIGhvWgwiCnNlcnZpY2UgaG-SARh3YXN0ZV9tYW5hZ2VtZW50X3NlcnZpY2WaASRDaGREU1VoTk1HOW5TMFZKUTBGblNVUjVNa3Q1TlMxblJSQULgAQA!16s%2Fg%2F11h3thgj0f?entry=ttu&g_ep=EgoyMDI0MDkxMS4wIKXMDSoASAFQAw%3D%3D";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });


        immigrationbut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.google.com/maps/place/Ghana+Immigration+Service/@6.6106646,0.4582761,16z/data=!4m10!1m2!2m1!1sservice+ho!3m6!1s0x10272522d02b46a1:0x8c04a18a8bf9c08f!8m2!3d6.6106646!4d0.4672883!15sCgpzZXJ2aWNlIGhvkgERZ292ZXJubWVudF9vZmZpY2XgAQA!16s%2Fg%2F11dy1ljjws?entry=ttu&g_ep=EgoyMDI0MDkxMS4wIKXMDSoASAFQAw%3D%3D";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });


        gesbut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.google.com/maps/place/Ghana+Education+Service/@6.6090493,0.4576781,16z/data=!4m10!1m2!2m1!1sservice+ho!3m6!1s0x1027253cdf6c3ff1:0x4f65a0bfb7e69ec0!8m2!3d6.6090493!4d0.4666903!15sCgpzZXJ2aWNlIGhvkgERZ292ZXJubWVudF9vZmZpY2XgAQA!16s%2Fg%2F11c1rfwln3?entry=ttu&g_ep=EgoyMDI0MDkxMS4wIKXMDSoASAFQAw%3D%3D";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });


        statbut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.google.com/maps/place/Ghana+Statistical+Service/@6.6088804,0.4587094,16z/data=!4m10!1m2!2m1!1sservice+ho!3m6!1s0x1027256c599bb1eb:0xaa98556961a227b8!8m2!3d6.6088804!4d0.4677216!15sCgpzZXJ2aWNlIGhvkgERZ292ZXJubWVudF9vZmZpY2XgAQA!16s%2Fg%2F11h7vlqgz1?entry=ttu&g_ep=EgoyMDI0MDkxMS4wIKXMDSoASAFQAw%3D%3D";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });


        nssbut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.google.com/maps/place/National+Service+Scheme+Volta+Regional+Office/@6.6145625,0.4603003,16z/data=!4m10!1m2!2m1!1sservice+ho!3m6!1s0x10272522d2da2bd1:0x5e6c27327bb5dfca!8m2!3d6.6102109!4d0.4672116!15sCgpzZXJ2aWNlIGhvkgERZ292ZXJubWVudF9vZmZpY2XgAQA!16s%2Fg%2F11cs1_2hx7?entry=ttu&g_ep=EgoyMDI0MDkxMS4wIKXMDSoASAFQAw%3D%3D";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });


        prisonbut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.google.com/maps/place/Ho+central+prisons+service/@6.6088951,0.4636556,16.18z/data=!4m10!1m2!2m1!1sservice+ho!3m6!1s0x102725623e20df83:0xc3cfc5dd58de69fe!8m2!3d6.6108231!4d0.46829!15sCgpzZXJ2aWNlIGhvkgEGcHJpc29u4AEA!16s%2Fg%2F11j53m3v_d?entry=ttu&g_ep=EgoyMDI0MDkxMS4wIKXMDSoASAFQAw%3D%3D";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });


        auditbut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.google.com/maps/place/Audit+Service,+Ho/@6.6083399,0.4308318,14z/data=!4m10!1m2!2m1!1sservice+ho!3m6!1s0x1027252b17b66963:0xaf34f86302a8d710!8m2!3d6.6083399!4d0.4668807!15sCgpzZXJ2aWNlIGhvkgERZ292ZXJubWVudF9vZmZpY2XgAQA!16s%2Fg%2F11rqr1km32?entry=ttu&g_ep=EgoyMDI0MDkxMS4wIKXMDSoASAFQAw%3D%3D";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });


        healthbut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.google.com/maps/place/Volta+Regional+Health+Directorate/@6.6084864,0.4491001,15z/data=!4m10!1m2!2m1!1sho+district!3m6!1s0x1027253d1bdf942b:0xb38afd0726098d96!8m2!3d6.6084864!4d0.4671245!15sCgtobyBkaXN0cmljdFoNIgtobyBkaXN0cmljdJIBEGNvcnBvcmF0ZV9vZmZpY2WaASRDaGREU1VoTk1HOW5TMFZKUTBGblNVTnpibDh5UWpOQlJSQULgAQA!16s%2Fg%2F11cs3z85zs?entry=ttu&g_ep=EgoyMDI0MDkxMS4wIKXMDSoASAFQAw%3D%3D";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });


        nppbut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.google.com/maps/place/NPP+Regional+Office/@6.6045414,0.4571882,15z/data=!4m10!1m2!2m1!1sho+district!3m6!1s0x10272513e3cdd529:0xe1074cd6a1f54497!8m2!3d6.6045414!4d0.4752126!15sCgtobyBkaXN0cmljdJIBFGNpdHlfZGlzdHJpY3Rfb2ZmaWNl4AEA!16s%2Fg%2F11dxryjvxz?entry=ttu&g_ep=EgoyMDI0MDkxMS4wIKXMDSoASAFQAw%3D%3D";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });


        electoralbut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.google.com/maps/place/Electoral+Commission+Ho/@6.619753,0.4554002,15z/data=!4m10!1m2!2m1!1sho+district!3m6!1s0x102725d6d0a3ed29:0x6b49799a5fbd90e0!8m2!3d6.6084871!4d0.4700185!15sCgtobyBkaXN0cmljdJIBEWdvdmVybm1lbnRfb2ZmaWNl4AEA!16s%2Fg%2F11t61v0gts?entry=ttu&g_ep=EgoyMDI0MDkxMS4wIKXMDSoASAFQAw%3D%3D";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });


        forestbut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.google.com/maps/place/FSD+Ho+Forest+District+Office/@6.6145628,0.4623151,15z/data=!4m10!1m2!2m1!1sho+district!3m6!1s0x1027252f26cd839b:0x841f45f35437d21b!8m2!3d6.6145202!4d0.457499!15sCgtobyBkaXN0cmljdJIBEGZvcmVzdHJ5X3NlcnZpY2XgAQA!16s%2Fg%2F12ltvtbh_?entry=ttu&g_ep=EgoyMDI0MDkxMS4wIKXMDSoASAFQAw%3D%3D";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });


        municipalbut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.google.com/maps/place/Ho+Municipal+Assembly+Office/@6.6076759,0.4663555,15z/data=!4m10!1m2!2m1!1sho+district!3m6!1s0x102725173e978b07:0xab94810cb6bfd2d9!8m2!3d6.6084432!4d0.4721491!15sCgtobyBkaXN0cmljdJIBFmNpdHlfZ292ZXJubWVudF9vZmZpY2XgAQA!16s%2Fg%2F11_tkvlrs?entry=ttu&g_ep=EgoyMDI0MDkxMS4wIKXMDSoASAFQAw%3D%3D";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });

        policebut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url =
                        "https://www.google.com/maps/place/District+Police+Headquarters/@6.6095165,0.468124,15z/data=!4m10!1m2!2m1!1sho+district!3m6!1s0x10272518271b6a7f:0x37c46fddc419a1e2!8m2!3d6.6103265!4d0.4707848!15sCgtobyBkaXN0cmljdJIBDGNpdmlsX3BvbGljZeABAA!16s%2Fg%2F11f0y5bjwm?entry=ttu&g_ep=EgoyMDI0MDkxMS4wIKXMDSoASAFQAw%3D%3D";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });

        marketbut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.google.com/maps/place/Ho+central+market+police+station/@6.6172069,0.4696739,15.93z/data=!4m10!1m2!2m1!1sho+district!3m6!1s0x10272560608eef89:0xe41e4a1237f4c27c!8m2!3d6.619753!4d0.4734246!15sCgtobyBkaXN0cmljdJIBEWdvdmVybm1lbnRfb2ZmaWNl4AEA!16s%2Fg%2F11pwxmfrrr?entry=ttu&g_ep=EgoyMDI0MDkxMS4wIKXMDSoASAFQAw%3D%3D";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });



    }
}