package employeemanagement.service;

import employeemanagement.dto.Employee;
import employeemanagement.repository.EmployeeDAO;

public class EmployeeService {
	
	EmployeeDAO employeeDAO=new EmployeeDAO();
	
	public String addEmployee(Employee emp) {
		return employeeDAO.addEmployees(emp);
	}
	public Employee getEmployeeById(String id) {
		return employeeDAO.getEmployee(id);
	}
    
	public Employee[] getEmployees() {
		return employeeDAO.getEmployees();
	}
	
	public String deleteEmployeeById(String id) {
		return employeeDAO.deleteEmployeeById(id);
	}
	public String deleteAllEmployee() {
		return employeeDAO.deleteAllEmployee();
	}
   
	public String updateEmployee(Employee e,String id) {
		return employeeDAO.updateEmployee(e,id);
	}

}
