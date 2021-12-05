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

public class GwangjuActivity extends AppCompatActivity {

    private AdView mAdView;

    Button back;
    Button noah;
    Button kor;
    Button soowan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gwangju);

        back=findViewById(R.id.gwangju_back_to_main);
        back.setOnClickListener(onClickListener_back);
        noah=findViewById(R.id.noah_vet);
        noah.setOnClickListener(onClickListener_noah);
        kor=findViewById(R.id.kor_vet);
        kor.setOnClickListener(onClickListener_kor);
        soowan=findViewById(R.id.soowan_vet);
        soowan.setOnClickListener(onClickListener_soowan);

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

    View.OnClickListener onClickListener_noah = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(),VetNoahActivity.class);
            startActivity(intent);
        }
    };

    View.OnClickListener onClickListener_kor = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(), VetKorActivity.class);
            startActivity(intent);
        }
    };

    View.OnClickListener onClickListener_soowan = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(), VetSoowanActivity.class);
            startActivity(intent);
        }
    };
}