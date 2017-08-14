package com.francky.mathsExos.modele;

import java.util.HashMap;

import javax.swing.JButton;

import com.francky.mathsExos.ctrl.Controleur;
import com.francky.mathsExos.ctrl.EcouteurActions;
import com.francky.mathsExos.vues.panneaux.PanneauKeyboard;


public class BoutonsMap {


	//DECLARATIONS
	PanneauKeyboard panelkeyboard;
	Controleur ctrl;
	
	private HashMap<String, JButton> boutons;
	
	private JButton btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9,
			btnDel, btnHelp;
	

	//CONSTRUCTEUR
	public BoutonsMap(EcouteurActions btnListener, PanneauKeyboard panelkeyboard, Controleur ctrl) {
		super();
		this.ctrl = ctrl;
		boutons = new HashMap<String, JButton>();
		this.panelkeyboard = panelkeyboard;
		boutons = remplissageBoutons();
		
		
	}
	
	//METHODES
	public HashMap<String, JButton> remplissageBoutons(){
		btn0 = new JButton("0");
		btn1 = new JButton("1");
		btn2 = new JButton("2");
		btn3 = new JButton("3");
		btn4 = new JButton("4");
		btn5 = new JButton("5");
		btn6 = new JButton("6");
		btn7 = new JButton("7");
		btn8 = new JButton("8");
		btn9 = new JButton("9");
		btnDel = new JButton("Eff.");
		btnHelp = new JButton("AIDE");
		
		
		boutons.put("0", btn0);
		boutons.put("1", btn1);
		boutons.put("2", btn2);
		boutons.put("3", btn3);
		boutons.put("4", btn4);
		boutons.put("5", btn5);
		boutons.put("6", btn6);
		boutons.put("7", btn7);
		boutons.put("8", btn8);
		boutons.put("9", btn9);
		boutons.put("10", btnDel);
		boutons.put("11", btnHelp);
		
		return boutons;
	}
	
	public HashMap<String, JButton> getBoutons() {
		return boutons;
	}
	
	public JButton getJBouton(String btnValue) {	
		return boutons.get(btnValue);
	}
}
