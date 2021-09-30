package employeemanagement.repository;

import employeemanagement.dto.Employee;

public class EmployeeDAO {
	
	private static int counter=0;

	Employee employee[]=new Employee[10];
	
	
	
	
	public String addEmployees(Employee emp) {
		if(counter<employee.length) {
			employee[counter++]=emp;	
		    return "success";	
		  }
		else {return "Array is full";}
			
	}
	
	
	
	public Employee getEmployee(String id) {
		
		 for (Employee employee2 : employee) {
			 if(employee2!=null && employee2.getEmpId().equals(id)==true) {
				 return employee2;
			 }
			
		}
		 return null;
		
		
	}
	
	
	
	
	
	public Employee[] getEmployees() {
		return employee;
	}
	
	
	
	
	
	//update
	
	public String updateEmployee(Employee emp,String id) {
		for(int i=0;i<employee.length;i++) {
			if(employee[i]!=null && employee[i].getEmpId().equals(id)) {
				employee[i]=emp;
				return "Updated Succesfully";
			   }
			
		}
		
	   return "employee not exixsts";	
	}
	
	
	
	
	
	//delete by id
	public String deleteEmployeeById(String id) {
		
		for(int i=0;i<employee.length;i++) {
			if(employee[i]!=null && employee[i].getEmpId().equals(id)) {
				
				employee[i]=null;
				shiftArray(i,employee.length);
				counter--;
				return "deleted Successfulle";
				
				
			}
			
		}
		
		
		return "Deleteion Failed ! employee does not exists";
	}
	
	
	
	
	
	//delete all employee
	public String deleteAllEmployee() {
		employee=new Employee[10];
		return "deleted All employee";
		
	}

	
	public void shiftArray(int s,int e) {
		for(int i=s;i<e-1;i++) {
			employee[i]=employee[i+1];
		}
		employee[e-1]=null;
		
	}

}
