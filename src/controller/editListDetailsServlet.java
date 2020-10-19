package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.ListBike;
import model.ListDetails;
import model.ListUser;

/**
 * Servlet implementation class editListDetailsServlet
 */
@WebServlet("/editListDetailsServlet")
public class editListDetailsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public editListDetailsServlet() {
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
		doGet(request, response);
		
		ListDetailsHelper dao = new ListDetailsHelper();
		ListBikeHelper lbh = new ListBikeHelper();
		UserHelper uh = new UserHelper();
		
		Integer tempId = Integer.parseInt(request.getParameter("id"));
		ListDetails listToUpdate = dao.searchForListDetailsById(tempId);
		
		String newListName = request.getParameter("listName");
		String userName = request.getParameter("userName");
		ListUser newUser = uh.findUser(userName);
		
		
		try {
			String [] selectedBikes = request.getParameterValues("allBikesToAdd");
			List<ListBike> selectedBikesInList = new ArrayList<ListBike>();
			
			for (int i = 0; i < selectedBikes.length; i++) {
				System.out.println(selectedBikes[i]);
				ListBike c = lbh.searchForBikeById(Integer.parseInt(selectedBikes[i]));
				selectedBikesInList.add(c);
			}
			
			listToUpdate.setListOfBikes(selectedBikesInList);
		} catch (NullPointerException e) {
			List<ListBike> selectedBikesInList = new ArrayList<ListBike>();
			listToUpdate.setListOfBikes(selectedBikesInList);
		}
		
		listToUpdate.setListName(newListName);
		listToUpdate.setUser(newUser);
		
		dao.updateList(listToUpdate);
		
		getServletContext().getRequestDispatcher("/viewAllListsServlet").forward(request, response);
	}

}
