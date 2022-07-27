package com.onmobile.stumanagement.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.onmobile.stumanagement.model.Student;

@Repository									// This annotation will be used in Dao implementation class.
public class StudentDaoImpl implements StudentDao{
	
	@PersistenceContext					//this annotation is used above the entity manager.
	EntityManager entityManager;   		// we access database using entity manager

	@Override
	public String deleteById(int id) {
		entityManager.remove(entityManager.find(Student.class, id));
		return "Student removed succesfully";
		
	}

	@Override
	public List<Student> getAllStudent() {
		
		return entityManager.createQuery("select s from Student s").getResultList();
	}

	@Override
	public Student getStudentById(int id) {
		return	entityManager.find(Student.class, id);
		
	}

	@Override
	public String StudentCreation(Student stu) {
		entityManager.persist(stu);
		return "Student Created successfully";
	}

	@Override
	public String UpdateStudent(Student stu) {
		entityManager.merge(stu);
		return "Student Updated successfully";
	}

	
	
}
