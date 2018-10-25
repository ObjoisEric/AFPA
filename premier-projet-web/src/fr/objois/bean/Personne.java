package fr.objois.bean;

public class Personne {
	
	private String nom;
	private String prenom;
	private String date;
	private String numEtRue;
	private String ville;
	private String mail;
	private String telephone;
	private String departement;
	private String pays;
	private String genre;
	private String urlPhoto;
	
	
	


	public Personne() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Personne(String nom, String prenom, String date, String numEtRue, String ville, String mail,
			String telephone, String departement, String pays, String genre, String urlPhoto) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.date = date;
		this.numEtRue = numEtRue;
		this.ville = ville;
		this.mail = mail;
		this.telephone = telephone;
		this.departement = departement;
		this.pays = pays;
		this.genre = genre;
		this.urlPhoto = urlPhoto;
	}
	

	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}


	public String getNumEtRue() {
		return numEtRue;
	}


	public void setNumEtRue(String numEtRue) {
		this.numEtRue = numEtRue;
	}


	public String getVille() {
		return ville;
	}


	public void setVille(String ville) {
		this.ville = ville;
	}


	public String getMail() {
		return mail;
	}


	public void setMail(String mail) {
		this.mail = mail;
	}


	public String getTelephone() {
		return telephone;
	}


	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	
	public String getDepartement() {
		return departement;
	}


	public void setDepartement(String departement) {
		this.departement = departement;
	}


	public String getPays() {
		return pays;
	}


	public void setPays(String pays) {
		this.pays = pays;
	}


	public String getGenre() {
		return genre;
	}


	public void setGenre(String genre) {
		this.genre = genre;
	}


	public String getUrlPhoto() {
		return urlPhoto;
	}


	public void setUrlPhoto(String urlPhoto) {
		this.urlPhoto = urlPhoto;
	}


	
	
	

}
