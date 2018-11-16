package fr.objois.universite.matiere.business.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.objois.universite.matiere.business.IMatiereBusiness;
import fr.objois.universite.matiere.domain.Matiere;
import fr.objois.universite.matiere.repository.IMatiereRepository;
@Service
public class MatiereBusinessImpl implements IMatiereBusiness {
	
	@Autowired
	IMatiereRepository matiereRepository;

	@Override
	public List<Matiere> getAllMatiere() {
		List<Matiere> listeMatiere = matiereRepository.findAll();
		return listeMatiere;
	}

	@Override
	public Matiere getDetailMatiere(Integer id) {
		Matiere detailMatiere = matiereRepository.getOne(id);
		
		return detailMatiere;
	}

	@Override
	public void ajouterMatiere(Matiere matiere) {
		
		
	}

}
