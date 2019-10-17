package com.shopping4th.ecommerce.service;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;

import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.shopping4th.ecommerce.dao.IProductRepo;

import com.shopping4th.ecommerce.entity.Product;

@Service
public class ProductService implements IProductService {
	
	@Autowired
	private IProductRepo productRepo;
	
	public ProductService(IProductRepo productRepo) {
		super();
		this.productRepo = productRepo;
	}

	@Override
	public List<Product> findAll() {
		
		return productRepo.findAll();
	}

	@Override
	public Product findById(Long id) {
		Optional<Product> product = this.productRepo.findById(id);
		if(product.isPresent()) {
			return product.get();
		
		}
		else {
			throw new EntityNotFoundException();
		}
	}

	@Override
	public void save(Product product) {
		this.productRepo.save(product);
	}

	@Override
	public boolean existsById(Long id) {
		return this.productRepo.existsById(id);
	}

	@Override
	public void deletedById(Long id) {
		this.productRepo.deleteById(id);
	}

	@Override
	public List<Product> findAll(Pageable pageable) {
		Page<Product> products=this.productRepo.findAll(pageable);
		return products.getContent();
	}

//	@Override
//	public Page<Product> findAllByPage(Pageable pageable) {
//		return this.productRepo.findAll(pageable);
//	}
 
	
	
}
