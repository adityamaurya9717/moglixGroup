package employeemanagement.repository;

import java.util.ArrayList;
import java.util.List;

import employeemanagement.dto.Roles;

public class RolesDAO {
	
	ArrayList<Roles> roles=new ArrayList<Roles>();
	
	public String addRole(Roles r) {
		
		roles.add(r);
	    return "role added";
	}
	
	public int serachRoleById(int id) {
		for(int i=0;i<roles.size();i++) {
			if(roles.get(i).getRoleId()==id) {
				return i;
			}
			
		}
		return -1;
		
	}
	
	public Roles getRole(int roleid) {
		int i=serachRoleById(roleid);
		if(i!=-1) {
			return roles.get(i);
		}
		return null;	
		
	}
	
	public List<Roles> getRoles(){
		
		return roles;
	}
	
	public String deleteRoleById(int id) {
		int i=serachRoleById(id);
		if(i!=-1) {
			roles.remove(i);
			return "Deleted Successfully";
		}
		return "Id not present";
		
	}
	
	public void deleteAllRoles() {
		roles.clear();
		
	}
	

}
