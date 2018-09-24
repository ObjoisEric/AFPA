package fr.objois;

public class Utils {
	
	
	public static void verifPlume(boolean verifplume) {
		if(verifplume) {
			System.out.println("C'est un oiseau à plumes");
		}else {
			System.out.println("C'est oiseau n'à pas de  plumes");
		}
	}

	
	public static int calculMoyenne(int valeur1, int valeur2) {
		
		int resultat = ((valeur1+valeur2)/2);		
		return resultat;
		
	}
}
