package ood.backend.happytails.Service;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ood.backend.happytails.DAO.RoleDAO;
import ood.backend.happytails.DAO.UserDAO;
import ood.backend.happytails.POJO.Role;
import ood.backend.happytails.POJO.User;
import ood.backend.happytails.form.RegisterUser;

@Service
public class UserServiceImp implements UserService {

	@Autowired
	private UserDAO userDAO;
	
	@Autowired
	private RoleDAO roleDAO;	
	
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
	
	@Override
	@Transactional
	public void save(RegisterUser reguser) {
		
		User user = new User();
		 // assign user details to the user object
		user.setFirstName(reguser.getFirstName());
		user.setLastName(reguser.getLastName());
		user.setEmail(reguser.getEmail());
		user.setPhone(reguser.getPhone());
		user.setPassword(passwordEncoder.encode(reguser.getPassword()));
		
		// give user default role of "ROLE_USER"
		user.setRoles(Arrays.asList(roleDAO.findRoleByName("ROLE_USER")));
		
		userDAO.save(user);
	}
	
//	For email verification

	@Override
	@Transactional
	public void save_user(User reguser) {
		
		User user = new User();
		
//		Assign user details to the user object
		user.setFirstName(reguser.getFirstName());
		user.setLastName(reguser.getLastName());
		user.setEmail(reguser.getEmail());
		user.setPhone(reguser.getPhone());
		user.setPassword(passwordEncoder.encode(reguser.getPassword()));
		
//		Give user default role of "ROLE_USER"
		user.setRoles(Arrays.asList(roleDAO.findRoleByName("ROLE_USER")));
		
		userDAO.save(user);
	}
	
	@Override
	public User transfer(RegisterUser reguser) {
		User user = new User();
		
		user.setFirstName(reguser.getFirstName());
		user.setLastName(reguser.getLastName());
		user.setEmail(reguser.getEmail());
		user.setPhone(reguser.getPhone());
		user.setPassword(passwordEncoder.encode(reguser.getPassword()));
		
		return user;
	}
	
	@Override
	@Transactional
	public User findByemail(String email) {
		return userDAO.findByemail(email);
	}
	
	@Override
	@Transactional
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		User user = userDAO.findByemail(email);
		if (user == null) {
			throw new UsernameNotFoundException("Invalid username or password.");
		}
		return new org.springframework.security.core.userdetails.User(user.getEmail(), user.getPassword(),
				mapRolesToAuthorities(user.getRoles()));
	}

	private Collection<? extends GrantedAuthority> mapRolesToAuthorities(Collection<Role> roles) {
		return roles.stream().map(role -> new SimpleGrantedAuthority(role.getName())).collect(Collectors.toList());
	}



}
