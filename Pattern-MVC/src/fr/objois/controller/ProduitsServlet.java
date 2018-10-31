package fr.objois.controller;

import java.io.IOException;
import java.util.ArrayList;

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
@WebServlet("/produits")
public class ProduitsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ProduitBusiness produitB = new ProduitBusiness();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ProduitsServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		ArrayList<Produit> tableauProduit = produitB.getProduit();


		request.setAttribute("tableauProduit", tableauProduit);


		this.getServletContext().getRequestDispatcher("/WEB-INF/Produit/produits.jsp").forward(request, response);


	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
