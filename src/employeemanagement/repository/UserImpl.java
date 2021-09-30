package employeemanagement.repository;

import java.util.ArrayList;
import java.util.List;

import employeemanagement.dto.User;

public class UserImpl implements UserRepository {
	private static UserRepository  userRepository;

	private UserImpl() {
		// TODO Auto-generated constructor stub
	}
	public static UserRepository getInstance() {
		if(userRepository==null) {
			userRepository=new UserImpl();
			return userRepository;
		}
		return userRepository;
				
	}			
	
	@Override
	public String addUser(User u) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getUserById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateUserById(String id, User u) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteUserById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAllUsers() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<User> getUser() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
