package ood.backend.happytails.Controller;

import java.security.Principal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import ood.backend.happytails.POJO.AddtoFav;
import ood.backend.happytails.POJO.DogData;
import ood.backend.happytails.POJO.User;
import ood.backend.happytails.Service.AddtoFavService;
import ood.backend.happytails.Service.DogDataService;
import ood.backend.happytails.Service.UserService;
import ood.backend.happytails.form.SearchCity;

@RestController
@RequestMapping("/fav")
public class FavouritesController {

	@Autowired
	public DogDataService dogDataService;
	
	@Autowired
	public UserService userService;
	
	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
		
		dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
	}
   
   @Autowired
   public AddtoFavService addtoFavService;
   
//   Add dog to the favorites list
   @RequestMapping(value = "/addToFavourites/{id}", method = RequestMethod.GET)
   @ResponseBody
   public ModelAndView addToFavList(HttpServletRequest request, @PathVariable(name = "id") int id) {
       Principal principal = request.getUserPrincipal();
       
       
       String email = principal.getName();
	   System.out.println(email);
	   User u = userService.findByemail(email);
	   DogData dd = dogDataService.getDogDetail(id);
      
	   AddtoFav f = addtoFavService.getEntryDetails(u.getId(), dd.getId());

//	   If dog does not exist in favorites list then add and display success page
	   if(f == null) {
		   addtoFavService.addUserAndDog(u.getId(), id);
		   return new ModelAndView("Success_Page");
	   }
        
// If dog already exist in favorites list then display already exist page       
        return new ModelAndView("Exist_Page");
      
   }
 
   
//   Remove dog from favorites list
   @RequestMapping(value = "/removeFromFavourites/{id}", method = RequestMethod.GET)
   @ResponseBody
   public ModelAndView currentUserNameSimple(HttpServletRequest request, @PathVariable(name = "id") int id) {
       Principal principal = request.getUserPrincipal();
       
       String email = principal.getName();
       User u = userService.findByemail(email);
       
//		Remove dog with the user entered userId and dogId from the favorites list and display Page for successful removal
       addtoFavService.removeUserAndDog(u.getId(), id);	
       
       return new ModelAndView("remove_page");
      
   }
   
//  Display favorites list
   @GetMapping("/favlist")
	public ModelAndView processFavouritesRequest(HttpServletRequest request, Model theModel) {
		 
	   Principal principal = request.getUserPrincipal();
	   
	   String email = principal.getName();
	   System.out.println(email);
	   User u = userService.findByemail(email);
	   
	   List<AddtoFav> l = new ArrayList<>();
	   l = addtoFavService.getuserAndDogList(u.getId());
	   
	   List<DogData> dd = new ArrayList<> ();
	   
	   for(AddtoFav i : l) {
		   dd.add(dogDataService.getDogDetail(i.getDogId()));
	   }
	   
		System.out.println(dd.size());	
		ModelAndView mv = new ModelAndView();
		if(dd != null) {
       	theModel.addAttribute("DogListModel", dd);
       	mv = new ModelAndView("favourite_page");
		}
              
       if(dd == null) {
       	mv = new ModelAndView("final_home_page");
       }
       
               
       return mv;	
	}
   
}
