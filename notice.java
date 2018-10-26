package com.webtek.ghy_hc;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

import com.webtek.ghy_hc.R;

/**
 * Created by Nilabh on 05-04-2018.
 */

public class notice extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notice);
        WebView WebView4 = (WebView) findViewById(R.id.WebView5);
        WebSettings webSettings = WebView4.getSettings();
        webSettings.setJavaScriptEnabled(true);
        WebView4.loadUrl("http://ghconline.gov.in/notice.html");
    }
};