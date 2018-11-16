package fr.objois.universite.etudiant.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="t_etudiant")
public class Etudiant {
	@Column(name="id")
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	Integer id;
	@Column(name="numero_etudiant")
	Integer numeroEtudiant;
	@Column(name="nom")
	String nom;
	@Column(name="prenom")
	String prenom;
	@Column(name="date_naissance")
	String dateNaissance;
	@Column(name="sexe")
	String sexe;
	public Etudiant() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Etudiant(Integer id, Integer numeroEtudiant, String nom, String prenom, String dateNaissance,
			String sexe) {
		super();
		this.id = id;
		this.numeroEtudiant = numeroEtudiant;
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
		this.sexe = sexe;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getNumeroEtudiant() {
		return numeroEtudiant;
	}
	public void setNumeroEtudiant(Integer numeroEtudiant) {
		this.numeroEtudiant = numeroEtudiant;
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
	public String getDateNaissance() {
		return dateNaissance;
	}
	public void setDateNaissance(String dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	public String getSexe() {
		return sexe;
	}
	public void setSexe(String sexe) {
		this.sexe = sexe;
	}
	
	
	
	

}
