
public class OEExoWhileBoucle {

	public static void main(String[] args) {
		int b = 1;


		while ( b <= 100) {

			System.out.println("b : " +b);
			b++;			

		}

		System.out.println("intermission b : " +b);


		while ( b >= 1) {

			System.out.println("b desc : " +b);
			b--;

		}

		System.out.println("intermission b : " +b);

				
		int chiffre = 1;

		while (chiffre <= 100){				

			if (chiffre%2 == 0) {
				System.out.println("chiffre pair: " + chiffre);
								
			}			
			chiffre++;			

		}

		while (chiffre >= 1){				

			if (chiffre%2 == 0) {
				System.out.println("chiffre pair: " + chiffre);
								
			}			
			chiffre--;	
		}	
		
		int x = 1;
		int y = 100;
		
		while (x <=100 && y >=1){
			
			System.out.println("x : " + x);
			System.out.println("y : " + y);
			x++;
			y--;
		}
		
		
		int res = 10 ;
		int bbb = 10 ;
		
		System.out.println(res+=bbb);
		System.out.println(res-=bbb);
		System.out.println(res*=bbb);
		System.out.println(res/=bbb);
		
		

		

		


	}
}
