package com.eu.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author
 */
@RestController("/hello")
public class HelloController {

    private static Logger log = LoggerFactory.getLogger(HelloController.class);

    @GetMapping
    public String hello(){
        log.info("开始了");
        log.debug("debug");
        log.warn("警告");
        log.error("错误");
        return "666";
    }
}
