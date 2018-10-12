package fr.objois;

import java.util.Scanner;
import fr.objois.oejusteprix.Factorielle;

public class Main {	

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		int nombreSaisi = 0;
		int resultatFactorielle = 0;
		
		nombreSaisi = Factorielle.nombreASaisir();
		resultatFactorielle = Factorielle.calculFactorielle(nombreSaisi);
		
		
		System.out.println("le resultat est : "+resultatFactorielle);
		
		sc.close();
	}

}
