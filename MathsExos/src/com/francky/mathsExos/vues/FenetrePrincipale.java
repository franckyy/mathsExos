package com.francky.mathsExos.vues;

import java.awt.BorderLayout;

import javax.swing.JFrame;

import com.francky.mathsExos.ctrl.Controleur;
import com.francky.mathsExos.vues.panneaux.PanneauAffichage;
import com.francky.mathsExos.vues.panneaux.PanneauKeyboard;
import com.francky.mathsExos.vues.panneaux.PanneauScore;

public class FenetrePrincipale extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	Controleur ctrl;

	public Menu menu;
	public PanneauKeyboard panneauKeyboard;
	public PanneauScore panneauScore;
	public PanneauAffichage panneauAffichage;
	
	public FenetrePrincipale(Controleur ctrl) {
		super("MathsExos");
		
		setLayout(new BorderLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		
		this.ctrl = ctrl;
		
		// ajout d'un menu
		menu = new Menu(this, ctrl);
		
		/*
		 * Initialisation des panneaux
		 */
		//cr�ation du clavier
		panneauKeyboard = new PanneauKeyboard(ctrl);
		//ajout du clavier � la fen�tre
		add(panneauKeyboard, BorderLayout.CENTER);
		
		//Cr�ation du panneau de score
		panneauScore = new PanneauScore(ctrl);
		add(panneauScore, BorderLayout.EAST);
		
		//cr�ation du panneau d'affichage des mots
		panneauAffichage = new PanneauAffichage(ctrl);
		add(panneauAffichage, BorderLayout.NORTH);
		

		pack();
		setLocationRelativeTo(null);
	}
	
	
	//**********************  METHODES

	public void colorerTousBoutons() {
		panneauKeyboard.colorerTousBoutons();
	}

}
