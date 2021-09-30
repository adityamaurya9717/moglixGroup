package employeemanagement.repository;

import employeemanagement.dto.Employee;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;



public class EmployeeRepositoryImpl implements EmployeeRepository {

	private static int counter=0;
	private static EmployeeRepository employeeRepository;

	Employee employee[]=new Employee[10];
	private EmployeeRepositoryImpl() {
		// TODO Auto-generated constructor stub
	}
	
	public static EmployeeRepository getInstance() {
		if(employeeRepository==null) {
			employeeRepository=new EmployeeRepositoryImpl();
			return employeeRepository;
		}
		else return employeeRepository;
		
	}
	
	@Override
	public String addEmployees(Employee emp) {
		if(counter<employee.length) {
			employee[counter++]=emp;	
		    return "success";	
		  }
		else {return "Array is full";}
		
	}

	@Override
	public String updateEmployee(Employee emp, String id) {
		
		return null;
	}

	@Override
	public Employee getEmployee(String id) {
		for (Employee employee2 : employee) {
			 if(employee2!=null && employee2.getEmpId().equals(id)==true) {
				 return employee2;
			 }
			
		}
		return null;
	}

	@Override
	public Employee[] getEmployees() {
		
		return employee;
	}

	@Override
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

	@Override
	public void deleteAllEmployee() {
		employee=new Employee[10];
		

	

	}
	
	public void shiftArray(int s,int e) {
		for(int i=s;i<e-1;i++) {
			employee[i]=employee[i+1];
		}
		employee[e-1]=null;
		
	}

}
