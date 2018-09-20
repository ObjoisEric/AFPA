
public class Main {
	
	public static void main(String[] args ) {
		
		System.out.println("Début du programme : ");
		Ville paris  = new Ville();
		paris.nom = "Paris";
		paris.nombreHabitants = 10;
		paris.sup = 100;
		
		System.out.println("--------------------Paris----------------------------");
		System.out.println("Nom : " + paris.nom);
		System.out.println("Nombre d'habitants : " + paris.nombreHabitants);
		System.out.println("Sup : " + paris.sup);
		
		Ville marseille = new Ville();
		marseille.nom = "Marseille";
		marseille.nombreHabitants = 200;
		marseille.sup = 95;
		
		System.out.println("--------------------Marseille------------------------------");
		System.out.println("Nom : " + marseille.nom);
		System.out.println("Nombre d'habitants : " + marseille.nombreHabitants);
		System.out.println("Sup : " + marseille.sup);		
		

		
		

		System.out.println("--------------------Liverpool------------------------------------");
		Ville liverpool = new Ville("Liverpool",500,50);				
		System.out.println("Nom : " + liverpool.nom);
		System.out.println("Nombre d'habitants : " + liverpool.nombreHabitants);
		System.out.println("Sup : " + liverpool.sup);
		
		System.out.println("---------------------Lille-----------------------------------");		
		Ville lille = new Ville("Lille", 400);
		System.out.println("Nom : " + lille.nom);
		System.out.println("Nombre d'habitants : " + lille.nombreHabitants);
		System.out.println("Sup : " + lille.sup);
		
		
		System.out.println("---------------------Barcelone-----------------------------------");
		
		Ville barcelone = new Ville(750, 150);
		System.out.println("Nom : " + barcelone.nom);
		System.out.println("Nombre d'habitants : " + barcelone.nombreHabitants);
		System.out.println("Sup : " + barcelone.sup);
		
		
		System.out.println("---------------------Lumière-----------------------------------");
		System.out.println("Lumiere : "+ paris.nom +" "+ paris.etatLumiere);
		System.out.println("Lumiere : "+ marseille.nom+" " + marseille.etatLumiere);
		System.out.println("Lumiere : "+lille.nom+" "+lille.etatLumiere);
		System.out.println("Lumiere : "+liverpool.nom+" "+liverpool.etatLumiere);
		
		paris.allumerLesLumieres();
		System.out.println("Lumiere : "+ paris.nom +" "+ paris.etatLumiere);
		marseille.allumerLesLumieres();
		System.out.println(marseille.etatLumiere);
		lille.allumerLesLumieres();
		System.out.println(lille.etatLumiere);
		liverpool.allumerLesLumieres();
		System.out.println(liverpool.etatLumiere);
		
		
		lille.eteindreLesLumieres();
		
		
	}

}
