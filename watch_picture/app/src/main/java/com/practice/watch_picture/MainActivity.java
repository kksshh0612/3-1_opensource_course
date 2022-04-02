package com.practice.watch_picture;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private CheckBox start_cb;
    private RadioGroup pet_rg;
    private Button select_btn;
    private ImageView puppy_img, cat_img, rabbit_img;
    private int radio_val;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("애완동물보기");

        start_cb = (CheckBox) findViewById(R.id.start_cb);
        pet_rg = (RadioGroup) findViewById(R.id.pet_rg);
        select_btn = (Button) findViewById(R.id.select_btn);
        puppy_img = (ImageView) findViewById(R.id.puppy_img);
        cat_img = (ImageView) findViewById(R.id.cat_img);
        rabbit_img = (ImageView) findViewById(R.id.rabbit_img);

        start_cb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(start_cb.isChecked()){       //시작함 체크박스가 체크되면
                    pet_rg.setVisibility(View.VISIBLE);
                }
                else{
                    pet_rg.setVisibility(View.INVISIBLE);
                }
            }
        });
        pet_rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i){
                    case R.id.puppy_rb: {
                        radio_val = 1;
                        break;
                    }
                    case R.id.cat_rb: {
                        radio_val = 2;
                        break;
                    }
                    case R.id.rabbit_rb: {
                        radio_val = 3;
                        break;
                    }
                }
            }
        });
        select_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (radio_val){
                    case 1: {
                        puppy_img.setVisibility(View.VISIBLE);
                        cat_img.setVisibility(View.INVISIBLE);
                        rabbit_img.setVisibility(View.INVISIBLE);
                        break;
                    }
                    case 2: {
                        puppy_img.setVisibility(View.INVISIBLE);
                        cat_img.setVisibility(View.VISIBLE);
                        rabbit_img.setVisibility(View.INVISIBLE);
                        break;
                    }
                    case 3: {
                        puppy_img.setVisibility(View.INVISIBLE);
                        cat_img.setVisibility(View.INVISIBLE);
                        rabbit_img.setVisibility(View.VISIBLE);
                        break;
                    }
                }
            }
        });

    }
}