package fr.objois;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import fr.objois.bean.Personne;

/**
 * Servlet implementation class UsersServlet
 */
@WebServlet("/users")
public class UsersServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UsersServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		

		HttpSession session = request.getSession();
		session.setMaxInactiveInterval(900);
		
		ArrayList<Personne> tableauPersonne = new ArrayList<Personne>();
		long timeCreationSession = session.getCreationTime();
		
		
		//System.out.println(new Date(timeCreationSession));
		//System.out.println("current session : " + timeCreationSession);
		//System.out.println("temps actuel :    " + System.currentTimeMillis());
		
		if ((timeCreationSession + 300000) < System.currentTimeMillis()) {
			
			session.invalidate();
			session = request.getSession();
			System.out.println("new session");
			
		}
		
		
		
		tableauPersonne.add(new Personne("tomate","tomate","2000-05-03","2 rue de la tomate","Tomate","tomate.tomate@tomate.com","0123456789","tomate","tomate","tomate","Ressources/Images/tomate.jpg"));
		tableauPersonne.add(new Personne("banane","banane","2000-05-03","2 rue de la banane","banane","banane.banane@banane.com","0123456789","banane","banane","banane","Ressources/Images/banane.jpg"));
		tableauPersonne.add(new Personne("ananas","ananas","2000-05-03","2 rue de la ananas","ananas","ananas.ananas@ananas.com","0123456789","ananas","ananas","ananas","Ressources/Images/ananas.jpg"));
		tableauPersonne.add(new Personne("grenade","grenade","2000-05-03","2 rue de la grenade","grenade","grenade.grenade@grenade.com","0123456789","grenade","grenade","grenade","Ressources/Images/grenade.jpg"));
		tableauPersonne.add(new Personne("kiwi","kiwi","2000-05-03","2 rue de la kiwi","kiwi","kiwi.kiwi@kiwi.com","0123456789","kiwi","kiwi","kiwi","Ressources/Images/kiwi.jpg"));
		tableauPersonne.add(new Personne("noix de coco","noix de coco","2000-05-03","2 rue de la noix de coco","noix de coco","noixDeCoco.noixDeCoco@noixDeCoco.com","0123456789","noix de coco","noix de coco","noix de coco","Ressources/Images/noixDeCoco.jpg"));
		tableauPersonne.add(new Personne("poire","poire","2000-05-03","2 rue de la poire","poire","poire.poire@poire.com","0123456789","poire","poire","poire","Ressources/Images/poire.jpg"));
		tableauPersonne.add(new Personne("pomme","pomme","2000-05-03","2 rue de la pomme","pomme","pomme.pomme@pomme.com","0123456789","pomme","pomme","pomme","Ressources/Images/pomme.jpg"));
		
		String sessionID = session.getId();
		session.setAttribute("sessionID",sessionID);
		session.setAttribute("donneePersonne",tableauPersonne);
		
		request.setAttribute("tableauPersonne", tableauPersonne);
		request.setAttribute("sessionID", sessionID);
		request.setAttribute("timeCreationSession", timeCreationSession);
		
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/users.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
