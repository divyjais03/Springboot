package com.onmobile.pdtmanagement.controller;

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
import org.springframework.web.bind.annotation.RestController;

import com.onmobile.pdtmanagement.model.Product;
import com.onmobile.pdtmanagement.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {

	@Autowired 
	ProductService service;
	
	@PostMapping("/addProduct") // http://localhost:7687/employee/addEmployee
	public String createProduct(@Valid @RequestBody Product pdt) {
		return service.productCreation(pdt);
	}

	@PutMapping("/updateProduct") // http://localhost:7687/employee/updateEmployee
	public String updateProduct(@RequestBody Product pdt) {
		return service.updateProduct(pdt);
	}

	@DeleteMapping("/deleteProduct/{id}") // http://localhost:7687/employee/deleteEmployee/123
	public String deleteProduct(@PathVariable("id") int pdtId) {
		return service.deleteById(pdtId);
	}

	@GetMapping("/getProduct/{id}") // http://localhost:7687/employee/getEmployee/123
	public Product getProduct(@PathVariable("id") int pdtId) {
		return service.getProductById(pdtId);
	}

	@GetMapping("/getAll") // http://localhost:7687/employee/getAll
	public List<Product> getAllProduct() {
		return service.getAllProduct();
	
	}
	
	@GetMapping("/getAllInBetween/{minPrice}/{maxPrice}")
	public List<Product> getAllProduct(@PathVariable("minPrice")int minPrice,@PathVariable("maxPrice")int maxPrice){
	return service.getAllProductInBetween(minPrice, maxPrice);
	}
	
	@GetMapping("/getAllByPdtName/{pdtName}") // http://localhost:7687/employee/getAllByOrgName/onmobile
	public List<Product> getAllProduct(@PathVariable("pdtName")String pdtName) {
		return service.getAllProductByName(pdtName);
	}
	
	@GetMapping("/getAllPdtPriceLessThan/{pdtMax}")
	public List<Product> getAllProduct(@PathVariable("pdtMax")int maxPrice ){
		return service.getAllProductPriceLessThan(maxPrice);
	}
}

