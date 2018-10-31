package fr.objois.controller.pizza;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.objois.business.pizza.PizzaBusiness;

/**
 * Servlet implementation class PizzaASupprimerServlet
 */
@WebServlet("/pizzaASupprimer")
public class PizzaASupprimerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	PizzaBusiness pizzaBz = new PizzaBusiness();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PizzaASupprimerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		Integer pizzaID = Integer.valueOf(request.getParameter("pizzaID"));
		
		pizzaBz.deletePizza(pizzaID);
		
		response.sendRedirect("pizzas");
	}

}
