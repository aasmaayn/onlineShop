package com.asmaayni.transaction.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.asmaayni.transaction.common.Transaction;
import com.asmaayni.transaction.controller.CustomerController;
import com.asmaayni.transaction.service.TransactionService;
import com.asmaayni.transaction.utils.Utils;
import com.mongodb.DBCollection;

@Component
public class TransactionServiceImpl implements TransactionService {
	
	@Autowired
	DBCollection dbCollection;
	
	@Autowired
	Utils utils;
    Logger logger = LoggerFactory.getLogger(CustomerController.class);


	@Override
	public Transaction persistCustomer(Transaction customer) throws Exception{
		logger.info("persisitng: ",customer );
		dbCollection.insert(utils.getDbObject(customer));
		return customer;
	}

	@Override
	public Transaction removeCustomer(Transaction customer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Transaction> findCustomer(Transaction customer) {
		// TODO Auto-generated method stub
		return null;
	}

}
