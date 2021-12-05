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

public class ReptileInformationActivity extends AppCompatActivity {

    private AdView mAdView;

    Button Backmain_rep;
    Button Backinfo;
    Button Rodentinfo;
    Button search_repinfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reptile_information);

        Backmain_rep=findViewById(R.id.inforep_back_to_main);
        Backmain_rep.setOnClickListener(OnClickListener_backmain_rep);
        Backinfo=findViewById(R.id.inforep_back_to_infopage);
        Backinfo.setOnClickListener(OnClickListener_backinfo_rep);
        Rodentinfo=findViewById(R.id.inforep_next_to_rodentinfopage);
        Rodentinfo.setOnClickListener(OnClickListener_backinfo_rod);
        search_repinfo=findViewById(R.id.repinfo_go_to_searchpage);
        search_repinfo.setOnClickListener(OnClickListener_go_to_searchpage_rep);

        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });

        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
    }

    View.OnClickListener OnClickListener_backmain_rep = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(intent);
        }
    };

    View.OnClickListener OnClickListener_backinfo_rep = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(), InformationActivity.class);
            startActivity(intent);
        }
    };

    View.OnClickListener OnClickListener_backinfo_rod = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(), RodentInformationActivity.class);
            startActivity(intent);
        }
    };

    View.OnClickListener OnClickListener_go_to_searchpage_rep = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(), SearchActivity.class);
            startActivity(intent);
        }
    };
}