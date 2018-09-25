package fr.objois;

import fr.objois.oevehicule.*;

public class Main {

	public static void main(String[] args) {

		Voiture c3 = new Voiture();		
		c3.setMarque("citroen");
		c3.setCouleur("rouge");
		c3.setVitesse(230);
		c3.setPuissance(6);
		c3.setPrix(15000);
		c3.setKilometrage(0);
		c3.setNombreDePortes(5);
		
		
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
		
		
		Camion h16 = new Camion();
		
		h16.setMarque("volvo");
		h16.setCouleur("vert");
		h16.setVitesse(180);
		h16.setPuissance(24);
		h16.setPrix(100000);
		h16.setKilometrage(5000);
		h16.setCapacite(26);
		
		
		
		System.out.println();
		System.out.println(h16.getMarque()+" "+h16.getCapacite());
		Camion camionUtilise = h16;
		
		Camion h17 = null;
		if (camionUtilise.getCapacite()<25) {
			
			System.out.println("changement de camion");
			
			h17 = new Camion();			
			h17.setMarque("mercedes");
			h17.setCouleur("blanc");
			h17.setVitesse(200);
			h17.setPuissance(75);
			h17.setPrix(150000);
			h17.setKilometrage(0);
			h17.setCapacite(30);
			camionUtilise = h17;
			
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
		
		camionUtilise.demarrer();
		camionUtilise.accelerer();
		camionUtilise.rouler();

		


		
		
		
		
	}

}
