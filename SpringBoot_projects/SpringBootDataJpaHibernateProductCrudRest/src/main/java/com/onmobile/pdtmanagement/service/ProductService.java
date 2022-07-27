package com.onmobile.pdtmanagement.service;

import java.util.List;

import com.onmobile.pdtmanagement.model.Product;


public interface ProductService {

	String deleteById(int id);

	List<Product> getAllProduct();

	Product getProductById(int id);

	String productCreation(Product pdt);

	String updateProduct(Product pdt);

	List<Product> getAllProductInBetween(int minPrice, int maxPrice);

	List<Product> getAllProductByName(String pdtName);
	
	List<Product> getAllProductPriceLessThan(int maxPrice);
	
}
