package com.vetfinder.animal_hospital_finder;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

public class IncheonActivity extends AppCompatActivity {

    private AdView mAdView;


    ScrollView incheonlist;
    Button back;
    Button anyheal;
    Button nonhyun;
    Button chansem;
    Button sydney;
    Button bupyung;
    Button lime;
    Button plaza;
    Button ara;
    Button dao;
    Button hateaheung;
    Button go_sugu;
    Button go_michuhol;
    Button go_namdong;
    Button go_yeonsu;
    Button go_bupyeong;
    Button go_gyeyang;
    TextView sugu;
    TextView michuhol;
    TextView namdong;
    TextView yeonsu;
    TextView bupyeong;
    TextView gyeyang;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_incheon);

        incheonlist=findViewById(R.id.incheonlist);
        back = findViewById(R.id.incheon_back_to_main);
        back.setOnClickListener(onClickListener);
        anyheal = findViewById(R.id.anyheal_vet);
        anyheal.setOnClickListener(onClickListener);
        nonhyun = findViewById(R.id.nonhyun_vet);
        nonhyun.setOnClickListener(onClickListener);
        chansem = findViewById(R.id.chansem_vet);
        chansem.setOnClickListener(onClickListener);
        sydney = findViewById(R.id.sydney_vet);
        sydney.setOnClickListener(onClickListener);
        bupyung = findViewById(R.id.bupyung_vet);
        bupyung.setOnClickListener(onClickListener);
        lime = findViewById(R.id.lime_vet);
        lime.setOnClickListener(onClickListener);
        plaza = findViewById(R.id.plaza_vet);
        plaza.setOnClickListener(onClickListener);
        ara = findViewById(R.id.ara_vet);
        ara.setOnClickListener(onClickListener);
        dao = findViewById(R.id.dao_vet);
        dao.setOnClickListener(onClickListener);
        hateaheung = findViewById(R.id.hateaheung_vet);
        hateaheung.setOnClickListener(onClickListener);
        go_sugu=findViewById(R.id.go_sugu);
        go_michuhol=findViewById(R.id.go_michuhol);
        go_namdong=findViewById(R.id.go_namdong);
        go_yeonsu=findViewById(R.id.go_yeonsu);
        go_bupyeong=findViewById(R.id.go_bupyeong);
        go_gyeyang=findViewById(R.id.go_gyeyang);
        go_sugu.setOnClickListener(onClickListener);
        go_michuhol.setOnClickListener(onClickListener);
        go_namdong.setOnClickListener(onClickListener);
        go_yeonsu.setOnClickListener(onClickListener);
        go_bupyeong.setOnClickListener(onClickListener);
        go_gyeyang.setOnClickListener(onClickListener);
        sugu=findViewById(R.id.sugu);
        michuhol=findViewById(R.id.michuhol);
        namdong=findViewById(R.id.namdong);
        yeonsu=findViewById(R.id.yeonsu);
        bupyeong=findViewById(R.id.bupyung);
        gyeyang=findViewById(R.id.gyeyang);


        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });

        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
    }

    public static void scrollToView(View view, final ScrollView scrollView, int count) {
        if (view != null && view != scrollView) {
            count += view.getTop();
            scrollToView((View) view.getParent(), scrollView, count);
        } else if (scrollView != null) {
            final int finalCount = count;
            new Handler().postDelayed(new Runnable() {

                @Override
                public void run() {
                    scrollView.smoothScrollTo(0, finalCount);
                }
            }, 200);
        }
    }

    View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if (v.getId() == R.id.incheon_back_to_main) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }

            else if (v.getId() == R.id.anyheal_vet){
                Intent intent = new Intent(getApplicationContext(), VetAnyhealActivity.class);
                startActivity(intent);
            }

            else if (v.getId() == R.id.nonhyun_vet){
                Intent intent = new Intent(getApplicationContext(), VetNonhyunActivity.class);
                startActivity(intent);
            }

            else if (v.getId() == R.id.chansem_vet){
                Intent intent = new Intent(getApplicationContext(), VetChansemActivity.class);
                startActivity(intent);
            }

            else if (v.getId() == R.id.sydney_vet){
                Intent intent = new Intent(getApplicationContext(), VetSydneyActivity.class);
                startActivity(intent);
            }

            else if (v.getId() == R.id.bupyung_vet){
                Intent intent = new Intent(getApplicationContext(), VetBupyungActivity.class);
                startActivity(intent);
            }

            else if (v.getId() == R.id.lime_vet){
                Intent intent = new Intent(getApplicationContext(), VetLimeActivity.class);
                startActivity(intent);
            }

            else if (v.getId() == R.id.plaza_vet){
                Intent intent = new Intent(getApplicationContext(), VetPlazaActivity.class);
                startActivity(intent);
            }

            else if (v.getId() == R.id.ara_vet){
                Intent intent = new Intent(getApplicationContext(), VetAraActivity.class);
                startActivity(intent);
            }

            else if (v.getId() == R.id.dao_vet){
                Intent intent = new Intent(getApplicationContext(), VetDaoActivity.class);
                startActivity(intent);
            }

            else if (v.getId() == R.id.hateaheung_vet){
                Intent intent = new Intent(getApplicationContext(), VetHateaheungActivity.class);
                startActivity(intent);
            }

            else if (v.getId() == R.id.go_gyeyang) {
                scrollToView(gyeyang,incheonlist,0);
            }

            else if (v.getId() == R.id.go_michuhol) {
                scrollToView(michuhol,incheonlist,0);
            }

            else if (v.getId() == R.id.go_bupyeong) {
                scrollToView(bupyeong,incheonlist,0);
            }

            else if (v.getId() == R.id.go_sugu) {
                scrollToView(sugu,incheonlist,0);
            }

            else if (v.getId() == R.id.go_yeonsu) {
                scrollToView(yeonsu,incheonlist,0);
            }

            else if (v.getId() == R.id.go_namdong) {
                scrollToView(namdong,incheonlist,0);
            }
        }
    };
}