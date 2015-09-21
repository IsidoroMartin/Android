package com.example.secondtry;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.TextView;
import android.widget.Toast;

public class Activity2 extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity2);
		String nombre = getIntent().getExtras().getString("nombre");
		String apellidos = getIntent().getExtras().getString("apellidos");
		String email= getIntent().getExtras().getString("email");
		Toast.makeText(getApplicationContext(), nombre+" "+apellidos+" "+email, 20).show();
		TextView t = (TextView)findViewById(R.id.parametros);
		
		t.setText(nombre+" "+apellidos+" "+email);
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// TODO Auto-generated method stub
		getMenuInflater().inflate(R.menu.menusecundario, menu);
		return true;
				
	}
}