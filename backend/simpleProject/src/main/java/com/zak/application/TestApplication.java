package com.zak.application;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.Bean;

import com.zak.application.others.LoopRunner;


@SpringBootApplication

public class TestApplication {
    Logger logger = LoggerFactory.getLogger(TestApplication.class);
    

    public static void main(String[] args) {
    	SpringApplication.run(TestApplication.class, args);
//    	new SpringApplicationBuilder(TestApplication.class)
//        .web(WebApplicationType.REACTIVE)
//        .run(args);
    }
    
    //Thread sender = new Thread(new LoopRunner());
    
    @Bean
    public Thread getThread() {
    	Thread sender = new Thread(new LoopRunner());
    	return sender;
    }
}

