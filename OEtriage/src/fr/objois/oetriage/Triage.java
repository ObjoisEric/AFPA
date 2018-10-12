package fr.objois.oetriage;

import java.util.Scanner;

public class Triage {
	
	static Scanner sc = new Scanner(System.in);
	public static int nombreDeSaisi() {	
		
		int nombreDeSaisi = 0;
		
		do {
			System.out.println("veuillez saisir un nombre positif:");
			nombreDeSaisi = Integer.parseInt(sc.next());
			if (nombreDeSaisi <= 0) {
				System.out.println("saisissez un nombre valide");
			}
		} while (nombreDeSaisi <= 0);		
		
		return nombreDeSaisi;
	}
	public static int[] saisieDeNombre(int[] saisiNombre) {
		
		for (int i = 0; i < saisiNombre.length; i++) {
			System.out.println("saisir un nombre :");
			saisiNombre[i]= Integer.parseInt(sc.next());
		}
		
		for (int i = 0; i < saisiNombre.length; i++) {
			if (i < saisiNombre.length - 1) {
				System.out.print(saisiNombre[i]+", ");
			}else {
				System.out.print(saisiNombre[i]+".");
			}			
		}
		System.out.println();
		return saisiNombre;
	}
	public static int nombrePlusBas(int[] saisiNombre) {
		
		int nombrePlusBas = saisiNombre[0];
	
		for (int i = 0; i < saisiNombre.length; i++) {
			
			if (saisiNombre[i] < nombrePlusBas) {
				nombrePlusBas = saisiNombre[i];
			}
		}			
		return nombrePlusBas;
	}
	public static int nombrePlusGrand(int[] saisiNombre) {
		
		int nombrePlusGrand = saisiNombre[0];
	
		for (int i = 0; i < saisiNombre.length; i++) {
			
			if (saisiNombre[i] > nombrePlusGrand) {
				nombrePlusGrand = saisiNombre[i];
			}
		}			
		return nombrePlusGrand;
	}
	public static void plusPetitPlusGrand(int[] saisiNombre) {
		
		int valeurTemp = 0;
		boolean tableTrier = false;
		int  i = 0;
		
		do {
			if (i == saisiNombre.length-1) {
				tableTrier = true;				
			}else if (saisiNombre[i] > saisiNombre[i+1]) { 				
				valeurTemp = saisiNombre[i+1]; 
				saisiNombre[i+1] = saisiNombre[i];
				saisiNombre[i] = valeurTemp;			
				if (i!=0) {
					i=0;
				}				
			}else if(saisiNombre[i] <= saisiNombre[i+1]) {
				i++;
			}			
		} while (!tableTrier);
		
		for (int j = 0; j < saisiNombre.length; j++) {
			System.out.print(saisiNombre[j]+" ");
		}
		System.out.println();
	}
	public static void plusGrandPlusPetit(int[] saisiNombre) {
		
		int valeurTemp = 0;
		boolean tableTrier = false;
		int  i = 0;
		
		do {
			if (i == saisiNombre.length-1) {
				tableTrier = true;				
			}else if (saisiNombre[i] <= saisiNombre[i+1]) { 				
				valeurTemp = saisiNombre[i+1]; 
				saisiNombre[i+1] = saisiNombre[i];
				saisiNombre[i] = valeurTemp;			
				if (i!=0) {
					i=0;
				}				
			}else if(saisiNombre[i] > saisiNombre[i+1]) {
				i++;
			}			
		} while (!tableTrier);
		
		for (int j = 0; j < saisiNombre.length; j++) {
			System.out.print(saisiNombre[j]+" ");			
		}	
		System.out.println();
	}
	
	
	

}
