package com.example.secondtry.listener;

import com.example.secondtry.MainActivity;
import com.example.secondtry.R;


import android.view.View;
import android.view.View.OnClickListener;

public class ProcesarEventos implements OnClickListener {

	@Override
	public void onClick(View view) {
		int id = view.getId();
		switch (id) {
		case R.id.boton:
			String texto = MainActivity.getCaja1().getText().toString();
			StringBuilder sb = new StringBuilder(texto);
			String reverse = sb.reverse().toString();
			MainActivity.getCaja2().setText(reverse);
			break;
		}
	}

}
