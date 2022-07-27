package com.onmobile.empmanagement.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.onmobile.empmanagement.model.Employee;

public interface EmployeeDao extends JpaRepository<Employee, Integer> {

	List<Employee> findByCompany(String orgName);

	List<Employee> findBySalaryBetween(long minSal, long maxSal);
	
//	@Query("select e from Employee e where e.company=?1")
//	List<Employee> getByCompany123(String orgName);
	
//	
}
