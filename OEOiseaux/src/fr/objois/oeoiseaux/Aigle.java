package fr.objois.oeoiseaux;

public class Aigle extends Oiseaux implements OiseauVolant {	
	
	
	public Aigle() {
		super();
		
	}

	public Aigle(String nom, int taille, int poids, String race, boolean plumes) {
		super(nom, taille, poids, race, plumes);
		
	}
	
	
	public void chasser(String nomAnimal) {
		System.out.println(nomAnimal + " chasse");
	}
	
	@Override
	public void voler() {
		System.out.println(nom + " vole");
	}
	


}
