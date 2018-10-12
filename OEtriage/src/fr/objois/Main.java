package fr.objois;
import java.util.Scanner;

import fr.objois.oetriage.Triage;
public class Main {
	
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		int nombreDeSaisi = 0;
		int nombre = 0;
		
		nombreDeSaisi = Triage.nombreDeSaisi();
		
		int saisiNombre[] = new int [nombreDeSaisi]; 
		
		saisiNombre = Triage.saisieDeNombre(saisiNombre);		
		nombre = Triage.nombrePlusBas(saisiNombre);
		
		System.out.println("le nombre le plus bas : "+ nombre );
		
		nombre = Triage.nombrePlusGrand(saisiNombre);
		
		System.out.println("le nombre le plus grand : "+ nombre );
		System.out.println("plus petit au plus grand : ");
		Triage.plusPetitPlusGrand(saisiNombre);
		System.out.println("plus grand au plus petit : ");
		Triage.plusGrandPlusPetit(saisiNombre);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();
	}

}
