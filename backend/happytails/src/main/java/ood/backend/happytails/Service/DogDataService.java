package ood.backend.happytails.Service;

import java.util.Collection;
import java.util.List;

import ood.backend.happytails.POJO.Dog_Data;

public interface DogDataService {
	
	public List<Dog_Data> findBycity(String city);
}
