package com.vetfinder.animal_hospital_finder;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

public class JeonraActivity extends AppCompatActivity {

    private AdView mAdView;

    Button back;
    Button kirin;
    Button ino;
    Button healing;
    Button blue;
    Button future;
    Button joongma;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jeonra);

        back=findViewById(R.id.jeonra_back_to_main);
        back.setOnClickListener(onClickListener_back);
        kirin=findViewById(R.id.kirin_vet);
        kirin.setOnClickListener(onClickListener_kirin);
        ino=findViewById(R.id.ino_vet);
        ino.setOnClickListener(onClickListener_ino);
        healing=findViewById(R.id.healing_vet);
        healing.setOnClickListener(onClickListener_healing);
        blue=findViewById(R.id.blue_vet);
        blue.setOnClickListener(onClickListener_blue);
        future=findViewById(R.id.future_vet);
        future.setOnClickListener(onClickListener_future);
        joongma=findViewById(R.id.joongma_vet);
        joongma.setOnClickListener(onClickListener_joongma);

        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });

        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);


    }

    View.OnClickListener onClickListener_back = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(intent);
        }
    };

    View.OnClickListener onClickListener_kirin = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(), VetKirinActivity.class);
            startActivity(intent);
        }
    };

    View.OnClickListener onClickListener_ino = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(), VetInoActivity.class);
            startActivity(intent);
        }
    };

    View.OnClickListener onClickListener_healing = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(), VetHealingActivity.class);
            startActivity(intent);
        }
    };

    View.OnClickListener onClickListener_blue = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
          Intent intent = new Intent(getApplicationContext(), VetBlueActivity.class);
          startActivity(intent);
        }
    };

    View.OnClickListener onClickListener_future = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(), VetFutureActivity.class);
            startActivity(intent);
        }
    };

    View.OnClickListener onClickListener_joongma = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(), VetJoongmaActivity.class);
            startActivity(intent);
        }
    };
}