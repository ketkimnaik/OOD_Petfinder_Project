package ood.backend.happytails.Service;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ood.backend.happytails.DAO.DogDataDAO;
import ood.backend.happytails.POJO.DogData;

@Service
public class DogDataServiceImp implements DogDataService {
	
	@Autowired
	private DogDataDAO dogDataDAO;
	
	@Override
	@Transactional
	public List<DogData> findBycity(String city) {
		// TODO Auto-generated method stub
		return dogDataDAO.findBycity(city);
	}

}
