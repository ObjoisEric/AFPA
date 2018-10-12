package fr.objois.oejusteprix;

import java.util.Scanner;

public class JustePrix {

	public static int numeroAleatoire() {
		
		int numero = 0 ;		
					
		numero = (int)Math.round(Math.random()*100);	
		//System.out.println("le numero a trouver est :" + numero);
		
		return numero;
	}
	
	static Scanner sc = new Scanner(System.in);
	public static int numeroASaisir(int nombreDejaSaisi[],int indexNombreDejaSaisi) {
		
		int numeroSaisi = -1;
		boolean nombreBon = true;
		
		
		do {
			nombreBon = true;
			System.out.println("Saisir un nombre : ");
			try {
				numeroSaisi = Integer.parseInt(sc.next());
				if (numeroSaisi > 100 | numeroSaisi < 0) {
					System.out.println("numero non valide pour ce jeu !");
					nombreBon = false;
				}else {
					for (int i = 0; i < indexNombreDejaSaisi; i++) {
						if (numeroSaisi == nombreDejaSaisi[i]) {
							System.out.println("Ce numero a déja était saisi");
							nombreBon = false;
						}
					}
				}
			}catch (Exception e) {
				System.out.println("Ceci n'est pas un nombre");
				nombreBon = false ;
			}			
		} while (!nombreBon);
		
		//afficher tableau nombre saisi pour test
		nombreDejaSaisi[indexNombreDejaSaisi] = numeroSaisi;
		System.out.println("nombre déja saisi :");
		for (int i = 0; i < indexNombreDejaSaisi + 1 ; i++) {
			System.out.print(nombreDejaSaisi[i]);
			if (i < indexNombreDejaSaisi) {
				System.out.print(", ");
			}else {
				System.out.print(".");
			}
		}
		System.out.println();
		
		
		return numeroSaisi;
	}
	
	public static boolean verifNombre(int nombreATrouver,int nombreSaisi, int nombreEssai) {
		
		boolean nombreTrouver = false;
		
		if (nombreSaisi > nombreATrouver) {
			System.out.println("le nombre a trouver est plus petit");
		}else if(nombreSaisi < nombreATrouver) {
			System.out.println("le nombre a trouver est plus grand");
		}else {
			System.out.println("vous avez trouver le bon nombre en "+ nombreEssai+ " essai!");
			nombreTrouver = true;
		}
		
		
		return nombreTrouver;
	}
	
	
	
	

}
