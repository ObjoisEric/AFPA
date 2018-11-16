package fr.objois.client.controller;

import java.io.IOException;
import java.util.List;

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
 * Servlet implementation class ClientServlet
 */
@WebServlet("/clients")
public class ClientsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private IClientBusiness clientBusiness = new ClientBusinessImpl();
	private  static Logger LOGGER = LoggerFactory.getLogger(ClientsServlet.class);

       
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
		
		LOGGER.info("ClientsServlet");
		
		List<Client> listeClient = clientBusiness.findAll();
		
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
