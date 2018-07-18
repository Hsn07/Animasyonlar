package com.example.hsn07.animasyonlar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SayfaGecisi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sayfa_gecisi);

        overridePendingTransition(R.anim.start_anim,R.anim.exit_anim);

    }

    @Override
    protected void onPause() {
        super.onPause();

        overridePendingTransition(R.anim.start_anim,R.anim.exit_anim);
    }
}
