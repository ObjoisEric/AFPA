package fr.objois.client.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.objois.client.business.IClientBusiness;
import fr.objois.client.business.impl.ClientBusinessImpl;
import fr.objois.client.domain.Client;

/**
 * Servlet implementation class ClientServlet
 */
@WebServlet("/clients")
public class ClientsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	IClientBusiness clientBusiness = new ClientBusinessImpl();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ClientsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<Client> listeClient = new ClientBusinessImpl().findAll();
		
		request.setAttribute("listeClient", listeClient);
		
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/Client/clients.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
