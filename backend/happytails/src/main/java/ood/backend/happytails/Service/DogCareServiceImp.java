package ood.backend.happytails.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ood.backend.happytails.DAO.DogCareDAO;
import ood.backend.happytails.DAO.DogDataDAO;
import ood.backend.happytails.POJO.DogCare;

@Service
public class DogCareServiceImp implements DogCareService {

	@Autowired
	private DogCareDAO dogCareDAO;
	
	@Override
	public List<DogCare> findBycity(String city) {
		
		return dogCareDAO.findBycity(city);
	}

}
