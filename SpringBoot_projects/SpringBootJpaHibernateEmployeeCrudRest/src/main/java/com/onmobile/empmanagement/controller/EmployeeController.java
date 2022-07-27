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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.onmobile.empmanagement.model.Employee;
import com.onmobile.empmanagement.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	@Autowired
	EmployeeService service;

	@PostMapping("/addEmployee")				// http://localhost:7687/employee/addEmployee
	public String createEmplyee(@Valid @RequestBody Employee emp) {

		return service.EmployeeCreation(emp);

	}
	
	@PutMapping("/updateEmployee")				//http://localhost:7687/employee/updateEmployee
	public String updateEmplyee(@Valid @RequestBody Employee emp) {
		return service.UpdateEmployee(emp);
}
	
	@DeleteMapping("/deleteEmployee/{id}")		//http://localhost:7687/employee/deleteEmployee/id
	public String deleteEmplyee(@PathVariable ("id") int empId) {
		return service.deleteById(empId);
	}
	
	@GetMapping("/getEmployee/{id}")			//http://localhost:7687/employee/getEmployee/id
	public Employee getEmplyee(@PathVariable ("id") int empId) {
		return service.getEmployeeById(empId);
	}
	
	@GetMapping("/getAll")						//http://localhost:7687/employee/getAll
	public List<Employee> getAllEmployees(){
	return service.getAllEmployee();
	}
	
	/*
	 * @GetMapping ("/byrange") public List<Employee>
	 * getBySalaryRange(@RequestParam(name="minsal") int
	 * minsal, @RequestParam(name="maxsal") int maxsal){
	 * 
	 * System.out.println("EEEEEE"); return
	 * service.getEmployeeInBetweenSalary(minsal, maxsal); }
	 * 
	 * @GetMapping("/byorgname") public List<Employee> getbyorgname(@RequestParam
	 * String org){ return service.getEmployeeByOrgName(org); }
	 */
	
	
}
