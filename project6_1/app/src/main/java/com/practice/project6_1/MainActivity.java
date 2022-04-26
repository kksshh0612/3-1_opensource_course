package com.practice.project6_1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.Chronometer;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Chronometer chronometer;
    private Button start_btn, complete_btn;
    private RadioGroup rg;
    private CalendarView cv;
    private TimePicker timepicker;
    private TextView result_tv;
    private String result_time, result_date;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("시간예약");

        chronometer = findViewById(R.id.chronometer);
        start_btn = findViewById(R.id.start_btn);
        complete_btn = findViewById(R.id.complete_btn);
        rg = findViewById(R.id.rg);
        cv = findViewById(R.id.cv);
        timepicker = findViewById(R.id.timepicker);
        result_tv = findViewById(R.id.result_tv);


        start_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chronometer.setBase(SystemClock.elapsedRealtime());     //시간 초기화
                chronometer.start();            //스타트 버튼 누르면 크로노미터 스타트
            }
        });
        complete_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chronometer.stop();             //크로노미터 스탑.
                //예약 날짜 시간 출력 구현하기
                result_tv.setText(result_date + result_time);
            }
        });

        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if(i==R.id.date_rb){
                    cv.setVisibility(View.VISIBLE);
                    timepicker.setVisibility(View.INVISIBLE);
                }
                else if(i==R.id.time_rb){
                    cv.setVisibility(View.INVISIBLE);
                    timepicker.setVisibility(View.VISIBLE);
                }
            }
        });

        timepicker.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {
            @Override
            public void onTimeChanged(TimePicker timePicker, int hour, int minute) {
                result_time = hour + "시 " + minute + "분 ";
            }
        });
        cv.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView calendarView, int year, int month, int day) {
                    result_date = year + "년 " + month + "월 " + day + "일 ";
            }
        });

    }
}