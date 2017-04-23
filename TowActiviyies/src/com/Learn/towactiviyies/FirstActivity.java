package com.Learn.towactiviyies;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.content.Intent;
import android.widget.Button;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;

public class FirstActivity extends Activity {
	
	
	Button button;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_first);
		
		addListenerOnButton();
	}

	
	public void addListenerOnButton() {
		 
 
		button = (Button) findViewById(R.id.button1);
 
		button.setOnLongClickListener(new OnLongClickListener() {
 
			@Override
			public boolean onLongClick(View arg0) {
 
			    Intent intent1 = new Intent(getApplicationContext(), Second.class);
                            startActivity(intent1);   
 return true;
                         
			}
 
		});
 
	}
	
	
	
}
