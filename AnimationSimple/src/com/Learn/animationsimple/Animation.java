package com.Learn.animationsimple;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class Animation extends Activity {

	
	MyBringBack ourview ;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		ourview = new MyBringBack(this);
		
		//setContentView(R.layout.activity_animation);
		
		setContentView(ourview);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_animation, menu);
		return true;
	}

}
