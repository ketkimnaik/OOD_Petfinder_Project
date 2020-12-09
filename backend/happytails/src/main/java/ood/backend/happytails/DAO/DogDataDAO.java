package ood.backend.happytails.DAO;

import java.util.Collection;
import java.util.List;

import ood.backend.happytails.POJO.DogData;

public interface DogDataDAO {
	
	public List<DogData> findBycity(String city);
	
}
