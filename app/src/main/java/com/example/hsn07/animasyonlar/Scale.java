package com.example.hsn07.animasyonlar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class Scale extends AppCompatActivity {
    Animation asagi,yukari,slayt_kucult,slayt_buyut,slayt_zipla;
    Button btn_asagi,btn_yukari,btn_kucult,btn_buyut,btn_zipla;
    ImageView img_kuala;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scale);

        asagi= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.asagi);
        yukari= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.yukari);
        slayt_kucult= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.kucult);
        slayt_buyut= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.buyut);
        slayt_zipla= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.zipla);

        btn_asagi=findViewById(R.id.btn_asagi);
        btn_yukari=findViewById(R.id.btn_yukari);
        btn_kucult=findViewById(R.id.btn_kucult);
        btn_buyut=findViewById(R.id.btn_buyut);
        btn_zipla=findViewById(R.id.btn_zipla);
        img_kuala=findViewById(R.id.img_kuala);

        btn_asagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            img_kuala.startAnimation(asagi);
            }
        });
        btn_yukari.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img_kuala.startAnimation(yukari);
            }
        });
        btn_kucult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img_kuala.startAnimation(slayt_kucult);
            }
        });
        btn_buyut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img_kuala.startAnimation(slayt_buyut);
            }
        });
        btn_zipla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img_kuala.startAnimation(slayt_zipla);
            }
        });
    }
}
