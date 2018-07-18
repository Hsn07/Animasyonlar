package com.example.hsn07.animasyonlar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class Rotate extends AppCompatActivity {
    Animation rotate;
    ImageView img_resim;
    Button btn_baslat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rotate);

        rotate= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotate);
        img_resim=findViewById(R.id.imvrotate);
        btn_baslat=findViewById(R.id.btn_baslat);
        btn_baslat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img_resim.startAnimation(rotate);
            }
        });
    }
}
