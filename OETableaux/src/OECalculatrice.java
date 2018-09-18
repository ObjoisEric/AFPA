import java.util.Scanner;
public class OECalculatrice {

	public static void main(String[] args) {

		//declaration variable
		double nombre1=0;
		double nombre2=0;
		double resultat=0;
		String operation;
		int resultatSwitch = 0;
		int operationSelect = 0;

		//ouverture saisie clavier
		Scanner sc = new Scanner(System.in);

		//saisie nombre1
		System.out.print("Saisir le nombre 1 : ");
		nombre1 = sc.nextInt();
	

		//saisie operation
		System.out.print("Saisir l'opération : ");
		operation = sc.next();

		//saisie nombre2
		System.out.print("Saisir le nombre 2 : ");
		nombre2 = sc.nextInt();




		//selection de l'operation à effectuer
		if ("+".equals(operation))
		{

			operationSelect = 1;

		}
		else if ("-".equals(operation)) 
		{

			operationSelect = 2;

		}
		else if ("*".equals(operation)) 
		{

			operationSelect = 3;

		}
		else if (("/".equals(operation)) && (nombre2 != 0)) 
		{

			operationSelect = 4;

		}
		else if (nombre2 == 0) {

			operationSelect = -1;

		}
		else 
		{

			operationSelect = 0;

		}

		//effectuer l'operation
		switch (operationSelect) 
		{		
		case 1:
			resultat = nombre1 + nombre2;
			resultatSwitch = 0;
			break;
		case 2:
			resultat = nombre1 - nombre2;
			resultatSwitch = 0;
			break;
		case 3:
			resultat = nombre1 * nombre2;
			resultatSwitch = 0;
			break;
		case 4:
			resultat = nombre1 / nombre2;
			resultatSwitch = 0;
			break;
		case -1:
			resultatSwitch = 1;			
			break;
		case 0:
			resultatSwitch = 2;
			break;
		default:
			resultatSwitch = 3;
			break;
		}

		System.out.println();

		//affichage du resultat
		switch (resultatSwitch) 
		{
		case 0:
			System.out.println(nombre1 + " " + operation +" "+ nombre2 + " = " + resultat);			
			break;
		case 1:
			System.out.println("division par 0 impossible");
			break;
		case 2:
			System.out.println("Cette operateur n'est pas valide");
			break;
		case 3:
			System.out.println("Une erreur s'est produite dans la selection de l'operation");
			break;
		default:
			System.out.println("Une erreur s'est produite");
			break;
		}

		sc.close();
	}
}












































