package com.practice.project5_5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText first_et, second_et;
    private Button[] num_btn = new Button[10];       //0-9까지 버튼 배열
    private Integer[] num_btn_id = {R.id.btn0, R.id.btn1, R.id.btn2, R.id.btn3, R.id.btn4, R.id.btn5, R.id.btn6, R.id.btn7, R.id.btn8, R.id.btn9 };
    private Button plus_btn, minus_btn, mul_btn, div_btn;
    private TextView result_tv;
    private String num1, num2;
    private int result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        first_et = findViewById(R.id.first_et);
        second_et = findViewById(R.id.second_et);
        plus_btn = findViewById(R.id.plus_btn);
        minus_btn = findViewById(R.id.minus_btn);
        mul_btn = findViewById(R.id.mul_btn);
        div_btn = findViewById(R.id.div_btn);
        result_tv = findViewById(R.id.result_tv);

        for(int i=0; i<10; i++){        //버튼 배열에 id값 찾아서 적용하고 actionlistener 적용
            num_btn[i] = findViewById(num_btn_id[i]);       //버튼 대입
            final int idx = i;
            num_btn[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(first_et.isFocused()){
                        num1 = first_et.getText().toString() + num_btn[idx].getText().toString();
                        first_et.setText(num1);
                    }
                    else if(second_et.isFocused()){
                        num2 = second_et.getText().toString() + num_btn[idx].getText().toString();
                        second_et.setText(num2);
                    }
                    else{
                        Toast.makeText(getApplicationContext(), "Edittext를 선택하시오", Toast.LENGTH_SHORT).show();
                    }

                }
            });
        }

        plus_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result = Integer.parseInt(first_et.getText().toString()) + Integer.parseInt(second_et.getText().toString());
                result_tv.setText(String.valueOf(result));
            }
        });
        minus_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result = Integer.parseInt(first_et.getText().toString()) - Integer.parseInt(second_et.getText().toString());
                result_tv.setText(String.valueOf(result));
            }
        });
        mul_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result = Integer.parseInt(first_et.getText().toString()) * Integer.parseInt(second_et.getText().toString());
                result_tv.setText(String.valueOf(result));
            }
        });
        div_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result = Integer.parseInt(first_et.getText().toString()) / Integer.parseInt(second_et.getText().toString());
                result_tv.setText(String.valueOf(result));
            }
        });



    }
}