package com.ocom.empty_project;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

public class WebViewActivity extends AppCompatActivity {
    private String TAG = WebViewActivity.class.getSimpleName();

    private WebView webView = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);

        webView = (WebView) findViewById(R.id.webview1);

        webView.setWebViewClient(new WebViewClient());  // 새 창 띄우기 않기
        webView.setWebChromeClient(new WebChromeClient());

        webView.getSettings().setLoadWithOverviewMode(true);  // WebView 화면크기에 맞추도록 설정 - setUseWideViewPort 와 같이 써야함
        webView.getSettings().setUseWideViewPort(true);  // wide viewport 설정 - setLoadWithOverviewMode 와 같이 써야함

        webView.getSettings().setSupportZoom(false);  // 줌 설정 여부
        webView.getSettings().setBuiltInZoomControls(false);  // 줌 확대/축소 버튼 여부

        webView.getSettings().setJavaScriptEnabled(true); // 자바스크립트 사용여부
//        webview.addJavascriptInterface(new AndroidBridge(), "android");
        webView.getSettings().setJavaScriptCanOpenWindowsAutomatically(true); // javascript가 window.open()을 사용할 수 있도록 설정
        webView.getSettings().setSupportMultipleWindows(true); // 멀티 윈도우 사용 여부

        webView.getSettings().setDomStorageEnabled(true);  // 로컬 스토리지 (localStorage) 사용여부


        //웹페이지 호출
        //webView.loadUrl("https://www.bing.com");
        //webView.loadUrl("https://www.google.com");
        //webView.loadUrl("https://m.naver.com/");
        //webView.loadUrl("https://www.daum.net/");

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras(); //bundle을 통해 Extra들을 모두 가져온다.
        String inputurl = bundle.getString("inputurl");
        webView.loadUrl(inputurl);
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
        Log.d("yoon", "web onbtnclick");
        webView.setVisibility(View.GONE);
        //WebView.setVisibility(View.GONE);
        //WebView.setVisibility(View.VISIBLE);
    }
}