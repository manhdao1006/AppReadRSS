package com.example.appreadrss;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class NewsActivity extends AppCompatActivity {

    WebView wvTinTuc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);

        wvTinTuc = (WebView) findViewById(R.id.webViewTinTuc);

        Intent intent = getIntent();
        String link = intent.getStringExtra("linkTinTuc");
        wvTinTuc.loadUrl(link);
        wvTinTuc.setWebViewClient(new WebViewClient());
    }
}