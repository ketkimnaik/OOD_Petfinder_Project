package ood.backend.happytails.DAO;

import java.util.List;

import ood.backend.happytails.POJO.DogCare;

public interface DogCareDAO {
	public List<DogCare> findBycity(String city);
}
