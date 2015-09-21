package com.example.secondtry;

import java.net.URI;

import com.example.secondtry.listener.ProcesarEventos;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
	private static EditText caja1 = null;
	private static TextView caja2 = null;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		caja1 = (EditText) findViewById(R.id.caja1);
		caja2 = (TextView) findViewById(R.id.caja2);
		Button b = (Button) findViewById(R.id.boton);
		b.setOnClickListener(new ProcesarEventos());

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		Intent i = null;
		if (id == R.id.action_close) {
			finish();
		}
		if (id == R.id.menu1) {
			i = new Intent("android.intent.action.VIEW",
					Uri.parse("http://www.google.com"));
		}
		if (id == R.id.menu2) {
			i = new Intent("android.intent.action.VIEW",
					Uri.parse("http://www.facebook.com"));
		}
		if (id == R.id.menu3) {
			i = new Intent("android.intent.action.VIEW",
					Uri.parse("http://www.twitter.com"));
		}
		if (id == R.id.activity2) {
			i = new Intent(this,Activity2.class);
		}
		
		if (i != null) {
			startActivity(i);
		}
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	public static EditText getCaja1() {
		return caja1;
	}

	public static TextView getCaja2() {
		return caja2;
	}
	public void registro(View v){
		Intent i = new Intent(this,Activity2.class);
		i.putExtra("nombre", ((EditText)findViewById(R.id.nombre)).getText().toString());
		i.putExtra("apellidos", ((EditText)findViewById(R.id.apellidos)).getText().toString());
		i.putExtra("email", ((EditText)findViewById(R.id.email)).getText().toString());
		startActivity(i);
//		 Toast.makeText(getApplicationContext(), "hello", 20).show();
	}
}
