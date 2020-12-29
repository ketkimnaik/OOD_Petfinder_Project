package ood.backend.happytails.Service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ood.backend.happytails.DAO.AddtoFavDAO;
import ood.backend.happytails.POJO.AddtoFav;

@Service
public class AddtoFavServiceImp implements AddtoFavService {

	@Autowired
	public AddtoFavDAO addtoFavDAO;
	
	@Override
	@Transactional
	public void addUserAndDog(int userId, int dogId) {
		addtoFavDAO.save(userId, dogId);
	}
	
	@Override
	@Transactional
	public List<AddtoFav> getuserAndDogList(int id) {
		return addtoFavDAO.getList(id);
	}
	
	@Override
	@Transactional
	public void removeUserAndDog(int userId, int dogId) {
		addtoFavDAO.removeUserAndDog(userId, dogId);
	}
	
	@Override
	@Transactional
	public AddtoFav getEntryDetails(int userId, int dogId) {
		return addtoFavDAO.getEntryDetails(userId, dogId);
	}

}
