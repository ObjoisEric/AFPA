package fr.objois.controller.pizza;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.objois.bean.Pizza;
import fr.objois.business.pizza.PizzaBusiness;

/**
 * Servlet implementation class AjoutPizzaServlet
 */
@WebServlet("/ajoutPizza")
public class AjoutPizzaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private PizzaBusiness pizzaBZ = new PizzaBusiness();
    
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AjoutPizzaServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/pizza/ajoutPizza.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String libelle = request.getParameter("libelle");
		String reference = request.getParameter("reference");
		Double prix = Double.valueOf(request.getParameter("prix"));
		String urlImage = request.getParameter("urlImage");
		
		Boolean pizzaAjouter = pizzaBZ.addPizza(libelle,reference, prix, urlImage);		
		
		if (pizzaAjouter) {
			
			response.sendRedirect("pizzas");
			
		} else {

			response.sendRedirect("AjoutPizza");
			
		}
		
		
	}

}
