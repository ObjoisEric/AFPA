package fr.objois.oeanimaux;

public class Chat extends Animal {

	private String couleurDesYeux = "bleu";
	private String jeuPref = "foot";

	public Chat() {
		super();
	}

	public Chat(String nom, String race, int taille, int poids, String couleur) {
		super(nom, race, taille, poids, couleur);
		// TODO Auto-generated constructor stub
	}

	public void miaule() {
		System.out.println(nom + " miaule.");
	}

	public void griffe() {
		System.out.println(nom + " griffe.");
	}

	public String getCouleurDesYeux() {
		return couleurDesYeux;

	}

	public String getJeuPref() {
		return jeuPref;

	}

	public void setJeuPref(String jeuPref) {
		if ("".equals(jeuPref)) {
			System.out.println("veuillez rentrer une valeur valide");
			
		}else {
			this.jeuPref = jeuPref;
		}
	}
}
