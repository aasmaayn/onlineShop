package com.asmaayni.customer.service;

import java.util.List;

import com.asmaayni.customer.common.Customer;


public interface CustomerService {
	public Customer persistCustomer(Customer customer) throws Exception;
	public Customer removeCustomer(Customer customer);
	public List<Customer> findCustomer(Customer customer);

}
