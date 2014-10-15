package it.giuseppeliccardo.corsi.invocazioneactivity3;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class PrimaActivity extends Activity {
 
	Button mButtonPA1, mButtonPA2, mButtonPA3;  
	    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prima);
        
        mButtonPA1 = (Button) findViewById(R.id.button1ASecondaActivity);
        mButtonPA1.setOnClickListener(gestoreListener);
        
        mButtonPA2 = (Button) findViewById(R.id.button1ATerzaActivity);     
    	mButtonPA2.setOnClickListener(gestoreListener);
    	
    	mButtonPA3 = (Button) findViewById(R.id.button1ATerminaActivity);
    	mButtonPA3.setOnClickListener(gestoreListener);
	} 
    
    OnClickListener gestoreListener = new OnClickListener() {
		@Override
		public void onClick(View view) {
			if (view == mButtonPA1)		avviaActivity(SecondaActivity.class);
			if (view == mButtonPA2)		avviaActivity(TerzaActivity.class);
			if (view == mButtonPA3)		finish();
		}
	};
	
	public void avviaActivity(Class<?> classeDaAvviare) {
		Intent intent = new Intent(this, classeDaAvviare);
		startActivity(intent);
	}
}