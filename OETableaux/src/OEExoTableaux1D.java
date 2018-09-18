import java.util.Scanner;
public class OEExoTableaux1D {

	public static void main(String[] args) {


		boolean trouver= false;
		int recherche=14;
		int [] entierPremiers = {2,3,5,7,11,13,1,19,23};

		for (int i = 0; i < entierPremiers.length; i++) {
			if(recherche == entierPremiers[i]) {
				trouver = true;
			}
		}

		if (trouver) {

			System.out.println("Le nombre " + recherche + " existe dans le taleau");

		}else {

			System.out.println("Le nombre " + recherche + " n'existe pas dans le taleau");

		}

		System.out.println("Afficher les éléments du tableau");
		String matiere [] = {"Java" , "Html", "CSS", "Javascript", "PHP", "C++","NodeJS", ".NET", "Typescript", "Golang", "Scala", "Kotlin"};


		for (int i = 0; i < matiere.length; i++) {

			System.out.println("la matière est : " + matiere[i]);

		}

		System.out.println("Afficher les éléments sur la meme ligne séparés par ','");
		int i = 0;
		for ( i = 0; i < matiere.length; i++) {

			if (i == 0 ) {

				System.out.print(matiere[i]);

			}else {	

				System.out.print(", " + matiere[i]);

			}
		}
		System.out.println();
		System.out.println("i : " + i);

		for ( i = 0; i < matiere.length; i++) {

			if (i == (matiere.length-1)) {

				System.out.println("la matière : " + matiere[i] + " = 10.");

			}else {

				System.out.println("la matière : " + matiere[i] + " = 10,");

			}
		}

		for ( i = 0; i < matiere.length; i++) {

			if (i == (matiere.length-1)) {

				System.out.println("la matière : " + matiere[i] +" à l'indice " + i+ " est égale à 10.");

			}else {

				System.out.println("la matière : " + matiere[i] +" à l'indice " + i + " est égale à 10,");

			}
		}


		Scanner sc = new Scanner(System.in);
		System.out.print("Saisir la matière à rechercher : ");
		String rechercheUser = sc.nextLine();

		for ( i = 0; i < matiere.length; i++) {

			if (rechercheUser.equals(matiere[i])) {

				System.out.println("La valeur " + rechercheUser + " se trouve à l'indice " + i );

			}else {

				System.out.println("la valeur " + rechercheUser +" est différente de la valeur présente dans le tableau à l'indice " + i );

			}
		}

		boolean existe = false;
		int indiceRecherche = 0;
		System.out.println();
		System.out.println("Affichage via boolean");
		System.out.println();
		for ( i = 0; i < matiere.length; i++) {

			if (rechercheUser.equals(matiere[i])) {

				existe = true;
				indiceRecherche = i;

			}
		}

		if (existe) {

			System.out.println("La valeur " + rechercheUser + " se trouve à l'indice " + indiceRecherche );

		}else {

			System.out.println("La valeur " + rechercheUser + " ne se trouve pas dans le tableau");

		}

		System.out.println();
		System.out.print("Saisir la taille du tableau : ");
		int tailleTableau = sc.nextInt();
		sc.nextLine();

		System.out.println("La taille du tableau est de " + tailleTableau);

		String [] tableauUser = new String[tailleTableau]; 

		for (int j = 0; j < tableauUser.length; j++) {			

			System.out.print("Saisissez la donnée "+ (j+1) +" : ");
			tableauUser[j] = sc.nextLine();			

		}

		for (int j = 0; j < tableauUser.length; j++) {

			System.out.println("la donnée "+ (j+1)+" est "+ tableauUser[j]);

		}


		

		double nombre1 = 0;
		double nombre2 = 0;
		double resultat = 0;
		String operation;
		int operationSelect;
		

		System.out.print("Saisir le nombre 1 : ");
		nombre1 = sc.nextInt();
		System.out.println();

		System.out.print("Saisir l'opération : ");
		operation = sc.nextLine();
		System.out.println();

		System.out.print("Saisir le nombre 2 : ");
		nombre2 = sc.nextInt();
		System.out.println();
		
		

		if (operation == "+") {

			operationSelect = 1;

		}else if (operation == "-") {

			operationSelect = 2;
			
		}else if (operation == "*") {

			operationSelect = 3;
			
		}else if ((operation == "/") && (nombre2 >= 0)) {

			operationSelect = 4;
			
		}else if (operation == "*") {

			operationSelect = 100;
			
		}else {
			operationSelect = 0;
		}


		switch (operationSelect) {
		case 0:
			System.out.println("Cette operateur n'est pas valide");
			break;
		case 1:
			resultat = nombre1 + nombre2;
			break;
		case 2:
			resultat = nombre1 - nombre2;
			break;
		case 3:
			resultat = nombre1 * nombre2;
			break;
		case 4:
			resultat = nombre1 / nombre2;
			break;
		case 100:
			System.out.println("division par 0 impossible");
			break;	
		default:	
			System.out.println("Une erreur s'est produite");
			break;
		}

		
		System.out.println();










		sc.close();
	}

}
