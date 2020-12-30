package ood.backend.happytails.Controller;

import java.security.Principal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import ood.backend.happytails.Config.CustomAuthenticationSuccessHandler;
import ood.backend.happytails.POJO.DogData;
import ood.backend.happytails.POJO.User;
import ood.backend.happytails.Service.UserService;
import ood.backend.happytails.form.SearchCity;

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
	
////	Display Login Page
//	@GetMapping("/showMyLoginPage")
//	public ModelAndView showForm() {
//		
//		ModelAndView modelAndView = new ModelAndView("login_form");
//		return modelAndView;
//	}
	
	@RequestMapping(method = RequestMethod.GET, value = {"/showMyLoginPage"})
	public ModelAndView login(Model model, Principal principal, HttpServletRequest request) throws Exception{
        String referer = request.getHeader("Referer"); //Get previous URL before call '/login'

        System.out.println(referer);
        //save referer URL to session, for later use on CustomAuthenticationSuccesshandler
        if(!referer.equals("http://happytails.us-east-2.elasticbeanstalk.com/register/showRegistrationForm")) {
        request.getSession().setAttribute(CustomAuthenticationSuccessHandler.REDIRECT_URL_SESSION_ATTRIBUTE_NAME, referer); 
        }
        ModelAndView modelAndView = new ModelAndView("login_form");


        return modelAndView;
    }
	

}
