package ood.backend.happytails.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import ood.backend.happytails.POJO.User;
import ood.backend.happytails.Service.UserService;

@RestController
@RequestMapping("/login")
public class LoginController {
	
	@Autowired
	public UserService userService;

	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
		
		dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
	}
	
	@GetMapping("/home")
	public String root() {
		
		return "Homepage guys";
	}
	
	@GetMapping("/showMyLoginPage")
	public User showUser() {
		
		return userService.findByemail("ketkimnaik@gmail.com");
	}
}
