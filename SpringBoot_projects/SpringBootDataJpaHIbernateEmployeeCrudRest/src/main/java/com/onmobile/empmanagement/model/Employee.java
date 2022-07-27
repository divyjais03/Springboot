package com.onmobile.empmanagement.model;
//commenting for check
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

//select * from onmobile_emps where empsal between 10000 and 30000; 
//select * from onmobile_emps where org="onmobile";
//select e from Employee e where e.salary between 10000 and 30000;
//select e from Employee e where e.company="";
@Entity
@Table(name = "onmobile_emps")
public class Employee {
	@Id
	@Column(name = "empid")
	@Min(value = 10)
	@Max(value = 10000)
	private int id;// 2000
	@NotNull(message = "name cannot be null")
	@NotEmpty(message = "name cannot be empty")
	@Column(name = "empname", length = 15)
	private String name;
	@Column(name = "empsal", length = 10)
	private long salary;
	@Column(name = "contact", length = 15)
//	@Pattern(regexp = "^[0-9]{10}$",message = "pass valid 10 digit number")
	private long phonenumber;
	@Column(name = "org", length = 15)
	@Size(min = 5, max = 10, message = "company name should have at least 5 characters and lessthan 10 ")
	private String company;// "rps"

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

	public Employee() {
	}

	public Employee(int id, String name, long salary, long phonenumber, String company) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.phonenumber = phonenumber;
		this.company = company;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", phonenumber=" + phonenumber
				+ ", company=" + company + "]";
	}

}
