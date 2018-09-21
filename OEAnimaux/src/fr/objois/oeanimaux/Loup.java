package fr.objois.oeanimaux;
public class Loup extends Animal {

	public Loup() {

	}

	public Loup(String nom, String race, int taille, int poids, String couleur) {
		super(nom, race, taille, poids, couleur);
	}

	public void hurler() {
		System.out.println(nom + " hurle.");
	}

	public void mordre() {
		System.out.println(nom + " mord.");
	}

}