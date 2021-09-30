package employeemanagement.repository;

import java.util.List;

import employeemanagement.dto.Roles;

public interface RolesRepository {
	public String addRole(Roles r);
	public int serachRoleById(int id);
	public Roles getRole(int roleid);
	public List<Roles> getRoles();
	public String deleteRoleById(int id);
	public void deleteAllRoles();

}
