package edu.stuy.droidpulse;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.Toast;

public class RobotSpinnerListener implements OnItemSelectedListener {
	public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
	      Toast.makeText(parent.getContext(), "The robot is " +
	          parent.getItemAtPosition(pos).toString(), Toast.LENGTH_LONG).show();
	    }

	    public void onNothingSelected(AdapterView<?> parent) {
	      // Do nothing.
	    }
}
