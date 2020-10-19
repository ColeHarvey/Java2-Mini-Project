package controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import model.ListBike;

public class ListBikeHelper {
	static EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("GroupMiniProject");
	
	public void insertBike(ListBike li) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		em.persist(li);
		em.getTransaction().commit();
		em.close();
	}
	
	public List<ListBike> showAllBikes(){
		EntityManager em = emfactory.createEntityManager();
		List<ListBike> allBikes = em.createQuery("SELECT i FROM ListBike i").getResultList();
		return allBikes;
	}
	
	public void deleteBike(ListBike toDelete) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		TypedQuery<ListBike>typedQuery = em.createQuery("SELECT li FROM ListBike li WHERE "
				+ "li.make = :selectedBike and li.model = :selectedBike", ListBike.class);
		
		//Substitute parameter with actual data from the toDelete item
		typedQuery.setParameter("selectedStore", toDelete.getMake());
		typedQuery.setParameter("selectedItem", toDelete.getModel());
		
		//we only want one result
		typedQuery.setMaxResults(1);
		
		//get the result and save it into a new list item
		ListBike result = typedQuery.getSingleResult();
		
		//remove it
		em.remove(result);
		em.getTransaction().commit();
		em.close();
	}

	public ListBike searchForBikeById(int idToEdit) {
		// TODO Auto-generated method stub
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		ListBike found = em.find(ListBike.class, idToEdit);
		em.close();
		return found;
	}

	public void updateBike(ListBike toEdit) {
		// TODO Auto-generated method stub
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		
		em.merge(toEdit);
		em.getTransaction().commit();
		em.close();
		
	}

	public List<ListBike> searchForBikeByMake(String makeName) {
		// TODO Auto-generated method stub
		EntityManager em =emfactory.createEntityManager();
		em.getTransaction().begin();
		TypedQuery<ListBike> typedQuery = em.createQuery("SELECT li FROM ListBike"
				+ " li WHERE li.make = :selectedMake", ListBike.class);
		typedQuery.setParameter("selectedMake", makeName);
		
		List<ListBike> foundBikes = typedQuery.getResultList();
		em.close();
		return foundBikes;
	}

	public List<ListBike> searchForItemByModel(String modelName) {
		// TODO Auto-generated method stub
		EntityManager em =emfactory.createEntityManager();
		em.getTransaction().begin();
		TypedQuery<ListBike> typedQuery = em.createQuery("SELECT li FROM ListBike"
				+ " li WHERE li.model = :selectedModel", ListBike.class);
		typedQuery.setParameter("selectedModel", modelName);
		
		List<ListBike> foundBikes = typedQuery.getResultList();
		em.close();
		return foundBikes;
	}

	public void cleanUp() {
		emfactory.close();
	}
}
