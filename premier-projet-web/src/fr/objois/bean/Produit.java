package fr.objois.bean;

public class Produit {
	
	private String nomProduit ="";
	private Double prixProduit = 0.00;
	private String urlProduit = "";
	
	

	public Produit() {
		super();
	}
	
	public Produit(String nomProduit, Double prixProduit, String urlProduit) {
		super();
		this.nomProduit = nomProduit;
		this.prixProduit = prixProduit;
		this.urlProduit = urlProduit;
	}
	
	
	public String getNomProduit() {
		return nomProduit;
	}

	public void setNomProduit(String nomProduit) {
		this.nomProduit = nomProduit;
	}

	public Double getPrixProduit() {
		return prixProduit;
	}

	public void setPrixProduit(Double prixProduit) {
		this.prixProduit = prixProduit;
	}

	public String getUrlProduit() {
		return urlProduit;
	}

	public void setUrlProduit(String urlProduit) {
		this.urlProduit = urlProduit;
	}
	
	
	
	

}
