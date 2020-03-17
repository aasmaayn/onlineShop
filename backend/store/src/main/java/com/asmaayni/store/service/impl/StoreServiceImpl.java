package com.asmaayni.store.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.asmaayni.store.common.Product;
import com.asmaayni.store.controller.StoreController;
import com.asmaayni.store.service.StoreService;
import com.asmaayni.store.utils.Utils;
import com.mongodb.DBCollection;

@Component
public class StoreServiceImpl implements StoreService {
	
	@Autowired
	DBCollection dbCollection;
	
	@Autowired
	Utils utils;
    Logger logger = LoggerFactory.getLogger(StoreController.class);


	@Override
	public Product persistProduct(Product customer) throws Exception{
		logger.info("persisitng: ",customer );
		dbCollection.insert(utils.getDbObject(customer));
		return customer;
	}

	@Override
	public Product removeProcuct(Product customer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> findProduct(Product customer) {
		// TODO Auto-generated method stub
		return null;
	}

}
