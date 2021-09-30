package employeemanagement.service;

import java.util.List;

import employeemanagement.dto.Roles;
import employeemanagement.repository.RolesDAO;
import employeemanagement.repository.RolesImpl;
import employeemanagement.repository.RolesRepository;

public class RolesService implements RolesRepository{
     RolesRepository rolesRepository=RolesImpl.getInstance();
	@Override
	public String addRole(Roles r) {
		// TODO Auto-generated method stub
		return rolesRepository.addRole(r);
	}

	@Override
	public int serachRoleById(int id) {
		// TODO Auto-generated method stub
		return rolesRepository.serachRoleById(id);
	}

	@Override
	public Roles getRole(int roleid) {
		// TODO Auto-generated method stub
		return rolesRepository.getRole(roleid);
	}

	@Override
	public List<Roles> getRoles() {
		// TODO Auto-generated method stub
		return rolesRepository.getRoles();
	}

	@Override
	public String deleteRoleById(int id) {
		// TODO Auto-generated method stub
		return rolesRepository.deleteRoleById(id);
	}

	@Override
	public void deleteAllRoles() {
		// TODO Auto-generated method stub
		rolesRepository.deleteAllRoles();
		
	}
   
   
	
	
}
