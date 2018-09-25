package fr.objois.oevehicule;

public class Voiture extends Vehicule {
	
	private int nombreDePortes;

	public Voiture() {
		super();
	}

	public Voiture(String marque, int vitesse, int puissance, double prix, int kilometrage) {
		super(marque, vitesse, puissance, prix, kilometrage);
	}

	public int getNombreDePortes() {
		return nombreDePortes;
	}

	public void setNombreDePortes(int nombreDePortes) {
		this.nombreDePortes = nombreDePortes;
	}

	
	

	
	
	
}
