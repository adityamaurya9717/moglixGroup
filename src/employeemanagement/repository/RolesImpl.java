package employeemanagement.repository;

import java.util.ArrayList;
import java.util.List;

import employeemanagement.dto.Roles;

public class RolesImpl implements RolesRepository {
    private static RolesRepository rolesRepository;
    private RolesImpl() {
		// TODO Auto-generated constructor stub
	}
    
    public static RolesRepository getInstance() {
       if(rolesRepository==null) {
    	   rolesRepository=new RolesImpl();
    	   return rolesRepository;
    	   
       }
    	return rolesRepository;
    	
	}
	
	
	
	@Override
	public String addRole(Roles r) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int serachRoleById(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Roles getRole(int roleid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Roles> getRoles() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteRoleById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAllRoles() {
		// TODO Auto-generated method stub
		
	}

	
}
