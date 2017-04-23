package com.Learn.employee;

import android.os.Bundle;

import android.app.ListActivity;
import android.view.Menu;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import android.view.View;
import android.widget.EditText;

import android.widget.SimpleCursorAdapter;
public class MainActivity extends ListActivity {
	
	protected EditText searchText;
	protected SQLiteDatabase db;
	protected Cursor cursor;
	protected ListAdapter adapter;
	protected ListView employeeList;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		 db = (new DatabaseHelper(this)).getWritableDatabase();
	        searchText = (EditText) findViewById (R.id.searchText);
	       
	}

	
	
	@SuppressWarnings("deprecation")
	public void search(View view) {
    	// || is the concatenation operation in SQLite
		cursor = db.rawQuery("SELECT _id, firstName, lastName, title FROM employee WHERE firstName || ' ' || lastName LIKE ?", 
						new String[]{"%" + searchText.getText().toString() + "%"});
		adapter = new SimpleCursorAdapter(
				this, 
				R.layout.employee_list_item, 
				cursor, 
				new String[] {"firstName", "lastName", "title"}, 
				new int[] {R.id.firstName, R.id.lastName, R.id.title});
		employeeList.setAdapter(adapter);
    }
    
	
	  public void onListItemClick(ListView parent, View view, int position, long id) {
	    	Intent intent = new Intent(this, EmployeeDetails.class);
	    	Cursor cursor = (Cursor) adapter.getItem(position);
	    	intent.putExtra("EMPLOYEE_ID", cursor.getInt(cursor.getColumnIndex("_id")));
	    	startActivity(intent);
	    }

}
