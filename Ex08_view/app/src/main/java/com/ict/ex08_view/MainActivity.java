package com.ict.ex08_view;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    RadioGroup rg1, rg2 ;
    TextView textView1 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rg1 = findViewById(R.id.radioGroup1);
        rg2 = findViewById(R.id.radioGroup2);
        textView1 = findViewById(R.id.textView1);

        rg1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                // int i 는 선택된 라디오버튼 자체이다.
                switch (i){
                    case R.id.radioButton : textView1.setTextColor(Color.RED); break;
                    case R.id.radioButton2 : textView1.setTextColor(Color.GREEN); break;
                    case R.id.radioButton3 : textView1.setTextColor(Color.BLUE); break;
                }
            }
        });
        rg2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                // int i 는 선택된 라디오버튼 자체이다.
                switch (i){
                    case R.id.radioButton4 : textView1.setTextSize(24); break;
                    case R.id.radioButton5 : textView1.setTextSize(36); break;
                    case R.id.radioButton6 : textView1.setTextSize(48); break;
                }
            }
        });
    }
}
