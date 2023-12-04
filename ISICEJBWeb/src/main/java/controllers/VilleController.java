package controllers;

import jakarta.ejb.EJB;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import dao.VilleIDaoLocale;
import entities.Ville;

/**
 * Servlet implementation class VilleController
 */
public class VilleController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@EJB
	private VilleIDaoLocale ejb;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public VilleController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nom = request.getParameter("ville");
		ejb.create(new Ville(nom));
		
		request.setAttribute("villes", ejb.findAll());
		RequestDispatcher dispatcher = request.getRequestDispatcher("ville.jsp");
		
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Get the parameters from the form
        String action = request.getParameter("action");

        if ("create".equals(action)) {
            // Create new city
            String nom = request.getParameter("ville");
            ejb.create(new Ville(nom));
        } else if ("update".equals(action)) {
            // Update existing city
            int id = Integer.parseInt(request.getParameter("id"));
            String updatedNom = request.getParameter("updatedVille");
            Ville villeToUpdate = ejb.findById(id);

            if (villeToUpdate != null) {
                villeToUpdate.setNom(updatedNom);
                ejb.update(villeToUpdate);
            }
        }

        // Retrieve and forward the list of cities
        request.setAttribute("villes", ejb.findAll());
        RequestDispatcher dispatcher = request.getRequestDispatcher("ville.jsp");
        dispatcher.forward(request, response);
    }
		
}


