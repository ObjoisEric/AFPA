package fr.objois.oeoiseaux;

public class Autruche extends Oiseaux {
	
	
	public Autruche() {
		super();		
	}
	
	public Autruche(String nom, int taille, int poids,String race, boolean plumes) {
		super(nom, taille, poids,race, plumes);		
	}

	public void voler() {
		System.out.println("Les autruches ne savent pas voler");
	}
	
	
}


