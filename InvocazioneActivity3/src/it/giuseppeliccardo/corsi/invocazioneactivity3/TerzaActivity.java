package it.giuseppeliccardo.corsi.invocazioneactivity3;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class TerzaActivity extends Activity {

	Button mButtonTA1, mButtonTA2, mButtonTA3;  
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terza);
        
        mButtonTA1 = (Button) findViewById(R.id.button3APrimaActivity);
        mButtonTA1.setOnClickListener(gestoreListener);
        
        mButtonTA2 = (Button) findViewById(R.id.button3ASecondaActivity);
        mButtonTA2.setOnClickListener(gestoreListener);
        
        mButtonTA3 = (Button) findViewById(R.id.button3ATerminaActivity);
        mButtonTA3.setOnClickListener(gestoreListener);
	} 
    
    OnClickListener gestoreListener = new OnClickListener() {
		@Override
		public void onClick(View view) {
			if (view == mButtonTA1)		avviaActivity(PrimaActivity.class);
			if (view == mButtonTA2)		avviaActivity(SecondaActivity.class);
			if (view == mButtonTA3)		finish();
		}
	};
	
	public void avviaActivity(Class<?> classeDaAvviare) {
		Intent intent = new Intent(this, classeDaAvviare);
		startActivity(intent);
	}
}
