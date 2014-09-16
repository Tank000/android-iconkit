package com.tank.iconkit;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.util.Log;

public class IconDrawable extends Drawable {
	private TextPaint paint;
	private int size = 0;
	private String text;
	private int alpha = 255;
	private Rect textBounds;
	private int color = Color.BLACK;
	
	public IconDrawable(Context context, String txt) {
		initView(context, txt);
	}

	public IconDrawable(Context context, int txtId) {
		initView(context, context.getString(txtId));
	}

	
	public void initView(Context ctx,String txt) {
		text = txt;
		paint = new TextPaint();
		paint.setTypeface(Util.getTypeFace(ctx));
		paint.setStyle(Paint.Style.STROKE);
		paint.setTextAlign(Paint.Align.CENTER);
		paint.setUnderlineText(false);
		paint.setAntiAlias(true);
		textBounds = new Rect();
		paint.getTextBounds(txt, 0, 1, textBounds);
		paint.setColor(color);
	}
	
	
	public void setColor(int c) {
		// TODO Auto-generated method stub
		this.color = c;
		paint.setColor(c);
		invalidateSelf();
	}

	
	@Override
	public int getIntrinsicHeight() {
		// TODO Auto-generated method stub
		return size;
	}

	@Override
	public int getIntrinsicWidth() {
		// TODO Auto-generated method stub
		return size;
	}

	public void setPXSize(Context ctx,int s) {
		// TODO Auto-generated method stub
		this.size = s;
		paint.setTextSize(size/2);
		invalidateSelf();
	}
	public void setDPSize(Context ctx,int s) {
		// TODO Auto-generated method stub
		this.size = Util.dip2px(ctx, s);
		paint.setTextSize(size/2);
		invalidateSelf();
	}
	
	
	
	@Override
	public void draw(Canvas canvas) {
		// TODO Auto-generated method stub
		if(size==0){
			Rect rec = getBounds();
			size = rec.right-rec.left;
			paint.setTextSize(size/2);
		}
		canvas.drawText(text, size/2.0f, size/2.0f-textBounds.centerY(), paint);
	}

	@Override
	public int getOpacity() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

	@Override
	public void setAlpha(int alpha) {
		// TODO Auto-generated method stub
		this.alpha = alpha;
		paint.setAlpha(alpha);
		invalidateSelf();
	}

	@Override
	public void setColorFilter(ColorFilter cf) {
		// TODO Auto-generated method stub

	}

}
