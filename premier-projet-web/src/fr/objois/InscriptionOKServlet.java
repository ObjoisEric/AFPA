package fr.objois;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.objois.bean.Personne;

/**
 * Servlet implementation class InscriptionOKServlet
 */
@WebServlet("/inscriptionOK")
public class InscriptionOKServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InscriptionOKServlet() {
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

		
		
	    String nom = (String) request.getParameter("nom");
	    String prenom= (String) request.getParameter("prenom");
	    String date = (String) request.getParameter("dateNaissance");
	    String numEtRue = (String) request.getParameter("numEtRue");
	    String ville = (String) request.getParameter("ville");
	    String mail = (String) request.getParameter("mail");
	    String telephone = (String) request.getParameter("telephone");
	    String departement = (String) request.getParameter("departement");
	    String pays = (String) request.getParameter("pays");
	    String genre = (String) request.getParameter("genre");
	    String urlPhoto = (String) request.getParameter("");
		
	    String commentaires = (String) request.getParameter("commentaires");
		
		Personne nouveauUtilisateur = new Personne(nom, prenom, date, numEtRue, ville, mail, telephone, departement, pays, genre, urlPhoto);
		
		
		request.setAttribute("nouveauUtilisateur", nouveauUtilisateur);
		request.setAttribute("commentaires", commentaires);
		
		
		if (commentaires.trim().equals("")) {
			
			this.getServletContext().getRequestDispatcher("/WEB-INF/inscriptionNotOK.jsp").forward(request, response);
			
		}else {

			this.getServletContext().getRequestDispatcher("/WEB-INF/inscriptionOK.jsp").forward(request, response);
	
		}
	}

}
