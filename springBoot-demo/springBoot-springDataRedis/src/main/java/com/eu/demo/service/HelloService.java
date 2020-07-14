package com.eu.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.TimeoutUtils;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

@Service
public class HelloService {
    @Autowired
    private RedisTemplate redisTemplate;



    public void hello(){
        redisTemplate.opsForValue().set("age","200");
        redisTemplate.opsForValue().set("sex","男");
        redisTemplate.opsForValue().set("group","12");
        //设置了过期时间
        redisTemplate.opsForValue().set("dog","大黄",10,TimeUnit.SECONDS);

        redisTemplate.opsForValue().set("num",10);
        //自增2
        redisTemplate.boundValueOps("num").increment(2);
        //减去3
        redisTemplate.boundValueOps("num").increment(-3);
        //获取缓存中的值
        redisTemplate.opsForValue().get("num");

        List list=new ArrayList();
        list.add("大梦");
        list.add("大姚");

        redisTemplate.opsForList().leftPushAll("list",list);


        if (redisTemplate.hasKey("age")){
            System.out.println("有");
        }
        if (redisTemplate.hasKey("age00")){
            System.out.println("有");
        }else{
            System.out.println("没有");
        }
    }
}
