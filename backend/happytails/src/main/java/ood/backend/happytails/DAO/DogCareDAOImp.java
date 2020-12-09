package ood.backend.happytails.DAO;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ood.backend.happytails.POJO.DogCare;

@Repository
public class DogCareDAOImp implements DogCareDAO {

	@Autowired
	private EntityManager entityManager;
	
	@Override
	public List<DogCare> findBycity(String city) {
		
		Session session = entityManager.unwrap(Session.class);
		Query<DogCare> query = session.createQuery("from DogCare where city=:ucity", DogCare.class);
		query.setParameter("ucity", city);
		
		List<DogCare> dd = null;
		
//			Check the entry of the user with given email and email is always unique for each user 
//			so use giveSingleResul() function
		try {
			dd = query.getResultList();
//				
			for(DogCare i : dd) {
				System.out.println(i);
			}
		} catch (Exception e) {
			dd = null;
		}
		
		

		return dd; 
	}
}


