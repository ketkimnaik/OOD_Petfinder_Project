package ood.backend.happytails.Service;

import org.springframework.security.core.userdetails.UserDetailsService;
import ood.backend.happytails.POJO.User;
import ood.backend.happytails.form.RegisterUser;

public interface UserService extends UserDetailsService{

//	Save registered user to database
	public void save(RegisterUser user);

//	Find user using email
	public User findByemail(String email);
}
