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
 * Servlet implementation class ModifyPizzaServlet
 */
@WebServlet("/modifyPizza")
public class ModifyPizzaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    PizzaBusiness pizzaBZ = new PizzaBusiness(); 
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ModifyPizzaServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ArrayList<Pizza> listePizza = pizzaBZ.getPizzas();
		Integer libellePizzaValue = 0;
		
		
		request.setAttribute("listePizza", listePizza);
		request.setAttribute("libellePizzaValue", libellePizzaValue);
		request.setAttribute("pizza", listePizza.get(libellePizzaValue));
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/pizza/modifyPizza.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ArrayList<Pizza> listePizza = pizzaBZ.getPizzas();
		Integer libellePizzaValue = 0;
		
		libellePizzaValue = Integer.valueOf(request.getParameter("libellePizzaValue"));
		
		
		for (int i = 0; i < listePizza.size(); i++) {
			if (libellePizzaValue == listePizza.get(i).getId()) {				
				request.setAttribute("pizza", listePizza.get(i));				
			}			
		}
		
		request.setAttribute("libellePizzaValue", libellePizzaValue);
		request.setAttribute("listePizza", listePizza);

		this.getServletContext().getRequestDispatcher("/WEB-INF/pizza/modifyPizza.jsp").forward(request, response);
	}

}
