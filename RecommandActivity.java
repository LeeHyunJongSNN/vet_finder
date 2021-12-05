package com.vetfinder.animal_hospital_finder;

import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class RecommandActivity extends AppCompatActivity {

    Button back;
    TextView mail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recommand);

        back=findViewById(R.id.back_to_main);
        back.setOnClickListener(onClickListener_back);
        mail=findViewById(R.id.mail);
        mail.setOnClickListener(onClickListener_send);
        mail.setPaintFlags(mail.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
    }

    View.OnClickListener onClickListener_back = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(intent);
        }
    };

    View.OnClickListener onClickListener_send = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent email = new Intent(Intent.ACTION_SEND);
            email.setType("plain/text");
            String[] address = {"hetzer44@naver.com"};
            email.putExtra(Intent.EXTRA_EMAIL, address);
            email.putExtra(Intent.EXTRA_SUBJECT, "스페셜 펫 건의사항");
            email.putExtra(Intent.EXTRA_TEXT, "스페셜 펫에 대한 건의사항을 자유롭게 적어주세요");
            startActivity(email);
        }
    };
}