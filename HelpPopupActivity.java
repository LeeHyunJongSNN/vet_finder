package com.vetfinder.animal_hospital_finder;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

public class HelpPopupActivity extends AppCompatActivity {

    private AdView mAdView;

    Button backmain;
    TextView birdpalace;
    TextView animaldoctor;
    TextView thezoo;
    TextView petzzi;
    TextView notepet;
    TextView dailyvet;
    TextView parrotcom;
    TextView psamo;
    TextView engsamo;
    TextView korrep;
    TextView parrotkingdom;
    TextView thezoocafe;
    TextView hamsterstory;
    TextView hamsamo;
    TextView hedge;
    TextView gisamo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help_popup);

        backmain=findViewById(R.id.back_to_main);
        backmain.setOnClickListener(onClickListener_back);
        birdpalace=findViewById(R.id.birdpalace);
        birdpalace.setOnClickListener(onClickListener_birdpalace);
        animaldoctor=findViewById(R.id.animaldoctor);
        animaldoctor.setOnClickListener(onClickListener_animaldoctor);
        thezoo=findViewById(R.id.thezoo);
        thezoo.setOnClickListener(onClickListener_thezoo);
        petzzi=findViewById(R.id.petzzi);
        petzzi.setOnClickListener(onClickListener_petzzi);
        notepet=findViewById(R.id.notepet);
        notepet.setOnClickListener(onClickListener_notepet);
        dailyvet=findViewById(R.id.dailyvet);
        dailyvet.setOnClickListener(onClickListener_dailyvet);
        parrotcom=findViewById(R.id.parrotcom);
        parrotcom.setOnClickListener(onClickListener_parrotcom);
        engsamo=findViewById(R.id.engsamo);
        engsamo.setOnClickListener(onClickListener_engsamo);
        psamo=findViewById(R.id.psamo);
        psamo.setOnClickListener(onClickListener_psamo);
        korrep=findViewById(R.id.korrep);
        korrep.setOnClickListener(onClickListener_korrep);
        parrotkingdom=findViewById(R.id.parrotkingdom);
        parrotkingdom.setOnClickListener(onClickListener_parrotkingdom);
        thezoocafe=findViewById(R.id.thezoocafe);
        thezoocafe.setOnClickListener(onClickListener_thezoocafe);
        hamsterstory=findViewById(R.id.hamsterstory);
        hamsterstory.setOnClickListener(onClickListener_hamsterstory);
        hamsamo=findViewById(R.id.hamsamo);
        hamsamo.setOnClickListener(onClickListener_hamsamo);
        hedge=findViewById(R.id.hedge);
        hedge.setOnClickListener(onClickListener_hedge);
        gisamo=findViewById(R.id.gisamo);
        gisamo.setOnClickListener(onClickListener_gisamo);

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

    View.OnClickListener onClickListener_birdpalace = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://birdpalace.co.kr/"));
            startActivity(intent);
        }
    };
    View.OnClickListener onClickListener_animaldoctor = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://animaldoctor.co.kr/"));
            startActivity(intent);
        }
    };

    View.OnClickListener onClickListener_thezoo = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://xn--9m1b023b.com/"));
            startActivity(intent);
        }
    };

    View.OnClickListener onClickListener_petzzi = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.petzzi.com/"));
            startActivity(intent);
        }
    };

    View.OnClickListener onClickListener_notepet = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.notepet.co.kr/"));
            startActivity(intent);
        }
    };

    View.OnClickListener onClickListener_dailyvet = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.dailyvet.co.kr/"));
            startActivity(intent);
        }
    };

    View.OnClickListener onClickListener_parrotcom = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://cafe.naver.com/parrots4s/"));
            startActivity(intent);
        }
    };

    View.OnClickListener onClickListener_engsamo = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://cafe.naver.com/baekparrotlove/"));
            startActivity(intent);
        }
    };

    View.OnClickListener onClickListener_parrotkingdom = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://cafe.naver.com/pkd7/"));
            startActivity(intent);
        }
    };

    View.OnClickListener onClickListener_psamo = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://cafe.naver.com/reptilia/"));
            startActivity(intent);
        }
    };

    View.OnClickListener onClickListener_korrep = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.krsh.co.kr/"));
            startActivity(intent);
        }
    };

    View.OnClickListener onClickListener_thezoocafe = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://cafe.naver.com/insectmaster"));
            startActivity(intent);
        }
    };

    View.OnClickListener onClickListener_hamsterstory = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://cafe.naver.com/littleham"));
            startActivity(intent);
        }
    };

    View.OnClickListener onClickListener_hamsamo = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://cafe.naver.com/myfriendspet"));
            startActivity(intent);
        }
    };

    View.OnClickListener onClickListener_hedge = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://cafe.naver.com/kasibersi"));
            startActivity(intent);
        }
    };

    View.OnClickListener onClickListener_gisamo = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://cafe.naver.com/lovefhr"));
            startActivity(intent);
        }
    };

}