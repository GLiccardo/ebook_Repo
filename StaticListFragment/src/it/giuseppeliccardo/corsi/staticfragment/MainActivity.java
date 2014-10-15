package it.giuseppeliccardo.corsi.staticfragment;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import it.giuseppeliccardo.corsi.staticfragment.FragmentSinistro.ListSelectionListener;

public class MainActivity extends Activity implements
		ListSelectionListener {

	public static String[] mArraySinistro;
	public static String[] mArrayDestro;
	private FragmentDestro mFragmentDestro;

	private static final String TAG = "MainActivity";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		mArraySinistro = getResources().getStringArray(R.array.ArraySinistro);
		mArrayDestro = getResources().getStringArray(R.array.ArrayDestro);
		
		setContentView(R.layout.activity_main);
		
		mFragmentDestro = (FragmentDestro) getFragmentManager().findFragmentById(R.id.destro);
	}

	@Override
	public void onListSelection(int index) {
		if (mFragmentDestro.getShownIndex() != index) {
			mFragmentDestro.showQuoteAtIndex(index);
		}
	}
	
	@Override
	protected void onDestroy() {
		Log.i(TAG, getClass().getSimpleName() + ":entrato in onDestroy()");
		super.onDestroy();
	}

	@Override
	protected void onPause() {
		Log.i(TAG, getClass().getSimpleName() + ":entrato in onPause()");
		super.onPause();
	}

	@Override
	protected void onRestart() {
		Log.i(TAG, getClass().getSimpleName() + ":entrato in onRestart()");
		super.onRestart();
	}

	@Override
	protected void onResume() {
		Log.i(TAG, getClass().getSimpleName() + ":entrato in onResume()");
		super.onResume();
	}

	@Override
	protected void onStart() {
		Log.i(TAG, getClass().getSimpleName() + ":entrato in onStart()");
		super.onStart();
	}

	@Override
	protected void onStop() {
		Log.i(TAG, getClass().getSimpleName() + ":entrato in onStop()");
		super.onStop();
	}
}