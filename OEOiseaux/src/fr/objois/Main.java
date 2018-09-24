package fr.objois;

import fr.objois.oeoiseaux.Aigle;
import fr.objois.oeoiseaux.Autruche;
import fr.objois.oeoiseaux.Manchot;
import fr.objois.oeoiseaux.Perruche;
import fr.objois.oeoiseaux.Pigeon;

public class Main {

	public static void main(String[] args) {

		Autruche autruche1 = new Autruche("autruche1", 250, 115000, "autruche", true);
		// System.out.println(autruche1.getNom());
		autruche1.manger();
		autruche1.voler();

		Aigle aigle1 = new Aigle("aigle1", 100, 6000, "aigle", true);
//		System.out.println(aigle1.getNom());			
		aigle1.boire();
		aigle1.chasser(aigle1.getNom());

		Manchot manchot1 = new Manchot("manchot1", 122, 35000, "manchot", true);
//		System.out.println(manchot1.getNom());			
		manchot1.manger();
		manchot1.nager();
		manchot1.voler();

		Perruche perruche1 = new Perruche("perruche1", 18, 30, "perruche", true);
//		System.out.println(perruche1.getNom());				
		perruche1.voler();

		Pigeon pigeon1 = new Pigeon("pigeon1", 34, 270, "pigeon", true);
//		System.out.println(pigeon1.getNom());				
		pigeon1.courir();

	}

}
