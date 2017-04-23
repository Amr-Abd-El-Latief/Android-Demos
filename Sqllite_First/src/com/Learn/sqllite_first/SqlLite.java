package com.Learn.sqllite_first;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.database.SQLException;
import android.util.Log;
import android.view.Menu;

public class SqlLite extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_sql_lite);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_sql_lite, menu);
		return true;
	}
	
	
	public void creat_class()
	{
		try { // creating a database called db and a Table inside it, called
            // userdetails. With username and password as columns.

        Object db = openOrCreateDatabase("UserDetails.db",
        Context.MODE_PRIVATE, null); // optional CursorFactory
        db.execSQL("drop table if exists userdetails");
        db.execSQL("create table userdetails " + " ( username TEXT,"
                + "password TEXT);");

    } catch (SQLException x) {
        x.printStackTrace();
        Log.e(LOG_TAG_NAME, "Database creation error");

    }
		
		
	}

}
