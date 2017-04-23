package com.Learn.listview;


import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;


import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class MainActivity extends ListActivity {



	   // Array of strings...
	    String[] FRUITS = { "Apple", "Avocado", "Banana",
				"Blueberry", "Coconut", "Durian", "Guava", "Kiwifruit",
				"Jackfruit", "Mango", "Olive", "Pear", "Sugar-apple" };
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	//	setContentView(R.layout.activity_main);
		
		
		
		// no more this
				// setContentView(R.layout.list_fruit);
		 
				setListAdapter(new ArrayAdapter<String>(this, R.layout.activity_main,FRUITS));
		 
				ListView listView = getListView();
				listView.setTextFilterEnabled(true);
		 
				listView.setOnItemClickListener(new OnItemClickListener() {
					public void onItemClick(AdapterView<?> parent, View view,
						int position, long id) {
					    // When clicked, show a toast with the TextView text
					    Toast.makeText(getApplicationContext(),
						((TextView) view).getText(), Toast.LENGTH_SHORT).show();
				
					}
			});

				}
				
				
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

}
