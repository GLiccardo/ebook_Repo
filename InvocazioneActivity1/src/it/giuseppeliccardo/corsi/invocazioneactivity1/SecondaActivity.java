package it.giuseppeliccardo.corsi.invocazioneactivity1;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

public class SecondaActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_seconda);
	}
	
	public void terminaActivity(View view) {
		finish();
	}
}
