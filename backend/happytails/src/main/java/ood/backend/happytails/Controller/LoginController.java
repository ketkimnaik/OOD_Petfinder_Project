package ood.backend.happytails.Controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import ood.backend.happytails.POJO.DogData;
import ood.backend.happytails.POJO.User;
import ood.backend.happytails.Service.UserService;

@RestController
@RequestMapping("/login")
@SessionAttributes("user")
public class LoginController {
	
	@Autowired
	public UserService userService;

	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
		
		dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
	}
	
	/*
    * Add user in model attribute
    */
//   @ModelAttribute("user")
//   public User setUpUserForm() {
//      return new User();
//   }
		
	@GetMapping("/showMyLoginPagedemo")
	public User showUser() {
		
		User u = userService.findByemail("ketkimnaik@gmail.com");
		
		Collection<DogData> dd = u.getDogdata();
		
		for(DogData i : dd) {
			System.out.println(i.getId());
		}

		return u;
	}
	
	@GetMapping("/showMyLoginPage")
	public ModelAndView showForm() {
		
		ModelAndView modelAndView = new ModelAndView("login_form");
		
		return modelAndView;
	}
	
	@GetMapping("/trial")
	public String trial() {
		
		return "trial login page";
	}
}
