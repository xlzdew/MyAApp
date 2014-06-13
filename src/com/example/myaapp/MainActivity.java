package com.example.myaapp;

import com.example.myaapp.R;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ActionBar;
import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.os.Build;

//@SuppressLint("SetJavaScriptEnabled")
public class MainActivity extends Activity {

	private WebView mWebView;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
	 mWebView  = (WebView) findViewById(R.id.activity_main_webview1);
	// Enable Javascript
	 WebSettings webSettings = mWebView.getSettings();
	 webSettings.setJavaScriptEnabled(true);
	// Force links and redirects to open in the WebView instead of in a browser
	// mWebView.setWebViewClient(new WebViewClient());
	// Stop local links and redirects from opening in browser instead of WebView
	    mWebView.setWebViewClient(new MyWebViewClient());
/*	    mWebView.setWebChromeClient(new WebChromeClient() {
	    	  public boolean onConsoleMessage(ConsoleMessage cm) {
	    	    Log.d("MyApplication", cm.message() + " -- From line "
	    	                         + cm.lineNumber() + " of "
	    	                         + cm.sourceId() );
	    	    return true;
	    	  }
	    	});*/
	    
	  mWebView.loadUrl("http://www.baidu.com/");
//	 mWebView.loadUrl("file:///android_asset/www/index.html");
	}
	
    @Override
    public void onBackPressed() {
        if(mWebView.canGoBack()) {
            mWebView.goBack();
        } else {
            super.onBackPressed();
        }
    }


}
