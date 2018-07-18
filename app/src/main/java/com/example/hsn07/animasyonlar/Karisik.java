package com.example.hsn07.animasyonlar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class Karisik extends AppCompatActivity {

    Animation karisik,karisik2,kedicik,acilis,acilis_2;
    Button btn_basla,btn_basla_2;
    ImageView img_kedicik;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_karisik);

        btn_basla=findViewById(R.id.btn_basla_1);
        btn_basla_2=findViewById(R.id.btn_basla_2);
        img_kedicik=findViewById(R.id.img_kedicik);

        karisik= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.karisik);
        karisik2= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.karisik2);
        kedicik= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.acilis_kedicik);
        acilis=AnimationUtils.loadAnimation(getApplicationContext(),R.anim.acilis_basla);
        acilis_2=AnimationUtils.loadAnimation(getApplicationContext(),R.anim.acilis_basla_2);

        btn_basla.startAnimation(acilis);
        btn_basla_2.startAnimation(acilis_2);
        img_kedicik.startAnimation(kedicik);


        btn_basla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img_kedicik.startAnimation(karisik);
            }
        });
        btn_basla_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img_kedicik.startAnimation(karisik2);
            }
        });


    }
}
