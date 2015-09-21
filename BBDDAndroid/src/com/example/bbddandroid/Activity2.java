package com.example.bbddandroid;

import android.app.Activity;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

public class Activity2 extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity2);
		TextView txtcontactos = (TextView) findViewById(R.id.users);
		GestorBBDD usdbh = new GestorBBDD(this, "UsuariosDB", null, 1);
		SQLiteDatabase db = usdbh.getWritableDatabase();
		Cursor c = db.rawQuery(" SELECT * FROM Usuarios ", null);
//		Log.d("Ndatos", c.getCount() + "");
		
		StringBuffer datos = new StringBuffer();
//		Toast.makeText(getApplicationContext(), c.getCount(), Toast.LENGTH_SHORT).show();
		if (c.moveToFirst()) {
			// Recorremos el cursor hasta que no haya más registros
			do {
				String codigo = c.getString(0);
				String nombre = c.getString(1);
				datos.append("codigo y nombre ");
				datos.append(codigo + " " + nombre);
				datos.append("\n");
			} while (c.moveToNext());
		}

		c.close();
		txtcontactos.setText(datos);
	}
}
