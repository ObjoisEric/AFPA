package fr.objois.oeoiseaux;

public class Canard  extends Oiseaux implements OiseauQuiNage, OiseauVolant{

	public Canard() {
		super();
	}

	public Canard(String nom, int taille, int poids, String race, boolean plumes) {
		super(nom, taille, poids, race, plumes);
	}

	@Override
	public void voler() {
		System.out.println( "Je suis un canard qui n'aime pas voler, mais il sais voler");
		
	}

	@Override
	public void nager() {
		System.out.println( "Je suis un canard qui nage");
		
	}

	
}
