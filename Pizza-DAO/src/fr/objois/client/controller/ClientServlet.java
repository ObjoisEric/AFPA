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
 * Servlet implementation class ClientServlet
 */
@WebServlet("/client")
public class ClientServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	IClientBusiness clientBusiness = new ClientBusinessImpl();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ClientServlet() {
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
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/Client/client.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
