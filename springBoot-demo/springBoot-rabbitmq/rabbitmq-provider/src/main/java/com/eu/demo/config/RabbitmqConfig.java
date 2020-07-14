package com.eu.demo.config;

import org.springframework.amqp.core.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class RabbitmqConfig {

    @Bean
    public Queue queue(){
        return new Queue("mess");
    }

    @Bean
    public Queue topicQueue(){
        return new Queue("topic.message");
    }

    @Bean
    public Queue topicQueue2(){
        return new Queue("topic.messages");
    }

    @Bean
    public TopicExchange exchange(){
        return new TopicExchange("topicExchange");
    }


    //给队列绑定 exchange 和 routing_key
    @Bean
    public Binding bingingExchangeMessage(){
        return BindingBuilder.bind(topicQueue()).to(exchange()).with("topic.message");
    }

    @Bean
    public Binding bindingExchangeMessages(){
        return BindingBuilder.bind(topicQueue2()).to(exchange()).with("topic.#");
    }


    @Bean
    public Queue fanoutQueue(){
        return new Queue("fanout.A");
    }

    @Bean
    public Queue fanoutQueue2(){
        return new Queue("fanout.B");
    }

    @Bean
    public Queue fanoutQueue3(){
        return new Queue("fanout.C");
    }

    @Bean
    public FanoutExchange fanoutExchange(){
        return new FanoutExchange("fanoutExchange");
    }

    @Bean
    public Binding bingingExchangeA(){
        return BindingBuilder.bind(fanoutQueue()).to(fanoutExchange());
    }

    @Bean
    public Binding bingingExchangeB(){
        return BindingBuilder.bind(fanoutQueue2()).to(fanoutExchange());
    }

    @Bean
    public Binding bingingExchangeC(){
        return BindingBuilder.bind(fanoutQueue3()).to(fanoutExchange());
    }

}
