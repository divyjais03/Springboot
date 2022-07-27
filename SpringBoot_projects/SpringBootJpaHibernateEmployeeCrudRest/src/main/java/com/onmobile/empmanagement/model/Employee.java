package com.onmobile.empmanagement.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "onmobile_emps")
public class Employee {

	@Id
	@Column(name = "empid")				 // this will be reflected in table

	// @Size()							 // size() contains both Min and Max
	@Min(value = 10)
	@Max(value = 10000)
	private int id;
	@NotNull(message = "Name cannot be null")
	@NotEmpty(message = "Name cannot be Empty")
	@Column(name = "empname", length = 15)
	private String name;
	@Column(name = "empsal", length = 10)
	private long salary;
	@Column(name = "contact", length = 15)
	private long phonenumber;
	@Column(name = "org", length = 15)
	@Size(min = 5, max = 10, message = "Company name should have atleast 5 characters and less than 10 characters...!")
	private String company;

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

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	public long getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(long phonenumber) {
		this.phonenumber = phonenumber;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public Employee(int id, String name, long salary, long phonenumber, String company) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.phonenumber = phonenumber;
		this.company = company;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", phonenumber=" + phonenumber
				+ ", company=" + company + "]";
	}

}
