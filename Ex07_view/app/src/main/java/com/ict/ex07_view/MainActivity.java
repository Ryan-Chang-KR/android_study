package com.ict.ex07_view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editText1, editText2, editText3 ;
    Button button1 ;
    TextView result ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText1 = findViewById(R.id.editText1);
        editText2 = findViewById(R.id.editText2);
        editText3 = findViewById(R.id.editText3);
        button1 = findViewById(R.id.button1);
        result = findViewById(R.id.result);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    int su1 = Integer.parseInt(editText1.getText().toString());
                    int su2 = Integer.parseInt(editText2.getText().toString());
                    String op = editText3.getText().toString();
                    int res = 0;
                    switch (op){
                        case "+" : res = su1+su2 ; break;
                        case "-" : res = su1-su2 ; break;
                        case "*" : res = su1*su2 ; break;
                        case "/" : res = su1/su2 ; break;
                    }
                    result.setText(String.valueOf(res));    
                }catch (Exception e){
                    Toast.makeText(MainActivity.this, "제대로 입력하세요", Toast.LENGTH_SHORT).show();
                }
                
            }
        });
    }
}
