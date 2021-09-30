package employeemanagement.repository;

import java.util.ArrayList;

import employeemanagement.dto.Roles;
import employeemanagement.dto.User;

public class UserDAO {
	
ArrayList<User> users=new ArrayList<User>();
	
	public String addUser(User u) {
		users.add(u);
	   return "user added";
	}
	
	private int serachUserById(String id) {
		for(int i=0;i<users.size();i++) {
			if(users.get(i).getUserId().equals(id)==true) {
				return i;
			}
			
		 }
		return -1;
	}
	
	public User getUserById(String id) {
		int i=serachUserById(id);
		if(i!=-1) return users.get(i);
		return null;
	}
	
	public String updateUserById(String id,User u) {
		int i=serachUserById(id);
		if(i!=-1) {
			users.set(i,u);
			return "updated successfully";
		  }
		return "User Does not Exixst";
	}
	
	public String deleteUserById(String id) {
		int i=serachUserById(id);
		if(i!=-1) {
			users.remove(i);
			return "Deleted Successfully";
		}
		return "User not Exits";
		
	}
	
	public void deleteAllUsers() {
		users.clear();
	}
	
	
	
	
}
		
		

