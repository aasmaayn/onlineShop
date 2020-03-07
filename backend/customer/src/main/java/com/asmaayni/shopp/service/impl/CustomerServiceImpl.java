package com.asmaayni.shopp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.asmaayni.shopp.common.Customer;
import com.asmaayni.shopp.service.CustomerService;
import com.asmaayni.shopp.utils.Utils;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.google.gson.Gson;
import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import com.mongodb.util.JSON;

@Component
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	DBCollection dbCollection;
	
	@Autowired
	Utils utils;
	

	@Override
	public Customer persistCustomer(Customer customer) {
		Gson gson = new Gson();
		BasicDBObject obj = (BasicDBObject)JSON.parse(gson.toJson(customer));		
		dbCollection.insert(obj);
		return customer;
	}

	@Override
	public Customer removeCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Customer> findCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return null;
	}

}
