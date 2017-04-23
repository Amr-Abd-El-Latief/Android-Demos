package com.Learn.rating_bar;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.RatingBar.OnRatingBarChangeListener;
import android.widget.TextView;
import android.widget.Toast;


public class Rating_bar extends Activity {


	  private RatingBar ratingBar;
	  private TextView txtRatingValue;
	  private Button btnSubmit;
	 
	
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_rating_bar);
		addListenerOnRatingBar();
		addListenerOnButton();
		
		
		
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_rating_bar, menu);
		return true;
	}

	
	 public void addListenerOnRatingBar() {
		 
			ratingBar = (RatingBar) findViewById(R.id.ratingBar);
			txtRatingValue = (TextView) findViewById(R.id.txtRatingValue);
		 
			//if rating value is changed,
			//display the current rating value in the result (textview) automatically
			ratingBar.setOnRatingBarChangeListener(new OnRatingBarChangeListener() {
				public void onRatingChanged(RatingBar ratingBar, float rating,
					boolean fromUser) {
		 
					txtRatingValue.setText(String.valueOf(rating));
		 
				}
			});
		  }
		 
		  public void addListenerOnButton() {
		 
			ratingBar = (RatingBar) findViewById(R.id.ratingBar);
			btnSubmit = (Button) findViewById(R.id.btnSubmit);
		 
			//if click on me, then display the current rating value.
			btnSubmit.setOnClickListener(new OnClickListener() {
		 
				@Override
				public void onClick(View v) {
		 
					Toast.makeText(Rating_bar.this,
						String.valueOf(ratingBar.getRating()),
							Toast.LENGTH_SHORT).show();
		 
				}
		 
			});
		 
		  }

	
	
	
}
