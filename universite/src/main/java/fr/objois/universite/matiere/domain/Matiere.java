package fr.objois.universite.matiere.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="t_matiere")
public class Matiere {
	@Column(name="id")
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	Integer id;
	@Column(name="numero_matiere")
	Integer numeroMatiere;
	@Column(name="nom")
	String nom;
	@Column(name="coef")
	Integer coef;
	@Column(name="date_debut")
	String dateDebut;
	@Column(name="date_fin")
	String dateFin;
	@Column(name="id_enseignant")
	Integer idEnseignant;
	public Matiere() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Matiere(Integer id, Integer numeroMatiere, String nom, Integer coef, String dateDebut, String dateFin,
			Integer idEnseignant) {
		super();
		this.id = id;
		this.numeroMatiere = numeroMatiere;
		this.nom = nom;
		this.coef = coef;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.idEnseignant = idEnseignant;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getNumeroMatiere() {
		return numeroMatiere;
	}
	public void setNumeroMatiere(Integer numeroMatiere) {
		this.numeroMatiere = numeroMatiere;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Integer getCoef() {
		return coef;
	}
	public void setCoef(Integer coef) {
		this.coef = coef;
	}
	public String getDateDebut() {
		return dateDebut;
	}
	public void setDateDebut(String dateDebut) {
		this.dateDebut = dateDebut;
	}
	public String getDateFin() {
		return dateFin;
	}
	public void setDateFin(String dateFin) {
		this.dateFin = dateFin;
	}
	public Integer getIdEnseignant() {
		return idEnseignant;
	}
	public void setIdEnseignant(Integer idEnseignant) {
		this.idEnseignant = idEnseignant;
	}
	
	
	
	
	

}
