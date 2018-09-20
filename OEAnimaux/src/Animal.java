
public class Animal {

	public String nom;
	public String race;
	public int taille;
	public int poids;
	public String couleur;

	public Animal() {

	}

	public Animal(String nom, String race, int taille, int poids, String couleur) {
		
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

}
