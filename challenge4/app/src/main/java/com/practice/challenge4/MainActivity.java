package com.practice.challenge4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    private EditText input_et;
    private TextView length_tv;
    private Button send_btn, close_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input_et = findViewById(R.id.input_et);
        length_tv = findViewById(R.id.length_tv);
        send_btn = findViewById(R.id.send_btn);
        close_btn = findViewById(R.id.close_btn);

        input_et.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                String input = input_et.getText().toString();       //글자 가져와서
                length_tv.setText(input.length() + "/80 글자수");      //길이 구함
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        send_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), input_et.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });

        close_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.this.finish();
            }
        });
    }
}