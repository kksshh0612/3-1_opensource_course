package com.practice.android_picture;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {

    private Switch s;
    private RadioGroup rg;
    private ImageView Q_img, R_img, S_img;
    private Button end_btn, return_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("안드로이드 사진보기");

       s = (Switch) findViewById(R.id.switch1);
       rg = (RadioGroup) findViewById(R.id.radioGroup);
       Q_img = (ImageView) findViewById(R.id.Q_img);
       R_img = (ImageView) findViewById(R.id.R_img);
       S_img = (ImageView) findViewById(R.id.S_img);
       end_btn = (Button) findViewById(R.id.end_btn);
       return_btn = (Button) findViewById(R.id.return_btn);

       s.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
           @Override
           public void onCheckedChanged(CompoundButton compoundButton, boolean is_checked) {
               if(is_checked){      //체크 되면 라디오그룹 보여줌
                   rg.setVisibility(View.VISIBLE);
               }
               else{
                   rg.setVisibility(View.INVISIBLE);
               }
           }
       });
       rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
           @Override
           public void onCheckedChanged(RadioGroup radioGroup, int i) {
               switch (i){
                   case R.id.Q_rb:{
                       Q_img.setVisibility(View.VISIBLE);
                       R_img.setVisibility(View.INVISIBLE);
                       S_img.setVisibility(View.INVISIBLE);
                       break;
                   }
                   case R.id.R_rb:{
                       Q_img.setVisibility(View.INVISIBLE);
                       R_img.setVisibility(View.VISIBLE);
                       S_img.setVisibility(View.INVISIBLE);
                       break;
                   }
                   case R.id.S_rb:{
                       Q_img.setVisibility(View.INVISIBLE);
                       R_img.setVisibility(View.INVISIBLE);
                       S_img.setVisibility(View.VISIBLE);
                       break;
                   }
               }
           }
       });
       end_btn.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               moveTaskToBack(true); // 태스크를 백그라운드로 이동
               finishAndRemoveTask(); // 액티비티 종료 + 태스크 리스트에서 지우기
               android.os.Process.killProcess(android.os.Process.myPid()); // 앱 프로세스 종료
           }
       });
    }
}