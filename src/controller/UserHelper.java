package controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import model.ListUser;

public class UserHelper {
	static EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("GroupMiniProject");
	
	public void insertUser(ListUser s) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		em.persist(s);
		em.getTransaction().commit();
		em.close();
	}
	public List<ListUser> showAllUsers() {
		EntityManager em = emfactory.createEntityManager();
		List<ListUser> allShopper = em.createQuery("SELECT s FROM User s").getResultList();
		return allShopper;
	}	
	
	public ListUser findUser(String nameToLookUp) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		TypedQuery<ListUser> typedQuery = em.createQuery("select sh from User sh "
				+ "where sh.userName = :selectedName", ListUser.class);
		typedQuery.setParameter("selectedName", nameToLookUp);
		ListUser foundUser;
		try {
			foundUser = typedQuery.getSingleResult();
		} catch (NoResultException ex) {
			foundUser = new ListUser(nameToLookUp);
		}
		em.close();
		return foundUser;
	}
}
