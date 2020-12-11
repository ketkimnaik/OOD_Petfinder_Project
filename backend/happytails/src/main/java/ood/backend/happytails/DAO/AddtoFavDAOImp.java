package ood.backend.happytails.DAO;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ood.backend.happytails.POJO.AddtoFav;
import ood.backend.happytails.POJO.User;
@Repository
public class AddtoFavDAOImp implements AddtoFavDAO {
	@Autowired
	private EntityManager entityManager;
	
	@Override
	public void save(int userId, int dogId) {
		// TODO Auto-generated method stub
//		Get the current Hibernate session
		Session session = entityManager.unwrap(Session.class);
		AddtoFav addtoFav = new AddtoFav();

//		Set the object attributes
		addtoFav.setDogId(dogId);
		addtoFav.setUserId(userId);
		
//		Save the user in database
		session.saveOrUpdate(addtoFav);
	}
	
	@Override
	public List<AddtoFav> getList(int id) {
//		Get the current Hibernate session
		Session session = entityManager.unwrap(Session.class);

		Query<AddtoFav> query = session.createQuery("from AddtoFav where userId=:uid", AddtoFav.class);
		query.setParameter("uid", id);
		
		List<AddtoFav> list = null;

		try {
			list = query.getResultList();
			
		} catch (Exception e) {
			list = null;
		}

		return list;
	}
	
	@Override
	public void removeUserAndDog(int userId, int dogId) {
//		Get the current Hibernate session
		Session session = entityManager.unwrap(Session.class);

//		Delete the entry from favorites list
		Query query = session.createQuery("DELETE FROM AddtoFav AS a WHERE a.userId=:uid AND a.dogId=:did ");
		query.setParameter("uid", userId)
			.setParameter("did", dogId );
		
		query.executeUpdate();
	}
	
	@Override
	public AddtoFav getEntryDetails(int userId, int dogId) {
//		Get the current Hibernate session
		Session session = entityManager.unwrap(Session.class);

//		Get the entry from database
		Query<AddtoFav> query = session.createQuery("from AddtoFav As a where a.userId=:uid AND a.dogId =:did", AddtoFav.class);
		query.setParameter("uid", userId)
		.setParameter("did", dogId);
		
		AddtoFav af = null;

		try {
			af = query.getSingleResult();
			
		} catch (Exception e) {
			af = null;
		}

		return af;
	}

}
