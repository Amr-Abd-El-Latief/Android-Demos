package com.Learn.button2;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;
import android.widget.EditText;;
public class MainActivity extends Activity {

	
	Button button;
	EditText edittext;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		addListenerOnButton2();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

	
	public void addListenerOnButton2() {
		 
		edittext = (EditText) findViewById (R.id.editText1);	
		
		
		button = (Button) findViewById(R.id.button1);
 
		button.setOnClickListener(new OnClickListener() {
 
	   
			
			
			@Override
			public void onClick(View arg0) {
				//display in short period of time
				Toast.makeText(getApplicationContext(), edittext.getText(), Toast.LENGTH_SHORT).show();
				 
 
			}
 
		});
 
	}

}
