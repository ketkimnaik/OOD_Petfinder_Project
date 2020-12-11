package ood.backend.happytails.Service;

import java.util.List;

import ood.backend.happytails.POJO.AddtoFav;

public interface AddtoFavService {

	public void addUserAndDog(int userId, int dogId);
	public List<AddtoFav> getuserAndDogList(int id);
	public void removeUserAndDog(int userId, int dogId);
	public AddtoFav getEntryDetails(int userId, int dogId);
}
