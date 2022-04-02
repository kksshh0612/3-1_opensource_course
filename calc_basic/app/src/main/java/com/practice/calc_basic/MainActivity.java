package com.practice.calc_basic;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText num1_et, num2_et;
    private Button plus_btn, minus_btn, mul_btn, div_btn, mod_btn;
    private TextView result_tv;
    private String num1, num2;
    private int result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("초간단 계산기");

        num1_et = (EditText) findViewById(R.id.num1_et);
        num2_et = (EditText) findViewById(R.id.num2_et);
        plus_btn = (Button) findViewById(R.id.plus_btn);
        minus_btn = (Button) findViewById(R.id.minus_btn);
        mul_btn = (Button) findViewById(R.id.mul_btn);
        div_btn = (Button) findViewById(R.id.div_btn);
        mod_btn = (Button) findViewById(R.id.mod_btn);
        result_tv = (TextView) findViewById(R.id.result_tv);

        plus_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = num1_et.getText().toString();
                num2 = num2_et.getText().toString();
                if(num1.matches("") || num2.matches("")){
                    Toast.makeText(getApplicationContext(),"값을 입력하세요", Toast.LENGTH_SHORT).show();
                }
                result = Integer.parseInt(num1) + Integer.parseInt(num2);
                result_tv.setText("계산결과: " + result);
            }
        });
        minus_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = num1_et.getText().toString();
                num2 = num2_et.getText().toString();
                if(num1.matches("") || num2.matches("")){
                    Toast.makeText(getApplicationContext(),"값을 입력하세요", Toast.LENGTH_SHORT).show();
                }
                result = Integer.parseInt(num1) - Integer.parseInt(num2);
                result_tv.setText("계산결과: " + result);
            }
        });
        mul_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = num1_et.getText().toString();
                num2 = num2_et.getText().toString();
                if(num1.matches("") || num2.matches("")){
                    Toast.makeText(getApplicationContext(),"값을 입력하세요", Toast.LENGTH_SHORT).show();
                }
                result = Integer.parseInt(num1) * Integer.parseInt(num2);
                result_tv.setText("계산결과: " + result);
            }
        });
        div_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = num1_et.getText().toString();
                num2 = num2_et.getText().toString();
                if(num1.matches("") || num2.matches("")){
                    Toast.makeText(getApplicationContext(),"값을 입력하세요", Toast.LENGTH_SHORT).show();
                }
                result = Integer.parseInt(num1) / Integer.parseInt(num2);
                result_tv.setText("계산결과: " + result);
            }
        });
        mod_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = num1_et.getText().toString();
                num2 = num2_et.getText().toString();
                if(num1.matches("") || num2.matches("")){
                    Toast.makeText(getApplicationContext(),"값을 입력하세요", Toast.LENGTH_SHORT).show();
                }
                result = Integer.parseInt(num1) % Integer.parseInt(num2);
                result_tv.setText("계산결과: " + result);
            }
        });

    }
}