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
 * Servlet implementation class createNewListServlet
 */
@WebServlet("/createNewListServlet")
public class createNewListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public createNewListServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		getServletContext().getRequestDispatcher("/new-list.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ListBikeHelper lih = new ListBikeHelper();
		String listName = request.getParameter("listName");
		System.out.println("List Name: " + listName);
		String userFirstName = request.getParameter("first_Name");
		String userLastName = request.getParameter("last_Name");

		
		String[] selectedItems = request.getParameterValues("allBikesToAdd");
		List<ListBike> selectedBikesInList = new ArrayList <ListBike>();
		//make sure something was selected - otherwise we get a null pointer exception
		if (selectedItems != null && selectedItems.length > 0)
		{
			for(int i= 0; i<selectedItems.length;i++) {
				System.out.println(selectedItems[i]);
				ListBike c = lih.searchForBikeById(Integer.parseInt(selectedItems[i]));
				selectedBikesInList.add(c);
			}
		}
		ListUser user = new ListUser(userFirstName, userLastName);
		ListDetails sld = new ListDetails(listName, user);
		sld.setListOfBikes(selectedBikesInList);
		ListDetailsHelper slh = new ListDetailsHelper();
		slh.insertNewListDetails(sld);
		
		System.out.println("Success!");
		System.out.println(sld.toString());
		
		getServletContext().getRequestDispatcher("/index.html").forward(request, response);
	}

}
