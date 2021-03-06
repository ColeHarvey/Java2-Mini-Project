package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.ListBike;

/**
 * Servlet implementation class AddBikeServlet
 */
@WebServlet("/addBikeServlet")
public class AddBikeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddBikeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String path = "/add-bike.jsp";
		
		getServletContext().getRequestDispatcher(path).forward(request, response);
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String make = request.getParameter("make");
		String model = request.getParameter("model");
		String year = request.getParameter("year");
		String quality = request.getParameter("quality");
		String price = request.getParameter("price");
		ListBike li = new ListBike(make, model, year, quality, price);
		ListBikeHelper dao = new ListBikeHelper();
		dao.insertBike(li);
		getServletContext().getRequestDispatcher("/index.html").forward(request,
				response);
		
	}

}
