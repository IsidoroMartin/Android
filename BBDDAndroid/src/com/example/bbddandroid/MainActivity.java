package com.example.bbddandroid;

import android.app.Activity;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		GestorBBDD gbbdd = new GestorBBDD(this, "UsuariosDB", null, 1);
		SQLiteDatabase db = gbbdd.getWritableDatabase();
		db.execSQL("DELETE FROM Usuarios WHERE 1=1");
		if (db != null) {
			try{
			for (int i = 0; i <= 5; i++) {
				db.execSQL("INSERT INTO Usuarios VALUES("+i+",'Usuario"+i+"')");	
			}
			}catch(Exception e){
				Toast.makeText(getApplicationContext(), "Ha ocurrido un error"+e.getMessage(), Toast.LENGTH_LONG).show();
				System.out.println("Ha ocurrido un error"+e.getMessage());
			}finally{
				db.close();
			}
		}
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
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
	public void getUsers(View v){
		Intent i = new Intent(this,Activity2.class);
		startActivity(i);
	}
}
