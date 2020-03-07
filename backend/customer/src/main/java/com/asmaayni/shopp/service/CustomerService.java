package com.asmaayni.shopp.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.asmaayni.shopp.common.Customer;


public interface CustomerService {
	public Customer persistCustomer(Customer customer);
	public Customer removeCustomer(Customer customer);
	public List<Customer> findCustomer(Customer customer);

}
