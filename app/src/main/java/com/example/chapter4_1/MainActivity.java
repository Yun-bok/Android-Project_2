package com.example.chapter4_1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvString1,tvString2,tvString3 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("텍스트뷰 연습하기");//앱 제목 바꾸기

        tvString1 = (TextView)findViewById(R.id.tvString1); // view의 아이디를 받아오기
        tvString2 = (TextView)findViewById(R.id.tvString2);
        tvString3 = (TextView)findViewById(R.id.tvString3);

        tvString1.setTextColor(Color.BLUE); // 1번의 색갈 지정
        tvString1.setTextSize(50); // 1번의 글자 사이즈 지정
        tvString2.setSingleLine(); // 2번의 글자가 길어져도 다음줄로 안넘어가는 single Line 지정
        tvString3.setTypeface(Typeface.SANS_SERIF, Typeface.BOLD_ITALIC);//3번의 글씨체 지정
        tvString3.setBackgroundColor(Color.YELLOW);//3번 백그라운드 컬러를 지정하는 코드드
    }
}