package com.eu.demo.listener;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "topic.message")
public class TopicListener {

    @RabbitHandler
    public void exMessage(String message){
        System.out.println("topic.message收到的消息:"+message);
    }

}
