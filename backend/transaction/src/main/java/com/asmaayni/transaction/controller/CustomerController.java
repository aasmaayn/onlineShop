package com.asmaayni.transaction.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.asmaayni.transaction.common.Transaction;
import com.asmaayni.transaction.service.TransactionService;



@RestController
@RequestMapping("/transaction")
public class CustomerController {
    Logger logger = LoggerFactory.getLogger(CustomerController.class);

    @Autowired
    private TransactionService customerService;
    
    @PostMapping(value = "/find", produces= MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Transaction>> find(@RequestBody Transaction customer) {
    	List<Transaction> response = customerService.findCustomer(customer);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
    
    @PostMapping(value = "/commit", produces= MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Transaction> add(@RequestBody Transaction customer) {
    	Transaction response;
		try {
			response = customerService.persistCustomer(customer);
			return new ResponseEntity<>(response, HttpStatus.OK);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
		}
        
    }
    
    @GetMapping("/value")
    public ResponseEntity<String> getValue() {
        return new ResponseEntity<>("Success customer", HttpStatus.OK);
    }

}
