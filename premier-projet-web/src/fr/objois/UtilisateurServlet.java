package fr.objois;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UtilisateurServlet
 */
@WebServlet("/utilisateur")
public class UtilisateurServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UtilisateurServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String testServlet ="test de la servlet";
		String loginUser = "nameUser";
		String passwordUser = "password";
		Integer nombre1 = 2;
		Integer nombre2 = 8;
		
		
		
		request.setAttribute("testServ", testServlet);
		request.setAttribute("loginSend", loginUser);
		request.setAttribute("passwordSend", passwordUser);
		request.setAttribute("nombre1", nombre1);
		request.setAttribute("nombre2", nombre2);
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/utilisateur.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
