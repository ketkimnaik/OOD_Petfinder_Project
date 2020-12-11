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
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import ood.backend.happytails.POJO.DogCare;
import ood.backend.happytails.POJO.DogData;
import ood.backend.happytails.Service.DogCareService;
import ood.backend.happytails.Service.DogDataService;
import ood.backend.happytails.form.SearchCity;

@RestController
@RequestMapping("/daycare")
public class DogCareController {
	
	@Autowired
    private DogCareService dogCareService;
	
	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
		
		dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
	}
	
//	@GetMapping("/centerlist")
//	public List<DogCare> doglist(/*@RequestParam string city*/) {
//		
//		String city = "Syracuse";
//		return dogCareService.findBycity(city);
//		
//	}
	
	@GetMapping("/centerlist")
	public ModelAndView processDogSearchRequest(
				@Valid @ModelAttribute("searchCity") SearchCity form, 
				BindingResult theBindingResult, 
				Model theModel) {
		
		 
		String city = form.getCity();
		
//		// form validation
//		 if (theBindingResult.hasErrors()){
//			 System.out.println("it has error");
//			 return new ModelAndView("final_home_page");
//	     }

		// check the database if user already exists
//        List<DogData> exist_code = dogDataService.findBycity(city);
		List<DogCare> dogdata = new ArrayList<>();
		dogdata = dogCareService.findBycity(city);
		
		if(dogdata.size() != 0) {
			theModel.addAttribute("table_exist", true);
        	theModel.addAttribute("DogListModel", dogdata);
//        	return new ModelAndView("welcome");
        }
               
        if(dogdata.size() == 0) {
        	theModel.addAttribute("table_not_exist", true);
        }
        
        
                
        return new ModelAndView("daycare_search");	
	}
	
	@GetMapping("/showMDayCareSearch")
	public ModelAndView showForm(Model model) {
		
		model.addAttribute("searchCity", new SearchCity());
		ModelAndView modelAndView = new ModelAndView("daycare_search");
		
		return modelAndView;
	}
	
	
}
