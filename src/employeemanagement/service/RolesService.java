package employeemanagement.service;

import employeemanagement.dto.Roles;
import employeemanagement.repository.RolesDAO;

public class RolesService {
   RolesDAO rolesDAO=new RolesDAO();
   public String addRoles(Roles roles) {
	   return rolesDAO.addRole(roles);
   }
	
	
}
