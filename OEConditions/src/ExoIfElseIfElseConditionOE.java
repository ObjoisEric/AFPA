
public class ExoIfElseIfElseConditionOE {

	public static void main(String[] args) {

		/* 				note	coef
		 * java			14		3
		 * html			13		2
		 * javascript	9		3	
		 * css			7,5		1		
		 *
		 *moyenne	>	18	TB
		 *			>	15	b
		 *			>	12	Assez bien
		 *			>	10	moyen
		 *			>	8	peux fair emieux
		 *			>	5	plus de travail
		 *					ann�e prochaine
		 */
	
		double noteJava = 14;
		double noteHtml = 13;
		double noteJavascript = 9;
		double noteCss = 7.5;
		double moyenne;
		
		int coefJava = 3;
		int coefHtml = 2;
		int coefJavascript = 3;
		int coefCss = 1;
		int sommeCoef;
		
		
		sommeCoef = coefJava + coefHtml + coefJavascript + coefCss;
		
		moyenne = noteJava * coefJava
				+ noteHtml*coefHtml
				+ noteJavascript * coefJavascript
				+ noteCss * coefCss;
		moyenne = moyenne / sommeCoef;
		
		
		//moyenne = 20; Pour test la valeur de moyenne
		System.out.println("La note est de : " + moyenne);		
				
		if (moyenne > 18) {
			
			System.out.println("Tr�s Bien");	
			
			}else if (moyenne > 15) {
				
				System.out.println("Bien");	
				
				}else if (moyenne > 12) {
					
					System.out.println("Assez Bien");	
			
					}else if (moyenne > 10) {
						
						System.out.println("Moyen");
			
						}else if (moyenne > 8) {
							
							System.out.println("Il peut mieux faire");
			
							}else if (moyenne > 5) {
								
								System.out.println("il faut plus de travail");
			
								}else {
									
									System.out.println("A l�ann�e prochaine, m�me heure, m�me endroit");
			
		}
		
		
	}

}
