package com.ict.ex11_view;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.GridLayout;
import android.widget.GridView;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView imageView1, imageView2, imageView3,imageView4 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView1 = findViewById(R.id.imageView1);
        imageView2 = findViewById(R.id.imageView2);
        imageView3 = findViewById(R.id.imageView3);
        imageView4 = findViewById(R.id.imageView4);

        // 크기지정
        imageView1.getLayoutParams().width =200;
        imageView1.getLayoutParams().height=200;
        imageView1.requestLayout();

        // 속성이 invisible 일때
        imageView2.setVisibility(View.VISIBLE);
        imageView3.setVisibility(View.VISIBLE);

        // 이미지뷰에 이미지 넣기
        // 방법1)
        // imageView4.setImageBitmap(BitmapFactory.decodeResource(getResources(),R.drawable.donald));

        // 방법2)
        imageView4.setImageResource(R.drawable.donald);
    }
}
