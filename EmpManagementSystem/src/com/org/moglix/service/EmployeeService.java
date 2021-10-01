package com.org.moglix.service;

import java.util.List;

import com.org.moglix.domain.Employee;

public interface EmployeeService {
public String saveOrUpdate(Employee employee);
public Employee getById(String empId);
//public String updateEmployeeById(Employee employe,String empId);
public List<Employee> getEmployeeList();
public String deleteEmployeeById(String empId);
}
