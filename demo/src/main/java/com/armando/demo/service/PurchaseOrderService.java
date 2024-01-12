package com.armando.demo.service;

import com.armando.demo.model.PurchaseOrder;

public interface PurchaseOrderService {
	public PurchaseOrder create(PurchaseOrder purchaseOrder) ;
	public PurchaseOrder update(PurchaseOrder purchaseOrder) ;
	public PurchaseOrder delete(int id); 

}
