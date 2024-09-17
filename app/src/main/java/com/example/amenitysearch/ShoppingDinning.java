package com.example.amenitysearch;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;


public class ShoppingDinning extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shopping_dinning);

        CardView kcs = findViewById(R.id.kcscard);
        CardView batatas = findViewById(R.id.batatascard);
        CardView flavours = findViewById(R.id.flavoursscard);
        CardView lifeoven = findViewById(R.id.lifeovencard);
        CardView sylvia = findViewById(R.id.sylviascard);
        CardView thejoint = findViewById(R.id.thejointcard);
        CardView kfc = findViewById(R.id.kfccard);
        CardView reddot = findViewById(R.id.reddotcard);
        CardView js = findViewById(R.id.jscafecard);
        CardView freedom = findViewById(R.id.freedomCard);
        CardView soloko = findViewById(R.id.solokocard);
        CardView bravos = findViewById(R.id.bravosfoodcard);
        CardView christian = findViewById(R.id.christaincard);
        CardView mother = findViewById(R.id.mothercard);
        CardView rolis = findViewById(R.id.roliscard);
        CardView bedwin = findViewById(R.id.bedwinwinecard);
        CardView classhouse = findViewById(R.id.classhousecard);
        CardView connie = findViewById(R.id.conniecosmeticscard);
        CardView hoshopping = findViewById(R.id.hoshoppingmallcard);
        CardView letsa = findViewById(R.id.letsamallcard);
        CardView liquor = findViewById(R.id.liquorlandcard);
        CardView lis = findViewById(R.id.lizzdeecard);
        CardView melcom = findViewById(R.id.melcomhocard);
        CardView rich = findViewById(R.id.richciticard);
        CardView yelis = findViewById(R.id.yaliscollectioncard);

        Button kcsbutt = findViewById(R.id.kcsbutton);
        Button batatasbutt = findViewById(R.id.batatasbutton);
        Button flavoursbutt = findViewById(R.id.flavoursbutton);
        Button lifeovenbutt = findViewById(R.id.lifeOvenbutton);
        Button thejointbutt = findViewById(R.id.thejointbutton);
        Button kfcbutt = findViewById(R.id.kfcbutton);
        Button reddotbutt = findViewById(R.id.reddotbutton);
        Button lordsbutt = findViewById(R.id.lordsgardenbutton);
        Button solokobutt = findViewById(R.id.solokobutton);
        Button bravosbutt = findViewById(R.id.bravobutton);
        Button christianbutt = findViewById(R.id.christainbutton);
        Button motherbutt = findViewById(R.id.motherbutton);
        Button rolisbutt = findViewById(R.id.rolisbutton);
        Button bedwinbutt = findViewById(R.id.bedwinbutton);
        Button classhousebutt = findViewById(R.id.classhousebutton);
        Button hoshoppingbutt = findViewById(R.id.hoshoppingbutton);
        Button letsabutt = findViewById(R.id.letsabutton);
        Button liquorbutt = findViewById(R.id.liqourbutton);
        Button lisbutt = findViewById(R.id.lissdeebutton);
        Button melcombutt = findViewById(R.id.melcombutton);
        Button richbutt = findViewById(R.id.richcitibutton);
        Button yelisbutt = findViewById(R.id.yalisbutton);

        yelisbutt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.google.com/maps/place/Yalis+Collection/@6.6196971,0.4693032,17z/data=!3m1!4b1!4m6!3m5!1s0x102725db44f4401b:0xb65255c13156d52!8m2!3d6.6196918!4d0.4718835!16s%2Fg%2F11l71dq9r2?entry=ttu&g_ep=EgoyMDI0MDgyOC4wIKXMDSoASAFQAw%3D%3D";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });

        richbutt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.google.com/maps/place/Rich+Citi+Premium+Showroom/@6.5913264,0.4694916,17z/data=!3m1!4b1!4m6!3m5!1s0x1027251c5c775a43:0x2eadfcb595b8836e!8m2!3d6.5913211!4d0.4720719!16s%2Fg%2F11h4m_hzh9?entry=ttu&g_ep=EgoyMDI0MDgyOC4wIKXMDSoASAFQAw%3D%3D";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });

        melcombutt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.google.com/maps/place/Melcom+Ho+Volta+branch/@6.6033188,0.464615,17z/data=!3m1!4b1!4m6!3m5!1s0x1027253ed9858ec7:0x1f5179566f27e197!8m2!3d6.6033135!4d0.4671953!16s%2Fg%2F11cjj0y29m?entry=ttu&g_ep=EgoyMDI0MDgyOC4wIKXMDSoASAFQAw%3D%3D";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });

        lisbutt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.google.com/maps/place/LIZZ-DEE+SHOPPING+MALL/@6.6222942,0.4911763,17z/data=!3m1!4b1!4m6!3m5!1s0x102725b2807ffb85:0xf593dbd045bf500c!8m2!3d6.6222889!4d0.4937566!16s%2Fg%2F11fnp_gdbr?entry=ttu&g_ep=EgoyMDI0MDgyOC4wIKXMDSoASAFQAw%3D%3D";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });

        liquorbutt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.google.com/maps/place/Liqour+Land/@6.6057455,0.4687417,17z/data=!3m1!4b1!4m6!3m5!1s0x1027251662353333:0xd97e85e4dcc7540b!8m2!3d6.6057402!4d0.471322!16s%2Fg%2F11g88g927x?entry=ttu&g_ep=EgoyMDI0MDgyOC4wIKXMDSoASAFQAw%3D%3D";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });

        letsabutt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.google.com/maps/place/Letsa+Shopping+Mall/@6.6040924,0.4636502,17z/data=!3m1!4b1!4m6!3m5!1s0x102725cb1cd08fc5:0x3cf02faa2d13d2a2!8m2!3d6.6040871!4d0.4662305!16s%2Fg%2F11t0rhhlvs?entry=ttu&g_ep=EgoyMDI0MDgyOC4wIKXMDSoASAFQAw%3D%3D";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });

        hoshoppingbutt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.google.com/maps/place/Ho+shopping+mall/@6.6141817,0.4668143,17z/data=!3m1!4b1!4m6!3m5!1s0x102725955ea87c75:0xb07fa5f04dd88906!8m2!3d6.6141764!4d0.4693946!16s%2Fg%2F11gl1k1v7r?entry=ttu&g_ep=EgoyMDI0MDgyOC4wIKXMDSoASAFQAw%3D%3D";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });

        classhousebutt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.google.com/maps/place/Class+House+Electronics+-+HO/@6.6156852,0.4734224,15.65z/data=!4m6!3m5!1s0x10272513b117d82b:0x9600eb99dd998f86!8m2!3d6.6157684!4d0.4734687!16s%2Fg%2F11j2ykps8r?entry=ttu&g_ep=EgoyMDI0MDgyOC4wIKXMDSoASAFQAw%3D%3D";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });

        bedwinbutt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.google.com/maps/place/Bedwin+Wine+And+Liquor/@6.6094261,0.4749646,15.81z/data=!4m6!3m5!1s0x10272507aff06501:0xa559dd59d6c34ec9!8m2!3d6.6106144!4d0.474739!16s%2Fg%2F11gy8ljp_v?entry=ttu&g_ep=EgoyMDI0MDgyOC4wIKXMDSoASAFQAw%3D%3D";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });

        rolisbutt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.google.com/maps/place/Roliz+Pizza,+Bar+%26+Restaurant/@6.594235,0.4715391,17z/data=!4m6!3m5!1s0x10272518ad569805:0xc7146dc8ecc384fb!8m2!3d6.594283!4d0.4718663!16s%2Fg%2F11gyxfnxtk?entry=ttu&g_ep=EgoyMDI0MDgyOC4wIKXMDSoASAFQAw%3D%3D";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });

        motherbutt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.google.com/maps/place/Mothers+Inn+Restaurant/@6.6079258,0.4737981,16z/data=!4m6!3m5!1s0x102725167626fe9d:0x4736c323bfb1351!8m2!3d6.6101493!4d0.4785495!16s%2Fg%2F1td0jjj3?entry=ttu&g_ep=EgoyMDI0MDgyOC4wIKXMDSoASAFQAw%3D%3D";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });

        christianbutt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "\n" +
                        "https://www.google.com/maps/place/Christian+Gardens+Restaurant/@6.6104026,0.4783241,15.4z/data=!4m6!3m5!1s0x10272574e2733d1d:0x53d96093e111013b!8m2!3d6.6101493!4d0.4785495!16s%2Fg%2F11c6m3hhv_?entry=ttu&g_ep=EgoyMDI0MDgyOC4wIKXMDSoASAFQAw%3D%3D";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });

        bravosbutt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.google.com/maps/place/Bravos+Food+Restaurants+(Bravos+Food+Golden+Spoon+Restaurant),+Ho+Volta+Region,+Ghana/@6.608452,0.4645609,16.39z/data=!4m6!3m5!1s0x102725f444b17087:0x7baa073deefcd084!8m2!3d6.6093382!4d0.4644486!16s%2Fg%2F11mv0hl6sq?entry=ttu&g_ep=EgoyMDI0MDgyOC4wIKXMDSoASAFQAw%3D%3D";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });

        solokobutt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.google.com/maps/place/Soloko+Cafe/@6.6082675,0.4659246,17z/data=!3m1!4b1!4m6!3m5!1s0x10272589088bd621:0x1f3ba455b852b001!8m2!3d6.6082622!4d0.4685049!16s%2Fg%2F11rmwcq704?entry=ttu&g_ep=EgoyMDI0MDgyOC4wIKXMDSoASAFQAw%3D%3D";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });

        lordsbutt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.google.com/maps/place/Lord's+Garden+Restaurant/@6.6043471,0.4723122,17z/data=!3m1!4b1!4m6!3m5!1s0x10272513e71ae303:0xf81dba4a5f3022ba!8m2!3d6.6043418!4d0.4748925!16s%2Fg%2F11c2q3151p?entry=ttu&g_ep=EgoyMDI0MDgyOC4wIKXMDSoASAFQAw%3D%3D";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });

        reddotbutt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.google.com/maps/place/Red+Dot+Restaurant/@6.5944323,0.4672856,17z/data=!4m6!3m5!1s0x1027256995d2cfc1:0xcbc68b0f51d637b4!8m2!3d6.5929562!4d0.4705633!16s%2Fg%2F11c2pgd3h3?entry=ttu&g_ep=EgoyMDI0MDgyOC4wIKXMDSoASAFQAw%3D%3D";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });

        kfcbutt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.google.com/maps/place/KFC+Ho/@6.6159034,0.4745589,15.26z/data=!4m6!3m5!1s0x1027259d8edbca05:0xaf5192ddb3731fe4!8m2!3d6.6170029!4d0.4724111!16s%2Fg%2F11sh49d1k1?entry=ttu&g_ep=EgoyMDI0MDgyOC4wIKXMDSoASAFQAw%3D%3D";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });

        thejointbutt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.google.com/maps/place/The+Joint+Cafe+(+Summer+Light)/@6.6045649,0.4738993,15.47z/data=!4m6!3m5!1s0x10272535ab7d50a7:0x4853801f5290864d!8m2!3d6.6043441!4d0.4766321!16s%2Fg%2F11q8j48fgm?entry=ttu&g_ep=EgoyMDI0MDgyOC4wIKXMDSoASAFQAw%3D%3D";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });

        lifeovenbutt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.google.com/maps/place/LifeOven+Restaurant+Ho/@6.5900218,0.4644231,15.15z/data=!4m6!3m5!1s0x102725f49d84332f:0x456a90a8eb17fdf1!8m2!3d6.5898354!4d0.4626003!16s%2Fg%2F11ryf98bs8?entry=ttu&g_ep=EgoyMDI0MDgyOC4wIKXMDSoASAFQAw%3D%3D";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });

        flavoursbutt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.google.com/maps/place/Flavours+Restaurant/@6.6114866,0.4690671,15.26z/data=!4m6!3m5!1s0x102725c269170ce1:0xc912f4ac0b5aa2b5!8m2!3d6.6118688!4d0.475083!16s%2Fg%2F11vf4bjbl5?entry=ttu&g_ep=EgoyMDI0MDgyOC4wIKXMDSoASAFQAw%3D%3D";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });

        batatasbutt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.google.com/maps/place/Batatas(FLAT)/@6.5928768,0.4619826,15.46z/data=!4m6!3m5!1s0x10272586c7a3059b:0xa76976d00a5f9699!8m2!3d6.5925557!4d0.462152!16s%2Fg%2F11sgx03g4m?entry=ttu&g_ep=EgoyMDI0MDgyOC4wIKXMDSoASAFQAw%3D%3D";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });

        kcsbutt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.google.com/maps/place/KCS+Downtown/@6.6140816,0.4650486,15.7z/data=!4m6!3m5!1s0x10272518a2484ed9:0xbf4856f246ea15d6!8m2!3d6.6142233!4d0.4694844!16s%2Fg%2F11c0xhdpc0?entry=ttu&g_ep=EgoyMDI0MDgyOC4wIKXMDSoASAFQAw%3D%3D";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });


        kcs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ShoppingDinning.this, KCS_Restaurant.class);
                startActivity(intent);
            }
        });

        yelis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ShoppingDinning.this, Yalis_Collection.class);
                startActivity(intent);
            }
        });


        rich.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ShoppingDinning.this, Rich_Citi.class);
                startActivity(intent);
            }
        });


        melcom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ShoppingDinning.this, Melcom_Ho.class);
                startActivity(intent);
            }
        });


        lis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ShoppingDinning.this, LIZZ_dee.class);
                startActivity(intent);
            }
        });


        liquor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ShoppingDinning.this, Liqour_Land.class);
                startActivity(intent);
            }
        });


        letsa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ShoppingDinning.this, Letsa_Mall.class);
                startActivity(intent);
            }
        });


        hoshopping.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ShoppingDinning.this, Ho_Shopping_Mall.class);
                startActivity(intent);
            }
        });


        connie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ShoppingDinning.this, Connie_Cosmetics.class);
                startActivity(intent);
            }
        });


        classhouse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ShoppingDinning.this, ClassHouse.class);
                startActivity(intent);
            }
        });


        bedwin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ShoppingDinning.this, Bedwin_Wine.class);
                startActivity(intent);
            }
        });


        rolis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ShoppingDinning.this, Rolis_pissa.class);
                startActivity(intent);
            }
        });


        mother.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ShoppingDinning.this, Mothers_Inn.class);
                startActivity(intent);
            }
        });


        christian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ShoppingDinning.this, Christain_Garden_Res.class);
                startActivity(intent);
            }
        });


        bravos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ShoppingDinning.this, Bravos_Food.class);
                startActivity(intent);
            }
        });


        soloko.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ShoppingDinning.this, SolokoCofeShop.class);
                startActivity(intent);
            }
        });


        freedom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ShoppingDinning.this, Lords_Garden.class);
                startActivity(intent);
            }
        });


        js.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ShoppingDinning.this, JS_Cafe.class);
                startActivity(intent);
            }
        });


        reddot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ShoppingDinning.this, Red_Dot.class);
                startActivity(intent);
            }
        });


        kfc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ShoppingDinning.this, KFC_HO.class);
                startActivity(intent);
            }
        });


        thejoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ShoppingDinning.this, The_Joint_Cafe.class);
                startActivity(intent);
            }
        });


        sylvia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ShoppingDinning.this, Sylvia_Kitchen.class);
                startActivity(intent);
            }
        });


        lifeoven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ShoppingDinning.this, Life_Oven_Res.class);
                startActivity(intent);
            }
        });


        flavours.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ShoppingDinning.this, Flavours_Restaurant.class);
                startActivity(intent);
            }
        });


        batatas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ShoppingDinning.this, Batatas_Restaurant.class);
                startActivity(intent);
            }
        });

    }
}