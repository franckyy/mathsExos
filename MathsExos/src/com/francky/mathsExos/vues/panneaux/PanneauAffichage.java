package com.francky.mathsExos.vues.panneaux;

import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.Timer;

import com.francky.mathsExos.ctrl.Controleur;

public class PanneauAffichage extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	//DECLARATIONS
	private Controleur ctrl;
	/*
	 * D�clarations concernant le clignotement
	 */
	private int count;
	private Timer animator;
  
	/*
	 * Taille du panneau affichage
	 */
	private static final int PANEL_WIDTH = PanneauKeyboard.KEYBOARD_WIDTH + PanneauScore.SCORE_WIDTH;
	private static final int PANEL_HEIGHT = 150;
	
	//CONTROLEUR
	public PanneauAffichage(Controleur ctrl){
		this.ctrl = ctrl;
		
		setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
		setBackground(ctrl.COL_FOND);
	}
}
