package ood.backend.happytails.Controller;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
		
		dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
	}
	
	@GetMapping("/")
	public ModelAndView root(Model model) {
		
		return new ModelAndView("homepage");
	}
	
	@GetMapping("/showMyLoginPage")
	public ModelAndView showForm() {
		
		ModelAndView modelAndView = new ModelAndView("login_form");
		
		return modelAndView;
	}
}
