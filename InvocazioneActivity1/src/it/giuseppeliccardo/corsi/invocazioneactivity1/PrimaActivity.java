package it.giuseppeliccardo.corsi.invocazioneactivity1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PrimaActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prima);
    }
    
    public void avviaSecondaActivity(View view) {
    	Intent intent = new Intent(this, SecondaActivity.class);
    	startActivity(intent);
    }
}
