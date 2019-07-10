package com.ict.ex09_view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editText1, editText2 ;
    RadioGroup rg1 ;
    Button button1 ;
    TextView result ;
    String  op = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText1 = findViewById(R.id.editText1);
        editText2 = findViewById(R.id.editText2);
        rg1 = findViewById(R.id.radioGroup1);
        button1 = findViewById(R.id.button5);
        result = findViewById(R.id.result);

        rg1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i){
                    case R.id.radioButton1 : op="+"; break;
                    case R.id.radioButton2 : op="-"; break;
                    case R.id.radioButton3 : op="*"; break;
                    case R.id.radioButton4 : op="/"; break;
                }
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    int su1 = Integer.parseInt(editText1.getText().toString());
                    int su2 = Integer.parseInt(editText2.getText().toString());
                    editText1.setText("");
                    editText2.setText("");
                    rg1.clearCheck();
                    int res = 0;
                    switch (op){
                        case "+" : res = su1+su2 ; break;
                        case "-" : res = su1-su2 ; break;
                        case "*" : res = su1*su2 ; break;
                        case "/" : res = su1/su2 ; break;
                    }
                    result.setText(String.valueOf(res));
                }catch (Exception e){
                    Toast.makeText(MainActivity.this, "제대로 입력해 주세요", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}

