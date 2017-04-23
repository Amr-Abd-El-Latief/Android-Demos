package com.Learn.webviewsimple;


import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

	
	
	EditText edittext;
	Button button;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		
		 addListenerOnButton2();
	}

	
	
	
	public void addListenerOnButton2() {
		 
		edittext = (EditText) findViewById (R.id.editText1);	
		
		
		button = (Button) findViewById(R.id.button1);
 
		button.setOnClickListener(new OnClickListener() {
 
	   
			
			
			@Override
			public void onClick(View arg0) {
				//display in short period of time
				//Toast.makeText(getApplicationContext(), edittext.getText(), Toast.LENGTH_SHORT).show();
				 
				Intent intent = new Intent(Intent.ACTION_VIEW, 
					     Uri.parse("http://www.mkyong.com"));
					startActivity(intent);
			}
 
		});
 
	}



	
	
	
	
	
	
	
	
	
	
	
	
}
