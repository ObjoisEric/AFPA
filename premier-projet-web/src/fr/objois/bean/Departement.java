package fr.objois.bean;

public class Departement {
	
	private String numDepartement;
	private String nomDepartement;
	
	public Departement() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Departement(String numDepartement, String nomDepartement) {
		super();
		this.numDepartement = numDepartement;
		this.nomDepartement = nomDepartement;
	}
	public String getNumDepartement() {
		return numDepartement;
	}
	public void setNumDepartement(String numDepartement) {
		this.numDepartement = numDepartement;
	}
	public String getNomDepartement() {
		return nomDepartement;
	}
	public void setNomDepartement(String nomDepartement) {
		this.nomDepartement = nomDepartement;
	}
	
	

}
