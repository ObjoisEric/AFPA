package fr.objois;

import java.io.IOException;
import java.text.DecimalFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.objois.bean.Produit;

/**
 * Servlet implementation class ProduitIndividuelServlet
 */
@WebServlet("/produitIndividuel")
public class ProduitIndividuelServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProduitIndividuelServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		DecimalFormat df = new DecimalFormat("#0.00");
		String nomProduit;
		if((request.getParameter("nomDuProduit") == null)||(request.getParameter("nomDuProduit") == "")) {
						
			nomProduit = "Erreur";
			
		}else {
			
			nomProduit=request.getParameter("nomDuProduit");
			
		}
		
		
		Double prixProduit;
		if((request.getParameter("prixDuProduit") == null)||(request.getParameter("prixDuProduit") == "")) {
			
			prixProduit = 0.00;
			
		}else {
			
			prixProduit=Double.valueOf(request.getParameter("prixDuProduit"));
			
		}
		
		String urlProduit;
		if((request.getParameter("urlDuProduit") == null)||(request.getParameter("urlDuProduit") == "")) {
			
			urlProduit = "Erreur";
			
		}else {
			
			urlProduit=request.getParameter("urlDuProduit");
			
		}
		
		Produit produitAAfficher = new Produit(nomProduit,prixProduit,urlProduit);
		
		request.setAttribute("nomProduitSend", nomProduit);
		request.setAttribute("prixProduitSend", prixProduit);
		request.setAttribute("urlProduitSend", urlProduit);
		request.setAttribute("formatPrix", df);
		request.setAttribute("produitAAfficher", produitAAfficher);
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/produitIndividuel.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
