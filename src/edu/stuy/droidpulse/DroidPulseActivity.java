package edu.stuy.droidpulse;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class DroidPulseActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        final Button aboutbutton = (Button) findViewById(R.id.welcome_aboutbutton);
        aboutbutton.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				setContentView(R.layout.webview_aboutus);
				WebView webView = (WebView) findViewById(R.id.webview_aboutus);
			    webView.loadUrl("http://stuypulse.com/aboutus");
			    webView.getSettings().setJavaScriptEnabled(true);
			    webView.setWebViewClient(new WebViewClient());
			}
        });
        
        final Button robotbutton = (Button) findViewById(R.id.welcome_robotbutton);
        robotbutton.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
			    setContentView(R.layout.robot);
			    String robots[] = {"2011 - Desdroid","2010 - Donovan","2009 - Michael 1","2008 - Desbot","2007 - Tom","2006 - Joshua","2005 - Yvette"};
			    Spinner spinner = (Spinner) findViewById(R.id.robot_spinner);
			    ArrayAdapter<String> spinnerArrayAdapter = new ArrayAdapter<String>(null, android.R.layout.simple_spinner_item, robots);
			    spinnerArrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
			    spinner.setAdapter(spinnerArrayAdapter);
			}
		});
    }
}