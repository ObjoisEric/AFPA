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

		System.out.println("Afficher les �l�ments du tableau");
		String matiere [] = {"Java" , "Html", "CSS", "Javascript", "PHP", "C++","NodeJS", ".NET", "Typescript", "Golang", "Scala", "Kotlin"};


		for (int i = 0; i < matiere.length; i++) {

			System.out.println("la mati�re est : " + matiere[i]);

		}

		System.out.println("Afficher les �l�ments sur la meme ligne s�par�s par ','");
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

				System.out.println("la mati�re : " + matiere[i] + " = 10.");

			}else {

				System.out.println("la mati�re : " + matiere[i] + " = 10,");

			}
		}
		
		for ( i = 0; i < matiere.length; i++) {

			if (i == (matiere.length-1)) {

				System.out.println("la mati�re : " + matiere[i] +" � l'indice " + i+ " est �gale � 10.");

			}else {

				System.out.println("la mati�re : " + matiere[i] +" � l'indice " + i + " est �gale � 10,");

			}
		}
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Saisir la taille du tableau : ");
		int tailleTableau = sc.nextInt();
		sc.nextLine();
		
		System.out.println("La taille du tableau est de " + tailleTableau);
		
		String [] tableauUser = new String[tailleTableau]; 

		for (int j = 0; j < tableauUser.length; j++) {
			
			
			System.out.println("Saisissez la donn�e "+ (j+1) +" : ");
			tableauUser[j] = sc.nextLine();			
			
			
		}

		
		for (int j = 0; j < tableauUser.length; j++) {
			
			System.out.println("la donn�e "+ (j+1)+" est "+ tableauUser[j]);
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();
	}

}
