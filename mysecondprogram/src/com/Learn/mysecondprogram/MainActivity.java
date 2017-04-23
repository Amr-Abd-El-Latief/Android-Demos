package com.Learn.mysecondprogram;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;
 
public class MainActivity extends Activity {
 
	Button button10;
	Button button20;
	
	public void onCreate(Bundle savedInstanceState) {
 
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
 
		button10 = (Button) findViewById(R.id.button1);
		button20 = (Button) findViewById(R.id.button5);
		
		button20.setOnClickListener(new OnClickListener() {
			public void onClick(View arg1) {
				 
			     Toast.makeText(getApplicationContext(), 
                              "Left", Toast.LENGTH_SHORT).show();}});
		
		
		button10.setOnClickListener(new OnClickListener() {
 
			  @Override
			  public void onClick(View arg0) {
 
			     Toast.makeText(getApplicationContext(), 
                               "Right", 10).show();
 
			  }}
				);
		
		
		
		
	}
}
