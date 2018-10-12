package fr.objois.oejusteprix;

import java.util.Scanner;

public class Factorielle {


	public static int calculFactorielle(int nombreSaisi) {

		int resultat = 1;
		for (int i = 1; i <= nombreSaisi; i++) {
			resultat *= i;	
		}
		return resultat;
	}
		
	static Scanner sc = new Scanner(System.in);
	public static int nombreASaisir() {
		int nombreSaisi = 0;
		
		do {
			System.out.println("veuillez saisir un numero :");
			nombreSaisi = Integer.parseInt(sc.next());
			if (nombreSaisi < 0) {
				System.out.println("c'est pas bon");
			}
		} while (nombreSaisi < 0);		
		
		return nombreSaisi;
	}
	

}
