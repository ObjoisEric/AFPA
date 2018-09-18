import java.util.Scanner;
public class OECalculatriceMethode 
{
	
	//ouverture saisie clavier global
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{

		//declaration variable
		double nombre1=0;
		double nombre2=0;
		double resultat=0;
		String operation;
		int resultatSwitch = 0;
		int operationSelect = 0;
		boolean exit = false;
		
		
		
		do 
		{
			
		System.out.println("CALCULATRICE");
		//saisie nombre1
		System.out.print("Saisir le nombre : ");
		nombre1 = saisieUserDouble();	

		//saisie operation
		System.out.print("Saisir l'operation : ");
		operation = saisieUserString();

		//saisie nombre2
		System.out.print("Saisir le nombre : ");
		nombre2 = saisieUserDouble();

		//selection de l'operation à effectuer
		
		operationSelect = selectionOperation(operation, nombre2);		

		//effectuer l'operation
		
		if ((operationSelect >=1) && (operationSelect <= 4)) 
		{
			resultat = effectuerOperation(operationSelect, nombre1, nombre2);
		}
		else 
		{
			resultatSwitch = erreurOperation(operationSelect);
		}			
		

		System.out.println();

		//affichage du resultat
		
		affichageTraitement(nombre1, nombre2, operation, resultat, resultatSwitch);
		
		
		exit = demandeDeSortie(exit);
		
		
		} while (!exit);
		sc.close();
	}
	
	

	public static int saisieUserDouble() {		
		
		
		
		return sc.nextInt();		
	}
	
	public static String saisieUserString() {		
		
				
		
		return sc.next();
	}
	
	public static int selectionOperation (String operation, double nombre2) {
		
		int operationSelect;
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
		else if (nombre2 == 0) 
		{
			operationSelect = -1;
		}
		else 
		{
			operationSelect = 0;
		}
		
		return operationSelect;
	}
	
	public static double effectuerOperation(int operationSelect,double nombre1, double nombre2) {
		double resultat=0;
		
		switch (operationSelect) 
		{		
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
		}
		
		return resultat;
	}
	
	public static int erreurOperation(int operationSelect) {
		int erreur=0;
		switch (operationSelect) 
		{			
		case -1:
			erreur = 1;			
			break;
		case 0:
			erreur = 2;
			break;
		default:
			erreur = 3;
			break;
		}
		
		return erreur;
	}
	
	public static void affichageTraitement(double nombre1, double nombre2, String operation, double resultat,int resultatSwitch) 
	{
		
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
		
		
	}
	
	public static boolean demandeDeSortie(boolean exit)
	{
		String demandeSortie;		
		
		System.out.println("Voulez-vous sortir ? (Y)");
		
		demandeSortie = saisieUserString();
			
		
		if (demandeSortie.equals("Y")) 
		{ 
			exit = true;
			System.out.println("Fin du programme");			
		}
		return exit;
	}
}












































