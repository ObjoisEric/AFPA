package fr.objois.controller.pizza;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.objois.bean.Pizza;
import fr.objois.business.pizza.PizzaBusiness;

/**
 * Servlet implementation class DeletePizzaServlet
 */
@WebServlet("/deletePizza")
public class DeletePizzaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	PizzaBusiness pizzaBZ = new PizzaBusiness();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeletePizzaServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		ArrayList<Pizza> listePizza = pizzaBZ.getPizzas();
		
		
		
		request.setAttribute("listePizza", listePizza);
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/pizza/deletePizza.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
