package fr.objois.oeanimaux;

public class Animal {

	protected String nom;
	protected String race;
	protected int taille;
	protected int poids;
	protected String couleur;

	public Animal() {
		System.out.println("constructeur de la classe mère");
	}

	public Animal(String nom, String race, int taille, int poids, String couleur) {
		
		super();
		this.nom = nom;
		this.race = race;
		this.taille = taille;
		this.poids = poids;
		this.couleur = couleur;
	}

	public void manger() {
		System.out.println(nom + " mange.");
	}

	public void dormir() {
		System.out.println(nom + " dort.");
	}

	public void jouer() {
		System.out.println(nom + " joue.");
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getRace() {
		return race;
	}

	public void setRace(String race) {
		this.race = race;
	}

	public int getTaille() {
		return taille;
	}

	public void setTaille(int taille) {
		this.taille = taille;
	}

	public int getPoids() {
		return poids;
	}

	public void setPoids(int poids) {
		this.poids = poids;
	}

	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

}
