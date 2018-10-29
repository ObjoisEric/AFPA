package fr.objois.controller.personne;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.objois.bean.Personne;
import fr.objois.business.personne.PersonneBusiness;

/**
 * Servlet implementation class PersonneServlet
 */
@WebServlet("/personne")
public class PersonneServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	PersonneBusiness personneB = new PersonneBusiness();
   
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PersonneServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
				
		
		ArrayList<Personne> listePersonnes = personneB.getPersonnes();
		
		request.setAttribute("listePersonnes", listePersonnes);
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/personne/personne.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
