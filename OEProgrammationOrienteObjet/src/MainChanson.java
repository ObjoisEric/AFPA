
public class MainChanson {

	public static void main(String[] args) {

		Chanson ch1 = new Chanson();
		System.out.println("Titre : " + ch1.getTitre());
		
		//modification de la propri�t� titre de l'objet ch1
		ch1.setTitre("Titre de ma chanson");
		System.out.println("Titre : " + ch1.getTitre());
		
		//modification de la propri�t� artiste de l'objet ch1
		System.out.println("Artiste : " + ch1.getArtiste());
		ch1.setArtiste("Un artiste inconnu");
		System.out.println("Artiste : " + ch1.getArtiste());
		
		//modification de la propri�t� duree de l'objet ch1
		ch1.setDuree("5");
		System.out.println("Duree : " + ch1.getDuree());

		System.out.println(	"L'artiste " + ch1.getArtiste()
							+ "a une chnason qui se nomme" + ch1.getTitre()
							+ "et qui dure " + ch1.getDuree()+" min.");

	}

}
