package com.org.moglix.service.impl;

import java.util.List;

import com.org.moglix.dao.UserDao;
import com.org.moglix.dao.impl.UserDaoImpl;
import com.org.moglix.domain.User;
import com.org.moglix.service.UserService;

public class UserServiceImpl implements UserService {
	UserDao userDao = UserDaoImpl.getInstance();
	private static UserService userService;

	private UserServiceImpl() {
	}

	public static UserService getInstance() {
		if (userService == null) {
			userService = new UserServiceImpl();
			return userService;
		} else
			return userService;
	}

	@Override
	public String saveOrUpdate(User user) {
		return userDao.saveOrUpdate(user);
	}

	@Override
	public User getById(Long userId) {
		return userDao.getById(userId);
	}

	@Override
	public List<User> getList() {
		return userDao.getList();
	}

	@Override
	public String deleteById(Long userId) {
		return userDao.deleteById(userId);
	}

}
