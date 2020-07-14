package com.eu.demo.service;

import org.springframework.amqp.AmqpException;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class UserService {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    public void send(){
        System.out.println("666");
        try {
            rabbitTemplate.convertAndSend("mess", "mess:"+LocalDateTime.now());
        } catch (AmqpException e) {
            e.printStackTrace();
        }
        System.out.println("999");
    }

    public void topicSend(){
        String context="主题模式发送一条消息";
        rabbitTemplate.convertAndSend("topicExchange","topic.message",context);
    }

    public void topicSend2(){
        String context="主题模式发送第二条消息";
        rabbitTemplate.convertAndSend("topicExchange","topic.messages",context);
    }

    public void fanoutSend(){
        System.out.println("开始发送");
        String context="hello,fanoutExchange";
        rabbitTemplate.convertAndSend("fanoutExchange","",context);
        System.out.println("开始完毕");
    }


}
