package fr.objois.oecarre;

import java.util.Scanner;

public class OECarre {

	static Scanner sc = new Scanner(System.in);
	public static int saisiNombre() {	

		int nombreSaisi = 0;

		do {
			System.out.println("veuillez saisir un nombre positif:");
			nombreSaisi = Integer.parseInt(sc.next());
			if (nombreSaisi <= 0) {
				System.out.println("saisissez un nombre valide");
			}
		} while (nombreSaisi <= 0);		

		return nombreSaisi;
	}
	public static void tableauPrint(int nombreSaisi) {

		for (int i = 0; i < nombreSaisi; i++) {
			for (int j = 0; j < nombreSaisi; j++) {
				if (j < nombreSaisi - 1) {
					System.out.print("* ");
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}

	}
	public static void tableauPrintCreux(int nombreSaisi) {

		for (int i = 0; i < nombreSaisi; i++) {
			for (int j = 0; j < nombreSaisi; j++) {			

				if (i == 0 || j == 0 || j == nombreSaisi-1 || i == nombreSaisi-1) {		

					if (j < nombreSaisi - 1) {
						System.out.print("* ");
					}else {
						System.out.print("*");
					}

				}else {					
					System.out.print("  ");
				}				
			}			
			System.out.println();			
		}		
	}
	public static void tableauPrintTriangle(int nombreSaisi) {
		int indexTriangle = 0;
		for (int i = 0; i < nombreSaisi; i++) {
			for (int j = 0; j < nombreSaisi; j++) {			
				if (indexTriangle <= i) {
					indexTriangle++;
					System.out.print(indexTriangle+" ");
				}else {
					System.out.print("  ");
				}				
			}
			indexTriangle = 0;
			System.out.println();			
		}		
	}
	public static void tableauPrintLosange(int nombreSaisi) {
		int sommetLosange = ((int) Math.ceil(nombreSaisi/2.0))-1; 
		System.out.println(sommetLosange);
		if (nombreSaisi%2 != 0) {
			for (int i = 0; i < nombreSaisi; i++) {
				for (int j = 0; j < nombreSaisi; j++) {		
					if (i == 0 || i == (nombreSaisi-1)) {
						if (sommetLosange == j) {
							System.out.print("* ");							
						}else {							
							System.out.print("  ");
						}					
					}else if(i < sommetLosange) {
						if(((sommetLosange-i)== j) || (sommetLosange+i)== j){
							System.out.print("* ");	
						}else {
							System.out.print("  ");
						}
					}else {
						if(((i-sommetLosange)== j)||(i+sommetLosange)== j){
							System.out.print("* ");	
						}else {
							System.out.print("  ");
						}
					}
				}
				System.out.println();
			}
		}else {
			System.out.println("losange impossible");
		}

	}



}
