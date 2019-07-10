package com.ict.ex10_view;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    CheckBox checkBox1, checkBox2;
    ToggleButton toggleButton1;
    Switch switch1;
    TextView textView1, textView2, textView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        checkBox1 = findViewById(R.id.checkBox);
        checkBox2 = findViewById(R.id.checkBox2);
        toggleButton1 = findViewById(R.id.toggleButton);
        switch1 = findViewById(R.id.switch1);
        textView1 = findViewById(R.id.textView);
        textView2 = findViewById(R.id.textView2);
        textView3 = findViewById(R.id.textView3);

        // 체크박스, 토글버튼, 스위치 모두 같은 리스너를 사용한다.
        checkBox1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    textView1.setTextSize(50);
                }else{
                    textView1.setTextSize(25);
                }
            }
        });
        checkBox2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    textView1.setTextColor(Color.RED);
                }else{
                    textView1.setTextColor(Color.GRAY);
                }
            }
        });
        toggleButton1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    textView2.setTextColor(Color.RED);
                    textView2.setTextSize(50);
                }else{
                    textView2.setTextColor(Color.GRAY);
                    textView2.setTextSize(25);
                }
            }
        });
        switch1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    textView3.setText("대한민국 서울");
                }else{
                    textView3.setText("KOREA SEOUL");

                }
            }
        });
    }
}
