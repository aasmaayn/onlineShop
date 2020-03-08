package com.asmaayni.shopp.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.asmaayni.shopp.common.Customer;
import com.asmaayni.shopp.controller.CustomerController;
import com.asmaayni.shopp.service.CustomerService;
import com.asmaayni.shopp.utils.Utils;
import com.mongodb.DBCollection;

@Component
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	DBCollection dbCollection;
	
	@Autowired
	Utils utils;
    Logger logger = LoggerFactory.getLogger(CustomerController.class);


	@Override
	public Customer persistCustomer(Customer customer) throws Exception{
		logger.info("persisitng: ",customer );
		dbCollection.insert(utils.getDbObject(customer));
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
