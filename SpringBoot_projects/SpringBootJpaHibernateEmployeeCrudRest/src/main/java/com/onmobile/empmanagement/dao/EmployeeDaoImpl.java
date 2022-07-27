package com.onmobile.empmanagement.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.onmobile.empmanagement.exceptions.EmployeeNotFoundException;
import com.onmobile.empmanagement.model.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	@PersistenceContext
	EntityManager entityManager;

	@Override
	public String deleteById(int id) {

		Employee emp = entityManager.find(Employee.class, id);
		if (emp != null) {
			entityManager.remove(emp);
			return "Employee Removed Successfully";
		} else {
			throw new EmployeeNotFoundException("Employee id is not valid");
		}
	}
	
	@Override
	public List<Employee> getAllEmployee() {

		List<Employee> emps = entityManager.createQuery("select e from Employee e").getResultList();
		if (emps.isEmpty()) {
			throw new EmployeeNotFoundException("no employees to display");
		} else {
			return emps;
		}
	}

	@Override
	public Employee getEmployeeById(int id) {

		Employee emp = entityManager.find(Employee.class, id);
		if (emp != null) {

			return emp;
		} else {
			throw new EmployeeNotFoundException("Employee id is not valid");
		}

	}

	@Override
	public String EmployeeCreation(Employee emp) {
		entityManager.persist(emp);
		return "Employee created successfully";
	}

	@Override
	public String UpdateEmployee(Employee emp) {
		entityManager.merge(emp);
		return "Employee updated successfully";
	}

}
