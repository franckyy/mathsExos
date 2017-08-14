package com.francky.mathsExos.vues;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import com.francky.mathsExos.ctrl.Controleur;
import com.francky.mathsExos.ctrl.EcouteurActions;

public class Menu extends JMenuBar {


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	JMenu menuAffichage, ssmenuThemCoul;
	JMenuItem itemTheme1, itemTheme2, itemTheme3, itemTheme4, itemTheme5, itemTheme6;
	
	JMenu menuJeu, menuNiveau, menuModeJeu;
	JMenuItem itemStart, difficulte, itemQuit;
	JMenuItem itemNiveau1, itemNiveau2, itemNiveau3;
	JMenuItem itemModeAddition, itemModeSoustraction, itemModeMultiplication, itemModeDivision, itemModeRandom;
	
	EcouteurActions menuListener;
	
	public Menu(FenetrePrincipale fenetreprincipale, Controleur ctrl) {
		menuListener = new EcouteurActions(ctrl);
		
		//**********   JEU   *********************
		
		menuJeu = new JMenu("Jeu");
		this.add(menuJeu);
		
		//menu NIVEAU
		menuNiveau = new JMenu("Niveau");
		itemNiveau1 = new JMenuItem("niveau 1");
		itemNiveau2 = new JMenuItem("niveau 2");
		itemNiveau3 = new JMenuItem("niveau 3");
		menuNiveau.add(itemNiveau1);
		menuNiveau.add(itemNiveau2);
		menuNiveau.add(itemNiveau3);
		
		itemNiveau1.addActionListener(menuListener);
		itemNiveau1.setActionCommand("NIVEAU1");
		itemNiveau2.addActionListener(menuListener);
		itemNiveau2.setActionCommand("NIVEAU2");
		itemNiveau3.addActionListener(menuListener);
		itemNiveau3.setActionCommand("NIVEAU3");
		
		menuJeu.add(menuNiveau);
		
		//menu MODE DE JEU
		menuModeJeu = new JMenu("mode du jeu");
		itemModeAddition = new JMenuItem("addition");
		itemModeSoustraction = new JMenuItem("soustraction");
		itemModeMultiplication = new JMenuItem("multiplication");
		itemModeDivision = new JMenuItem("division");
		itemModeRandom = new JMenuItem("au hasard");
		menuModeJeu.add(itemModeAddition);
		menuModeJeu.add(itemModeSoustraction);
		menuModeJeu.add(itemModeMultiplication);
		menuModeJeu.add(itemModeDivision);
		menuModeJeu.add(itemModeRandom);
		
		itemModeAddition.addActionListener(menuListener);
		itemModeAddition.setActionCommand("MODE_ADDITION");
		itemModeSoustraction.addActionListener(menuListener);
		itemModeSoustraction.setActionCommand("MODE_SOUSTRACTION");
		itemModeMultiplication.addActionListener(menuListener);
		itemModeMultiplication.setActionCommand("MODE_MULTIPLICATION");
		itemModeDivision.addActionListener(menuListener);
		itemModeDivision.setActionCommand("MODE_DIVISION");
		itemModeRandom.addActionListener(menuListener);
		itemModeRandom.setActionCommand("MODE_HASARD");
		
		menuJeu.add(menuModeJeu);
				
		itemStart = new JMenuItem("Start / restart");
		itemQuit = new JMenuItem("Quit");
		menuJeu.add(itemStart);
		menuJeu.add(itemQuit);
		
		itemStart.addActionListener(menuListener);
		itemStart.setActionCommand("START");
		itemQuit.addActionListener(menuListener);
		itemQuit.setActionCommand("QUIT");
		
		//**********   AFFICHAGE   *********************
		
		menuAffichage = new JMenu("Affichage");

		this.add(menuAffichage);
		
		ssmenuThemCoul = new JMenu("Themes couleurs");
		menuAffichage.add(ssmenuThemCoul);
		
		itemTheme1 = new JMenuItem("thème1");
		itemTheme2 = new JMenuItem("thème2");
		itemTheme3 = new JMenuItem("thème3");
		itemTheme4 = new JMenuItem("thème4");
		itemTheme5 = new JMenuItem("thème5");
		itemTheme6 = new JMenuItem("thème6");
		
		ssmenuThemCoul.add(itemTheme1);
		ssmenuThemCoul.add(itemTheme2);
		ssmenuThemCoul.add(itemTheme3);
		ssmenuThemCoul.add(itemTheme4);
		ssmenuThemCoul.add(itemTheme5);
		ssmenuThemCoul.add(itemTheme6);

		itemTheme1.addActionListener(menuListener);
		itemTheme1.setActionCommand("THEME1");
		itemTheme2.addActionListener(menuListener);
		itemTheme2.setActionCommand("THEME2");
		itemTheme3.addActionListener(menuListener);
		itemTheme3.setActionCommand("THEME3");
		itemTheme4.addActionListener(menuListener);
		itemTheme4.setActionCommand("THEME4");
		itemTheme5.addActionListener(menuListener);
		itemTheme5.setActionCommand("THEME5");
		itemTheme6.addActionListener(menuListener);
		itemTheme6.setActionCommand("THEME6");
		
		fenetreprincipale.setJMenuBar(this);
		
	}
}
