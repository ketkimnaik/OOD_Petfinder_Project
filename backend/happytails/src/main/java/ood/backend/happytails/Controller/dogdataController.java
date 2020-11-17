package ood.backend.happytails.Controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ood.backend.happytails.POJO.Dog_Data;
import ood.backend.happytails.Service.DogDataService;
import ood.backend.happytails.Service.UserService;

@RestController
@RequestMapping("/dog")
public class dogdataController {
	
	@Autowired
    private DogDataService dogDataService;
	
	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
		
		dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
	}
	
	@GetMapping("/doglist")
	public Collection<Dog_Data> doglist(/*@RequestParam int zipcode*/) {
		
		String city = "Syracuse";
		return dogDataService.findBycity(city);
		
	}
	
	
}
