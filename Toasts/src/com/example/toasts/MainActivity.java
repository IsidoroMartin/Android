package com.example.toasts;


import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

//	public static Context contexto;

//	public static Context getContexto() {
//		return contexto;
//	}

//	public static void setContexto(Context contexto) {
//		MainActivity.contexto = contexto;
//	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
//		Button normal = (Button) findViewById(R.id.normal);
//		Button customized = (Button) findViewById(R.id.customized);
//		Button gravity = (Button) findViewById(R.id.gravity);

//		GestorDeEventos gestor = new GestorDeEventos();
//		contexto = getApplicationContext();
		// gestor.setActivity(this);

//		normal.setOnClickListener(gestor);
//		customized.setOnClickListener(gestor);
		// gravity.setOnClickListener(gestor);
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

	public void customizedToast(View v) {
		Toast t = new Toast(getApplicationContext());// Creo toast
		LayoutInflater inflater = getLayoutInflater();
		View layout = inflater.inflate(R.layout.customtoast,
				(ViewGroup) findViewById(R.id.toast_layout_root));// Obtengo el layout archivo xml,id layout
		TextView tv = (TextView) layout.findViewById(R.id.textolayout); // Obtengo el Textview y lo modifico para insertar el texto que yo quiero
		tv.setText("BlahBlah");
		// Seteo gravedad y duración
		t.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
		t.setDuration(Toast.LENGTH_SHORT);
		t.setView(layout);// Seteo el layout personalizado al toast
		t.show();
	}
	
	 public void normalToast(View v) {
	 Toast t = Toast.makeText(getApplicationContext(), "Normal", 20);
	 t.show();
	 }
	
	 public void gravityToast(View v) {
	 Toast t = Toast.makeText(getApplicationContext(), "Gravity", 20);
	 t.setGravity(Gravity.TOP, 30, 500);
	 t.show();
	 }

}
