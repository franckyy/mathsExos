package com.francky.mathsExos.modele;

import java.awt.Dimension;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

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
			btnDel, btnHelp, btnPlus, btnMinus, btnMultiply, btnDivide;
	
	List<String> boutonsSerigraphie;

	//CONSTRUCTEUR
	public BoutonsMap(EcouteurActions btnListener, PanneauKeyboard panelkeyboard, Controleur ctrl) {
		super();
		this.ctrl = ctrl;
		boutons = new HashMap<String, JButton>();
		this.panelkeyboard = panelkeyboard;
		boutons = remplissageBoutons();
		
		boutonsSerigraphie = new ArrayList<String>();	//instanciation de la liste des caractères de sérigraphie des boutons
		
		boutonsSerigraphie.add("1");
		boutonsSerigraphie.add("2");
		boutonsSerigraphie.add("3");
		boutonsSerigraphie.add("+");
		boutonsSerigraphie.add("4");
		boutonsSerigraphie.add("5");
		boutonsSerigraphie.add("6");
		boutonsSerigraphie.add("-");
		boutonsSerigraphie.add("7");
		boutonsSerigraphie.add("8");
		boutonsSerigraphie.add("9");
		boutonsSerigraphie.add("X");
		boutonsSerigraphie.add("Eff.");
		boutonsSerigraphie.add("0");
		boutonsSerigraphie.add("Aide");
		boutonsSerigraphie.add("/");
		
		//paramétrages des attributs des boutons
		for(int i = 0; i < boutons.size(); i++){
			panelkeyboard.add(boutons.get(boutonsSerigraphie.get(i)));
			boutons.get(boutonsSerigraphie.get(i)).setBackground(ctrl.COL_FOND_BOUTONS_NON_CLIC);
			boutons.get(boutonsSerigraphie.get(i)).setForeground(ctrl.COL_TEXT_BOUTONS_NON_CLIC);
			boutons.get(boutonsSerigraphie.get(i)).setPreferredSize(new Dimension(PanneauKeyboard.KEY_WIDTH, PanneauKeyboard.KEY_HEIGHT));
			boutons.get(boutonsSerigraphie.get(i)).addActionListener(btnListener);
			boutons.get(boutonsSerigraphie.get(i)).setActionCommand("" + boutonsSerigraphie.get(i));
		}
	}
	
	//METHODES
	public HashMap<String, JButton> remplissageBoutons(){
		
		btn1 = new JButton("1");
		btn2 = new JButton("2");
		btn3 = new JButton("3");
		btnPlus = new JButton("+");
		btn4 = new JButton("4");
		btn5 = new JButton("5");
		btn6 = new JButton("6");
		btnMinus = new JButton("-");
		btn7 = new JButton("7");
		btn8 = new JButton("8");
		btn9 = new JButton("9");
		btnMultiply = new JButton("X");
		btnDel = new JButton("Efface");
		btn0 = new JButton("0");
		btnHelp = new JButton("Aide");
		btnDivide = new JButton("/");
		
		boutons.put("1", btn1);
		boutons.put("2", btn2);
		boutons.put("3", btn3);
		boutons.put("+", btnPlus);
		boutons.put("4", btn4);
		boutons.put("5", btn5);
		boutons.put("6", btn6);
		boutons.put("-", btnMinus);
		boutons.put("7", btn7);
		boutons.put("8", btn8);
		boutons.put("9", btn9);
		boutons.put("X", btnMultiply);
		boutons.put("Eff.", btnDel);
		boutons.put("0", btn0);
		boutons.put("Aide", btnHelp);
		boutons.put("/", btnDivide);
		
		return boutons;
	}
	
	public HashMap<String, JButton> getBoutons() {
		return boutons;
	}
	
	public JButton getJBouton(String btnValue) {	
		return boutons.get(btnValue);
	}
}
