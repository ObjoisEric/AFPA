package fr.objois;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import fr.objois.bean.Personne;


/**
 * Servlet implementation class UsersDetailServlet
 */
@SuppressWarnings("unchecked")
@WebServlet("/usersDetail")
public class UsersDetailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UsersDetailServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/**ouverture de session**/
		HttpSession session = request.getSession(true);
		
		String sessionID = (String)session.getAttribute("sessionID");
		
		ArrayList<Personne> tableauPersonne = (ArrayList<Personne>)session.getAttribute("donneePersonne");
		
		//System.out.println("test => " + session.getAttribute("donneePersonne"));
		
		String nomPersonne;
		if((request.getParameter("nomPersonne") == null)||(request.getParameter("nomPersonne").equals(""))) {
						
			nomPersonne = "Erreur";
			
		}else {
			
			nomPersonne=request.getParameter("nomPersonne");
			
		}
		String prenomPersonne;
		if((request.getParameter("prenomPersonne") == null)||(request.getParameter("prenomPersonne").equals(""))) {
			
			prenomPersonne = "Erreur";
			
		}else {
			
			prenomPersonne=request.getParameter("prenomPersonne");
			
		}
		String datePersonne;
		if((request.getParameter("datePersonne") == null)||(request.getParameter("datePersonne").equals(""))) {
			
			datePersonne = "Erreur";
			
		}else {
			
			datePersonne=request.getParameter("datePersonne");
			
		}
		String numEtRuePersonne;
		if((request.getParameter("numEtRuePersonne") == null)||(request.getParameter("numEtRuePersonne").equals(""))) {
			
			numEtRuePersonne = "Erreur";
			
		}else {
			
			numEtRuePersonne=request.getParameter("numEtRuePersonne");
			
		}
		String villePersonne;
		if((request.getParameter("villePersonne") == null)||(request.getParameter("villePersonne").equals(""))) {
			
			villePersonne = "Erreur";
			
		}else {
			
			villePersonne=request.getParameter("villePersonne");
			
		}
		String mailPersonne;
		if((request.getParameter("mailPersonne") == null)||(request.getParameter("mailPersonne").equals(""))) {
			
			mailPersonne = "Erreur";
			
		}else {
			
			mailPersonne=request.getParameter("mailPersonne");
			
		}
		String telephonePersonne;
		if((request.getParameter("telephonePersonne") == null)||(request.getParameter("telephonePersonne").equals(""))) {
			
			telephonePersonne = "Erreur";
			
		}else {
			
			telephonePersonne=request.getParameter("telephonePersonne");
			
		}
		String departementPersonne;
		if((request.getParameter("departementPersonne") == null)||(request.getParameter("departementPersonne").equals(""))) {
			
			departementPersonne = "Erreur";
			
		}else {
			
			departementPersonne=request.getParameter("departementPersonne");
			
		}
		String paysPersonne;
		if((request.getParameter("paysPersonne") == null)||(request.getParameter("paysPersonne").equals(""))) {
			
			paysPersonne = "Erreur";
			
		}else {
			
			paysPersonne=request.getParameter("paysPersonne");
			
		}
		String genrePersonne;
		if((request.getParameter("genrePersonne") == null)||(request.getParameter("genrePersonne").equals(""))) {
			
			genrePersonne = "Erreur";
			
		}else {
			
			genrePersonne=request.getParameter("genrePersonne");
			
		}
		String urlPhotoPersonne;
		if((request.getParameter("urlPhotoPersonne") == null)||(request.getParameter("urlPhotoPersonne").equals(""))) {
			
			urlPhotoPersonne = "Erreur";
			
		}else {
			
			urlPhotoPersonne=request.getParameter("urlPhotoPersonne");
			
		}		
		Integer indice;
		if((request.getParameter("id") == null)||(request.getParameter("id").equals(""))) {
			
			indice = 0;
			
		}else {
			
			indice=Integer.valueOf(request.getParameter("id"));
			
		}
		
		
		
		Personne p = tableauPersonne.get(indice);
		
		Personne personneAAfficher = new Personne(nomPersonne, prenomPersonne, datePersonne, numEtRuePersonne, villePersonne, mailPersonne, telephonePersonne, departementPersonne, paysPersonne, genrePersonne, urlPhotoPersonne);
		
		request.setAttribute("personneAAfficher", personneAAfficher);
		request.setAttribute("sessionID", sessionID);
		request.setAttribute("tableauPersonne", tableauPersonne);
		request.setAttribute("p", p);
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/usersDetail.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
