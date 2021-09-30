package employeemanagement.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {
	
	String userId;
	String userName;
	String password;
	String emailId;
	int roleId;

}
