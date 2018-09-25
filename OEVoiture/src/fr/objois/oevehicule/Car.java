package fr.objois.oevehicule;

public class Car extends Vehicule {

	private int nombreDePlaces;

	public Car() {
		super();
	}

	public Car(String marque, int vitesse, int puissance, double prix, int kilometrage) {
		super(marque, vitesse, puissance, prix, kilometrage);
	}

	public int getNombreDePlaces() {
		return nombreDePlaces;
	}

	public void setNombreDePlaces(int nombreDePlaces) {
		this.nombreDePlaces = nombreDePlaces;
	}

}
