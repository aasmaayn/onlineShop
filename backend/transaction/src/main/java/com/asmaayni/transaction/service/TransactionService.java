package com.asmaayni.transaction.service;

import java.util.List;

import com.asmaayni.transaction.common.Transaction;


public interface TransactionService {
	public Transaction persistCustomer(Transaction customer) throws Exception;
	public Transaction removeCustomer(Transaction customer);
	public List<Transaction> findCustomer(Transaction customer);

}
