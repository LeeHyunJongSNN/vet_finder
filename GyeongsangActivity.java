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

public class GyeongsangActivity extends AppCompatActivity {

    private AdView mAdView;

    Button back;
    Button vest;
    Button isop;
    Button newworld;
    Button shinsege;
    Button langs;
    Button gooddoc;
    Button hainl;
    Button noble;
    Button mirae;
    Button aqua;
    Button feel;
    Button dongin;
    Button lovely;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gyeongsang);

        back=findViewById(R.id.gyeongsang_back_to_main);
        back.setOnClickListener(onClickListener_back);
        vest=findViewById(R.id.vest_vet);
        vest.setOnClickListener(onClickListener_vest);
        isop=findViewById(R.id.isop_vet);
        isop.setOnClickListener(onClickListener_isop);
        newworld=findViewById(R.id.newworld_vet);
        newworld.setOnClickListener(onClickListener_newworld);
        shinsege=findViewById(R.id.shinsege_vet);
        shinsege.setOnClickListener(onClickListener_shinsege);
        langs=findViewById(R.id.langs_vet);
        langs.setOnClickListener(onClickListener_langs);
        gooddoc=findViewById(R.id.gooddoc_vet);
        gooddoc.setOnClickListener(onClickListener_gooddoc);
        hainl=findViewById(R.id.hanil_vet);
        hainl.setOnClickListener(onClickListener_hanil);
        noble=findViewById(R.id.noble_vet);
        noble.setOnClickListener(onClickListener_noble);
        mirae=findViewById(R.id.mirae_vet);
        mirae.setOnClickListener(onClickListener_mirae);
        aqua=findViewById(R.id.aqua_vet);
        aqua.setOnClickListener(onClickListener_aqua);
        feel=findViewById(R.id.feel_vet);
        feel.setOnClickListener(onClickListener_feel);
        dongin=findViewById(R.id.dongin_vet);
        dongin.setOnClickListener(onClickListener_dongin);
        lovely=findViewById(R.id.lovely_vet);
        lovely.setOnClickListener(onClickListener_lovely);

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

    View.OnClickListener onClickListener_vest = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(), VetVestActivity.class);
            startActivity(intent);
        }
    };

    View.OnClickListener onClickListener_isop = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(), VetIsopActivity.class);
            startActivity(intent);
        }
    };

    View.OnClickListener onClickListener_newworld = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(), VetNewworldActivity.class);
            startActivity(intent);
        }
    };

    View.OnClickListener onClickListener_shinsege = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(), VetShinsegeActivity.class);
            startActivity(intent);
        }
    };

    View.OnClickListener onClickListener_langs = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(), VetLangsActivity.class);
            startActivity(intent);
        }
    };

    View.OnClickListener onClickListener_gooddoc = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(), VetGoodocActivity.class);
            startActivity(intent);
        }
    };

    View.OnClickListener onClickListener_hanil = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(), VetHanilActivity.class);
            startActivity(intent);
        }
    };

    View.OnClickListener onClickListener_noble = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
           Intent intent = new Intent(getApplicationContext(), VetNobleActivity.class);
           startActivity(intent);
        }
    };

    View.OnClickListener onClickListener_mirae = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(), VetMiraeActivity.class);
            startActivity(intent);
        }
    };

    View.OnClickListener onClickListener_aqua = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(), VetAquaActivity.class);
            startActivity(intent);
        }
    };

    View.OnClickListener onClickListener_feel = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(), VetFeelActivity.class);
            startActivity(intent);
        }
    };

    View.OnClickListener onClickListener_dongin = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(), VetDonginActivity.class);
            startActivity(intent);
        }
    };

    View.OnClickListener onClickListener_lovely = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(), VetLovelyActivity.class);
            startActivity(intent);
        }
    };
}