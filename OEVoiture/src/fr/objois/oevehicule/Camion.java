package fr.objois.oevehicule;

public class Camion extends Vehicule {

	private int capacite;

	public Camion() {
		super();
	}

	public Camion(String marque, int vitesse, int puissance, double prix, int kilometrage) {
		super(marque, vitesse, puissance, prix, kilometrage);
	}

	public int getCapacite() {
		return capacite;
	}

	public void setCapacite(int capacite) {
		this.capacite = capacite;
	}

}
