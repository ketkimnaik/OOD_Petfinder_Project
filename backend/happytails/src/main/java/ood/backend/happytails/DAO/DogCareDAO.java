package ood.backend.happytails.DAO;

import java.util.List;

import ood.backend.happytails.POJO.DogCare;

public interface DogCareDAO {
	
//	Get the list of dog daycare centers from the databse
	public List<DogCare> findBycity(String city);
	
}
