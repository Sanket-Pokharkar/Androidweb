package com.example.webview;



import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.webkit.WebSettings;

import android.webkit.WebView;

import android.webkit.WebViewClient;



public class MainActivity extends AppCompatActivity {



    private WebView webView;



    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);



        webView = findViewById(R.id.webView);



        WebSettings webSettings = webView.getSettings();

        webSettings.setJavaScriptEnabled(true);





        webView.setWebViewClient(new WebViewClient());



        webView.loadUrl("https://www.google.com/");

    }



    // Override the onBackPressed method to handle navigation within the WebView

    @Override

    public void onBackPressed() {

        if (webView.canGoBack()) {

            webView.goBack();

        } else {

            super.onBackPressed();

        }

    }

}