
public class ExoOperateurLogiqueOE {

	public static void main(String[] args) {
		
		/*	noteJava = 14 			coefJava = 3 
			noteHtml = 14           coefHtml = 2 
			noteJavascript = 9      coefJava = 3 
			noteCss = 14         	coefJava = 7,5 
			moyenne  moyenne Sans les coef 
			MoyenneGenerale : moyenne avec les coef 

1.SI la moyenne est sup�rieur � 10 ou la moyenneGenerale est sup�rieur � 10 
ALORS afficher Vous avez la moyenne

2. SI la moyenne est sup�rieur � 10 et la note en java est sup�rieur � 10 
ALORS afficher Vous avez eu la moyenne et une bonne note en Java

3. SI la note en css est sup�rieur � 10 ou la note en HTML est sup�rieur � 10 ou la note en javascript est sup�rieur � 10 
ALORS afficher Vous avez eu une bonne note en html ou Css ou Javascript

4. SI la note en css est sup�rieur � 10 ET la note en HTML est sup�rieur � 10 ET la note en javascript est sup�rieur � 10 
ALORS afficher Vous avez eu une bonne note en html, Css et Javascript  

5. SI la note en Java est sup�rieur � 15 et la note en Javascript est sup�rieur � 15 
ALORS affciher Vous avez eu une tr�s bonne note een Java et Javascript

6. SI la moyenne est inf�rieur � 10 ou la moyenneGenerale est inf�rieur � 10 
ALORS afficher Vous n'avez pas eu la moyenne

7. SI une des quatre notes est inf�rieur � 5 
ALORS afficher Vous devez travailler s�rieusement une des quatre mati�res

*/
		
			double noteJava = 14 ;
			double noteHtml = 14 ;
			double noteJavascript = 9 ;
			double noteCss = 14 ;
			double coefJava = 3 ;
			double coefHtml = 2 ;
			double coefJavascript = 3 ;
			double coefCss = 1 ;
			double moyenne ;
			double moyenneGenerale;
			double sommeCoef;
			
			moyenne = noteJavascript+noteJava+noteCss+noteHtml;
			moyenne = moyenne/4;		
			
			
			sommeCoef = coefJava + coefHtml + coefJavascript + coefCss;
			
			moyenneGenerale = noteJava * coefJava 
					+ noteHtml * coefHtml
					+ noteJavascript * coefJavascript
					+ noteCss * coefCss;
			
			moyenneGenerale = moyenneGenerale / sommeCoef ;
			
			
			System.out.println(moyenne);
			System.out.println(moyenneGenerale);
			
			
			/*1.SI la moyenne est sup�rieur � 10 ou la moyenneGenerale est sup�rieur � 10 
			ALORS afficher Vous avez la moyenne*/
			if (moyenne > 10 || moyenneGenerale > 10) {
				System.out.println("Vous avez la moyenne");				
			}
			/*2. SI la moyenne est sup�rieur � 10 et la note en java est sup�rieur � 10 
ALORS afficher Vous avez eu la moyenne et une bonne note en Java */
			
			if (moyenne > 10 && noteJava > 10) {
				System.out.println("Vous avez eu la moyenne et une bonne note en Java");				
			}
			/*3. SI la note en css est sup�rieur � 10 ou la note en HTML est sup�rieur � 10 ou la note en javascript est sup�rieur � 10 
ALORS afficher Vous avez eu une bonne note en html ou Css ou Javascript*/
			if (noteCss > 10 || noteHtml >10 || noteJavascript > 10) {
				System.out.println("Vous avez eu une bonne note en html ou css ou javascript");				
			}
			/*4. SI la note en css est sup�rieur � 10 ET la note en HTML est sup�rieur � 10 ET la note en javascript est sup�rieur � 10 
ALORS afficher Vous avez eu une bonne note en html, Css et Javascript*/
			if (noteCss > 10 && noteHtml >10 && noteJavascript > 10) {
				System.out.println("Vous avez eu une bonne note en html, Css et Javascript  ");				
			}
			/*5. SI la note en Java est sup�rieur � 15 et la note en Javascript est sup�rieur � 15 
ALORS affciher Vous avez eu une tr�s bonne note een Java et Javascript*/
			if (noteJava > 15 && noteJavascript > 15) {
				System.out.println("Vous avez eu une tr�s bonne note en Java et Javascript");				
			}
			/*6. SI la moyenne est inf�rieur � 10 ou la moyenneGenerale est inf�rieur � 10 
ALORS afficher Vous n'avez pas eu la moyenne*/
			if (moyenne < 10 || moyenneGenerale < 10) {
				System.out.println("Vous n'avez pas eu la moyenne");				
			}
			/*7. SI une des quatre notes est inf�rieur � 5 
ALORS afficher Vous devez travailler s�rieusement une des quatre mati�res*/
			if (noteCss < 5 | noteHtml < 5 | noteJava < 5 | noteJavascript < 5) {
				System.out.println("Vous devez travailler s�rieusement une des quatre mati�res");				
			}
			
			
			
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
