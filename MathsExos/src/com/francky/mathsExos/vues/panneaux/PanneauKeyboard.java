package com.francky.mathsExos.vues.panneaux;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.francky.mathsExos.ctrl.Controleur;
import com.francky.mathsExos.ctrl.EcouteurActions;
import com.francky.mathsExos.modele.BoutonsMap;

public class PanneauKeyboard extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	//************************************************************DECLARATIONS
	
	/*
	 * Nombre de touches dans le clavier
	 */
	private static final int ROWS_NUMBER = 4;
	private static final int COLS_NUMBER = 4;
	
	/*
	 * hauteur et largeur d'une touche de clavier en pixel
	 */
	public static final int KEY_HEIGHT = 50;
	public static final int KEY_WIDTH = 70;
	
	/*
	 * Marge autour d'une touche de clavier
	 */
	public static final int KEY_MARGE = 5;
	private static final int KEY_PANEL_MARGE_TOP = 5;
	private static final int KEY_PANEL_MARGE_BOTTOM = 5;
	private static final int KEY_PANEL_MARGE_LEFT = 5;
	private static final int KEY_PANEL_MARGE_RIGHT = 5;
	
	/*
	 * Calcul de la hauteur du panneaux clavier
	 * nombre de colonnes * hauteur d'une colonne + marge
	 */
	public static final int KEYBOARD_HEIGTH = ROWS_NUMBER * (KEY_HEIGHT + KEY_MARGE) + KEY_PANEL_MARGE_BOTTOM;
	public static final int KEYBOARD_WIDTH = COLS_NUMBER * (KEY_WIDTH + KEY_MARGE) + KEY_PANEL_MARGE_LEFT;
	
	/*
	 * D�claration des boutons du clavier et d'une HashMap
	 */
	
	HashMap<Character, JButton> boutons;	//HashMap qui associe un JButton � un caractère -> utilisé pour la sérigraphie des boutons
	BoutonsMap bm;							//Cr�ation d'une instance de la classe BoutonsMap
	
	/*
	 * Instanciation du controleur et du listener
	 */
	private Controleur ctrl;
	private EcouteurActions btnListener;

	
	//************************************************************CONSTUCTEUR
	public PanneauKeyboard(Controleur ctrl) {
		this.ctrl = ctrl;
		this.btnListener = new EcouteurActions(ctrl);
		
		setPreferredSize(new Dimension(KEYBOARD_WIDTH, KEYBOARD_HEIGTH));
		setBackground(ctrl.COL_FOND);
		
		//param�trage du layout du clavier
		setLayout(new GridLayout(ROWS_NUMBER, COLS_NUMBER, KEY_MARGE, KEY_MARGE));

		//Construction des boutons du clavier
		bm = new BoutonsMap(btnListener, this, ctrl);					//Instanciation de BoutonsMap
		
		//d�finition d'une marge autour du panneau clavier
		setBorder(new EmptyBorder(KEY_PANEL_MARGE_TOP, KEY_PANEL_MARGE_LEFT, KEY_PANEL_MARGE_BOTTOM, KEY_PANEL_MARGE_RIGHT));
	}
	
	//**************************    METHODES
	
	
	//repaint du panelKeyboard
	public void repaintPanelKeyboard() {
		this.repaint();
	}
}
