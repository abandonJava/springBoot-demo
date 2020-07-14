package com.eu.demo.listener;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "fanout.A")
public class FanoutAListener {

    @RabbitHandler
    public void exMessage(String message){
        System.out.println("fanout.A:"+message);
    }
}
