package employeemanagement.repository;

import employeemanagement.dto.Employee;

public interface EmployeeRepository {
	public String addEmployees(Employee emp);
	public String updateEmployee(Employee emp,String id);
	public Employee getEmployee(String id);
	public Employee[] getEmployees();
	public String deleteEmployeeById(String id);
	public void deleteAllEmployee();

}
