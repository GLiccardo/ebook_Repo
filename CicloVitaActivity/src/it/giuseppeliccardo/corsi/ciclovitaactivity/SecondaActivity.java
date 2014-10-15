package it.giuseppeliccardo.corsi.ciclovitaactivity;

import android.os.Bundle;
import android.view.View;

public class SecondaActivity extends CicloVitaActivity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_seconda);
	}
	
	public void terminaActivity(View view) {
		finish();
	}
}
