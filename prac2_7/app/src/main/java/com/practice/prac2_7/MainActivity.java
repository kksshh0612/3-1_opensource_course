package com.practice.prac2_7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText et;
    private Button btn1, btn2;
    private RadioGroup rg;
    private ImageView img11, img12;
    private String et_line;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et = findViewById(R.id.et_URL);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        rg = findViewById(R.id.radio_group);
        img11 = findViewById(R.id.img_11);
        img12 = findViewById(R.id.img_12);


        btn1.setOnClickListener(new View.OnClickListener() {    //글자 나타내기 버튼 클릭
            @Override
            public void onClick(View view) {
                et_line = et.getText().toString();
                Toast.makeText(getApplicationContext(), et_line, Toast.LENGTH_SHORT).show();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {    //홈페이지 열기 버튼 클릭
            @Override
            public void onClick(View view) {
                et_line = et.getText().toString();
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://" + et_line));     //홈페이지로 인텐트 전송
                startActivity(intent);
            }
        });

        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {    //라디오버튼 이벤트
            @Override
            public void onCheckedChanged(RadioGroup radiogroup, int checked_id) {
                switch (checked_id){
                    case R.id.radio_btn1: {       //11.0 라디오버튼 클릭
                        img11.setVisibility(View.VISIBLE);
                        img12.setVisibility(View.INVISIBLE);
                        break;
                    }
                    case R.id.radio_btn2: {      //12.0 라디오버튼 클릭
                        img11.setVisibility(View.INVISIBLE);
                        img12.setVisibility(View.VISIBLE);
                        break;
                    }
                }
            }
        });
    }
}