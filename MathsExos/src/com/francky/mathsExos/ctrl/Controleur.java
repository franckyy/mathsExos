package com.francky.mathsExos.ctrl;

import java.awt.Color;

import com.francky.mathsExos.ctrlHelper.colors.CouleurThemes;
import com.francky.mathsExos.vues.FenetrePrincipale;

public class Controleur {

	private ListenerClavier keyListener;
	private FenetrePrincipale fenetrePrincipale;
	

	/*
	 * Définition de la palette des couleurs pour le jeu (le contrôleur donne les couleurs aux panneaux)
	 */
	private String COLOR_THEME = "THEME3";	//THEME1 à THEME6
	public Color COL_FOND;
	public Color COL_FOND_BOUTONS_CLIC;
	public Color COL_TEXT_BOUTONS_CLIC;
	public Color COL_FOND_BOUTONS_NON_CLIC;
	public Color COL_TEXT_BOUTONS_NON_CLIC;
	public Color COL_TEXTE_1;
	public Color COL_TEXTE_2;
	public Color COL_MOT;
	public Color COL_MOT_TROUVE1;
	public Color COL_MOT_TROUVE2;
	public Color COL_MOT_TROUVE3;
	public Color COL_MOT_TROUVE4;
	public Color COL_MOT_TROUVE5;
	public Color COL_MOT_TROUVE6;
	public Color COL_MOT_TROUVE7;
	public Color COL_MOT_TROUVE8;
	public Color COL_MOT_TROUVE9;
	public Color COL_GRAPH;
	
	public Controleur() {

		
		//************************************Initialisations
//		resetGame();
		resetColors(COLOR_THEME);		
		
		keyListener = new ListenerClavier(this);
		
		fenetrePrincipale = new FenetrePrincipale(this);
		fenetrePrincipale.addKeyListener(keyListener);
		fenetrePrincipale.setVisible(true);
		fenetrePrincipale.requestFocus();
	}
	
	
	//¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤    
	//**********************************************METHODES POUR REINITIALISER LE JEU
	//¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤  
	
	
	//¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤    réinitialisation des couleurs
	public void resetColors(String theme) {
		//initialisation des couleurs - a l'avenir il faudra aller chercher le theme dans un .xml
		CouleurThemes coul = new CouleurThemes(theme);
		
		COL_FOND = coul.getColComplementaire_5();
		COL_FOND_BOUTONS_CLIC = coul.getColComplementaire_3();
		COL_TEXT_BOUTONS_CLIC = coul.getColPrimaire_3();
		COL_FOND_BOUTONS_NON_CLIC = coul.getColPrimaire_5();
		COL_TEXT_BOUTONS_NON_CLIC = coul.getColComplementaire_4();
		COL_TEXTE_1 = coul.getColPrimaire_3();
		COL_TEXTE_2 = coul.getColPrimaire_2();
		COL_MOT = coul.getColPrimaire_3();
		COL_MOT_TROUVE1 = coul.getColComplementaire_1();
		COL_MOT_TROUVE2 = coul.getColComplementaire_2();
		COL_MOT_TROUVE3 = coul.getColComplementaire_3();
		COL_MOT_TROUVE4 = coul.getColComplementaire_4();
		COL_MOT_TROUVE5 = coul.getColPrimaire_1();
		COL_MOT_TROUVE6 = coul.getColPrimaire_2();
		COL_MOT_TROUVE7 = coul.getColPrimaire_3();
		COL_MOT_TROUVE8 = coul.getColPrimaire_4();
		COL_MOT_TROUVE9 = coul.getColPrimaire_5();
		COL_GRAPH = coul.getColPrimaire_1();
		
	}
	
	//¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤    
	//**********************************************METHODES D'AFFICHAGES
	//¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤  
		
	//¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤    repaint général qui modifie les couleurs de fond
	public void rafraichiJeu() {
		fenetrePrincipale.modifieBackgrounds();
	}
	
	public void colorerTousBoutons() {fenetrePrincipale.colorerTousBoutons();}
}
