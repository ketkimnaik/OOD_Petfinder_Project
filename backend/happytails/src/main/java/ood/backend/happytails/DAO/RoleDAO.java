package ood.backend.happytails.DAO;

import ood.backend.happytails.POJO.Role;

public interface RoleDAO {
	
//	find by entered role name
	public Role findRoleByName(String role);
	
}
