package it.giuseppeliccardo.corsi.intentimpliciti;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class IntentImplicitiActivity extends Activity {
	
	private Spinner mSpinner;
	private Button mButton;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_intent_impliciti);
		
		mSpinner = (Spinner) findViewById(R.id.spinner);
		ArrayAdapter adapter = ArrayAdapter.createFromResource(this, 
				R.array.intents, android.R.layout.simple_spinner_item);
		adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		mSpinner.setAdapter(adapter);
		
		mButton	= (Button) findViewById(R.id.triggerButton);
		mButton.setOnClickListener(listener);
	}
	
	OnClickListener listener = new OnClickListener() {
    	@Override
    	public void onClick(View view) {  
    		int position = mSpinner.getSelectedItemPosition();
    		Intent intent = null;
        
    		switch (position) {
    			case 0:		/* Apri Browser */
    				intent = new Intent(Intent.ACTION_VIEW,	Uri.parse("http://www.giuseppeliccardo.it"));
    				break;
    			case 1: 	/* Effettua Chiamata */
    				String number = "1234578910";
    			    intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + number));
    				break;
    			case 2:		/* Mostra Mappa */
    				intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:40.9093349,14.2066452?z=10"));
    				break;
    			case 3:		/* Scatta Foto */
    				intent = new Intent("android.media.action.IMAGE_CAPTURE");
    				break;
    			case 4:		/* Mostra Rubrica */
    				intent = new Intent(Intent.ACTION_VIEW, Uri.parse("content://contacts/people/"));
    				break;
    		}
        
    		if (intent != null) {
    			startActivity(intent);
    		} 
    	}
    };
} 