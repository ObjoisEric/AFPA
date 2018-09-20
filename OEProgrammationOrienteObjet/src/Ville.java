
public class Ville {

	public String nom ;
	public int nombreHabitants;
	public int sup;
	public boolean etatLumiere;
	
	//Constructeur sans params
	public Ville() 
	{
		
		System.out.println("Création d'un objet de type Ville");
	}
	
	
	//Constructeur avec params
	public Ville(String nomP, int nombreHabitantsP, int supP)  {
		
		System.out.println("Constructeur avec params");
		nom = nomP;
		nombreHabitants = nombreHabitantsP;
		sup = supP;
		
	}


	public Ville(String nom, int nombreHabitants) {
		
		this.nom = nom;
		this.nombreHabitants = nombreHabitants;
	}
	
	public Ville(int sup, int nombreHabitants) {
		super();
		this.sup = sup;
		this.nombreHabitants = nombreHabitants;
	}
	
	public void allumerLesLumieres () 
	{
		etatLumiere = true;
	}
	
	public void eteindreLesLumieres () 
	{
		etatLumiere = false;
	}
	
	
	
	
}
