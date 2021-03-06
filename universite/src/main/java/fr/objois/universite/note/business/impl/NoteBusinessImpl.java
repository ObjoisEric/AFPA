package fr.objois.universite.note.business.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.objois.universite.etudiant.business.IEtudiantBusiness;
import fr.objois.universite.etudiant.domain.Etudiant;
import fr.objois.universite.matiere.business.IMatiereBusiness;
import fr.objois.universite.matiere.domain.Matiere;
import fr.objois.universite.note.business.INoteBusiness;
import fr.objois.universite.note.domain.Note;
import fr.objois.universite.note.domain.NotePrimaryKey;
import fr.objois.universite.note.repository.INoteRepository;

@Service
public class NoteBusinessImpl implements INoteBusiness{
	
	
	@Autowired
	INoteRepository noteRepository;
	@Autowired
	IMatiereBusiness matiereBusiness;
	@Autowired
	IEtudiantBusiness etudiantBusiness;

	@Override
	public List<Note> getAllNotes() {
		List<Note> listeNote = noteRepository.findAll();
		return listeNote;
	}


	@Override
	public Matiere getMatiere(Integer id) {
		Matiere matiere = matiereBusiness.getDetailMatiere(id);
		return matiere;
	}
	


	@Override
	public List<Matiere> getAllMatiere() {
		
		List<Matiere> listeMatiere = matiereBusiness.getAllMatiere();
		
		return listeMatiere;
	}


	@Override
	public List<Etudiant> getAllEtudiant() {
		List<Etudiant> listeEtudiant = etudiantBusiness.getAllEtudiant();
		return listeEtudiant;
	}


	@Override
	public void ajouterNote(Note note, Integer idMatiere, Integer idEtudiant) {
		Matiere matiere = matiereBusiness.getDetailMatiere(idMatiere);
		Etudiant etudiant = etudiantBusiness.getDetailEtudiant(idEtudiant);
		NotePrimaryKey notePrimaryKey = new NotePrimaryKey();		
		
		notePrimaryKey.setIdEtudiant(idEtudiant);
		notePrimaryKey.setIdMatiere(idMatiere);
		
		note.setEtudiant(etudiant);
		note.setMatiere(matiere);
		note.setNotePrimaryKey(notePrimaryKey);
		
		noteRepository.save(note);
		
	}


	@Override
	public List<Etudiant> getEtudiantDiff() {
		List<Etudiant> listEtudiantDiff = etudiantBusiness.getAllEtudiant();
		listEtudiantDiff = getEtudiantInfDix(listEtudiantDiff);	
		
	
		return listEtudiantDiff;
	}


	private List<Etudiant> getEtudiantInfDix(List<Etudiant> listEtudiantDiff) {
		for (Iterator<Etudiant> iterator = listEtudiantDiff.iterator(); iterator.hasNext();) {
			Etudiant etudiant = (Etudiant) iterator.next();			
			List<Note> listNote = getNoteInfDix(etudiant.getNotes());
			
			if (listNote.size() == 0) {
				iterator.remove();
			}else {
				etudiant.setNotes(listNote);
			}		
		}
		return listEtudiantDiff;
	}


	private List<Note> getNoteInfDix(List<Note> notes) {
		
		for (Iterator<Note> iterator = notes.iterator(); iterator.hasNext();) {
			Note note = (Note) iterator.next();
			if (note.getNote() >= 10) {
				iterator.remove();
			}			
		}
		
		return notes;
	}
	
	

}
