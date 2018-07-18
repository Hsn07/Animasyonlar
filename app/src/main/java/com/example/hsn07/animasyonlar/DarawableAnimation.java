package com.example.hsn07.animasyonlar;

import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class DarawableAnimation extends AppCompatActivity {
    ImageView img_kare;
    AnimationDrawable wifi_Animation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_darawable_animation);

        img_kare=findViewById(R.id.img_kare);
        img_kare.setBackgroundResource(R.drawable.drawable_animation);

        wifi_Animation= (AnimationDrawable) img_kare.getBackground();
        wifi_Animation.start();

    }
}
