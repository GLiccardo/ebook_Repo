package it.giuseppeliccardo.corsi.cambiostato;

import android.app.Activity;
import android.os.Bundle;
import android.widget.EditText;

public class CambioStatoActivity extends Activity {
	
	private EditText mEditText;
	
	@Override
	protected void onCreate(Bundle savedState) {
		super.onCreate(savedState);
		setContentView(R.layout.activity_cambio_stato);
	}
	
	@Override
    protected void onSaveInstanceState(Bundle savedState) {
        super.onSaveInstanceState(savedState);

        mEditText = (EditText) findViewById(R.id.editText);
		CharSequence userText = mEditText.getText();
		savedState.putCharSequence("TestoSalvato", userText);
    }

	@Override
	protected void onRestoreInstanceState(Bundle savedState) {		
		super.onRestoreInstanceState(savedState);
		
        mEditText = (EditText) findViewById(R.id.editText);
		CharSequence userText = savedState.getCharSequence("TestoSalvato");
		mEditText.setText(userText);
	}
}
