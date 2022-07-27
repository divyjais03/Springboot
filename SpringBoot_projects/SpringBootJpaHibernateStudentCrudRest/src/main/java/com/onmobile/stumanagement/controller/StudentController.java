package com.onmobile.stumanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.onmobile.stumanagement.model.Student;
import com.onmobile.stumanagement.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	StudentService service;
	
	@PostMapping("/addStudent")				// http://localhost:7687/student/addStudent
	public String createEmplyee(@RequestBody Student stu) {

		return service.StudentCreation(stu);

	}
	
	@PutMapping("/updateStudent")				//http://localhost:7687/student/updateStudent
	public String updateEmplyee(@RequestBody Student stu) {
		return service.UpdateStudent(stu);
}
	
	@DeleteMapping("/deleteStudent/{id}")		//http://localhost:7687/student/deleteStudent/id
	public String deleteStudent(@PathVariable ("id") int stuId) {
		return service.deleteById(stuId);
	}
	
	@GetMapping("/getStudent/{id}")			//http://localhost:7687/student/getStudent/id
	public Student getStudent(@PathVariable ("id") int StuId) {
		return service.getStudentById(StuId);
	}
	
	@GetMapping("/getAll")						//http://localhost:7687/student/getAll
	public List<Student> getAllStudent(){
	return service.getAllStudent();
	}
	
}
