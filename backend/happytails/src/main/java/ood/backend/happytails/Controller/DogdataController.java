package ood.backend.happytails.Controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


import ood.backend.happytails.POJO.DogData;
import ood.backend.happytails.Service.DogDataService;
import ood.backend.happytails.Service.UserService;
import ood.backend.happytails.form.SearchCity;

@RestController
@RequestMapping("/dog")
public class DogdataController {
	
	@Autowired
    private DogDataService dogDataService;
	
	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
		
		dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
	}
	
	
//	Display doglist	 when user enters city
	@GetMapping("/doglist")
	public ModelAndView processDogSearchRequest(@Valid @ModelAttribute("searchCity") SearchCity form, 
			BindingResult theBindingResult, Model theModel) {
		 
		String city = form.getCity();
		
		// form validation
		 if (theBindingResult.hasErrors()){
			 System.out.println("it has error");
			 return new ModelAndView("final_home_page");
	     }

//		Get list of dogs by city from database
		List<DogData> dogdata = new ArrayList<>();
		dogdata = dogDataService.findBycity(city);
		
		if(dogdata != null) {
        	theModel.addAttribute("DogListModel", dogdata);
        }
               
        if(dogdata == null) {
        	return new ModelAndView("final_home_page");
        }
        return new ModelAndView("dog_page");	
	}

//	Get dog details by dog id
	@GetMapping("/details/{id}")
	public ModelAndView showEditProductPage(@PathVariable(name = "id") int id) {
	    ModelAndView mav = new ModelAndView("dogdetail_page");
	    DogData dd = dogDataService.getDogDetail(id);
	    mav.addObject("dogdetail", dd);
	     
	    return mav;
	}
	
}
