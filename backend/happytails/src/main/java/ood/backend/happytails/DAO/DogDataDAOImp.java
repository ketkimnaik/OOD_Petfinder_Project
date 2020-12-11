	package ood.backend.happytails.DAO;

import java.util.Collection;
import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import ood.backend.happytails.POJO.DogData;

@Repository
public class DogDataDAOImp implements DogDataDAO {

	@Autowired
	private EntityManager entityManager;
	
	
	@Override
	public List<DogData> findBycity(String city) {
//		get the current hibernate session
		Session session = entityManager.unwrap(Session.class);

		Query<DogData> query = session.createQuery("from DogData where contact_city=:ucity", DogData.class);
		query.setParameter("ucity", city);
		
		List<DogData> dd = null;
		
		try {
			dd = query.getResultList();
		} catch (Exception e) {
			dd = null;
		}

		return dd; 
	}
	
	@Override
	public DogData getDogDetail(int id) {
//		get the current hibernate session
		Session session = entityManager.unwrap(Session.class);
		Query<DogData> query = session.createQuery("from DogData where id=:uid", DogData.class);
		query.setParameter("uid", id);
		
		DogData dd = null;
		
		try {
			dd = query.getSingleResult();
		} catch (Exception e) {
			dd = null;
		}

		return dd; 
	}
	
}
