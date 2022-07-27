package com.onmobile.stumanagement.dao;

import java.util.List;

import com.onmobile.stumanagement.model.Student;

public interface StudentDao {

	String deleteById(int id);

	List<Student> getAllStudent();

	Student getStudentById(int id);

	String StudentCreation(Student stu);

	String UpdateStudent(Student stu);
	
}
