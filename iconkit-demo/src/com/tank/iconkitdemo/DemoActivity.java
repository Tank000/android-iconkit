package com.tank.iconkitdemo;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;

import com.tank.iconkit.IconDrawable;

public class DemoActivity extends Activity {

	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		setContentView(R.layout.demo);
		ImageView icon = (ImageView)findViewById(R.id.icon);
		IconDrawable ic= new IconDrawable(this, R.string.fa_bicycle);
		ic.setDPSize(this,48);
		icon.setImageDrawable(ic);
		super.onCreate(savedInstanceState);
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// TODO Auto-generated method stub
		getMenuInflater().inflate(R.menu.main, menu);
		MenuItem github = menu.findItem(R.id.action_github);
		IconDrawable ic = new IconDrawable(this, R.string.fa_github);
		ic.setDPSize(this, 48);
		ic.setColor(Color.WHITE);
		Log.v("onCreateOptionsMenu","----");
		github.setIcon(ic);
		return true;
	}
}
