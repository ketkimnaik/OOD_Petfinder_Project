package ood.backend.happytails.Config;

import java.io.IOException;
import java.util.Collection;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import ood.backend.happytails.POJO.DogData;
import ood.backend.happytails.POJO.User;
import ood.backend.happytails.Service.UserService;


@Component
public class CustomAuthenticationSuccessHandler implements AuthenticationSuccessHandler {

    @Autowired
    private UserService userService;
	
	@Override
	public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication)
			throws IOException, ServletException {

		System.out.println("\n\nIn customAuthenticationSuccessHandler\n\n");

		String email = authentication.getName();
		
		System.out.println("Email=" + email);

		User user = userService.findByemail(email);
		// now place in the session
		HttpSession session = request.getSession();
		session.setAttribute("user", user);
		
		
		// forward to home page
		
		response.sendRedirect(request.getContextPath() + "/");
	}

	
}
