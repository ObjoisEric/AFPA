
public class OEMethodes {
// public static typeDeRetour nomDeLaMethode(args....) {
// }
	public static void main(String[] args) {
		int addition1215 = addition(12,15);
		System.out.println(addition1215);
		
		int addition1516 = addition(15,16);
		System.out.println(addition1516);
		
		int addition2533 = addition(25,33);
		System.out.println(addition2533);
		
		
		double soustraction2533 = soustraction(25,33);
		System.out.println(soustraction2533);
		
		double multiplication1516 = multiplication(15,16);
		System.out.println(multiplication1516);

		double division1515 = division(20,20);
		System.out.println(division1515);
	}

	public static int addition(int nombre1, int nombre2) {
		int resultat = nombre1 + nombre2;
		return resultat;
	}
	
	public static double soustraction(double nombre1, double nombre2) {
		double resultat =  nombre1 - nombre2;
		return resultat;
		
	}
	
	public static double multiplication(double nombre1, double nombre2) {
		double resultat =  nombre1 * nombre2;
		return resultat;
		
	}
	
	public static double division(double nombre1, double nombre2) {
		double resultat=0;
		if (nombre2 != 0) {
			 resultat =  nombre1 / nombre2;
		}
		 
		return resultat;
		
	}
}
