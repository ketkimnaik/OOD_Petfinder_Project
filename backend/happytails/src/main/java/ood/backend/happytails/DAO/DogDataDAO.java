package ood.backend.happytails.DAO;

import java.util.Collection;
import java.util.List;

import ood.backend.happytails.POJO.Dog_Data;

public interface DogDataDAO {
	
	public List<Dog_Data> findBycity(String city);
	
}
