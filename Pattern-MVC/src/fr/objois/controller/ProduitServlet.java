package fr.objois.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.objois.bean.Produit;
import fr.objois.business.ProduitBusiness;

/**
 * Servlet implementation class ProduitServlet
 */
@WebServlet("/produit")
public class ProduitServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ProduitBusiness produitB = new ProduitBusiness();

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

		Produit produitDetail = new Produit();
		
		try {
			
			Integer indice = Integer.valueOf(request.getParameter("indice"));
			produitDetail = produitB.infosProduit(indice);
			
		}catch (Exception e) {			

			produitDetail = null;
			
		}	
			
				


		if (produitDetail == null) {
			
			response.sendRedirect("produits");

		}else {

			request.setAttribute("produitDetail", produitDetail);
			this.getServletContext().getRequestDispatcher("/WEB-INF/Produit/produit.jsp").forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
