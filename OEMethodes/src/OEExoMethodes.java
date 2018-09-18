
public class OEExoMethodes {

	public static void main(String[] args) 
	{
		float noteJava = 14f; 
		float noteHtml = 13f; 
		float noteJavascript = 9f; 
		float noteCss = 8.5f;


		int coefJava = 3; 
		int coefHtml = 2;
		int coefJavascript = 3;
		int coefCss = 1;

		float moyenne;

		
		moyenne = calculMoyenne(noteJava, noteHtml, noteJavascript, noteCss, coefJava, coefHtml, coefJavascript, coefCss);


		System.out.println("La moyenne = " + moyenne);

		

		if (moyenne <15)
		{
			System.out.println("recalcul de la moyenne en changant coeff");
			coefJava = 1; 
			coefHtml = 3; 
			coefJavascript = 2;
			coefCss = 3;
			moyenne = calculMoyenne(noteJava, noteHtml, noteJavascript, noteCss, coefJava, coefHtml, coefJavascript, coefCss);	
			System.out.println("La moyenne = " + moyenne);
		}

		if (moyenne < 10) 
		{
			System.out.println("recalcul de la moyenne en changant coeff");
			coefJava = 3; 
			coefHtml = 3; 
			coefJavascript = 4;
			coefCss = 3;
			moyenne = calculMoyenne(noteJava, noteHtml, noteJavascript, noteCss, coefJava, coefHtml, coefJavascript, coefCss);	
			System.out.println("La moyenne = " + moyenne);

		}


	}

	public static float calculMoyenne(float noteJava,float noteHtml,float noteJavascript,float noteCss,int coefJava, int coefHtml,int coefJavascript,int coefCss) {
		float moyenne 	= ((noteJava * coefJava ) 
				+ (noteHtml * coefHtml) 
				+ (noteJavascript * coefJavascript) 
				+ (noteCss * coefCss)) 
				/ (coefJava + coefHtml + coefJavascript + coefCss);
		
		if(moyenne > 18) {
			System.out.println("Très bien");
		}else if(moyenne > 15) {
			System.out.println("Bien");
		}else if(moyenne > 12) {
			System.out.println("Assez bien");
		}else if(moyenne > 10) {
			System.out.println("Moyen");
		}else if(moyenne > 8) {
			System.out.println("Il peut faire mieux");
		}else if(moyenne > 5) {
			System.out.println("Il faut plus de travail");
		}else {
			System.out.println("A l’année prochaine, même heure, même endroit ;)");
		}
		return moyenne;
	}



}
