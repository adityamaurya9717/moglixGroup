package com.org.moglix.service.impl;

import java.util.List;

import com.org.moglix.dao.RoleDao;
import com.org.moglix.dao.impl.RoleDaoImpl;
import com.org.moglix.domain.Role;
import com.org.moglix.service.RoleService;

public class RoleServiceImpl implements RoleService {
	RoleDao roleDao = RoleDaoImpl.getInstance();
	private static RoleService roleService;

	private RoleServiceImpl() {
	}

	public static RoleService getInstance() {
		if (roleService == null) {
			roleService = new RoleServiceImpl();
			return roleService;
		} else
			return roleService;
	}

	@Override
	public String saveOrUpdate(Role Role) {
		return roleDao.saveOrUpdate(Role);
	}

	@Override
	public Role getById(Long roleId) {
		return roleDao.getById(roleId);
	}

	@Override
	public List<Role> getList() {
		return roleDao.getList();
	}

	@Override
	public String deleteById(Long roleId) {
		return roleDao.deleteById(roleId);
	}

}
