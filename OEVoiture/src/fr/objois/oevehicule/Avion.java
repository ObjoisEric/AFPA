package fr.objois.oevehicule;

public class Avion extends Vehicule implements VehiculeQuiVole {

	public Avion() {
	}

	public Avion(String marque, int vitesse, int puissance, double prix, int kilometrage) {
		super(marque, vitesse, puissance, prix, kilometrage);
	}

	@Override
	public void vehiculequivole() {
		
	}

}
