package ood.backend.happytails.Service;

import java.util.Collection;
import java.util.List;

import ood.backend.happytails.POJO.DogData;

public interface DogDataService {
	
	public List<DogData> findBycity(String city);
	public DogData getDogDetail(int id);
}
