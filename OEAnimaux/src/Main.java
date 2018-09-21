package fr.objois

import fr.objois.oeanimaux.Animal;
import fr.objois.oeanimaux.Chat;
import fr.objois.oeanimaux.Cheval;
import fr.objois.oeanimaux.Chien;
import fr.objois.oeanimaux.Lapin;
import fr.objois.oeanimaux.Loup;
import fr.objois.oeanimaux.Vache;



public class Main {

	public static void main(String[] args) {

		System.out.println("Début du programme : ");

		// Class Chien
		Chien rex = new Chien();
		
		rex.setNom("Rex");
//		rex.nom = "Rex";
//		rex.race = "Berger allemand";
//		rex.taille = 50;
//		rex.poids = 30;
//		rex.couleur = "Blanc";

		rex.aboyer();
		rex.dormir();
		rex.jouer();
		rex.manger();
		rex.mordre();

		// Class Chat
		Chat orion = new Chat();
		orion.nom = "Orion";
		orion.race = "Bleu russe";
		orion.taille = 20;
		orion.poids = 10;
		orion.couleur = "gris";

		orion.miaule();
		orion.dormir();
		orion.jouer();
		orion.manger();
		orion.griffe();

		// Class Cheval
		Cheval garou = new Cheval();
		// Cheval garou = new Cheval("Garou", "Frison", 200,200,"noir");
		garou.nom = "Garou";
		garou.race = "Frison";
		garou.taille = 200;
		garou.poids = 200;
		garou.couleur = "noir";

		garou.hennir();
		garou.dormir();
		garou.jouer();
		garou.manger();
		garou.frapper();

		// Class Vache
		Vache marguerrite = new Vache();
		marguerrite.nom = "Marguerrite";
		marguerrite.race = "Angus";
		marguerrite.taille = 150;
		marguerrite.poids = 200;
		marguerrite.couleur = "noir";

		marguerrite.beugler();
		marguerrite.dormir();
		marguerrite.jouer();
		marguerrite.manger();

		// Class Loup
		Loup lupus = new Loup();
		lupus.nom = "Lupus";
		lupus.race = "Husky de Sibérie";
		lupus.taille = 50;
		lupus.poids = 30;
		lupus.couleur = "blanc";

		lupus.hurler();
		lupus.dormir();
		lupus.jouer();
		lupus.manger();
		lupus.mordre();

		// Class Lapin
		Lapin cookie = new Lapin();
		cookie.nom = "Cookie";
		cookie.race = "Lapin bélier";
		cookie.taille = 10;
		cookie.poids = 5;
		cookie.couleur = "marron";

		cookie.couiner();
		cookie.dormir();
		cookie.jouer();
		cookie.manger();
		cookie.manger();
		cookie.manger();

		Animal loup = new Loup("Loup", "loup garou", 115, 15, "bleu");

		Loup monAnimalLoup = (Loup) loup;
		monAnimalLoup.hurler();
		((Loup) loup).hurler();
	//	((Chat) loup).miaule();
		
		Chat chat1 = new Chat("Chat n°1", "Persan",125,125,"Rouge");
		
		System.out.println("jeu préféré : "+ chat1.getJeuPref());		
		
		chat1.setJeuPref("Rugby");		
		System.out.println("jeu préféré : "+ chat1.getJeuPref());
		
		chat1.setJeuPref("");
		System.out.println("jeu préféré : "+ chat1.getJeuPref());
		
		

	}

}
