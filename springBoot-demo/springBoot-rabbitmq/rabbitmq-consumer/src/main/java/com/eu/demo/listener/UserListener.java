package com.eu.demo.listener;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "mess")
public class UserListener {

    @RabbitHandler
    public void exMessage(String message){
        System.out.println(message);
    }
}
