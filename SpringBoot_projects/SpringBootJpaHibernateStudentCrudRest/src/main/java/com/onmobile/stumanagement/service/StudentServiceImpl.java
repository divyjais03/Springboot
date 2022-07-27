package com.onmobile.stumanagement.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onmobile.stumanagement.dao.StudentDao;
import com.onmobile.stumanagement.model.Student;

@Service
@Transactional
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentDao dao;
	
	@Override
	public String deleteById(int id) {
		
		return dao.deleteById(id);
	}

	@Override
	public List<Student> getAllStudent() {
		
		return dao.getAllStudent();
	}

	@Override
	public Student getStudentById(int id) {
		
		return dao.getStudentById(id);
	}

	@Override
	public String StudentCreation(Student stu) {
		
		return dao.StudentCreation(stu);
	}

	@Override
	public String UpdateStudent(Student stu) {
		
		return dao.UpdateStudent(stu);
	}

}
