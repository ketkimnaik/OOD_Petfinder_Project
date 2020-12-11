package ood.backend.happytails.DAO;

import java.util.List;

import ood.backend.happytails.POJO.AddtoFav;

public interface AddtoFavDAO {

	public void save(int userId, int dogId);
	public List<AddtoFav> getList(int id);
	public void removeUserAndDog(int userId, int dogId);
	public AddtoFav getEntryDetails(int userId, int dogId);
}
