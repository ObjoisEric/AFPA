package fr.objois;

import fr.objois.oecarre.OECarre;

public class Main {

	public static void main(String[] args) {
		
		int nombreSaisi = 0;
		
		nombreSaisi = OECarre.saisiNombre();
		
		OECarre.tableauPrint(nombreSaisi);
		System.out.println("---------------------------------------------------------------");
		OECarre.tableauPrintCreux(nombreSaisi);
		System.out.println("---------------------------------------------------------------");
		OECarre.tableauPrintTriangle(nombreSaisi);
		System.out.println("---------------------------------------------------------------");
		OECarre.tableauPrintLosange(nombreSaisi);
		System.out.println("---------------------------------------------------------------");

		System.out.println("---------------------------------------------------------------");

		System.out.println("---------------------------------------------------------------");

		System.out.println("---------------------------------------------------------------");

		
	}

}
