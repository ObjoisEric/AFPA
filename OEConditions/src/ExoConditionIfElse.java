public class ExoConditionIfElse {
	public static void main(String[] args) {
		String cnx = "connection";
		if(cnx == "connection") {
			System.out.println("Vous �tes connect�");
		}else {
			System.out.println("Vous n'�tes pas connect�");
		}
		
		char caractere = 'a';
		if(caractere == 'a') {
			System.out.println("Le caract�re = 'a'");
		}else {
			System.out.println("Le caract�re != 'a'");
		}
	}
}