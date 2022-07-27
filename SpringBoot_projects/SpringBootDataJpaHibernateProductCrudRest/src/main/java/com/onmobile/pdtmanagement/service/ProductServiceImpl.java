package com.onmobile.pdtmanagement.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onmobile.pdtmanagement.dao.ProductDao;
import com.onmobile.pdtmanagement.model.Product;

@Service
@Transactional
public class ProductServiceImpl implements ProductService{

	@Autowired
	ProductDao dao;
	
	@Override
	public String deleteById(int id) {
		dao.deleteById(id);
		return "Product Deleted Successfully...!";
	}

	@Override
	public List<Product> getAllProduct() {
		return dao.findAll(); // select p from Product p;
	}

	@Override
	public Product getProductById(int id) {
		Optional <Product> optional=dao.findById(id);
		return optional.get();
	}

	@Override
	public String productCreation(Product pdt) {
		dao.save(pdt);
		return "Product inserted Successfully...!";
	}

	@Override
	public String updateProduct(Product pdt) {
		dao.save(pdt);
		return "Product Updated Successfully...!";
	}

	@Override
	public List<Product> getAllProductInBetween(int minPrice, int maxPrice) {
		
		return dao.findByPriceBetween(minPrice, maxPrice); 	//this method is defined in Dao interface
	}

	@Override
	public List<Product> getAllProductByName(String pdtName) {
		
		return dao.findByNameEquals(pdtName);
	}

	@Override
	public List<Product> getAllProductPriceLessThan(int maxPrice) {
		
		return dao.findByPriceLessThan(maxPrice);		//DSL Grammer is used....(Domain Specific Language)
	}

}
