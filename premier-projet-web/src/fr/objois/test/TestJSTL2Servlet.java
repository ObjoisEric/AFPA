package fr.objois.test;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class testJSTL2
 */
@WebServlet("/testJSTL2")
public class TestJSTL2Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TestJSTL2Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		
		
		Integer ligne;		
		if ((request.getParameter("ligne") == null) || (request.getParameter("ligne") == "") ) {
			ligne = (int) Math.round(Math.random()*(100-5)) + 5;
		}else {
			ligne = Integer.valueOf(request.getParameter("ligne"));
		}
		
		Integer colonne;
		if ((request.getParameter("colonne") == null) || (request.getParameter("colonne") == "")){
			colonne = (int) Math.round(Math.random()*(100-5)) + 5 ;
		}else {
			colonne = Integer.valueOf(request.getParameter("colonne"));
		}
		Integer etoile;
		if ((request.getParameter("etoile") == null) || (request.getParameter("etoile") == "")){
			etoile = (int) Math.round(Math.random()*(9-2)) + 2 ;
		}else {
			etoile = Integer.valueOf(request.getParameter("etoile"));
		}
		
		
		
		
		
		request.setAttribute("ligne", ligne);
		request.setAttribute("colonne", colonne);
		request.setAttribute("etoile", etoile);
		
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/testJSTL2.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
