package fr.objois.universite.matiere.business;

import java.util.List;

import fr.objois.universite.matiere.domain.Matiere;

public interface IMatiereBusiness {

	public List<Matiere> getAllMatiere();

	public Matiere getDetailMatiere(Integer id);

	public void ajouterMatiere(Matiere matiere);

}
