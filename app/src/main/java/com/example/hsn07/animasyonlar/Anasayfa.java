package com.example.hsn07.animasyonlar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Anasayfa extends AppCompatActivity {
    Button btnalpha,btnrotate,btntranslate,btnscale;
    Button btnsga,btnkarea,btnmda,btnkarisik;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anasayfa);
        btnalpha=findViewById(R.id.btnalpha);
        btnrotate=findViewById(R.id.btnrotate);
        btntranslate=findViewById(R.id.btntranslate);
        btnscale=findViewById(R.id.btnscale);
        btnsga=findViewById(R.id.btnsayfanimasyonu);
        btnkarea=findViewById(R.id.btnkare);
        btnmda=findViewById(R.id.btnmda);
        btnkarisik=findViewById(R.id.btnkarisik);

        ///////////////////////////////////////////////////
        btnalpha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent git=new Intent(Anasayfa.this,Alpha.class);
                startActivity(git);
            }
        });
        btnrotate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent git=new Intent(Anasayfa.this,Rotate.class);
                startActivity(git);
            }
        });
        btntranslate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent git=new Intent(Anasayfa.this,Translate.class);
                startActivity(git);
            }
        });
        btnscale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent git=new Intent(Anasayfa.this,Scale.class);
                startActivity(git);
            }
        });
        btnkarisik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent git=new Intent(Anasayfa.this,Karisik.class);
                startActivity(git);
            }
        });
        btnsga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent git=new Intent(Anasayfa.this,SayfaGecisi.class);
                startActivity(git);
            }
        });
        btnkarea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent git=new Intent(Anasayfa.this,DarawableAnimation.class);
                startActivity(git);
            }
        });



    }
}
