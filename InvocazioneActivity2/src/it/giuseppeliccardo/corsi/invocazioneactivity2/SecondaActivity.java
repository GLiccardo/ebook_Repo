package it.giuseppeliccardo.corsi.invocazioneactivity2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class SecondaActivity extends Activity {

	EditText mEditText;  
    Button mButton;  
    
    @Override  
    protected void onCreate(Bundle savedInstanceState) {  
        super.onCreate(savedInstanceState);  
        setContentView(R.layout.activity_seconda);  
          
        mEditText = (EditText) findViewById(R.id.editTextSecondaActivity);  
        mButton = (Button) findViewById(R.id.buttonSecondaActivity);  
          
        mButton.setOnClickListener(new OnClickListener() {  
            @Override  
            public void onClick(View view) {  
            	Intent intent = new Intent();  
            	String messaggio = mEditText.getText().toString();  
                intent.putExtra("MESSAGGIO", messaggio);  
                
                if (messaggio.equals("")) {
                	setResult(RESULT_CANCELED, intent);
                } else {                
                	setResult(RESULT_OK, intent);
                }
                finish();
            }  
        });  
    }  	
}
