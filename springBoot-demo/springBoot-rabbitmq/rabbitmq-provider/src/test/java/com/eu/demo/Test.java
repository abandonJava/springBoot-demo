package com.eu.demo;

import com.eu.demo.service.UserService;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Test {

    @Autowired
    private UserService userService;

    @org.junit.Test
    public void send(){
        userService.send();
    }

    @org.junit.Test
    public void topicSend(){
        userService.topicSend();
    }

    @org.junit.Test
    public void topicSend2(){
        userService.topicSend2();
    }


    @org.junit.Test
    public void fanoutSend(){
        userService.fanoutSend();
    }
}
