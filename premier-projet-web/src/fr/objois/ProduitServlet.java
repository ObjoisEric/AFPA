package fr.objois;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import fr.objois.bean.Produit;

/**
 * Servlet implementation class ProduitServlet
 */
@WebServlet("/produit")
public class ProduitServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProduitServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		Produit[] tableauProduit = new Produit[9];
		tableauProduit[0] = new Produit("pomme",1.50,"Ressources/Images/pomme.jpg");
		tableauProduit[1] = new Produit("banane",1.40,"Ressources/Images/banane.jpg");
		tableauProduit[2] = new Produit("poire",1.30,"Ressources/Images/poire.jpg");
		tableauProduit[3] = new Produit("grenade",1.70,"Ressources/Images/grenade.jpg");
		tableauProduit[4] = new Produit("kiwi",1.00,"Ressources/Images/kiwi.jpg");
		tableauProduit[5] = new Produit("orange",1.20,"Ressources/Images/orange.jpg");
		tableauProduit[6] = new Produit("ananas",2.00,"Ressources/Images/ananas.jpg");
		tableauProduit[7] = new Produit("tomate",1.10,"Ressources/Images/tomate.jpg");
		tableauProduit[8] = new Produit("noix de coco",1.80,"Ressources/Images/noixDeCoco.jpg");
		
		ArrayList<Produit> listProduit = new ArrayList<Produit>();
		
		listProduit.add(new Produit("pomme",1.50,"Ressources/Images/pomme.jpg"));
		listProduit.add(new Produit("banane",1.40,"Ressources/Images/banane.jpg"));
		listProduit.add(new Produit("poire",1.30,"Ressources/Images/poire.jpg"));
		listProduit.add(new Produit("grenade",1.70,"Ressources/Images/grenade.jpg"));
		listProduit.add(new Produit("kiwi",1.00,"Ressources/Images/kiwi.jpg"));
		listProduit.add(new Produit("orange",1.20,"Ressources/Images/orange.jpg"));
		listProduit.add(new Produit("ananas",2.00,"Ressources/Images/ananas.jpg"));
		listProduit.add(new Produit("tomate",1.10,"Ressources/Images/tomate.jpg"));
		listProduit.add(new Produit("noix de coco",1.80,"Ressources/Images/noixDeCoco.jpg"));
		
		
		String nomProduit[] = {"pomme","banane","poire","grenade","kiwi","orange","ananas","tomate","noix de coco"};	
		Double prixProduit[] = {1.50,1.40,1.30,1.70,1.00,1.20,2.00,1.10,1.80};
		String urlProduit[] = {"Ressources/Images/pomme.jpg","Ressources/Images/banane.jpg","Ressources/Images/poire.jpg"
							   ,"Ressources/Images/grenade.jpg","Ressources/Images/kiwi.jpg","Ressources/Images/orange.jpg"
							   ,"Ressources/Images/ananas.jpg","Ressources/Images/tomate.jpg","Ressources/Images/noixDeCoco.jpg"};
		String pomme = "pomme";
		
		request.setAttribute("nomPomme", pomme);
		request.setAttribute("tableauNomProduit", nomProduit);
		request.setAttribute("tableauPrixProduit", prixProduit);
		request.setAttribute("tableauUrlProduit", urlProduit);
		request.setAttribute("tableauProduitObjet", tableauProduit);
		request.setAttribute("listProduit", listProduit);
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/produit.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
