
public class TypesVariables {

	public static void main(String[] args) {
		
		//int	
		int entier = 14 ;		
		System.out.println("La variable entier = " + entier);
		
		//float
		float decimal = 12.5f;
		System.out.println("La variable decimal = " + decimal);
		
		//double
		double decimalDoublePrec= 15.5;
		System.out.println("La variable decimalDoublePrec = " + decimalDoublePrec);
		
		//boolean
		boolean bool = true;
		System.out.println("La variable bool = " + bool);
		
		//char
		char caractere = '2';
		System.out.println("La variable caractere = " + caractere);
		
		//String
		String chaine = "Hello";
		System.out.println("La variable chaine = " + chaine);
		
		
		//entier1
		int prix = 10;
				
		//entier2		
		int tva = 20;
		
		System.out.println("prix * tva = " + (prix*tva));
		
		prix = 12;
		System.out.println("prix * tva = " + (prix*tva));
		
		tva = 21;
		System.out.println("prix * tva = " + (prix*tva));
		
		double tvaDouble = 19.6;
		System.out.println("prix * tva = " + (prix*tvaDouble));
		
		
		
		//Declaration et affectation
		//TYPE nomVariable = valeur;
		// int : primitive -> Integer : objet
		// String : objet
		
		Integer monInt = 12;
		double monDouble = 15.5;
		float monFloat = 12.6f;
		char monChar = 'a';
		boolean monBoolean = false;
		String maChaine = "chaine";
				
		System.out.println("Declaration + affectation");
		System.out.println("monInt = " + monInt);
		System.out.println("monDouble = " + monDouble);
		System.out.println("monFloat = " +monFloat);
		System.out.println("monChar = " +monChar);
		System.out.println("maChaine = "+maChaine);
		System.out.println("monBoolean = "+monBoolean);
				
		
		//Affectation
		// nomVariable = valeur;
		maChaine = "nouvelle chaine";
		monChar = 'Z';
		monBoolean = true;
		monDouble = 120.12;
		monInt = 1500;
		monFloat = 155.26f;
		
		System.out.println("affectation");
		System.out.println("monInt = " + monInt);
		System.out.println("monDouble = " + monDouble);
		System.out.println("monFloat = " +monFloat);
		System.out.println("monChar = " +monChar);
		System.out.println("maChaine = "+maChaine);
		System.out.println("monBoolean = "+monBoolean);
		
		
		
		//double -1.7 * 10^308 ------ 1.7 * 10^308
		double d = 12.5555555555555;
		
		//float -3.4*10^38 ------- 3.4 * 10 ^38
		float f = 12.5555555555555f;
				
		System.out.println("d = " + d);
		System.out.println("f = " + f);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
