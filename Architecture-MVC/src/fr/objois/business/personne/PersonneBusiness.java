package fr.objois.business.personne;

import java.util.ArrayList;

import fr.objois.bean.Personne;

public class PersonneBusiness {
	
	public ArrayList<Personne> getPersonnes() {
		
		Personne p1 = new Personne("tomate", "tomate", "2000-01-01", "0123456789", "tomate@gmail.com");
		Personne p2 = new Personne("banane", "banane", "2001-01-01", "0123456789", "banane@gmail.com");
		Personne p3 = new Personne("poire", "poire", "2002-01-01", "0123456789", "poire@gmail.com");
		Personne p4 = new Personne("pomme", "pomme", "2003-01-01", "0123456789", "pomme@gmail.com");
		Personne p5 = new Personne("framboise", "framboise", "2004-01-01", "0123456789", "framboise@gmail.com");
		
		ArrayList<Personne> listePersonnes = new ArrayList<>();
		listePersonnes.add(p1);
		listePersonnes.add(p2);
		listePersonnes.add(p3);
		listePersonnes.add(p4);
		listePersonnes.add(p5);
		
		
		return listePersonnes;
	}

}
