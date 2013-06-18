package com.google.zxing.client.result;

import android.util.Log;

import com.google.zxing.Result;

public class PubTransResultParser extends ResultParser{

	@Override
	public ParsedResult parse(Result theResult) {
		// Übergabe des gesamten Ergebnis des gescannten QR-Codes
		// es wird überprüft ob dieser Text mit dem String "PUBTRANS" beginnt.
		if(theResult.getText().toString().startsWith("PUBTRANS")){
			// Wenn die Abfrage erfolgreich ist, wird eine Log-Ausgabe in Eclipse 
			// mit dem Inhalt des QR-Codes ausgegeben.
			Log.d("PubTransResultParser", "Abfrage OK: " + theResult.getText());
		}
		
		return null;
	}

}
