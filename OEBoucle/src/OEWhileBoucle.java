
public class OEWhileBoucle {

	public static void main(String[] args) {
		
		/* BOUCLE WHILE
		 * while (condition) {
		 * 		traitement;
		 * }
		 */
		
		
		
		
		
		int a = 10 ;		
  		
		/*System.out.println("la variable a : "+ a);		
		a = a + 1 ;
		System.out.println("la variable a : "+ a);		
		a++;
		System.out.println("la variable a : "+ a);
		a = a - 1 ;
		a--;		
		*/

		while (a > 2 ) {
			System.out.println("la variable a : " + a + " est > 2");	
			a--;			
		}
		
		while ( a < 0 ) {
			System.out.println("la variable a : " + a + " est < 0");
		}
		
		System.out.println("la variable a : " + a + " est <= 2");	
		System.out.println("Fin");
		
		boolean bool = a > 5;
		
		while (bool) {
			System.out.println(a);
		}
		
		
		
		
	}

}
