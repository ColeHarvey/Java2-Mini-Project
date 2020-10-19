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
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String make = request.getParameter("make");
		String model = request.getParameter("model");
		ListBike li = new ListBike(make, model);
		ListBikeHelper dao = new ListBikeHelper();
		dao.insertBike(li);
		getServletContext().getRequestDispatcher("/index.html").forward(request,
				response);
		
	}

}
