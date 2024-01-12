package com.armando.demo.service;

import com.armando.demo.model.Client;

public interface ClientService {
	public Client create(Client client);
	public Client update(Client client);
	public Client delete(int id);
}
