package com.francky.mathsExos.modele;

public class Joueur {

	//DECLARATIONS
	private String idJoueur;
	private Integer niveauJoueur;
	private Integer score;
	
	//CONSTRUCTEURS
	public Joueur() {
		//initialisation d'un joueur "invité"
		this("Invité", 1, 0);
	}
	
	public Joueur(String id, Integer niveau, Integer score){
		setIdJoueur(id);
		setNiveauJoueur(niveau);
		setScore(score);
	}

	//ACCESSEURS
	public String getIdJoueur() {return idJoueur;}
	public void setIdJoueur(String idJoueur) {this.idJoueur = idJoueur;}
	
	public Integer getNiveauJoueur() {return niveauJoueur;}
	public void setNiveauJoueur(Integer niveauJoueur) {this.niveauJoueur = niveauJoueur;}

	public Integer getScore() {return score;}
	public void setScore(Integer score) {this.score = score;}
}
