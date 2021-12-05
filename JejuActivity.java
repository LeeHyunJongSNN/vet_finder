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

public class JejuActivity extends AppCompatActivity {

    Button kium;
    Button health;
    Button hallah;
    Button back;

    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jeju);

        kium=findViewById(R.id.kium_vet);
        kium.setOnClickListener(onClickListener_kium);
        health=findViewById(R.id.health_vet);
        health.setOnClickListener(onClickListener_health);
        hallah=findViewById(R.id.halla_vet);
        hallah.setOnClickListener(onClickListener_hallah);
        back=findViewById(R.id.jeju_back_to_main);
        back.setOnClickListener(onClickListener_back);

        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });

        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

    }

    View.OnClickListener onClickListener_kium = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(), VetKiumActivity.class);
            startActivity(intent);
        }
    };

    View.OnClickListener onClickListener_health = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(), VetHealthActivity.class);
            startActivity(intent);
        }
    };

    View.OnClickListener onClickListener_hallah = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(), VetHallahActivity.class);
            startActivity(intent);
        }
    };

    View.OnClickListener onClickListener_back = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(intent);
        }
    };
}