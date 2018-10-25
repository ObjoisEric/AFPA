package fr.objois.bean;

public class Pays {
	
	private String codePays;
	private String nomPays;
	public Pays() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Pays(String codePays, String nomPays) {
		super();
		this.codePays = codePays;
		this.nomPays = nomPays;
	}
	public String getCodePays() {
		return codePays;
	}
	public void setCodePays(String codePays) {
		this.codePays = codePays;
	}
	public String getNomPays() {
		return nomPays;
	}
	public void setNomPays(String nomPays) {
		this.nomPays = nomPays;
	}
	
	
	

}
