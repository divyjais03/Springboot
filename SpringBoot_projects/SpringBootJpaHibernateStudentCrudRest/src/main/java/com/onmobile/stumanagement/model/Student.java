package com.onmobile.stumanagement.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="onmobile_stu")
public class Student {

	@Id
	
	private int id;
	
	private String name;
	
	private long roll;
	
	private int std;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getRoll() {
		return roll;
	}

	public void setRoll(long roll) {
		this.roll = roll;
	}

	public int getStd() {
		return std;
	}

	public void setStd(int std) {
		this.std = std;
	}

	public Student(int id, String name, long roll, int std) {
		super();
		this.id = id;
		this.name = name;
		this.roll = roll;
		this.std = std;
	}

	public Student() {
		super();
		
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", roll=" + roll + ", std=" + std + "]";
	}
	
	
	
}
