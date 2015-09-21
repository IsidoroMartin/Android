package com.example.consumwebserviceandroid;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class ActivityNotification extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_notification);
		String strecivved = getIntent().getStringExtra("contigo");
		Log.e("mensaje recibido", strecivved);
	}
}
