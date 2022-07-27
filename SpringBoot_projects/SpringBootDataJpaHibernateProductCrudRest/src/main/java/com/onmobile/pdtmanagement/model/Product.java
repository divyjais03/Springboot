package com.onmobile.pdtmanagement.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="pdt_onmobile")
public class Product {
	@Id
	@Min(value=1)
	@Max(value=1000)
	private int id;
	
	@NotNull(message="Name cannot be Null")
	@NotEmpty(message="Name cannot be Empty")
	private String name;
	
	@Min(value=0)
	private int price;
	

	@NotNull(message="Brand cannot be Null")
	@NotEmpty(message="Brand cannot be Empty")
	private String brand;


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


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", brand=" + brand + "]";
	}


	public Product(@Min(1) @Max(1000) int id,
			@NotNull(message = "Name cannot be Null") @NotEmpty(message = "Name cannot be Empty") String name,
			@Min(0) int price,
			@NotNull(message = "Brand cannot be Null") @NotEmpty(message = "Brand cannot be Empty") String brand) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.brand = brand;
	}


	public Product() {
		super();
		
	}
	
	
	

}
