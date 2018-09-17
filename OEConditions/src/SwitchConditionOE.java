
public class SwitchConditionOE {

	public static void main(String[] args) {
		
		int entier = 10;
		if (entier == 10) {
						
		}else if (entier == 15) {
			
		}else if (entier == 13) {

		}else {
			
		}
		switch (entier) {
		case 10:
			System.out.println("la variable entier = 10");
			break;
		case 15:
			System.out.println("la variable entier = 15");
			break;
		case 13:
			System.out.println("la variable entier = 13");
			break;
		default:	
			System.out.println("Affichage par défaut");
			break;
		}

		String chaine = "Hello";
		switch (chaine) {
		case "Bonjour":
			System.out.println("Bonjour");
			break;
		case "Bonsoir":
			System.out.println("Bonsoir");
			break;
		case "Hello":
			System.out.println("Hello");
			break;
		case "Coucou":
			System.out.println("Coucou");
			break;
		default:
			System.out.println("aucune des valeurs");
			break;
		
		
		
		
		}
		
		
	}

}
