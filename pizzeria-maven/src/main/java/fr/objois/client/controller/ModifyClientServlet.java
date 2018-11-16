package fr.objois.client.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import fr.objois.client.business.IClientBusiness;
import fr.objois.client.business.impl.ClientBusinessImpl;
import fr.objois.client.domain.Client;

/**
 * Servlet implementation class ModifyClientServlet
 */
@WebServlet("/modifyClient")
public class ModifyClientServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private IClientBusiness clientBusiness = new ClientBusinessImpl();
	private  static Logger LOGGER = LoggerFactory.getLogger(ModifyClientServlet.class);

       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ModifyClientServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Integer id = Integer.valueOf(request.getParameter("id"));
		
		Client clientDetail = clientBusiness.clientDetail(id);
		
		request.setAttribute("clientDetail", clientDetail);
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/Client/modifyClient.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Client clientAModifier = new Client();		

		
		clientAModifier.setId(Integer.valueOf(request.getParameter("id")));
		clientAModifier.setNumeroClient(Integer.valueOf(request.getParameter("numeroClient")));
		clientAModifier.setNom(request.getParameter("nom"));
		clientAModifier.setPrenom(request.getParameter("prenom"));
		clientAModifier.setAdresse(request.getParameter("adresse"));
		clientAModifier.setTelFixe(request.getParameter("telFixe"));
		clientAModifier.setTelPortable(request.getParameter("telPortable"));
		clientAModifier.setDateNaissance(request.getParameter("dateNaissance"));
		clientAModifier.setEmail(request.getParameter("email"));
		
		clientBusiness.modifyClient(clientAModifier);
		
		response.sendRedirect("clients");

	}

}
