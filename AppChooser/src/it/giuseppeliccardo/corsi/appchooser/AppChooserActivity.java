package it.giuseppeliccardo.corsi.appchooser;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class AppChooserActivity extends Activity {
	
    private Button mButton;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_app_chooser);
		
		mButton = (Button) findViewById(R.id.button);
		mButton.setOnClickListener(listener);
	}
	
	OnClickListener listener = new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			Intent intent = new Intent(Intent.ACTION_SEND);
			intent.setType("text/plain");
			intent.putExtra(Intent.EXTRA_TEXT, "http://www.giuseppeliccardo.it/");
			startActivity(Intent.createChooser(intent, "Condividi attraverso:"));
		}
	};
}
