package it.giuseppeliccardo.corsi.ciclovitaactivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PrimaActivity extends CicloVitaActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prima);
    }
    
    public void avviaSecondaActivity(View view) {
    	Intent intent = new Intent(this, SecondaActivity.class);
    	startActivity(intent);
    }
}
