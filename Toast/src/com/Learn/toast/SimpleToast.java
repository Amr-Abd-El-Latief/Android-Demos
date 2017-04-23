package com.Learn.toast;
//package com.Learn.toast;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;


final class SimpleToast extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_simple_toast);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_simple_toast, menu);
		return true;
	}

}
