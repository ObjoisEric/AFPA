import java.util.Scanner;
public class OELectureClavier {

	public static void main(String[] args) {	
				
		
		Scanner sc = new Scanner(System.in);		
		System.out.println("DEBUT");
		
		/*String chaine = sc.nextLine();
		System.out.println("vous avez saisi : " + chaine);
		int entier = sc.nextInt();
		System.out.println("vous avez saisi : " + entier);
		float decimal = sc.nextFloat();
		System.out.println("vous avez saisi : " + decimal);
		double decimalDouble = sc.nextDouble();
		System.out.println("vous avez saisi : " + decimalDouble);
		boolean bool = sc.nextBoolean();	
		System.out.println("vous avez saisi : " + bool);
		
		if(bool) {
			System.out.println("vous avez saisie true dans le boolean !!");
		}
		System.out.println("entier + 100 = " + (entier + 100));*/
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(a>=b) {
			System.out.println(a + " >= " + b);
		}else {
			System.out.println(a + " < " + b);
		}
		
		
		
		
		System.out.println("FIN");
	
		sc.close();
	
	
	
	
	}
}
