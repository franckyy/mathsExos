package com.francky.mathsExos.vues;

import java.awt.BorderLayout;

import javax.swing.JFrame;

import com.francky.mathsExos.ctrl.Controleur;

public class FenetrePrincipale extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	Controleur ctrl;

	Menu menu;
	
	public FenetrePrincipale(Controleur ctrl) {
		super("MathsExos");
		
		setLayout(new BorderLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		
		this.ctrl = ctrl;
		
		// ajout d'un menu
		menu = new Menu(this, ctrl);
		

		pack();
		setLocationRelativeTo(null);
	}

}
