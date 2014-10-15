package it.giuseppeliccardo.corsi.ciclovitaactivity;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class CicloVitaActivity extends Activity {

	String tag = "Activity: " + getClass().getSimpleName();
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    Log.i(tag, "onCreate()");
	}
	  
	@Override
	public void onRestart() {
		super.onRestart();
		Log.i(tag, "onRestart()");
	}
  
	@Override
	public void onStart() {
		super.onStart();
		Log.i(tag, "onStart()");
	}
  
	@Override
	public void onResume() {
		super.onResume();
		Log.i(tag, "onResume()");
	}
  
	@Override
  	public void onPause() {
	   	super.onPause();
	   	Log.i(tag, "onPause()");
	}
  
	@Override
	public void onStop() {
		super.onStop();
		Log.i(tag, "onStop()");
	}
  
	@Override
	public void onDestroy() {
		super.onDestroy();
		Log.i(tag, "onDestroy()");
	}

}