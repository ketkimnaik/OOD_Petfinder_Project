package ood.backend.happytails.DAO;

import ood.backend.happytails.POJO.User;

public interface UserDAO {

//	Method to save User in database
	public void save(User user);

//	Find user from database by passing the user email
	public User findByemail(String email);

}
