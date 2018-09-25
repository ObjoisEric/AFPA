package fr.objois.oevehicule;

public class Bateau extends Vehicule implements VehiculeQuiNavigue{

	public Bateau() {
	}

	public Bateau(String marque, int vitesse, int puissance, double prix, int kilometrage) {
		super(marque, vitesse, puissance, prix, kilometrage);
	}

	@Override
	public void vehiculequinavigue() {
		
	}

}
