package ood.backend.happytails.Controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import ood.backend.happytails.POJO.User;
import ood.backend.happytails.Service.UserService;
import ood.backend.happytails.form.RegisterUser;

@RestController
@RequestMapping("/register")
public class RegistrationController {
	
	@Autowired
    private UserService userService;
	
	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
		
		dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
	}	
	
//	@GetMapping("/showRegistrationForm")
//	public String showMyLoginPage(Model model) {
//		
////		model.addAttribute("newUser", new RegisterUser());
////		ModelAndView modelAndView = new ModelAndView("registration-form");
////		return modelAndView;
//		return "registration";
//	}
	
	//trial method
	@GetMapping("/showRegistrationForm")
	public String showMyReg() {
		
//		model.addAttribute("newUser", new RegisterUser());
//		ModelAndView modelAndView = new ModelAndView("registration-form");
//		return modelAndView;
		return "registration";
	}
	
	@PostMapping("/processRegistrationForm")
	public ModelAndView processRegistrationForm(
				@Valid @ModelAttribute("newUser") RegisterUser newUser, 
				BindingResult bindingResult, 
				Model model, RedirectAttributes redirect) {
		
		
		
		 
		String email = newUser.getEmail();
//		logger.info("Processing registration form for: " + userName);
		
//		form validation
		if (bindingResult.hasErrors()){
			 return new ModelAndView("registration-form");
	    }

//		  Check the database if user already exists
        User existing_email = userService.findByemail(email);
          
        if(existing_email != null) {
        	
        	model.addAttribute("newUser", new RegisterUser());
            	
            model.addAttribute("registrationError", "Email already exists.");
            	
            return new ModelAndView("registration-form");
        }
          
//      Create user account  
        
        User user = userService.transfer(newUser);

        redirect.addFlashAttribute("newUserSaveStatus", true);
        
        return new ModelAndView("redirect:/showMyLoginPage");	
	}
	
	
}
