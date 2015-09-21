package com.example.consumwebserviceandroid;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import android.os.AsyncTask;
import android.util.Log;

public class ConexionAsicronaGet extends AsyncTask<Void, Void, String> {
	private final String DIR = "http://172.16.1.37:8091/WebServiceAndroid/MiServlet ";

	@Override
	protected String doInBackground(Void... params) {
		String respuesta = null;
		BufferedReader in = null;
		try {
			URL url = new URL(DIR);
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			if (conn.getResponseCode() == 200) {
				in = new BufferedReader(new InputStreamReader(
						conn.getInputStream()));
				respuesta = in.readLine();
				Log.i("IN_ASYNTASK",respuesta);
			} else {
				Log.e("IN_ASYNTASK",
						"Ha ocurrido un error al recibir la respuesta");
			}
		} catch (Exception e) {
			Log.e("IN_ASYNTASK", e.getMessage());
		} finally {
			try {
				if (in != null) {
					in.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return respuesta;
	}

	@Override
	protected void onPostExecute(String result) {
		
	}

}
