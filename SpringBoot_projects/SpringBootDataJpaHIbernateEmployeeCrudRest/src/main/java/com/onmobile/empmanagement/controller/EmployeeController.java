package com.onmobile.empmanagement.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onmobile.empmanagement.model.Employee;
import com.onmobile.empmanagement.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	@Autowired
	EmployeeService service;

	@PostMapping("/addEmployee") // http://localhost:7687/employee/addEmployee
	public String createEmployee(@Valid @RequestBody Employee emp) {
		return service.employeeCreation(emp);
	}

	@PutMapping("/updateEmployee") // http://localhost:7687/employee/updateEmployee
	public String updateEmployee(@RequestBody Employee emp) {
		return service.updateEmployee(emp);
	}

	@DeleteMapping("/deleteEmployee/{id}") // http://localhost:7687/employee/deleteEmployee/123
	public String deleteEmployee(@PathVariable("id") int empId) {
		return service.deleteById(empId);
	}

	@GetMapping("/getEmployee/{id}") // http://localhost:7687/employee/getEmployee/123
	public Employee getEmployee(@PathVariable("id") int empId) {
		return service.getEmployeeById(empId);
	}

	@GetMapping("/getAll") // http://localhost:7687/employee/getAll
	public List<Employee> getAllEmployees() {
		return service.getAllEmployee();
	}
	@GetMapping("/getAllInBetween/{minSal}/{maxSal}") // http://localhost:7687/employee/getAllInBetween/10000/20000
	public List<Employee> getAllEmployees(@PathVariable("minSal")long minSal,@PathVariable("maxSal")long maxSal) {
		return service.getAllEmployeeInBetween(minSal,maxSal);
	}
	@GetMapping("/getAllByOrgName/{orgName}") // http://localhost:7687/employee/getAllByOrgName/onmobile
	public List<Employee> getAllEmployees(@PathVariable("orgName")String orgName) {
		return service.getAllEmployeeByOrg(orgName);
	}
}
