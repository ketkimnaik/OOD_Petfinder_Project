package ood.backend.happytails.DAO;

import java.util.List;

import ood.backend.happytails.POJO.AddtoFav;

public interface AddtoFavDAO {

//	Save the entry with userId and dogId to the add_to_fav database table
	public void save(int userId, int dogId);
	
//	Get the list of dogs for given userId
	public List<AddtoFav> getList(int id);
	
//	Remove the entry of dog for given user
	public void removeUserAndDog(int userId, int dogId);
	
//	Add dog to the favorites list for the session user
	public AddtoFav getEntryDetails(int userId, int dogId);
}
