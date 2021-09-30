package employeemanagement.service;

import employeemanagement.dto.User;
import employeemanagement.repository.UserDAO;

public class UserService {
	UserDAO userDAO=new UserDAO();
	public String addUser(User user) {
		
		return userDAO.addUser(user);
	}

}
