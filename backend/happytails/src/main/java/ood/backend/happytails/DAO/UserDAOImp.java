package ood.backend.happytails.DAO;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ood.backend.happytails.POJO.User;

@Repository
public class UserDAOImp implements UserDAO {

	@Autowired
	private EntityManager entityManager;
	
	@Override
	public void save(User user) {
//		Get the current Hibernate session
		Session session = entityManager.unwrap(Session.class);
		System.out.println(user.firstName);
//		Save the user in database
		session.saveOrUpdate(user);
	}
	
	@Override
	public User findByemail(String email) {
		
//		Get the current Hibernate session
		Session session = entityManager.unwrap(Session.class);
//		email = "ketkimnaik@gmail.com";
//		now retrieve/read from database using email
		Query<User> query = session.createQuery("from User where email=:uEmail", User.class);
		query.setParameter("uEmail", email);
		
		User user = null;
		
//		Check the entry of the user with given email and email is always unique for each user 
//		so use giveSingleResul() function
		try {
			user = query.getSingleResult();
			System.out.println(user.firstName);
		} catch (Exception e) {
			user = null;
		}

		return user;
	}
	
}
