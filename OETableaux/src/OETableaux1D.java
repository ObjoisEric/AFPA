
public class OETableaux1D {

	public static void main(String[] args) {		

		int entiersPremiers[] = {2,3,5,7,11,13,17,19,23};
		int [] tableauP = {2,4,6,8,10,12};
		int [] tableauImp = new int[5];
		tableauImp[0] = 1 ;
		tableauImp[1] = 3 ;
		tableauImp[2] = 5 ;
		tableauImp[3] = 7 ;
		tableauImp[4] = 9 ;

		int tailleTableau = entiersPremiers.length;

		System.out.println("la taille du tableau : " + tailleTableau);

		System.out.println("element 1 du tableau : " + entiersPremiers[0]);
		System.out.println("element 2 du tableau : " + entiersPremiers[1]);
		System.out.println("element 3 du tableau : " + entiersPremiers[2]);
		System.out.println("element 4 du tableau : " + entiersPremiers[3]);
		System.out.println("element 5 du tableau : " + entiersPremiers[4]);
		System.out.println("element 6 du tableau : " + entiersPremiers[5]);
		System.out.println("element 7 du tableau : " + entiersPremiers[6]);
		System.out.println("element 8 du tableau : " + entiersPremiers[7]);
		System.out.println("element 9 du tableau : " + entiersPremiers[8]);

		/*
		 *  Parcourir le tableau et afficher le contenu
		 */
		System.out.println("Traitement en utilisant une boucle");
		for (int i = 0; i < entiersPremiers.length; i++) {
			System.out.println("element " +(i+1) + " du tableau : " + entiersPremiers[i]);
		}
		
		/*
		 *  Parcourir le tableau et afficher le contenu
		 *  Tableau de chaines de caractères
		 */

		String chaines [] = {"Java", "Html", "Css", "Javascipt", "PHP", "C++","NodeJS"};
		System.out.println("La première chaine : " + chaines[0]);

		for (int i = 0; i < chaines.length; i++) {
			System.out.println("Matière " +(i+1)+ " : " + chaines[i]);
		}
		
		/*
		 *  Parcourir le tableau et appliquer un traitement
		 */
		
		int resultat = 0;
		for (int i = 0; i < entiersPremiers.length; i++) {
			resultat = resultat + entiersPremiers[i];
			System.out.println("Resultat int : "+resultat);
		}
		System.out.println("resultat final : " + resultat);

		int resultatMult = 1;
		for (int i = 0; i < entiersPremiers.length; i++) {
			resultatMult = resultatMult * entiersPremiers[i];
			System.out.println("ResultatMult int : "+resultatMult);
		}
		System.out.println("resultatMult final : " + resultatMult);
		/*
		 *  Parcourir le tableau et appliquer un traitement
		 *  Chaines de caractères
		 */

		String resultatChaines = "";
		for (int i = 0; i < chaines.length; i++) {
			resultatChaines += chaines[i];
			System.out.println("ResultatChaines int : "+resultatChaines);
		}
		System.out.println("resultatChaines final : " + resultatChaines);

		/*
		 *  Parcourir le tableau et chercher un élément
		 *  Condition if
		 */

		int valeur = 13;
		for (int i = 0; i < entiersPremiers.length; i++) {
			if(entiersPremiers[i]==valeur) {
				System.out.println("le tableau contient la valeur : "+entiersPremiers[i]);
			}
		}
		



		System.out.println("FIN!");














	}

}
