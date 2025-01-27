package com.c3.anotaciones.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;

import com.c3.anotaciones.controller.webSocketContoller;

@Configuration
@EnableWebSocket
public class webSocketConfig implements WebSocketConfigurer {

    @Override
    public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
        registry.addHandler(new webSocketContoller(),"/ws").setAllowedOrigins("*");
    }

}
