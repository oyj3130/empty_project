package com.ocom.empty_project;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    //각 객체들을 저장하기 위해 변수 선언
    EditText texturl;

    private Button btn1;
    private Button btn2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //User Code
        btn1 = (Button)findViewById(R.id.button);
        btn2 = (Button)findViewById(R.id.button2);

        //https://kalsweb.tistory.com/88
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("yoon", "btn1 setOnClickListener Test Code");
                Intent intent = new Intent(v.getContext(), MainActivity_sub.class);
                startActivity(intent);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("yoon", "btn2 setOnClickListener Test Code");
                //사용자 입력 URL 값 가져오기
                texturl = findViewById(R.id.edittexturl);
                String sendurl = texturl.getText().toString();

                Intent intent = new Intent(v.getContext(), WebViewActivity.class);
                //사용자 입력 URL을 indent로 넘기기
                intent.putExtra("inputurl", sendurl);
                startActivity(intent);

                /*
                https://www.google.co.kr/search?q=
                https://www.bing.com/search?q=
                https://search.naver.com/search.naver?query=
                https://search.daum.net/search?w=tot&q=
                 */
            }
        });
    }



/*
    public void onbtnclick(View v) {

        Log.d("yoon", "onbtnclick");
        Toast.makeText(this, "저는 오오이에요.", Toast.LENGTH_LONG).show(); // Toast는 간단한 메세지를 잠깐 보여주는 역할을 수행한다.
        Intent intent = new Intent(this, MainActivity_sub.class);
        startActivity(intent);
    }


    public void oninternetbtnclick(View v) {

        //사용자 입력 URL 값 가져오기
        texturl = findViewById(R.id.edittexturl);
        String sendurl = texturl.getText().toString();

        Intent intent = new Intent(this, WebViewActivity.class);
        //사용자 입력 URL을 indent로 넘기기
        intent.putExtra("inputurl", sendurl);
        startActivity(intent);

        //https://www.google.co.kr/search?q=
        //https://www.bing.com/search?q=
        //https://search.naver.com/search.naver?query=
        //https://search.daum.net/search?w=tot&q=

    }
*/
}