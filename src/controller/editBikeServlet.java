package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.ListBike;

/**
 * Servlet implementation class editBikeServlet
 */
@WebServlet("/editBikeServlet")
public class editBikeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public editBikeServlet() {
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
		// TODO Auto-generated method stub
		ListBikeHelper dao = new ListBikeHelper();
		
		
		String make = request.getParameter("make");
		String model = request.getParameter("model");
		String year = request.getParameter("year");
		String quality = request.getParameter("quality");
		String price = request.getParameter("price");
		Integer tempId = Integer.parseInt(request.getParameter("id"));
		
		ListBike bikeToUpdate = dao.searchForBikeById(tempId);
		bikeToUpdate.setMake(make);
		bikeToUpdate.setModel(model);
		bikeToUpdate.setPrice(price);
		bikeToUpdate.setQuality(quality);
		bikeToUpdate.setYear(year);
		
		dao.updateBike(bikeToUpdate);
		
		getServletContext().getRequestDispatcher("/viewAllBikesServlet").forward(request, response);
		
		
	}

}
