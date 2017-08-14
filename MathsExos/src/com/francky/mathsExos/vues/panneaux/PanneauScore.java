package com.francky.mathsExos.vues.panneaux;

import java.awt.Dimension;

import javax.swing.JPanel;

import com.francky.mathsExos.ctrl.Controleur;


public class PanneauScore extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	//************************************************************DECLARATIONS
	
	Controleur ctrl;
	
	/*
	 * D�finition de la hauteur et de la largeur
	 */
	private static final int SCORE_HEIGTH = PanneauKeyboard.KEYBOARD_HEIGTH;
	public static final int SCORE_WIDTH = 200;

	//************************************************************CONTROLEUR
	public PanneauScore(Controleur ctrl) {
		this.ctrl = ctrl;
		
		setPreferredSize(new Dimension(SCORE_WIDTH, SCORE_HEIGTH));
		setBackground(ctrl.COL_FOND);
	}
}
