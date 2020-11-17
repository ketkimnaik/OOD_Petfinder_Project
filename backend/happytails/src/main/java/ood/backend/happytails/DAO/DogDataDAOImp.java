	package ood.backend.happytails.DAO;

import java.util.Collection;
import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import ood.backend.happytails.POJO.Dog_Data;

@Repository
public class DogDataDAOImp implements DogDataDAO {

	@Autowired
	private EntityManager entityManager;
	
	
	@Override
	public List<Dog_Data> findBycity(String city) {
//		get the current hibernate session
		Session session = entityManager.unwrap(Session.class);
//	Need to take list of dogs	
		
//		Need to write code

		Query<Dog_Data> query = session.createQuery("from Dog_Data where contact_city=:ucity", Dog_Data.class);
		query.setParameter("ucity", city);
		
		List<Dog_Data> dd = null;
		
//		Check the entry of the user with given email and email is always unique for each user 
//		so use giveSingleResul() function
		try {
			dd = query.getResultList();
//			System.out.println(dd.name);
		} catch (Exception e) {
			dd = null;
		}

		return dd; 
	}

}
