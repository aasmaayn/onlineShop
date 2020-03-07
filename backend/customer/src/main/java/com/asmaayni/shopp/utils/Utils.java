package com.asmaayni.shopp.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Component
public class Utils {
	@Autowired
	ObjectMapper objectMapper;
	
	public String convertToJson(Object object) throws JsonProcessingException {
		return objectMapper.writeValueAsString(object);
	}
	
}
