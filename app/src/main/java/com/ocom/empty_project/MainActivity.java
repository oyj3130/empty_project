package com.ocom.empty_project;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    //각 객체들을 저장하기 위해 변수 선언
    EditText texturl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onbtnclick(View v) {
        /*
        Log.e(String, String) - (ERROR)
        Log.w(String, String) - (WARNING)
        Log.i(String, String) - (INFO)
        Log.d(String, String) - (DEBUG)
        Log.v(String, String) - (VERBOSE)
        Log.wtf(String, String) - (ASSERT)
         */
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

        /*
        https://www.google.co.kr/search?q=
        https://www.bing.com/search?q=
        https://search.naver.com/search.naver?query=
        https://search.daum.net/search?w=tot&q=
         */
    }

}