package com.shopping4th.ecommerce.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import com.shopping4th.ecommerce.entity.Product;

public interface IProductService {

	public List<Product> findAll();
	
	public Product findById(Long id);
	
	public void save(Product product);
	
	public void deletedById(Long id);
	
	public boolean existsById(Long id);
	
	//public Page<Product> findAllByPage(Pageable pageable);
	public List<Product> findAll(Pageable pageable);
}
