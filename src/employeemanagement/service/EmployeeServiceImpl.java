package employeemanagement.service;

import employeemanagement.dto.Employee;
import employeemanagement.repository.EmployeeRepository;
import employeemanagement.repository.EmployeeRepositoryImpl;

public class EmployeeServiceImpl implements EmployeeServiceI {
    EmployeeRepository employeeRepository=EmployeeRepositoryImpl.getInstance();
    
	
	private EmployeeServiceImpl() {

		// TODO Auto-generated constructor stub
	}

	@Override
	public String addEmployees(Employee emp) {
		// TODO Auto-generated method stub
		return employeeRepository.addEmployees(emp);
	}

	@Override
	public String updateEmployee(Employee emp, String id) {
		// TODO Auto-generated method stub
		return employeeRepository.updateEmployee(emp, id);
	}

	@Override
	public Employee getEmployee(String id) {
		// TODO Auto-generated method stub
		return employeeRepository.getEmployee(id);
	}

	@Override
	public Employee[] getEmployees() {
		// TODO Auto-generated method stub
		return employeeRepository.getEmployees();
	}

	@Override
	public String deleteEmployeeById(String id) {
		// TODO Auto-generated method stub
		return employeeRepository.deleteEmployeeById(id);
	}

	@Override
	public void deleteAllEmployee() {
		// TODO Auto-generated method stub
       employeeRepository.deleteAllEmployee();
	}

}
