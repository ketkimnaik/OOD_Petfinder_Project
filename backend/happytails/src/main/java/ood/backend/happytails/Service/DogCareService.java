package ood.backend.happytails.Service;

import java.util.List;

import ood.backend.happytails.POJO.DogCare;

public interface DogCareService {

	public List<DogCare> findBycity(String city);
}
