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
		}
	}

}
