package ood.backend.happytails.Controller;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


import ood.backend.happytails.form.SearchCity;


@RestController
public class HomeController {

//	Remove white spaces
	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
		
		dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
	}
	
//	Display the home page when run the project
	@GetMapping("/")
	public ModelAndView showHomePage(Model model) {
		
		model.addAttribute("searchCity", new SearchCity());
		ModelAndView modelAndView = new ModelAndView("final_home_page");
		
		return modelAndView;
	}
	

}
