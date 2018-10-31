package fr.objois.controller.pizza;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.objois.business.pizza.PizzaBusiness;

/**
 * Servlet implementation class SortIDPizzaServlet
 */
@WebServlet("/sortIDPizza")
public class SortIDPizzaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	PizzaBusiness pizzaBz = new PizzaBusiness();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SortIDPizzaServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		pizzaBz.sortID();
		
		response.sendRedirect("pizzas");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
