package fr.objois.oevehicule;

public class Vehicule {

	protected String marque;
	protected String couleur;
	protected int vitesse;
	protected int puissance;
	protected double prix;
	protected int kilometrage;

	public String getCouleur() {
		return couleur;
	}

	

	public Vehicule(String marque, int vitesse, int puissance, double prix, int kilometrage) {
		super();
		this.marque = marque;
		this.vitesse = vitesse;
		this.puissance = puissance;
		this.prix = prix;
		this.kilometrage = kilometrage;
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}
	
	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	public Vehicule() {

	}

	public int getVitesse() {
		return vitesse;
	}

	public void setVitesse(int vitesse) {
		this.vitesse = vitesse;
	}

	public int getPuissance() {
		return puissance;
	}

	public void setPuissance(int puissance) {
		this.puissance = puissance;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public int getKilometrage() {
		return kilometrage;
	}

	public void setKilometrage(int kilometrage) {
		this.kilometrage = kilometrage;
	}

	public void demarrer() {
		System.out.println(marque + " démarre");
	}

	public void accelerer() {
		System.out.println(marque + " accélere");
	}

	public void freiner() {
		System.out.println(marque + " freine");
	}

	public void rouler() {
		
		System.out.println(marque + " roule");
	}

}
