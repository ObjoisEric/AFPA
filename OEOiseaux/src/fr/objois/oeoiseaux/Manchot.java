package fr.objois.oeoiseaux;

public class Manchot extends Oiseaux implements OiseauQuiNage {

	public Manchot() {
		super();
		
	}

	public Manchot(String nom, int taille, int poids, String race, boolean plumes) {
		super(nom, taille, poids, race, plumes);
		
	}

	@Override
	public void nager() {		
		System.out.println( "Le manchot nage");
	}
	
	
	
	
}
