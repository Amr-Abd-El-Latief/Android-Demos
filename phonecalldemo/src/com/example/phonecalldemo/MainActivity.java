package com.example.phonecalldemo;

import android.os.Bundle;
import android.app.Activity;
import android.net.Uri;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		
		
		Button startBtn = (Button) findViewById(R.id.makeCall);
	      startBtn.setOnClickListener(new View.OnClickListener() {
	         public void onClick(View view) {
	         makeCall();
	      }
	      });
		
	}

	
	protected void makeCall() {
	      Log.i("Make call", "");

	      Intent phoneIntent = new Intent(Intent.ACTION_CALL);
	      phoneIntent.setData(Uri.parse("tel:91-800-001-0101"));

	      try {
	         startActivity(phoneIntent);
	         finish();
	         Log.i("Finished making a call...", "");
	      } catch (android.content.ActivityNotFoundException ex) {
	         Toast.makeText(MainActivity.this, 
	         "Call faild, please try again later.", Toast.LENGTH_SHORT).show();
	      }
	   }
	      
	      
	      
	
}
