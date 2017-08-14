package com.francky.mathsExos.ctrl;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EcouteurActions implements ActionListener {

	//DECLARATIONS
	Controleur ctrl;
	
	//CONSTRUCTEUR
	public EcouteurActions(Controleur ctrl) {
		super();
		this.ctrl = ctrl;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String commande = e.getActionCommand();
		switch(commande){
			case "0":
			case "1":
			case "2":
			case "3":
			case "4":
			case "5":
			case "6":
			case "7":
			case "8":
			case "9":
				//
			case "+":
			case "-":
			case "X":
			case "/":
				//
			case "Eff.":
			case "Aide":
				System.out.println("clic sur " + commande);
				break;
			case "THEME1":
			case "THEME2":
			case "THEME3":
			case "THEME4":
			case "THEME5":
			case "THEME6":
				ctrl.resetColors(e.getActionCommand());
				ctrl.colorerTousBoutons();
//				ctrl.rafraichiJeu();
				break;
			case "START":
//				ctrl.start();
				break;
			case "QUIT":
				System.exit(0);
				break;
		}
	}

}
