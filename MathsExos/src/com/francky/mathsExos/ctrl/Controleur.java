package com.francky.mathsExos.ctrl;

import com.francky.mathsExos.vues.FenetrePrincipale;

public class Controleur {

	private ListenerClavier keyListener;
	private FenetrePrincipale fenetrePrincipale;
	
	public Controleur() {

		
		//************************************Initialisations
//		resetGame();
//		resetColors(COLOR_THEME);		
		
		keyListener = new ListenerClavier(this);
		
		fenetrePrincipale = new FenetrePrincipale(this);
		fenetrePrincipale.addKeyListener(keyListener);
		fenetrePrincipale.setVisible(true);
		fenetrePrincipale.requestFocus();
	}
}
