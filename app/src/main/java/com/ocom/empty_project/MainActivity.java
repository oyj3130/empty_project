package com.ocom.empty_project;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onbtnclick(View v) {
        Toast.makeText(this, "저는 오오이에요.", Toast.LENGTH_LONG).show(); // Toast는 간단한 메세지를 잠깐 보여주는 역할을 수행한다.
        Intent intent = new Intent(this, MainActivity_sub.class);
        startActivity(intent);
    }
    public void oninternetbtnclick(View v) {

        Intent intent = new Intent(this, WebViewActivity.class);
        startActivity(intent);
    }

}