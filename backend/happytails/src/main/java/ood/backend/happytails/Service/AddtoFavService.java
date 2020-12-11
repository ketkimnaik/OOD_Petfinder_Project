package ood.backend.happytails.Service;

import java.util.List;

import ood.backend.happytails.POJO.AddtoFav;

public interface AddtoFavService {

//	Save the entry with userId and dogId to the add_to_fav database table
	public void addUserAndDog(int userId, int dogId);
	
//	Get the list of dogs for given userId
	public List<AddtoFav> getuserAndDogList(int id);
	
//	Remove the entry of dog for given user
	public void removeUserAndDog(int userId, int dogId);
	
//	Add dog to the favorites list for the session user
	public AddtoFav getEntryDetails(int userId, int dogId);
}
