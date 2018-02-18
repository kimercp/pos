package com.kimersoft.pointofsaleterminal.scan;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

import com.kimersoft.pointofsaleterminal.R;

public class ScanInstructionActivity extends Activity {
	
	// 初始化控件
	private WebView webview_readme;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.vp_threepage);
		webview_readme = (WebView) findViewById(R.id.webview_readme);
		webview_readme.loadUrl(getString(R.string.weburl));
	}

}
