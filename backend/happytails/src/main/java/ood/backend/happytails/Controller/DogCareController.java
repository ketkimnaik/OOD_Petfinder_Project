package ood.backend.happytails.Controller;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ood.backend.happytails.POJO.DogCare;
import ood.backend.happytails.POJO.DogData;
import ood.backend.happytails.Service.DogCareService;
import ood.backend.happytails.Service.DogDataService;

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
	
	@GetMapping("/centerlist")
	public List<DogCare> doglist(/*@RequestParam string city*/) {
		
		String city = "Syracuse";
		return dogCareService.findBycity(city);
		
	}
	
	
	
}
