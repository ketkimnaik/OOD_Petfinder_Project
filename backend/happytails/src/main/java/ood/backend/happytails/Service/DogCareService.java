package ood.backend.happytails.Service;

import java.util.List;

import ood.backend.happytails.POJO.DogCare;

public interface DogCareService {

//	Get the list of dog daycare centers from the databse
	public List<DogCare> findBycity(String city);
}
