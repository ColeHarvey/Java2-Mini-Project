import java.util.ArrayList;
import java.util.List;

import controller.ListBikeHelper;
import controller.ListDetailsHelper;
import model.ListBike;
import model.ListDetails;
import model.ListUser;

public class ShoppingTester {
	public static void main(String[] args) {
//		ListUser susan = new ListUser("Susan");
//		
//		ListDetailsHelper ldh = new ListDetailsHelper();
//		
//		ListBike bike1 = new ListBike("Random Make", "Random Model" , "1999" , "Bad" , "$100");
//		ListBike bike2 = new ListBike("Random Make", "Random Model" , "1999" , "Bad" , "$100");
//		
//		List<ListBike> susansItems = new ArrayList<ListBike>();
//		susansItems.add(bike1);
//		susansItems.add(bike2);
//		
//		ListDetails susansList = new ListDetails("Susan's ShoppingList", susan);
//		susansList.setListOfBikes(susansItems);
//		
//		ldh.insertNewListDetails(susansList);
//		
//		List<ListDetails> allLists = ldh.getLists();
//		for(ListDetails a: allLists) {
//			System.out.println(a.toString());
//		}
		ListBikeHelper dao = new ListBikeHelper();
		List<ListBike> allBikes = dao.showAllBikes();
		for(ListBike a: allBikes) {
			System.out.println(a.getMake());
		}
		System.out.println("Complete");
		
	}
}
