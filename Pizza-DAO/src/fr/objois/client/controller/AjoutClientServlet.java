package fr.objois.client.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.objois.client.business.IClientBusiness;
import fr.objois.client.business.impl.ClientBusinessImpl;
import fr.objois.client.domain.Client;

/**
 * Servlet implementation class AjoutClientServlet
 */
@WebServlet("/ajoutClient")
public class AjoutClientServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	IClientBusiness clientBusiness = new ClientBusinessImpl();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AjoutClientServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher("/WEB-INF/Client/ajoutClient.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Client clientAAjouter = new Client();		

		
		clientAAjouter.setNumeroClient(Integer.valueOf(request.getParameter("numeroClient")));
		clientAAjouter.setNom(request.getParameter("nom"));
		clientAAjouter.setPrenom(request.getParameter("prenom"));
		clientAAjouter.setAdresse(request.getParameter("adresse"));
		clientAAjouter.setTelFixe(request.getParameter("telFixe"));
		clientAAjouter.setTelPortable(request.getParameter("telPortable"));
		clientAAjouter.setDateNaissance(request.getParameter("dateNaissance"));
		clientAAjouter.setEmail(request.getParameter("email"));
				
		clientBusiness.ajoutClient(clientAAjouter);
		
		request.setAttribute("nom", clientAAjouter.getNom());
		
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/Client/ajoutClient.jsp").forward(request, response);
	}

}
