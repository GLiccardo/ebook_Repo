package it.giuseppeliccardo.corsi.invocazioneactivity3;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class SecondaActivity extends Activity {

	Button mButtonSA1, mButtonSA2, mButtonSA3;  
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seconda);
        
        mButtonSA1 = (Button) findViewById(R.id.button2APrimaActivity);
        mButtonSA1.setOnClickListener(gestoreListener);
        
        mButtonSA2 = (Button) findViewById(R.id.button2ATerzaActivity);
        mButtonSA2.setOnClickListener(gestoreListener);
        
        mButtonSA3 = (Button) findViewById(R.id.button2ATerminaActivity);
        mButtonSA3.setOnClickListener(gestoreListener);
	} 
    
    OnClickListener gestoreListener = new OnClickListener() {
		@Override
		public void onClick(View view) {
			if (view == mButtonSA1)		avviaActivity(PrimaActivity.class);
			if (view == mButtonSA2)		avviaActivity(TerzaActivity.class);
			if (view == mButtonSA3)		finish();
		}
	};
	
	public void avviaActivity(Class<?> classeDaAvviare) {
		Intent intent = new Intent(this, classeDaAvviare);
		startActivity(intent);
	}
}
