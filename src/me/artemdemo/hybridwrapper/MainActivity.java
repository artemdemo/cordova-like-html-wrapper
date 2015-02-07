package me.artemdemo.hybridwrapper;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity extends Activity {

	@SuppressLint("SetJavaScriptEnabled")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		WebView wbMain = (WebView) findViewById(R.id.webViewMain);
		wbMain.loadUrl("file:///android_asset/index.html");
		wbMain.getSettings().setJavaScriptEnabled (true);
		wbMain.getSettings().setAllowFileAccessFromFileURLs(true);
		wbMain.getSettings().setAllowUniversalAccessFromFileURLs(true);
	}
}
