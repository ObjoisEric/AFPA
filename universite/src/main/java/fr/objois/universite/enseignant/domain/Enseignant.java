package fr.objois.universite.enseignant.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="t_enseignant")
public class Enseignant {
	
	@Column(name="id")
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	Integer id;
	@Column(name="Numero_Enseignant")
	Integer numeroEnseignant;
	@Column(name="Nom")
	String nom;
	@Column(name="Prenom")
	String prenom;
	@Column(name="Date_Naissance")
	String dateNaissance;
	@Column(name="Sexe")
	String sexe;
	@Column(name="Grade")
	String grade;
	@Column(name="Date_Embauche")
	String dateEmbauche;
	
	public Enseignant() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Enseignant(Integer id, Integer numeroEnseignant, String nom, String prenom, String dateNaissance,
			String sexe, String grade, String dateEmbauche) {
		super();
		this.id = id;
		this.numeroEnseignant = numeroEnseignant;
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
		this.sexe = sexe;
		this.grade = grade;
		this.dateEmbauche = dateEmbauche;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getNumeroEnseignant() {
		return numeroEnseignant;
	}
	public void setNumeroEnseignant(Integer numeroEnseignant) {
		this.numeroEnseignant = numeroEnseignant;
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
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getDateEmbauche() {
		return dateEmbauche;
	}
	public void setDateEmbauche(String dateEmbauche) {
		this.dateEmbauche = dateEmbauche;
	}
	
	

}
