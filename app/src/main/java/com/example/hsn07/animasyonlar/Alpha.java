package com.example.hsn07.animasyonlar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class Alpha extends AppCompatActivity {
    Button btn_azalt,btn_arttir,btn_capraz,btn_blink;
    TextView tv_azalt,tv_arttir,tv_capraz_azalt,tv_capraz_arttir,tv_blink;
    Animation anim_arttir,anim_azalt,anim_blink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alpha);

        btn_azalt=findViewById(R.id.btnazalt);
        btn_arttir=findViewById(R.id.btnarttir);
        btn_capraz=findViewById(R.id.btncapraz);
        btn_blink=findViewById(R.id.btnblink);

        tv_azalt=findViewById(R.id.tv_azalt);
        tv_arttir=findViewById(R.id.tv_artir);
        tv_capraz_azalt=findViewById(R.id.tv_capraz_azalt);
        tv_capraz_arttir=findViewById(R.id.tv_capraz_arttir);
        tv_blink=findViewById(R.id.tv_blink);

        anim_arttir= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.arttir);
        anim_azalt= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.azalt);
        anim_blink= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.blink);

        btn_azalt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                tv_azalt.setAnimation(anim_azalt);
            }
        });
        btn_arttir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            tv_arttir.setVisibility(View.VISIBLE);
            tv_arttir.setAnimation(anim_arttir);
            }
        });
        btn_capraz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv_capraz_arttir.setVisibility(View.VISIBLE);
                tv_capraz_arttir.setAnimation(anim_arttir);
                tv_capraz_azalt.setAnimation(anim_azalt);
            }
        });

        btn_blink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                tv_blink.setVisibility(View.VISIBLE);
                tv_blink.setAnimation(anim_blink);
            }
        });
    }
}
