package com.zak.application.config;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.config.CorsRegistry;
import org.springframework.web.reactive.config.WebFluxConfigurer;
import org.springframework.web.reactive.handler.SimpleUrlHandlerMapping;
import org.springframework.web.reactive.socket.WebSocketHandler;
import org.springframework.web.servlet.HandlerMapping;


@Configuration
public class CorsConfigurationBean implements WebFluxConfigurer{
	

  
//	@Override
//    public void addCorsMappings(CorsRegistry corsRegistry) {
//        corsRegistry.addMapping("/**")
//          .allowedOrigins("http://localhost:8082")
//          .allowedMethods("PUT,GET,POST")
//          .maxAge(3600);
//    }
//	
//	@Bean
//	public HandlerMapping webSocketHandlerMapping() {
//	    Map<String, WebSocketHandler> map = new HashMap<>();
//	    map.put("/event", webSocketHandler);
//	 
//	    SimpleUrlHandlerMapping handlerMapping = new SimpleUrlHandlerMapping();
//	    handlerMapping.setOrder(1);
//	    handlerMapping.setUrlMap(map);
//	    return (HandlerMapping) handlerMapping;
//	}


}
