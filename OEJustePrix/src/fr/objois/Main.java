package fr.objois;
import java.util.Scanner;
import fr.objois.oejusteprix.JustePrix;


public class Main {	

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		int numeroATrouver = -1;
		int numeroSaisi = -1;
		int nombreEssai = 0;
		int nombreDejaSaisi[] = new int[100];
		int indexNombreDejaSaisi = 0;
		
		boolean numeroTrouver = false;		
		
		numeroATrouver = JustePrix.numeroAleatoire();		
		
		System.out.println("Le Juste Prix !");
		System.out.println();
		
		do {
			nombreEssai ++;
			numeroSaisi = JustePrix.numeroASaisir(nombreDejaSaisi,indexNombreDejaSaisi);
			indexNombreDejaSaisi ++;
			numeroTrouver = JustePrix.verifNombre(numeroATrouver, numeroSaisi, nombreEssai);
		} while (!numeroTrouver);
		
		
		
		
		
		
		
		
		sc.close();
	}
	

	

}
