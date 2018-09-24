package fr.objois.oeoiseaux;

public class Pigeon extends Oiseaux implements OiseauVolant {

	public Pigeon() {
		super();
		
	}

	public Pigeon(String nom, int taille, int poids, String race, boolean plumes) {
		super(nom, taille, poids, race, plumes);
		
	}

	
	@Override
	public void voler() {
		System.out.println(nom + " vole");
	}
	
}
