package ood.backend.happytails.Controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttribute;

import ood.backend.happytails.POJO.User;

@RestController
@RequestMapping("/fav")
public class FavouritesController {

	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
		
		dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
	}
	
	/*
    * Get user from session attribute
    */
   @GetMapping("/info")
   public String userInfo(@SessionAttribute("user") User user) {

      //find user by email get all details including id
	   
	   //pass id get fav list
	   
//	  System.out.println(session.user.firstName);
      return "favourites";
   }
   
	
   @GetMapping("/trial")
   public String userInfoo() {

      //find user by email get all details including id
	   
	   //pass id get fav list
	   
	   
      return "favourites";
   }
}
