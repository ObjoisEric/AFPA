package fr.objois.oeoiseaux;

public class Perruche extends Oiseaux implements OiseauVolant {

	public Perruche() {
		super();
		
	}

	public Perruche(String nom, int taille, int poids, String race, boolean plumes) {
		super(nom, taille, poids, race, plumes);
		
	}
	
	@Override
	public void voler() {
		System.out.println(nom + " vole");
	}
}
