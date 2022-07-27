package com.onmobile.stumanagement.service;

import java.util.List;

import com.onmobile.stumanagement.model.Student;


public interface StudentService {

	String deleteById(int id);

	List<Student> getAllStudent();

	Student getStudentById(int id);

	String StudentCreation(Student stu);

	String UpdateStudent(Student stu);
	
}
