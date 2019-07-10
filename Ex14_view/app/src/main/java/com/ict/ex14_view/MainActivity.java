package com.ict.ex14_view;

import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    CheckBox chk;
    TextView tv1;
    RadioGroup rg;
    Button btn1;
    ImageView iv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        chk = findViewById(R.id.chk);
        tv1 = findViewById(R.id.tv1);
        rg = findViewById(R.id.rg);
        btn1 = findViewById(R.id.btn1);
        iv = findViewById(R.id.iv);

        chk.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    tv1.setVisibility(TextView.VISIBLE);
                    rg.setVisibility(RadioGroup.VISIBLE);
                    btn1.setVisibility(Button.VISIBLE);
                    iv.setVisibility(ImageView.VISIBLE);
                }else{
                    tv1.setVisibility(TextView.INVISIBLE);
                    rg.setVisibility(RadioGroup.INVISIBLE);
                    btn1.setVisibility(Button.INVISIBLE);
                    iv.setVisibility(ImageView.INVISIBLE);
                    // 초기화 방법
                    iv.setImageResource(0);
                    rg.clearCheck();
                }
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (rg.getCheckedRadioButtonId()){
                    case R.id.radio1 : iv.setImageResource(R.drawable.boy);  break;
                    case R.id.radio2 : iv.setImageResource(R.drawable.coffe); break;
                    case R.id.radio3 : iv.setImageBitmap(BitmapFactory.decodeResource(getResources(),R.drawable.dog));   break;
                    case R.id.radio4 : iv.setImageBitmap(BitmapFactory.decodeResource(getResources(),R.drawable.donald)); break;
                    default:
                        Toast.makeText(MainActivity.this, "선택하고 누르세요", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
