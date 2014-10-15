package it.giuseppeliccardo.corsi.invocazioneactivity2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class PrimaActivity extends Activity {

	TextView mTextView;  
	Button mButton;  
	    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prima);
        
        mTextView = (TextView) findViewById(R.id.textViewPrimaActivity);  
        mButton	= (Button) findViewById(R.id.buttonPrimaActivity);  
          
        mButton.setOnClickListener(new OnClickListener() {
        	@Override
        	public void onClick(View view) {  
        		Intent intent = new Intent(PrimaActivity.this, SecondaActivity.class);  
        		startActivityForResult(intent, 2); // requestCode = 2  
        	}
        });
	}
    
    @Override  
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {  
    	super.onActivityResult(requestCode, resultCode, data);  
                     
    	if (requestCode == 2) {
    		String messaggio = data.getStringExtra("MESSAGGIO");
    		if (resultCode == RESULT_OK) {
    			mTextView.setText(messaggio);
    			//mTextView.setText("Request Code: " + requestCode + "\nResult Code: " + resultCode + "\nMessaggio: " + messaggio);
    		} else if (resultCode == RESULT_CANCELED) {
    			mTextView.setText("Messaggio vuoto");
    			//mTextView.setText("Request Code: " + requestCode + "\nResult Code: " + resultCode + "\nMessaggio vuoto");
    		}
    	}  
	}  
}
