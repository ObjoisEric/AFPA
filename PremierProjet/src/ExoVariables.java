import java.util.Scanner;

public class ExoVariables {
	
	public static void main(String[] args) {
	
		
		
		
		
		
		
		
		
		//ouvrir la permission pour saisir utilisateur
		Scanner sc = new Scanner(System.in);
		
	
	
		/*System.out.println("note");
		//sc.nextFloat(); permet de saisir un float
		float note = sc.nextFloat();
		System.out.println("coef");
		//sc.nextInt(); permet de saisir un int
		int coef = sc.nextInt();		
		float resultat;	
		
		resultat = (note * coef);		
		System.out.println("note * coef = " + resultat);*/
	
	
		
		
		
		float noteJava = 10.5f;
		float noteHtml = 13.2f;
		float noteJavascript = 11.3f;
		float noteCss = 8.5f;
		float moyenne;
		float sommeCoef;
		
		int coefJava = 3;
		int coefHtml = 2;
		int coefJavascript = 3;
		int coefCss = 1; 
		
		
		sommeCoef = coefJava + coefHtml + coefJavascript + coefCss;				
		moyenne = ((noteJava * coefJava) 
				+ (noteHtml * coefHtml) 
				+ (noteJavascript * coefJavascript) 
				+ (noteCss * coefCss));
		moyenne = moyenne / sommeCoef;
		System.out.println("la moyenne est de : " + moyenne);
		System.out.println("la moyenne est de : " + Math.round(moyenne));
		
		//Declaration
		// [type] [nom de la variable];
		int quantite;
		//Affectation
		//[nom de la variable] = [LaValeur];
		quantite = 100;
		
		//Declaration + Affectation
		//[type] [nomDeLaVariable] = [LaValeur];
		int variable = 123;
		
		
		
		
		
		
		
		sc.close();
	}
}
