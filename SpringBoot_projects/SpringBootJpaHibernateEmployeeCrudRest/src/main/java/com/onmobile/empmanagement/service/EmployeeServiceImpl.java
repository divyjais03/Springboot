package com.onmobile.empmanagement.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onmobile.empmanagement.dao.EmployeeDao;
import com.onmobile.empmanagement.exceptions.EmployeeNotFoundException;
import com.onmobile.empmanagement.model.Employee;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeDao dao;

	@Override
	public String deleteById(int id) {

		return dao.deleteById(id);
	}

	@Override
	public List<Employee> getAllEmployee() {

		return dao.getAllEmployee();
	}

	@Override
	public Employee getEmployeeById(int id) {

		return dao.getEmployeeById(id);
	}

	@Override
	public String EmployeeCreation(Employee emp) {

		return dao.EmployeeCreation(emp);
	}

	@Override
	public String UpdateEmployee(Employee emp) {

		return dao.UpdateEmployee(emp);
	}

	/*
	 * @Override public List<Employee> getEmployeeInBetweenSalary(int minsal, int
	 * maxsal) {
	 * 
	 * List<Employee> all= this.getAllEmployee();
	 * 
	 * List<Employee> res= all.stream() .filter(s-> (s.getSalary()>=minsal &&
	 * s.getSalary()<=maxsal) ) .toList();
	 * 
	 * if(res.isEmpty()) throw new
	 * EmployeeNotFoundException("No Employee found in the salary range");
	 * 
	 * return res;
	 * 
	 * }
	 * 
	 * @Override public List<Employee> getEmployeeByOrgName(String org) {
	 * 
	 * List<Employee> all= this.getAllEmployee();
	 * 
	 * List<Employee> res= all.stream() .filter(e->
	 * e.getCompany().equalsIgnoreCase(org)) .toList();
	 * 
	 * 
	 * if(res.isEmpty()) throw new
	 * EmployeeNotFoundException("No Employee found in this Organization");
	 * 
	 * return res;
	 * 
	 * 
	 * 
	 * }
	 */

}
