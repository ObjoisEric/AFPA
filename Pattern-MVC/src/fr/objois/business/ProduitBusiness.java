package fr.objois.business;

import java.util.ArrayList;

import fr.objois.bean.Produit;

public class ProduitBusiness {
	
	public ArrayList<Produit> getProduit()  {
		
		ArrayList<Produit> listProduit = new ArrayList<>();
		
		listProduit.add(new Produit("pomme",1.50,"Ressources/Images/pomme.jpg"));
		listProduit.add(new Produit("banane",1.40,"Ressources/Images/banane.jpg"));
		listProduit.add(new Produit("poire",1.30,"Ressources/Images/poire.jpg"));
		listProduit.add(new Produit("grenade",1.70,"Ressources/Images/grenade.jpg"));
		listProduit.add(new Produit("kiwi",1.00,"Ressources/Images/kiwi.jpg"));
		listProduit.add(new Produit("orange",1.20,"Ressources/Images/orange.jpg"));
		listProduit.add(new Produit("ananas",2.00,"Ressources/Images/ananas.jpg"));
		listProduit.add(new Produit("tomate",1.10,"Ressources/Images/tomate.jpg"));
		listProduit.add(new Produit("noix de coco",1.80,"Ressources/Images/noixDeCoco.jpg"));	
		
		return listProduit;
	}

	public Produit infosProduit(Integer indice) {
		
		ArrayList<Produit> listProduit = getProduit();
		
		Produit produitIndividuel = new Produit();
		
		if ((indice >= listProduit.size()) || (indice < 0)) {
			
			produitIndividuel = null;
			
		}else {
			
			produitIndividuel = listProduit.get(indice);	
			
		}			
		
		return produitIndividuel;
	}
	
	

}
