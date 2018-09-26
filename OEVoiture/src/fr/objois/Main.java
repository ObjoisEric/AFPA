package fr.objois;

import fr.objois.oevehicule.*;

public class Main {

	public static void main(String[] args) {

		
		//crétaion de l'objet voiture c3 avec les valeurs 
		Voiture c3 = new Voiture();		
		c3.setMarque("citroen");
		c3.setCouleur("rouge");
		c3.setVitesse(230);
		c3.setPuissance(6);
		c3.setPrix(15000);
		c3.setKilometrage(0);
		c3.setNombreDePortes(5);
		
		//appelle des 3 méthodes pour l'objet c3 
		c3.demarrer();
		c3.accelerer();
		c3.rouler();
		
		
		//try : essaye de faire ce qu'il y as dans {}
		//catch : en cas d'exception faire ça
		//intéret : ne plante pas le programme en cas d'erreur!
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		/*int i = 0 ; 
		try {
			System.out.println("debut de la div");
			System.out.println(10/i);
		}catch (Exception e) {
			System.out.println("Impossible de diviser par 0");
		}*/
		
		
		System.out.println("Je roule depuis 1h j'ai besoin de faire une pause");
		c3.freiner();
		System.out.println("nombre porte de la voiture : "+ c3.getNombreDePortes());
		
		//creation de l'objet camion h16 avec ces valeurs ainsi que l'objet camion camionUtiliser
		Camion h16 = new Camion();
		Camion camionUtiliser = null;
		
		h16.setMarque("volvo");
		h16.setCouleur("vert");
		h16.setVitesse(180);
		h16.setPuissance(24);
		h16.setPrix(100000);
		h16.setKilometrage(5000);
		h16.setCapacite(26);
		
		
		
		System.out.println();
		System.out.println(h16.getMarque()+" "+h16.getCapacite());
		//le camionUtiliser est égale à celui h16
		camionUtiliser = h16;
		
		Camion h17 = null;
		if (camionUtiliser.getCapacite()<25) {
			
			System.out.println("changement de camion");
			
			h17 = new Camion();			
			h17.setMarque("mercedes");
			h17.setCouleur("blanc");
			h17.setVitesse(200);
			h17.setPuissance(75);
			h17.setPrix(150000);
			h17.setKilometrage(0);
			h17.setCapacite(30);
			camionUtiliser = h17;
			
		}
		
//		if (h17 != null ) {
//			System.out.println(h17.getMarque());
//			h17.demarrer();
//			h17.accelerer();
//			h17.rouler();			
//		}else {
//			System.out.println(h16.getMarque());
//			h16.demarrer();
//			h16.accelerer();
//			h16.rouler();	
//		}
		
		camionUtiliser.demarrer();
		camionUtiliser.accelerer();
		camionUtiliser.rouler();

		


		
		
		
		
	}

}
