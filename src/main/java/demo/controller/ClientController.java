package demo.controller;

import demo.model.Client;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("client")
public class ClientController {
	
	@RequestMapping(value = "/", method = RequestMethod.POST, produces = "application/json")
    public Client createClient(Client client) {
    	return null; 
    }
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = "application/json")
    public Client getClient(@PathVariable int id) {
        return null;
    }
	
	@RequestMapping(value = "/", method = RequestMethod.PUT, produces = "application/json")
    public Client updateClient(Client client) { 
    	return null; 
    }
	
	
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE, produces = "application/json")
    public Client deleteClient(@PathVariable int id) {
        return null;
    } 
}
