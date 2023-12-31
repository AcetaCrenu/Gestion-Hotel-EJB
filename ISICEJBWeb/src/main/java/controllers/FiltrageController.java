package controllers;

import java.io.IOException;
import java.util.List;

import dao.HotelIDaoLocale;
import dao.VilleIDaoLocale;
import entities.Ville;
import entities.Hotel;
import jakarta.ejb.EJB;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class FiltrageController
 */
public class FiltrageController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@EJB
	private VilleIDaoLocale vejb;
	@EJB
	private HotelIDaoLocale ejb;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FiltrageController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Ville> villes=vejb.findAll();
		List<Hotel> hotels=ejb.findAll();
		request.setAttribute("villes", villes);
		request.setAttribute("hotels", hotels);
		RequestDispatcher dispatcher = request.getRequestDispatcher("filtage.jsp");
		dispatcher.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
					//int villId=Integer.parseInt(request.getParameter("ville"));
					//Ville ville=vejb.findById(villId);
					ejb.findByville(2);
					request.setAttribute("hotels", ejb.findAll());
					request.setAttribute("villes", vejb.findAll());
					RequestDispatcher dispatcher = request.getRequestDispatcher("filtage.jsp");
					dispatcher.forward(request, response);

    }
		
}


