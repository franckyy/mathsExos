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
	
	JMenu menuJeu;
	JMenuItem itemStart, difficulte, itemQuit;
	
	EcouteurActions menuListener;
	
	public Menu(FenetrePrincipale fenetreprincipale, Controleur ctrl) {
		menuListener = new EcouteurActions(ctrl);
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
		
		//**********   JEU   *********************
		
		menuJeu = new JMenu("Jeu");
		this.add(menuJeu);
		

		itemStart = new JMenuItem("Start / restart");
		itemQuit = new JMenuItem("Quit");
		menuJeu.add(itemStart);
		menuJeu.add(itemQuit);
		
		itemStart.addActionListener(menuListener);
		itemStart.setActionCommand("START");
		itemQuit.addActionListener(menuListener);
		itemQuit.setActionCommand("QUIT");
		
		fenetreprincipale.setJMenuBar(this);
		
	}
}
