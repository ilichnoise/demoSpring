package com.armando.demo.service;

import com.armando.demo.model.Product;

public interface ProductService {
	public Product create(Product product);
	public Product update(Product product);
	public Product delete(int id);
}
