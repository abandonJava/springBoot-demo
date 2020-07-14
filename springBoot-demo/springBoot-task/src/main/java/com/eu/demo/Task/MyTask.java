package com.eu.demo.Task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class MyTask {

    private static final SimpleDateFormat data=new SimpleDateFormat("HH:mm:ss");

    @Scheduled(fixedRate = 3000) //每超过三秒执行一次
    public void run(){
        System.out.println("现在时间："+data.format(new Date()));
    }

    @Scheduled(cron = "* * * * * ?") // 每秒调用一次
    public void runJobB() {
        System.out.println("现在的时间："+data.format(new Date()));
    }
}
