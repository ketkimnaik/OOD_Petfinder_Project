package ood.backend.happytails.DAO;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ood.backend.happytails.POJO.Role;

@Repository
public class RoleDAOImp implements RoleDAO {
	
	@Autowired
	private EntityManager entityManager;

	@Override
	public Role findRoleByName(String role) {
		
//		Get the current hibernate session
		Session currentSession = entityManager.unwrap(Session.class);

//		Now retrieve/read from database using name
		Query<Role> query = currentSession.createQuery("from Role where name=:roleName", Role.class);
		query.setParameter("roleName", role);
		
		Role theRole = null;

//		Get the role for the user for give role from database
		try {
			theRole = query.getSingleResult();
		} catch (Exception e) {
			theRole = null;
		}
		
		return theRole;
	}

}
