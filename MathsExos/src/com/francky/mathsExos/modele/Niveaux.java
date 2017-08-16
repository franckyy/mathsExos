package com.francky.mathsExos.modele;

import java.util.ArrayList;
import java.util.List;

import javax.management.ObjectName;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

public enum Niveaux {
	
	NIVEAU1(1,	2), 
	NIVEAU2(2,	2),
	NIVEAU3(3,	2);
	
	//*************************DECLARATIONS
	private Integer rangNiveau;	//désigne le rang du niveau (ex : niveau 1, niveau 2 ...etc)
	private Integer nbreOperandes;	//Le nombre d'opérandes présents dans une opération
	
	//*************************CONSTRUCTEUR
	private Niveaux(Integer rangNiveau, Integer nbreOperandes){
		this.nbreOperandes = nbreOperandes;
		this.rangNiveau = rangNiveau;
	}

	//*************************GETTERS
	public Integer getNbreOperandes() {return nbreOperandes;}
	public Integer getRangNiveau() {return rangNiveau;}
	
	//*************************METHODES
	/**
	 * 
	 * @param niveau
	 * @return Une liste d'Integer ordonnés de la façon suivante :
	 * opérande1:{minValue, maxValue}, opérande2:{minValue, maxValue}, opérande3:{minValue, maxValue}, ...etc
	 * Le nombre d'opérande et les valeurs divergent selon le niveau de jeu
	 */
	public List<Integer> getMinMaxValuesFromNiveau() {
		List<Integer> listeValeurs = new ArrayList<Integer>();
		
		Integer rangNiveau = this.getRangNiveau();
		
		switch(rangNiveau){
		case 1:
			listeValeurs.add(0);
			listeValeurs.add(3);
			listeValeurs.add(0);
			listeValeurs.add(3);
			break;
		case 2:
			listeValeurs.add(0);
			listeValeurs.add(3);
			listeValeurs.add(0);
			listeValeurs.add(5);
			break;
		case 3:
			listeValeurs.add(0);
			listeValeurs.add(5);
			listeValeurs.add(0);
			listeValeurs.add(5);
			break;
		default:
			listeValeurs.add(0);
			listeValeurs.add(5);
			listeValeurs.add(0);
			listeValeurs.add(5);
		}
		
		return listeValeurs;
	}
	
	public String getJsonMinMaxValuesFromNiveau() {
		
		ObjectMapper mapper = new ObjectMapper();
		ArrayNode arrayNode = mapper.createArrayNode();
		
		Integer rangNiveau = this.getRangNiveau();
		
		Integer nbreOperandes = 0;
		int minValues[];
		int maxValues[];
		
		switch(rangNiveau){
		case 1:
			nbreOperandes = 2;
			minValues = new int[]{0,0};
			maxValues = new int[]{3,3};
			break;
		case 2:
			nbreOperandes = 2;
			minValues = new int[]{0,0};
			maxValues = new int[]{3,5};
			break;
		case 3:
			nbreOperandes = 2;
			minValues = new int[]{0,0};
			maxValues = new int[]{5,5};
			break;
		default:
			nbreOperandes = 2;
			minValues = new int[]{0,0};
			maxValues = new int[]{3,3};
		}
		
		//CRéation du JSON
		for(int i = 1; i < nbreOperandes + 1; i++){
			ObjectNode objectNode = mapper.createObjectNode();
			objectNode.put("operande", i);
			objectNode.put("minVal", minValues[i - 1]);
			objectNode.put("maxVal", maxValues[i - 1]);
			
			arrayNode.add(objectNode);
		}
		
		return arrayNode.toString();
	}
}
