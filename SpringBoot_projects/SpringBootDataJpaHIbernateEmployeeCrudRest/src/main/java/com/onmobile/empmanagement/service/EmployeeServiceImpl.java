package com.onmobile.empmanagement.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onmobile.empmanagement.dao.EmployeeDao;
import com.onmobile.empmanagement.model.Employee;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	EmployeeDao dao;

	@Override
	public String deleteById(int id) {
		dao.deleteById(id);
		return "Employee Deleted Successfully";
	}

	@Override
	public List<Employee> getAllEmployee() {

		return dao.findAll();//select e from Employee e
	}

	@Override
	public Employee getEmployeeById(int id) {
		Optional<Employee> optional = dao.findById(id);
		return optional.get();
	}

	@Override
	public String employeeCreation(Employee emp) {
		dao.save(emp);
		return "Employee Inserted Successfully";
	}

	@Override
	public String updateEmployee(Employee emp) {
		dao.save(emp);
		return "employee updated successfully";
	}

	@Override
	public List<Employee> getAllEmployeeInBetween(long minSal, long maxSal) {

		return dao.findBySalaryBetween(minSal,maxSal);
	}

	@Override
	public List<Employee> getAllEmployeeByOrg(String orgName) {

		return dao.findByCompany(orgName);//DSL Grammer 
	}

}
