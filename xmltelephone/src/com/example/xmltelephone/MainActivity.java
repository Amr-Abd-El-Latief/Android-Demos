package com.example.xmltelephone;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import java.io.File;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;
import android.view.View;
import android.view.View.OnClickListener;
public class MainActivity extends Activity {

	Button button;
	Button button2;
	
	
	
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

	
	
	
	
	

	public void addListenerOnButton() {
		 
		button = (Button) findViewById(R.id.button1);
 
		button.setOnClickListener(new OnClickListener() {
 
			@Override
			public void onClick(View arg0) {
 
			  Intent browserIntent = 
                            new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.mkyong.com"));
			    startActivity(browserIntent);
			    
			    SharedPreferences prefs = getSharedPreferences("myDataStorage",
			    		MODE_PRIVATE);
			    		String username = prefs.getString("username", "");
			    		String password = prefs.getString("password", "");
			    		Toast.makeText(getApplicationContext(), username + "  " + password , Toast.LENGTH_SHORT).show();
 
			}
 
		});
 
	}
	
	
	public void addListenerOnButton2() {
		 
		button2 = (Button) findViewById(R.id.button1);
 
		button2.setOnClickListener(new OnClickListener() {
 
			@Override
			public void onClick(View arg0) {
				//display in short period of time
			//	Toast.makeText(getApplicationContext(), "Fourth Computer", Toast.LENGTH_SHORT).show();
				 
				SharedPreferences prefs = getSharedPreferences("myDataStorage",
						MODE_PRIVATE);
						Editor mEditor = prefs.edit();
						mEditor.putString("username","Amr");
						mEditor.putString("password","password1234");
						
						mEditor.commit();
			}
 
		});
 
	}

	
	
	
	
	
}
