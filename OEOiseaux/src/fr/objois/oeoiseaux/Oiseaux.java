package fr.objois.oeoiseaux;

public class Oiseaux {
	
	protected String nom;
	protected int taille;
	protected int poids;
	protected String race;
	protected boolean plumes;
	
	
	
	public Oiseaux() {
			
	}

	public Oiseaux(String nom, int taille, int poids, String race, boolean plumes) {
		super();
		this.nom = nom;
		this.taille = taille;
		this.poids = poids;
		this.race = race;
		this.plumes = plumes;
	}	

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
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

	public String getRace() {
		return race;
	}

	public void setRace(String race) {
		this.race = race;
	}

	public boolean isPlumes() {
		return plumes;
	}

	public void setPlumes(boolean plumes) {
		this.plumes = plumes;
	}
	
	public void manger() {
		System.out.println(nom + " mange");
	}
	
	public void boire() {
		System.out.println(nom + " boit");
	}	
	
	public void jouer() {
		System.out.println(nom + " joue");
	}
	
	public void courir() {
		System.out.println(nom + " court");
	}
	
	public void sauter() {
		System.out.println(nom + " saute");
	}
	
	
	
	
	
}
