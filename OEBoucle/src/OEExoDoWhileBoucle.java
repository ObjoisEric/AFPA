
public class OEExoDoWhileBoucle {

	public static void main(String[] args) {
		
		int numeroChoisiParLaMachine = 90;
		int votreNumero = 89;
		
		do {
			System.out.println("veuillez entrer un num�ro svp : "+votreNumero);
			votreNumero++;
			
		} while (votreNumero != numeroChoisiParLaMachine);
		
		System.out.println("votre num = "+votreNumero);

	}
	
	

}
