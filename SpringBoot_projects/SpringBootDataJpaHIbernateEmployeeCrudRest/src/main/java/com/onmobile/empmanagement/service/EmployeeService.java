package com.onmobile.empmanagement.service;

import java.util.List;

import com.onmobile.empmanagement.model.Employee;

public interface EmployeeService {
	String deleteById(int id);

	List<Employee> getAllEmployee();

	Employee getEmployeeById(int id);

	String employeeCreation(Employee emp);

	String updateEmployee(Employee emp);

	List<Employee> getAllEmployeeInBetween(long minSal, long maxSal);

	List<Employee> getAllEmployeeByOrg(String orgName);
}
