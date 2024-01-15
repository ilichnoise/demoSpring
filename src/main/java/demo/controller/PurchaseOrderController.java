package demo.controller;

import demo.model.PurchaseOrder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("purchaseOrder")
public class PurchaseOrderController {
	@RequestMapping(value = "/", method = RequestMethod.POST, produces = "application/json")
    public PurchaseOrder createPurchaseOrder(PurchaseOrder purchaseOrder) {
    	return null; 
    }
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = "application/json")
    public PurchaseOrder getPurchaseOrder(@PathVariable int id) {
        return null;
    }
	
	@RequestMapping(value = "/", method = RequestMethod.PUT, produces = "application/json")
    public PurchaseOrder updatePurchaseOrder(PurchaseOrder purchaseOrder) { 
    	return null; 
    }
	
	
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE, produces = "application/json")
    public PurchaseOrder deletePurchaseOrder(@PathVariable int id) {
        return null;
    } 

}
