package com.vetfinder.animal_hospital_finder;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

public class MainActivity extends AppCompatActivity {

    private AdView mAdView;
    Button cls_app;
    Button go_seoul;
    Button go_gyeonggi;
    Button go_incheon;
    Button go_gangwon;
    Button go_choongchung;
    Button go_gyeongsang;
    Button go_jeonra;
    Button go_daejeon;
    Button go_sejong;
    Button go_daegu;
    Button go_busan;
    Button go_ulsan;
    Button go_gwangju;
    Button go_jeju;
    Button help_me;
    Button animal_info;
    Button more;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cls_app = findViewById(R.id.close_app);
        cls_app.setOnClickListener(onClickListener_clsapp);
        go_seoul = findViewById(R.id.seoul);
        go_seoul.setOnClickListener(onClickListener_seoul);
        go_gyeonggi = findViewById(R.id.gyeonggi);
        go_gyeonggi.setOnClickListener(onClickListener_gyeonggi);
        go_incheon = findViewById(R.id.incheon);
        go_incheon.setOnClickListener(onClickListener_incheon);
        go_gangwon = findViewById(R.id.gangwon);
        go_gangwon.setOnClickListener(onClickListener_gangwon);
        go_choongchung = findViewById(R.id.chooongchung);
        go_choongchung.setOnClickListener(onClickListener_choongchung);
        go_gyeongsang = findViewById(R.id.gyeongsang);
        go_gyeongsang.setOnClickListener(onClickListener_gyeongsang);
        go_jeonra = findViewById(R.id.jeonra);
        go_jeonra.setOnClickListener(onClickListener_jeonra);
        go_daejeon = findViewById(R.id.daejeon);
        go_daejeon.setOnClickListener(onClickListener_daejun);
        go_sejong = findViewById(R.id.sejong);
        go_sejong.setOnClickListener(onClickListener_sejong);
        go_daegu = findViewById(R.id.daegu);
        go_daegu.setOnClickListener(onClickListener_daegu);
        go_busan = findViewById(R.id.busan);
        go_busan.setOnClickListener(onClickListener_busan);
        go_ulsan = findViewById(R.id.ulsan);
        go_ulsan.setOnClickListener(onClickListener_ulsan);
        go_gwangju = findViewById(R.id.gwangju);
        go_gwangju.setOnClickListener(onClickListener_gwangju);
        go_jeju = findViewById(R.id.jeju);
        go_jeju.setOnClickListener(onClickListener_jeju);
        help_me = findViewById(R.id.help);
        help_me.setOnClickListener(onClickListener_help);
        animal_info = findViewById(R.id.information);
        animal_info.setOnClickListener(onClickListener_info);
        more=findViewById(R.id.more);
        more.setOnClickListener(onClickListener_more);


        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });

        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);


    }

    View.OnClickListener onClickListener_seoul = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(), SeoulActivity.class);
            startActivity(intent);
        }
    };

    View.OnClickListener onClickListener_gyeonggi = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(), GyeonggiActivity.class);
            startActivity(intent);
        }
    };

    View.OnClickListener onClickListener_incheon = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(), IncheonActivity.class);
            startActivity(intent);
        }
    };

    View.OnClickListener onClickListener_gangwon = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(), GangwonActivity.class);
            startActivity(intent);
        }
    };

    View.OnClickListener onClickListener_choongchung = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(), ChoongchungActivity.class);
            startActivity(intent);
        }
    };

    View.OnClickListener onClickListener_gyeongsang = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(), GyeongsangActivity.class);
            startActivity(intent);
        }
    };

   View.OnClickListener onClickListener_jeonra =new View.OnClickListener() {
       @Override
       public void onClick(View v) {
           Intent intent = new Intent(getApplicationContext(), JeonraActivity.class);
           startActivity(intent);
       }
   };

   View.OnClickListener onClickListener_daejun = new View.OnClickListener() {
       @Override
       public void onClick(View v) {
           Intent intent = new Intent(getApplicationContext(), DaejunActivity.class);
           startActivity(intent);
       }
   };

    View.OnClickListener onClickListener_sejong = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(), SejongActivity.class);
            startActivity(intent);
        }
    };

   View.OnClickListener onClickListener_daegu = new View.OnClickListener() {
       @Override
       public void onClick(View v) {
           Intent intent = new Intent(getApplicationContext(), DaeguActivity.class);
           startActivity(intent);
       }
   };

   View.OnClickListener onClickListener_busan = new View.OnClickListener() {
       @Override
       public void onClick(View v) {
           Intent intent = new Intent(getApplicationContext(), BusanActivity.class);
           startActivity(intent);
       }
   };

   View.OnClickListener onClickListener_ulsan = new View.OnClickListener() {
       @Override
       public void onClick(View v) {
           Intent intent = new Intent(getApplicationContext(), UlsanActivity.class);
           startActivity(intent);
       }
   };

   View.OnClickListener onClickListener_gwangju = new View.OnClickListener() {
       @Override
       public void onClick(View v) {
           Intent intent = new Intent(getApplicationContext(), GwangjuActivity.class);
           startActivity(intent);
       }
   };

   View.OnClickListener onClickListener_jeju = new View.OnClickListener() {
       @Override
       public void onClick(View v) {
           Intent intent = new Intent(getApplicationContext(), JejuActivity.class);
           startActivity(intent);
       }
   };

   View.OnClickListener onClickListener_info = new View.OnClickListener() {
       @Override
       public void onClick(View v) {
           Intent intent = new Intent(getApplicationContext(), InformationActivity.class);
           startActivity(intent);
       }
   };

   View.OnClickListener onClickListener_help =  new View.OnClickListener() {
       @Override
       public void onClick(View v) {
           Intent intent = new Intent(getApplicationContext(), HelpPopupActivity.class);
           startActivity(intent);
       }
   };

    View.OnClickListener onClickListener_more =  new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(), RecommandActivity.class);
            startActivity(intent);
        }
    };


    View.OnClickListener onClickListener_clsapp = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.close_app:
                    new AlertDialog.Builder(MainActivity.this)
                            .setIcon(R.mipmap.ic_parrot)
                            .setTitle(getResources().getString(R.string.dialog_title))
                            .setMessage(getResources().getString(R.string.close_message))
                            .setNegativeButton(getResources().getString(R.string.dialog_no), new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    Toast.makeText(MainActivity.this,getResources().getString(R.string.dialog_keep), Toast.LENGTH_SHORT).show();
                                }
                            })
                            .setPositiveButton(getResources().getString(R.string.dialog_yes), new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    Toast.makeText(MainActivity.this,getResources().getString(R.string.dialog_cls), Toast.LENGTH_SHORT).show();
                                    finishAffinity();
                                    System.runFinalization();
                                    System.exit(0);
                                }
                            })
                            .show();
                    break;
            }
        }
    };
}