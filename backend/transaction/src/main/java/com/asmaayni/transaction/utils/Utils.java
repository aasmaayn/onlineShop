package com.asmaayni.transaction.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.mongodb.BasicDBObject;
import com.mongodb.util.JSON;

@Component
public class Utils {
	@Autowired
	ObjectMapper objectMapper;
	@Autowired
	Gson gson;
	
	public BasicDBObject getDbObject(Object object) throws JsonProcessingException {
		return (BasicDBObject)JSON.parse(gson.toJson(object));	
	}
	
}
