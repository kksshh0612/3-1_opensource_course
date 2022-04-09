package com.practice.project5_3;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText et;
    Button btn;
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT);
        LinearLayout baselayout = new LinearLayout(this);
        baselayout.setOrientation(LinearLayout.VERTICAL);
        baselayout.setBackgroundColor(Color.rgb(0,255,255));
        setContentView(baselayout,params);

        et = new EditText(this);
        et.setHint("글자 입력");

        btn = new Button(this);
        btn.setText("버튼");
        btn.setBackgroundColor(Color.MAGENTA);

        text = new TextView(this);
        text.setTextColor(Color.rgb(255, 255, 255));
        text.setTextSize(30);

        baselayout.addView(et);
        baselayout.addView(btn);
        baselayout.addView(text);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = et.getText().toString();
                text.setText(str);
            }
        });
    }
}