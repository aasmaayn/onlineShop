//package com.zak.application.others;
//
//import org.springframework.stereotype.Component;
//import org.springframework.web.reactive.socket.WebSocketHandler;
//import org.springframework.web.reactive.socket.WebSocketMessage;
//import org.springframework.web.reactive.socket.WebSocketSession;
//
//import ch.qos.logback.core.util.Duration;
//import reactor.core.publisher.Flux;
//import reactor.core.publisher.Mono;
//
//@Component
//public class Handler implements WebSocketHandler {
//
//	@Override
//	public Mono<Void> handle(WebSocketSession session) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//     
////    // private fields ...
////	val interval = Flux.interval(Duration.ofSeconds(1));
//// 
////    @Override
////    public Mono<Void> handle(WebSocketSession webSocketSession) {
////        return webSocketSession.send(intervalFlux
////          .map(webSocketSession::textMessage))
////          .and(webSocketSession.receive()
////            .map(WebSocketMessage::getPayloadAsText)
////            .log());
////    }
//}
