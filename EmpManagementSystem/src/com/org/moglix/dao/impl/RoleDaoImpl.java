package com.org.moglix.dao.impl;

import java.util.ArrayList;
import java.util.List;

import com.org.moglix.dao.RoleDao;
import com.org.moglix.domain.Role;

public class RoleDaoImpl implements RoleDao {
	// private static int counter = 0;
	// Role roles[] = new Role[10];
	private static RoleDao roleDao;

	private RoleDaoImpl() {
	}

	public static RoleDao getInstance() {
		if (roleDao == null) {
			roleDao = new RoleDaoImpl();
			return roleDao;
		} else
			return roleDao;
	}

	private List<Role> roles = new ArrayList<>();

	@Override
	public String saveOrUpdate(Role role) {
		if (this.getById(role.getRoleId()) != null) {
			for (Role it : roles) {
				if (it != null && it.getRoleId() == role.getRoleId()) {
					it.setRoleName(role.getRoleName());
					return "updated Successfully by roleId " + role.getRoleId() + "";
				}
			}
		} else {
//			if (counter < roles.length) {
//				roles[counter] = role;
//			}
			this.roles.add(role);
		}
		return "Inserted Successfully ";
	}

	@Override
	public Role getById(Long roleId) {
		for (Role role : roles) {
			if (role != null && role.getRoleId() == roleId) {
				return role;
			}

		}
		return null;
	}

	@Override
	public List<Role> getList() {
		return roles;
	}

	@Override
	public String deleteById(Long roleId) {
		Role role = this.getById(roleId);
		if (role != null) {
			this.roles.remove(role);
			return " Entity Deleted Successfully by roleId " + roleId + "";

		} else
//		this.counter=0;
//		for (Role role : roles) {
//			if (role != null && role.getRoleId() == roleId) {
//				roles[counter] = null;
//				return "Deleted Successfully by roleId " + roleId + "";
//			}else {
//				counter++;
//			}
//		}
			return "Deletion failes please try again";
	}

}
