package com.eu.demo.listener;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "topic.messages")
public class Topic2Listener {

    @RabbitHandler
    public void exMessage(String message){
        System.out.println("topic.messages收到的消息:"+message);
    }
}
