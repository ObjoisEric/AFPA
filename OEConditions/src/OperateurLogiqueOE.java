
public class OperateurLogiqueOE {

	public static void main(String[] args) {

		/*2 var noteJava et noteHtml
		 * si note java >10 ET noteHtml >10
		 * Afficher bravo
		 */

		int noteJava = 8;
		int noteHtml = 19;

		boolean noteJavaSup = (noteJava >= 10) ;
		System.out.println(noteJavaSup);

		boolean noteHtmlSup = noteHtml >= 10 ;
		System.out.println(noteHtmlSup);

		if (noteJavaSup && noteHtmlSup) {

			System.out.println("Bravo");

		}else {
			System.out.println("Au moins une de vos conditions est fausse");
		}
		if (noteJavaSup ||  noteHtmlSup) {

			System.out.println("Vous avez eu une bonne note dans au moins une des mati�res");

		}else {
			System.out.println("Vous avez eu une mauvaise note en Java et html");
		}

	}

}
