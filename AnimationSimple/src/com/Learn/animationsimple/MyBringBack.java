package com.Learn.animationsimple;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;

public class MyBringBack extends View {

	Bitmap bBall;
	float changingy;
	
	public MyBringBack(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
		
		bBall = BitmapFactory.decodeResource(getResources(), R.drawable.ic_launcher);
		changingy=0;
	}

	@Override
	protected void onDraw(Canvas canvas) {
		// TODO Auto-generated method stub
		super.onDraw(canvas);
		
		canvas.drawColor(Color.WHITE);
		canvas.drawBitmap(bBall, (canvas.getWidth()/2), changingy, null);
	if(changingy<canvas.getHeight())
		changingy += 10;
	else
		changingy=0;
	Rect middleRect = new Rect();
	Paint myyellow = new Paint();
	
	middleRect. set(0, 400,canvas.getWidth(), 550);
	
	myyellow.setColor(Color.YELLOW);
	canvas.drawRect(middleRect, myyellow);
	
	invalidate();
	
	}

	
	
	
	

}
