package com.example.hsn07.animasyonlar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class Translate extends AppCompatActivity {
    Animation translate;
    Button btn_basla;
    ImageView img_cabin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_translate);

        translate= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.translate);
        btn_basla=findViewById(R.id.btn_basla);
        img_cabin=findViewById(R.id.img_cabin);
        btn_basla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img_cabin.startAnimation(translate);
            }
        });

    }
}
