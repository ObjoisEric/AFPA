package fr.objois.test;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestJSTLServlet
 */
@WebServlet("/testJSTL")
public class TestJSTLServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TestJSTLServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Boolean bool = true;
		Integer nombre1 = 10;
		Integer nombre2 = 5;
		Integer nombreLimite = 95;
		Integer colonneMax = 10;
		
		
		
		
		request.setAttribute("bool", bool);
		request.setAttribute("nombre1", nombre1);
		request.setAttribute("nombre2", nombre2);
		request.setAttribute("nombreLimite", nombreLimite);
		request.setAttribute("colonneMax", colonneMax);
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/testJSTL.jsp").forward(request, response);	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
