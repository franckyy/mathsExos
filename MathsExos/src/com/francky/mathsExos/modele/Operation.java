package com.francky.mathsExos.modele;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Operation {

	//**********************DECLARATIONS
	private List<Operateur> operateurs;	//Liste des opérateurs s'il y a plusieurs opérateurs dans l'opération
	private Integer resultat;	//Résultat à comparer avec la réponse du joueur
	private List<Integer> operandes;	//Liste des opérandes, la taille de la liste détermine le nombre d'opérandes
										//La position de l'opérande dans la liste détermine 
										//la position de l'opérande dans l'opération
	private List<int[]> operandesChiffres;	//tableaux des nombres possible pour les opérandes
	private Niveaux niveau;	//Niveau de jeu

	//**********************CONSTRUCTEUR
	public Operation(Niveaux niveau, Operateur operateur){
//		Integer nbreOperandes = niveau.getNbreOperandes();
		List<Integer> valeursOperandes = niveau.getMinMaxValuesFromNiveau();
		
		//Création de la liste des tableaux de chiffres possibles par opérande
		operandesChiffres = new ArrayList<int[]>();
		
		for(int i = 0; i < valeursOperandes.size(); i+=2) {	//on parcours 2 par 2 pour avoir min et maxValue d'un opérande puis ainsi de suite...
			
			int minVal = valeursOperandes.get(i);
			int maxVal = valeursOperandes.get(i + 1);
				
				int longueurTableau = maxVal - minVal + 1;	// "maxVal - minVal" est la taille du tableau, 
														//ou le nombre de valeurs que pourra prendre l'opérande
				int[] chiffresOperande = new int[longueurTableau];
				
				for(int rank = 0; rank < chiffresOperande.length; rank++) {	// chiffresOPerande.length = longueurTableau - 1 car il part de zéro
					chiffresOperande[rank] = minVal + rank;
				}
				
				operandesChiffres.add(chiffresOperande);
		}
		
		//On créé une liste d'opérandes car une liste est ordonnée.
		//Ainsi nous aurons l'opérande 1, 2 ... etc en suivant leur position dans l'opération
		operandes = new ArrayList<Integer>();
		for(int rank = 0; rank < operandesChiffres.size(); rank++){
			int[] operandeChiffres = operandesChiffres.get(rank);
			//on enlève les chiffres de l'opérande
			operandesChiffres.remove(rank);
			
			Random random = new Random();
			int chiffre = random.nextInt(operandeChiffres.length);
			operandes.add(operandeChiffres[chiffre]);
			
			int[] nouvelOperandeChiffres = new int[operandeChiffres.length - 1];
			//on reconstitue la liste des chiffres possibles pour l'opérande 
			//en enlevant celui qui vient d'être choisi au hasard
			int rankNouveauDiminue = 0;
			for(int rankNouveau = 0; rankNouveau < operandeChiffres.length; rankNouveau++){
				
				if(operandeChiffres[rankNouveau] != chiffre){
					nouvelOperandeChiffres[rankNouveauDiminue] = operandeChiffres[rankNouveau];
					rankNouveauDiminue++;
				}
				
			}
			operandesChiffres.add(rank, nouvelOperandeChiffres);
			
			
		}
		
		System.out.println("op1 : " + operandes.get(0) + ", op2 : " + operandes.get(1));
		
	}
	
	//**********************METHODES
	//calcul de la valeur au hasard en fonction du niveau de jeu.
	private static Integer calculValeurOperande(int[] chiffresPossibles){
		Integer valeur = 0;
		
		//détermination en fonction du niveau de l'intervalle dans lequel doit se trouver l'opérande.
		
		
		return valeur;
	}
	
	//**********************ACCESSEURS

	public Integer getResultat() {return resultat;}
	public void setResultat(Integer resultat) {this.resultat = resultat;}

	public List<Integer> getOperandes() {return operandes;}
	public void setOperandes(List<Integer> operandes) {this.operandes = operandes;}
	
	public Niveaux getNiveau() {return niveau;}
	public void setNiveau(Niveaux niveau) {this.niveau = niveau;}
}
