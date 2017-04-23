package com.Educate.button;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;
import android.view.View;
import android.view.View.OnClickListener;
public class Button_Activity extends Activity {
	
	Button button;
	Button button2;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_button_);
		
		addListenerOnButton();
		addListenerOnButton2();
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_button_, menu);
		return true;
	}
	
	
	public void addListenerOnButton() {
		 
		button = (Button) findViewById(R.id.button1);
 
		button.setOnClickListener(new OnClickListener() {
 
			@Override
			public void onClick(View arg0) {
 
			  Intent browserIntent = 
                            new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.mkyong.com"));
			    startActivity(browserIntent);
 
			}
 
		});
 
	}
	
	
	public void addListenerOnButton2() {
		 
		button2 = (Button) findViewById(R.id.button_amr);
 
		button2.setOnClickListener(new OnClickListener() {
 
			@Override
			public void onClick(View arg0) {
				//display in short period of time
				Toast.makeText(getApplicationContext(), "Fourth Computer", Toast.LENGTH_SHORT).show();
				 
 
			}
 
		});
 
	}

}


