package com.Learn.listviewl;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListViewActivity extends Activity {
	

	   // Array of strings...
	    String[] countryArray = {"India", "Pakistan", "USA", "UK"};

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_list_view);
		
		
		 ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, 
			      R.layout.activity_listview, countryArray);
			      
			      ListView listView = (ListView) findViewById(R.id.country_list);
			      listView.setAdapter(adapter);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_list_view, menu);
		return true;
	}

}
