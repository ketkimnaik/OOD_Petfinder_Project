package ood.backend.happytails.DAO;

import java.util.Collection;
import java.util.List;

import ood.backend.happytails.POJO.DogData;

public interface DogDataDAO {

//	Get the list of dogs from database for entered city
	public List<DogData> findBycity(String city);

//	Get details of the dog for entered dogId
	public DogData getDogDetail(int id);
	
}
