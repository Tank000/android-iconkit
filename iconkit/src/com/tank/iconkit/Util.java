package com.tank.iconkit;

import android.content.Context;
import android.graphics.Typeface;
import android.util.TypedValue;

public class Util {
	private static Typeface tf;
	
	public static Typeface getTypeFace(Context ctx){
		if(tf==null){
			tf = Typeface.createFromAsset(ctx.getAssets(), "fonts/fontawesome.ttf");
		}
		return tf;
	}
	public static int dip2px(Context context, float dipValue) {
//		return (int)TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_SP, 20, context.getResources().getDisplayMetrics());
		final float scale = context.getResources().getDisplayMetrics().density;
		return (int) (dipValue * scale + 0.5f);
	}
}
