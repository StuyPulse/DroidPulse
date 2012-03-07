package edu.stuy.droidpulse;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
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
			}
        });
        
		Spinner spinner = (Spinner) findViewById(R.id.robot_spinner);
		ArrayAdapter<CharSequence> spinnerArrayAdapter = ArrayAdapter.createFromResource(
	            this, R.array.robot_array, android.R.layout.simple_spinner_item);
		spinnerArrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		spinner.setAdapter(spinnerArrayAdapter);
		spinner.setOnItemSelectedListener(new RobotSpinnerListener());
    }
}

