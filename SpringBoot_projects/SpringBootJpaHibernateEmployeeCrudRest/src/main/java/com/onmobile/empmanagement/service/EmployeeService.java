package com.onmobile.empmanagement.service;

import java.util.List;

import com.onmobile.empmanagement.model.Employee;

public interface EmployeeService {
	String deleteById(int id);

	List<Employee> getAllEmployee();

	Employee getEmployeeById(int id);

	String EmployeeCreation(Employee emp);

	String UpdateEmployee(Employee emp);
	
	/*
	 * public List<Employee> getEmployeeInBetweenSalary(int minsal, int maxsal);
	 * 
	 * public List<Employee> getEmployeeByOrgName(String org);
	 */
}
