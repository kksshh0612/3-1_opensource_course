package com.practice.project5_1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

//xml 없이 코딩하기
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);       //xml 적용 X
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT);
        LinearLayout baselayout = new LinearLayout(this);
        baselayout.setOrientation(LinearLayout.VERTICAL);
        baselayout.setBackgroundColor(Color.rgb(0,255,255));
        setContentView(baselayout,params);

        Button btn = new Button(this);
        btn.setText("버튼");
        btn.setBackgroundColor(Color.MAGENTA);
        baselayout.addView(btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "XML없이 코드로 생성한 버튼", Toast.LENGTH_SHORT).show();
            }
        });
    }
}