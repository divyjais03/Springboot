package com.onmobile.empmanagement.dao;

import java.util.List;

import com.onmobile.empmanagement.model.Employee;

public interface EmployeeDao {

	String deleteById(int id);

	List<Employee> getAllEmployee();

	Employee getEmployeeById(int id);

	String EmployeeCreation(Employee emp);

	String UpdateEmployee(Employee emp);
	
}
