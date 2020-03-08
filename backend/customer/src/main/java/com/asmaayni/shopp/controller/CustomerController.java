package com.asmaayni.shopp.controller;

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

import com.asmaayni.shopp.common.Customer;
import com.asmaayni.shopp.service.CustomerService;



@RestController
@RequestMapping("/customer")
public class CustomerController {
    Logger logger = LoggerFactory.getLogger(CustomerController.class);

    @Autowired
    private CustomerService customerService;
    
    @PostMapping(value = "/find", produces= MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Customer>> find(@RequestBody Customer customer) {
    	List<Customer> response = customerService.findCustomer(customer);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
    
    @PostMapping(value = "/commit", produces= MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Customer> add(@RequestBody Customer customer) {
    	Customer response;
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
