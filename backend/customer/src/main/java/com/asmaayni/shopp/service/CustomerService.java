package com.asmaayni.shopp.service;

import java.util.List;

import com.asmaayni.shopp.common.Customer;


public interface CustomerService {
	public Customer persistCustomer(Customer customer) throws Exception;
	public Customer removeCustomer(Customer customer);
	public List<Customer> findCustomer(Customer customer);

}
