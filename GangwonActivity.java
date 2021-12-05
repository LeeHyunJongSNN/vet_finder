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

public class GangwonActivity extends AppCompatActivity {

    private AdView mAdView;

    Button back;
    Button royal;
    Button ak;
    Button somang;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gangwon);

        back=findViewById(R.id.gangwon_back_to_main);
        back.setOnClickListener(onClickListener_back);
        royal=findViewById(R.id.royal_vet);
        royal.setOnClickListener(onClickListener_royal);
        ak=findViewById(R.id.ak_vet);
        ak.setOnClickListener(onClickListener_ak);
        somang=findViewById(R.id.somang_vet);
        somang.setOnClickListener(onClickListener_somang);

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

    View.OnClickListener onClickListener_royal = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(), VetRoyalActivity.class);
            startActivity(intent);
        }
    };

    View.OnClickListener onClickListener_ak = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(), VetAkActivity.class);
            startActivity(intent);
        }
    };

    View.OnClickListener onClickListener_somang = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(), VetSomangActivity.class);
            startActivity(intent);
        }
    };
}