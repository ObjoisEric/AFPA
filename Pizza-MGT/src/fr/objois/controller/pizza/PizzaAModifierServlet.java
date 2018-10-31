package fr.objois.controller.pizza;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.objois.business.pizza.PizzaBusiness;

/**
 * Servlet implementation class PizzaAModifierServlet
 */
@WebServlet("/pizzaAModifier")
public class PizzaAModifierServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	PizzaBusiness pizzaBZ = new PizzaBusiness();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PizzaAModifierServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Integer id = Integer.valueOf(request.getParameter("id"));
		String libelle = request.getParameter("libelle");
		String reference = request.getParameter("reference");
		Double prix = Double.valueOf(request.getParameter("prix"));
		String urlImage = request.getParameter("urlImage");
		
		
		pizzaBZ.modifyPizza(id,libelle,reference,prix,urlImage);
		
		
		
		response.sendRedirect("pizzas");
	}

}
