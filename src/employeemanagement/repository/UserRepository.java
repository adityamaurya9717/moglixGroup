package employeemanagement.repository;

import java.util.List;

import employeemanagement.dto.User;

public interface UserRepository {
	
	public String addUser(User u) ;
	public User getUserById(String id) ;
	public String updateUserById(String id,User u);
	public String deleteUserById(String id);
	public void deleteAllUsers();
	public List<User> getUser();
}
