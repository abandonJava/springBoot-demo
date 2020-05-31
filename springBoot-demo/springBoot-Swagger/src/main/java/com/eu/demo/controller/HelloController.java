package com.eu.demo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "问候页面")
@RestController
public class HelloController {

    @ApiOperation(value="hello方法")
    @GetMapping("/hello")
    public Object hello(@RequestParam String name){
        return "12"+name;
    }
}
