package fr.objois.oeoiseaux;

public class Manchot extends Oiseaux {

	public Manchot() {
		super();
		
	}

	public Manchot(String nom, int taille, int poids, String race, boolean plumes) {
		super(nom, taille, poids, race, plumes);
		
	}

	public void nager() {		
		System.out.println( "Le manchot nager");
	}
	
	@Override
	public void voler() {
		System.out.println("Les manchots ne savent pas voler");
	}
	
	
}
