package com.zak.application.controller;

import java.time.Duration;
import java.time.LocalTime;
import java.util.Random;
import java.util.stream.Stream;

import javax.websocket.HandshakeResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.codec.ServerSentEvent;
import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.config.EnableWebFlux;

import com.zak.application.others.LoopRunner;

import reactor.core.publisher.Flux;

@RestController
public class TestController {
    Logger logger = LoggerFactory.getLogger(TestController.class);
    private static boolean active = false;
    @Autowired
    Thread sender;
    
 
    @GetMapping(value = "/test", produces= MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<Integer> getTemperature() { 
        Random r = new Random();
        int low = 0;
        int high = 50;
        return Flux.fromStream(Stream.generate(() -> r.nextInt(high - low) + low)
            .map(s -> String.valueOf(s))
            .peek((msg) -> {
                logger.info(msg);
            }))
            .map(s -> Integer.valueOf(s))
            .delayElements(Duration.ofSeconds(2));
    }
    @Async
    @RequestMapping("/value")
    public ResponseEntity<String> getValue() throws InterruptedException {
    	
    	System.out.println("before:"+ active);
    	active = active?false:true;
    	
    	System.out.println("after:"+ active);
    	if(active) sender.start(); else sender.stop();
    	System.out.println(sender.isAlive());

        return new ResponseEntity<>("Success", HttpStatus.OK);
    }
    
    @GetMapping(path = "/stream", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<String> streamFlux() {
        return Flux.interval(Duration.ofSeconds(1))
          .map(sequence -> "Flux - " + LocalTime.now().toString());
    }
    

    @GetMapping("/stream-sse")
    public Flux<ServerSentEvent<String>> streamEvents() {
        return Flux.interval(Duration.ofSeconds(1))
          .map(sequence -> ServerSentEvent.<String> builder()
            .id(String.valueOf(sequence))
              .event("periodic-event")
              .data("SSE - " + LocalTime.now().toString())
              .build());
    }
    
    @Async
    private void run() throws InterruptedException {
    	System.out.println("before:"+ active);
    	active = active?false:true;
    }
}
