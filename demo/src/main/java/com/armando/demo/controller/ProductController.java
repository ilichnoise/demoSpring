package com.armando.demo.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.armando.demo.model.Product;

@RestController
@RequestMapping("product")
public class ProductController {
	@RequestMapping(value = "/", method = RequestMethod.POST, produces = "application/json")
    public Product createProduct(Product Product) { 
    	return null; 
    }
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = "application/json")
    public Product getProduct(@PathVariable int id) {
        return null;
    }
	
	@RequestMapping(value = "/", method = RequestMethod.PUT, produces = "application/json")
    public Product updateProduct(Product Product) { 
    	return null; 
    }
	
	
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE, produces = "application/json")
    public Product deleteProduct(@PathVariable int id) {
        return null;
    } 

}
