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

public class GyeonggiActivity extends AppCompatActivity {

    private AdView mAdView;

    ScrollView gyeonggilist;
    Button back;
    Button topcare;
    Button petpia;
    Button central;
    Button garam;
    Button jm;
    Button ilsan;
    Button grand;
    Button geumjjock;
    Button daw;
    Button oz;
    Button ace;
    Button pogeun;
    Button ilovepet;
    Button gogang;
    Button moms;
    Button hanova;
    Button pole;
    Button pangyo;
    Button daisy;
    Button seoulmedical;
    Button we;
    Button yooljeon;
    Button leejihoon;
    Button daoul;
    Button saebom;
    Button indukwon;
    Button seoulcom;
    Button anyang;
    Button paw;
    Button hanmaeum;
    Button jookjeon;
    Button giheung;
    Button richpet;
    Button haesol;
    Button twentyfive;
    Button charm;
    Button petfield;
    Button suwonhanmaeum;
    Button ansanafrifca;
    Button go_goyang;
    Button go_uijungbu;
    Button go_paju;
    Button go_gimpo;
    Button go_bucheon;
    Button go_ansan;
    Button go_anyang;
    Button go_suwon;
    Button go_yongin;
    Button go_hwasung;
    Button go_osan;
    Button go_peongtaek;
    Button go_gwangjo;
    Button go_seongnam;
    TextView goyang;
    TextView uijungbu;
    TextView paju;
    TextView gimpo;
    TextView bucheon;
    TextView ansan;
    TextView anyangtx;
    TextView suwon;
    TextView yongin;
    TextView hwasung;
    TextView osan;
    TextView pyeongtaek;
    TextView gwangju;
    TextView seongnam;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gyeonggi);

        gyeonggilist=findViewById(R.id.gyeonggilist);
        back = findViewById(R.id.gyeonggi_back_to_main);
        back.setOnClickListener(onClickListener);
        topcare = findViewById(R.id.topcare_vet);
        topcare.setOnClickListener(onClickListener);
        petpia=findViewById(R.id.petpia_vet);
        petpia.setOnClickListener(onClickListener);
        central=findViewById(R.id.central_vet);
        central.setOnClickListener(onClickListener);
        garam = findViewById(R.id.garam_vet);
        garam.setOnClickListener(onClickListener);
        jm = findViewById(R.id.jm_vet);
        jm.setOnClickListener(onClickListener);
        ilsan = findViewById(R.id.ilsan_vet);
        ilsan.setOnClickListener(onClickListener);
        grand = findViewById(R.id.grand_vet);
        grand.setOnClickListener(onClickListener);
        geumjjock = findViewById(R.id.gold_vet);
        geumjjock.setOnClickListener(onClickListener);
        daw=findViewById(R.id.daw_vet);
        daw.setOnClickListener(onClickListener);
        oz=findViewById(R.id.oz_vet);
        oz.setOnClickListener(onClickListener);
        ace=findViewById(R.id.ace_vet);
        ace.setOnClickListener(onClickListener);
        pogeun=findViewById(R.id.pogeun_vet);
        pogeun.setOnClickListener(onClickListener);
        ilovepet=findViewById(R.id.ilovepet_vet);
        ilovepet.setOnClickListener(onClickListener);
        gogang=findViewById(R.id.gogang_vet);
        gogang.setOnClickListener(onClickListener);
        moms=findViewById(R.id.moms_vet);
        moms.setOnClickListener(onClickListener);
        hanova=findViewById(R.id.hanova_vet);
        hanova.setOnClickListener(onClickListener);
        pole=findViewById(R.id.pole_vet);
        pole.setOnClickListener(onClickListener);
        pangyo=findViewById(R.id.pangyo_vet);
        pangyo.setOnClickListener(onClickListener);
        daisy=findViewById(R.id.daisy_vet);
        daisy.setOnClickListener(onClickListener);
        seoulmedical=findViewById(R.id.seoulmedical_vet);
        seoulmedical.setOnClickListener(onClickListener);
        we=findViewById(R.id.we_vet);
        we.setOnClickListener(onClickListener);
        yooljeon=findViewById(R.id.yooljeon_vet);
        yooljeon.setOnClickListener(onClickListener);
        leejihoon=findViewById(R.id.leejihoon_vet);
        leejihoon.setOnClickListener(onClickListener);
        daoul=findViewById(R.id.daoul_vet);
        daoul.setOnClickListener(onClickListener);
        saebom=findViewById(R.id.saebom_vet);
        saebom.setOnClickListener(onClickListener);
        indukwon=findViewById(R.id.indukwon_vet);
        indukwon.setOnClickListener(onClickListener);
        seoulcom=findViewById(R.id.seoulcom_vet);
        seoulcom.setOnClickListener(onClickListener);
        anyang=findViewById(R.id.anyang_vet);
        anyang.setOnClickListener(onClickListener);
        paw=findViewById(R.id.paw_vet);
        paw.setOnClickListener(onClickListener);
        hanmaeum=findViewById(R.id.hanmaeum_vet);
        hanmaeum.setOnClickListener(onClickListener);
        jookjeon=findViewById(R.id.jookjeon_vet);
        jookjeon.setOnClickListener(onClickListener);
        giheung=findViewById(R.id.giheung_vet);
        giheung.setOnClickListener(onClickListener);
        richpet=findViewById(R.id.richpet_vet);
        richpet.setOnClickListener(onClickListener);
        haesol=findViewById(R.id.haesol_vet);
        haesol.setOnClickListener(onClickListener);
        twentyfive=findViewById(R.id.twentyfive_vet);
        twentyfive.setOnClickListener(onClickListener);
        charm=findViewById(R.id.charm_vet);
        charm.setOnClickListener(onClickListener);
        petfield=findViewById(R.id.petfield_vet);
        petfield.setOnClickListener(onClickListener);
        suwonhanmaeum=findViewById(R.id.suwonhanmaeum_vet);
        suwonhanmaeum.setOnClickListener(onClickListener);
        ansanafrifca=findViewById(R.id.ansanafrica_vet);
        ansanafrifca.setOnClickListener(onClickListener);
        go_goyang=findViewById(R.id.go_goyang);
        go_uijungbu=findViewById(R.id.go_uijungbu);
        go_paju=findViewById(R.id.go_paju);
        go_gimpo=findViewById(R.id.go_gimpo);
        go_bucheon=findViewById(R.id.go_bucheon);
        go_ansan=findViewById(R.id.go_ansan);
        go_anyang=findViewById(R.id.go_anyang);
        go_suwon=findViewById(R.id.go_suwon);
        go_yongin=findViewById(R.id.go_yongin);
        go_hwasung=findViewById(R.id.go_hwasung);
        go_osan=findViewById(R.id.go_osan);
        go_peongtaek=findViewById(R.id.go_pyeongtaek);
        go_gwangjo=findViewById(R.id.go_gwangju);
        go_seongnam=findViewById(R.id.go_seongnam);
        go_goyang.setOnClickListener(onClickListener);
        go_uijungbu.setOnClickListener(onClickListener);
        go_paju.setOnClickListener(onClickListener);
        go_gimpo.setOnClickListener(onClickListener);
        go_bucheon.setOnClickListener(onClickListener);
        go_ansan.setOnClickListener(onClickListener);
        go_anyang.setOnClickListener(onClickListener);
        go_suwon.setOnClickListener(onClickListener);
        go_yongin.setOnClickListener(onClickListener);
        go_hwasung.setOnClickListener(onClickListener);
        go_osan.setOnClickListener(onClickListener);
        go_peongtaek.setOnClickListener(onClickListener);
        go_gwangjo.setOnClickListener(onClickListener);
        go_seongnam.setOnClickListener(onClickListener);
        goyang=findViewById(R.id.goyang);
        uijungbu=findViewById(R.id.uijeongbu);
        paju=findViewById(R.id.paju);
        gimpo=findViewById(R.id.gimpo);
        bucheon=findViewById(R.id.buchun);
        ansan=findViewById(R.id.ansan);
        anyangtx=findViewById(R.id.anyang);
        suwon=findViewById(R.id.soowon);
        yongin=findViewById(R.id.yongin);
        hwasung=findViewById(R.id.hwasung);
        osan=findViewById(R.id.osan);
        pyeongtaek=findViewById(R.id.pyungtaek);
        gwangju=findViewById(R.id.gwangju);
        seongnam=findViewById(R.id.seongnam);

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
            if (v.getId() == R.id.gyeonggi_back_to_main) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }

            else if (v.getId() == R.id.topcare_vet){
                Intent intent = new Intent(getApplicationContext(), VetTopcareActivity.class);
                startActivity(intent);
            }

            else if (v.getId() == R.id.petpia_vet){
                Intent intent = new Intent(getApplicationContext(), VetPetpiaActivity.class);
                startActivity(intent);
            }

            else if (v.getId() == R.id.central_vet){
                Intent intent = new Intent(getApplicationContext(), VetCentralActivity.class);
                startActivity(intent);
            }

            else if (v.getId() == R.id.garam_vet){
                Intent intent = new Intent(getApplicationContext(), VetGaramActivity.class);
                startActivity(intent);
            }

            else if (v.getId() == R.id.jm_vet){
                Intent intent = new Intent(getApplicationContext(), VetJmActivity.class);
                startActivity(intent);
            }

            else if (v.getId() == R.id.ilsan_vet){
                Intent intent = new Intent(getApplicationContext(), VetIlsanActivity.class);
                startActivity(intent);
            }

            else if (v.getId() == R.id.grand_vet){
                Intent intent = new Intent(getApplicationContext(), VetGrandActivity.class);
                startActivity(intent);
            }

            else if (v.getId() == R.id.gold_vet){
                Intent intent = new Intent(getApplicationContext(), VetGeumjjockActivity.class);
                startActivity(intent);
            }

            else if (v.getId() == R.id.daw_vet){
                Intent intent = new Intent(getApplicationContext(), VetDawActivity.class);
                startActivity(intent);
            }

            else if (v.getId() == R.id.oz_vet){
                Intent intent = new Intent(getApplicationContext(), VetOzActivity.class);
                startActivity(intent);
            }

            else if (v.getId() == R.id.ace_vet){
                Intent intent = new Intent(getApplicationContext(), VetAceActivity.class);
                startActivity(intent);
            }

            else if (v.getId() == R.id.pogeun_vet){
                Intent intent = new Intent(getApplicationContext(), VetPogeunActivity.class);
                startActivity(intent);
            }

            else if (v.getId() == R.id.ilovepet_vet){
                Intent intent = new Intent(getApplicationContext(), VetIlovepetActivity.class);
                startActivity(intent);
            }

            else if (v.getId() == R.id.gogang_vet){
                Intent intent = new Intent(getApplicationContext(), VetGogangActivity.class);
                startActivity(intent);
            }

            else if (v.getId() == R.id.moms_vet){
                Intent intent = new Intent(getApplicationContext(), VetMomsActivity.class);
                startActivity(intent);
            }

            else if (v.getId() == R.id.hanova_vet){
                Intent intent = new Intent(getApplicationContext(), VetHanovaActivity.class);
                startActivity(intent);
            }

            else if (v.getId() == R.id.pole_vet){
                Intent intent = new Intent(getApplicationContext(), VetPoleActivity.class);
                startActivity(intent);
            }

            else if (v.getId() == R.id.pangyo_vet){
                Intent intent = new Intent(getApplicationContext(), VetPangyoActivity.class);
                startActivity(intent);
            }

            else if (v.getId() == R.id.suwonhanmaeum_vet){
                Intent intent = new Intent(getApplicationContext(), VetSuwonhanmaeumActivity.class);
                startActivity(intent);
            }

            else if (v.getId() == R.id.daisy_vet){
                Intent intent = new Intent(getApplicationContext(), VetDaisyActivity.class);
                startActivity(intent);
            }

            else if (v.getId() == R.id.seoulmedical_vet){
                Intent intent = new Intent(getApplicationContext(), VetSeoulmedicalActivity.class);
                startActivity(intent);
            }

            else if (v.getId() == R.id.we_vet){
                Intent intent = new Intent(getApplicationContext(), VetWeActivity.class);
                startActivity(intent);
            }

            else if (v.getId() == R.id.yooljeon_vet){
                Intent intent = new Intent(getApplicationContext(), VetYooljeonActivity.class);
                startActivity(intent);
            }

            else if (v.getId() == R.id.leejihoon_vet){
                Intent intent = new Intent(getApplicationContext(), VetLeejihoonActivity.class);
                startActivity(intent);
            }

            else if (v.getId() == R.id.daoul_vet){
                Intent intent = new Intent(getApplicationContext(), VetDaoulActivity.class);
                startActivity(intent);
            }

            else if (v.getId() == R.id.saebom_vet){
                Intent intent = new Intent(getApplicationContext(), VetSaebomActivity.class);
                startActivity(intent);
            }

            else if (v.getId() == R.id.indukwon_vet){
                Intent intent = new Intent(getApplicationContext(), VetIndukwonActivity.class);
                startActivity(intent);
            }

            else if (v.getId() == R.id.seoulcom_vet){
                Intent intent = new Intent(getApplicationContext(), VetSeoulcomActivity.class);
                startActivity(intent);
            }

            else if (v.getId() == R.id.anyang_vet){
                Intent intent = new Intent(getApplicationContext(), VetAnyangActivity.class);
                startActivity(intent);
            }

            else if (v.getId() == R.id.paw_vet){
                Intent intent = new Intent(getApplicationContext(), VetPawActivity.class);
                startActivity(intent);
            }

            else if (v.getId() == R.id.hanmaeum_vet){
                Intent intent = new Intent(getApplicationContext(), VetHanmaeumActivity.class);
                startActivity(intent);
            }

            else if (v.getId() == R.id.jookjeon_vet){
                Intent intent = new Intent(getApplicationContext(), VetJookjeonActivity.class);
                startActivity(intent);
            }

            else if (v.getId() == R.id.giheung_vet){
                Intent intent = new Intent(getApplicationContext(), VetGiheungActivity.class);
                startActivity(intent);
            }

            else if (v.getId() == R.id.richpet_vet){
                Intent intent = new Intent(getApplicationContext(), VetRichpetActivity.class);
                startActivity(intent);
            }

            else if (v.getId() == R.id.haesol_vet){
                Intent intent = new Intent(getApplicationContext(), VetHaesolActivity.class);
                startActivity(intent);
            }

            else if (v.getId() == R.id.ansanafrica_vet){
                Intent intent = new Intent(getApplicationContext(), VetAnsanafricaActivity.class);
                startActivity(intent);
            }

            else if (v.getId() == R.id.twentyfive_vet){
                Intent intent = new Intent(getApplicationContext(), VetTwnetyfiveActivity.class);
                startActivity(intent);
            }

            else if (v.getId() == R.id.charm_vet){
                Intent intent = new Intent(getApplicationContext(), VetCharmActivity.class);
                startActivity(intent);
            }

            else if (v.getId() == R.id.petfield_vet){
                Intent intent = new Intent(getApplicationContext(), VetPetfieldActivity.class);
                startActivity(intent);
            }

            else if (v.getId() == R.id.go_goyang) {
                scrollToView(goyang,gyeonggilist,0);
            }

            else if (v.getId() == R.id.go_paju) {
                scrollToView(paju,gyeonggilist,0);
            }

            else if (v.getId() == R.id.go_uijungbu) {
                scrollToView(uijungbu,gyeonggilist,0);
            }

            else if (v.getId() == R.id.go_gimpo) {
                scrollToView(gimpo,gyeonggilist,0);
            }

            else if (v.getId() == R.id.go_bucheon) {
                scrollToView(bucheon,gyeonggilist,0);
            }

            else if (v.getId() == R.id.go_ansan) {
                scrollToView(ansan,gyeonggilist,0);
            }

            else if (v.getId() == R.id.go_anyang) {
                scrollToView(anyangtx,gyeonggilist,0);
            }

            else if (v.getId() == R.id.go_suwon) {
                scrollToView(suwon,gyeonggilist,0);
            }

            else if (v.getId() == R.id.go_yongin) {
                scrollToView(yongin,gyeonggilist,0);
            }

            else if (v.getId() == R.id.go_hwasung) {
                scrollToView(hwasung,gyeonggilist,0);
            }

            else if (v.getId() == R.id.go_osan) {
                scrollToView(osan,gyeonggilist,0);
            }

            else if (v.getId() == R.id.go_pyeongtaek) {
                scrollToView(pyeongtaek,gyeonggilist,0);
            }

            else if (v.getId() == R.id.go_gwangju) {
                scrollToView(gwangju,gyeonggilist,0);
            }

            else if (v.getId() == R.id.go_seongnam) {
                scrollToView(seongnam,gyeonggilist,0);
            }
        }
    };
}