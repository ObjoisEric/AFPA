import java.sql.Date;
import java.util.Calendar;
import java.util.Scanner;

public class OEExolectureClavier {

	public static void main(String[] args) {
		
		long datedebut;
		long datefin;
		Scanner sc = new Scanner(System.in);
		int debut;
		int fin; 
		boolean exit = false;
		String caractere = "jnujand";
		
		
		do {
			System.out.println("debut ?");
			debut = sc.nextInt();
			System.out.println("fin ?");
			fin = sc.nextInt();
			datedebut = Calendar.getInstance().getTimeInMillis();


			while (debut != fin) {

				if (debut > fin ) {

					debut-- ;				
				}else {
					debut++;
				}

				System.out.println(debut +" != " + fin);
			}

			System.out.println(debut +" = " + fin);
			datefin = Calendar.getInstance().getTimeInMillis();
			System.out.println(datefin - datedebut + " ms");

			System.out.println("Sortir ?(Y)");
			sc.nextLine();
			caractere = sc.nextLine();
			if (caractere.equals("Y")) {
				exit = true;
			}


		}while (exit != true);

		System.out.println("FIN");
		
		sc.close();
	}

}
