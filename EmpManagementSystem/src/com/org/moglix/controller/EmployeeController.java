package com.org.moglix.controller;

import java.util.List;

import com.org.moglix.domain.Employee;
import com.org.moglix.service.EmployeeService;
import com.org.moglix.service.impl.EmployeeServiceImpl;

public class EmployeeController {
	EmployeeService empService = EmployeeServiceImpl.getInstance();

	public String addEmployee(Employee employee) {
		return this.empService.saveOrUpdate(employee);
	}

	public Employee getById(String empId) {
		return this.empService.getById(empId);
	}

	public List<Employee> getList() {
		return this.empService.getEmployeeList();
	}

	public String deleteEmployeeById(String empId) {
		return this.empService.deleteEmployeeById(empId);
	}
}
