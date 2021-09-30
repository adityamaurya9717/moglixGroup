package employeemanagement.service;

import java.util.List;

import employeemanagement.dto.User;
import employeemanagement.repository.UserDAO;
import employeemanagement.repository.UserImpl;
import employeemanagement.repository.UserRepository;

public class UserService implements UserRepository {
	UserRepository userRepository=UserImpl.getInstance();

	@Override
	public String addUser(User u) {
		// TODO Auto-generated method stub
		return userRepository.addUser(u);
	}

	@Override
	public User getUserById(String id) {
		// TODO Auto-generated method stub
		return userRepository.getUserById(id);
	}

	@Override
	public String updateUserById(String id, User u) {
		// TODO Auto-generated method stub
		return userRepository.updateUserById(id, u);
	}

	@Override
	public String deleteUserById(String id) {
		// TODO Auto-generated method stub
		return userRepository.deleteUserById(id);
	}

	@Override
	public void deleteAllUsers() {
		// TODO Auto-generated method stub
		userRepository.deleteAllUsers();
		
	}

	@Override
	public List<User> getUser() {
		// TODO Auto-generated method stub
		return userRepository.getUser();
	}
	

}
