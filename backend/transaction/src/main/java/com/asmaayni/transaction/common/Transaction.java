package com.asmaayni.transaction.common;

import java.time.LocalDate;
import java.util.Collection;

import com.asmaayni.customer.common.Customer;
import com.asmaayni.store.common.Product;

public class Transaction {
	private String id;
	private LocalDate trans_date;
	private Customer customer;
	private Collection<Product> cart;
	private String total;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public LocalDate getTrans_date() {
		return trans_date;
	}
	public void setTrans_date(LocalDate trans_date) {
		this.trans_date = trans_date;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public String getTotal() {
		return total;
	}
	public void setTotal(String total) {
		this.total = total;
	}
	public Collection<Product> getCart() {
		return cart;
	}
	public void setCart(Collection<Product> cart) {
		this.cart = cart;
	}
	
	
}
