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

public class RodentInformationActivity extends AppCompatActivity {

    private AdView mAdView;

    Button Previous_rodinfo;
    Button Backmain_rodinfo;
    Button Searchpage_rodinfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rodent_information);

        Previous_rodinfo=findViewById(R.id.rodinfo_go_to_reptilepage);
        Previous_rodinfo.setOnClickListener(OnClickListener_reptile_inforod);
        Backmain_rodinfo=findViewById(R.id.rodinfo_back_to_main);
        Backmain_rodinfo.setOnClickListener(OnClickListener_Back_to_main);
        Searchpage_rodinfo=findViewById(R.id.rodinfo_go_to_searchpage);
        Searchpage_rodinfo.setOnClickListener(OnClickListener_go_to_searchpage_rod);

        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });

        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
    }

    View.OnClickListener OnClickListener_reptile_inforod = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(), ReptileInformationActivity.class);
            startActivity(intent);
        }
    };

    View.OnClickListener OnClickListener_Back_to_main = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(intent);
        }
    };

    View.OnClickListener OnClickListener_go_to_searchpage_rod = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(), SearchActivity.class);
            startActivity(intent);
        }
    };
}