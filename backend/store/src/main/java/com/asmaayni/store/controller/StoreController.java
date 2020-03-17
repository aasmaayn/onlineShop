package com.asmaayni.store.controller;

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

import com.asmaayni.store.common.Product;
import com.asmaayni.store.service.StoreService;



@RestController
@RequestMapping("/product")
public class StoreController {
    Logger logger = LoggerFactory.getLogger(StoreController.class);

    @Autowired
    private StoreService storeService;
    
    @PostMapping(value = "/find", produces= MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Product>> find(@RequestBody Product product) {
    	List<Product> response = storeService.findProduct(product);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
    
    @PostMapping(value = "/commit", produces= MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Product> add(@RequestBody Product product) {
    	Product response;
		try {
			response = storeService.persistProduct(product);
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
