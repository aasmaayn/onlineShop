package com.asmaayni.store.service;

import java.util.List;

import com.asmaayni.store.common.Product;


public interface StoreService {
	public Product persistProduct(Product customer) throws Exception;
	public Product removeProcuct(Product customer);
	public List<Product> findProduct(Product customer);

}
