package ood.backend.happytails.Service;

import org.springframework.security.core.userdetails.UserDetailsService;
import ood.backend.happytails.POJO.User;
import ood.backend.happytails.form.RegisterUser;

public interface UserService extends UserDetailsService{

	
	public void save(RegisterUser user);
	
	public void save_user(User user);
	
	public User transfer(RegisterUser reguser);
	
	public User findByemail(String email);
}
