/** 
 * -------------------------------------------------------------
 * Copyright (c) 2013 tank, All rights reserved. 
 * https://github.com/Tank000/android-iconkit 
 *  
 * @version: 1.0 
 * @author: tank.tyt@gmail.com
 * ------------------------------------------------------------- 
 */ 
 
package com.tank.iconkit;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

public class IconTextView extends TextView {

	public IconTextView(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
		setTypeface(Util.getTypeFace(getContext()));
	}
	
	public IconTextView(Context context, AttributeSet attrs) {
		super(context, attrs);
		// TODO Auto-generated constructor stub
		setTypeface(Util.getTypeFace(getContext()));
	}
	
	
	public IconTextView(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		// TODO Auto-generated constructor stub
		setTypeface(Util.getTypeFace(getContext()));
	}

}
