package com.example.myaapp;

import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import android.webkit.ConsoleMessage;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MyWebViewClient extends WebViewClient {
    
    @Override
    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        if(Uri.parse(url).getHost().endsWith("bdaidu.com")) {
            return false;
        }
     
        
         
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        view.getContext().startActivity(intent);
        return true;
    }
    

	@Override
	public void onPageFinished(WebView view, String url) {
		// TODO Auto-generated method stub
		super.onPageFinished(view, url);
	}
	
    @Override
    public void onReceivedError(WebView view,
            int errorCode,
            String description,
            String failingUrl) {

        Log.e(getClass().toString(), "Error code:  " + errorCode );
        Log.e(getClass().toString(), "Description: " + description);
        Log.e(getClass().toString(), "Failing URL: " + failingUrl);

    }
    
}
