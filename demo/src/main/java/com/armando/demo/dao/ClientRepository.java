package com.armando.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.armando.demo.model.Client;

public interface ClientRepository extends CrudRepository<Client, Integer>{

}
