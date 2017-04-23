package com.androidcookbook.applifecycle;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.Toast;
public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}
	
	@Override
	protected void onStart() {
	super.onStart();
	
	Toast.makeText(this, "onStart", Toast.LENGTH_SHORT).show();
	}
	@Override
	protected void onResume() {
	super.onResume();
	Toast.makeText(this, "onResume", Toast.LENGTH_SHORT).show();
	}
	@Override
	protected void onRestart() {
	super.onRestart();
	Toast.makeText(this, "onRestart", Toast.LENGTH_SHORT).show();
	}
	
	@Override
	protected void onPause() {
	Toast.makeText(this, "onPause", Toast.LENGTH_SHORT).show();
	super.onPause();
	}
	@Override
	protected void onStop() {
	
	super.onStop();
	Toast.makeText(this, "onStop", Toast.LENGTH_SHORT).show();
	}
	@Override
	protected void onDestroy() {
	Toast.makeText(this, "onDestroy", Toast.LENGTH_SHORT).show();
	super.onDestroy();
	}
	
	

}
