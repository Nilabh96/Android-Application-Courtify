package com.webtek.ghy_hc;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

import com.webtek.ghy_hc.R;

/**
 * Created by Nilabh on 05-04-2018.
 */

public class judg extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_judg);
        WebView WebView1 = (WebView) findViewById(R.id.WebView1);
        WebSettings webSettings = WebView1.getSettings();
        webSettings.setJavaScriptEnabled(true);
        WebView1.loadUrl("http://ghconline.gov.in/ORDJDMT.html");
    }
    };
