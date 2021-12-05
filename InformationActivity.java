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

public class InformationActivity extends AppCompatActivity {

    Button backmain_info;
    Button next_info;
    Button search_info;

    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information);


        backmain_info=findViewById(R.id.info_back_to_main);
        backmain_info.setOnClickListener(OnClickListener_back_info);
        next_info=findViewById(R.id.info_go_to_reptilepage);
        next_info.setOnClickListener(OnClickListener_go_to_reptileinfo);
        search_info=findViewById(R.id.info_go_to_searchpage);
        search_info.setOnClickListener(OnClickListener_go_to_searchpage);

        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });

        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
    }

    View.OnClickListener OnClickListener_back_info = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(intent);
        }
    };

    View.OnClickListener OnClickListener_go_to_reptileinfo = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(), ReptileInformationActivity.class);
            startActivity(intent);
        }
    };

    View.OnClickListener OnClickListener_go_to_searchpage = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(), SearchActivity.class);
            startActivity(intent);
        }
    };

}

