package com.armando.demo.model;

import java.util.List;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class PurchaseOrder {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	List<Product> order;
	

}
