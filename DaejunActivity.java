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

public class DaejunActivity extends AppCompatActivity {

    private AdView mAdView;

    Button back;
    Button yedam;
    Button hwang;
    Button cool;
    Button jo;
    Button kenya;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daejun);

        back=findViewById(R.id.daejeon_back_to_main);
        back.setOnClickListener(onClickListener_back);
        yedam=findViewById(R.id.yedam_vet);
        yedam.setOnClickListener(onClickListener_yedam);
        hwang=findViewById(R.id.hwang_vet);
        hwang.setOnClickListener(onClickListener_hwang);
        cool=findViewById(R.id.cool_vet);
        cool.setOnClickListener(onClickListener_cool);
        jo=findViewById(R.id.jo_vet);
        jo.setOnClickListener(onClickListener_jo);
        kenya=findViewById(R.id.kenya_vet);
        kenya.setOnClickListener(onClickListener_kenya);

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

    View.OnClickListener onClickListener_yedam= new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(), VetYedamActivity.class);
            startActivity(intent);
        }
    };

    View.OnClickListener onClickListener_hwang = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(), VetHwangActivity.class);
            startActivity(intent);
        }
    };

    View.OnClickListener onClickListener_cool = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(), VetCoolActivity.class);
            startActivity(intent);
        }
    };

    View.OnClickListener onClickListener_jo = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(), VetJoActivity.class);
            startActivity(intent);
        }
    };

    View.OnClickListener onClickListener_kenya = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(), VetKenyaActivity.class);
            startActivity(intent);
        }
    };
}