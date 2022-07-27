package com.onmobile.pdtmanagement.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.onmobile.pdtmanagement.model.Product;

public interface ProductDao extends JpaRepository<Product, Integer> {

	List<Product> findByNameEquals(String pdtName);
	List<Product> findByPriceBetween (int minPrice, int maxPrice);
	List<Product> findByPriceLessThan (int maxPrice);
	
	
}
