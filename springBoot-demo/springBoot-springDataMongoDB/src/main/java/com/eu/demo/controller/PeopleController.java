package com.eu.demo.controller;

import com.eu.demo.Result;
import com.eu.demo.StatusCode;
import com.eu.demo.pojo.People;
import com.eu.demo.service.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/people")
public class PeopleController {

    @Autowired
    private PeopleService peopleService;

    @RequestMapping(method = RequestMethod.POST)
    public Result add(@RequestBody People people){
        peopleService.add(people);
        return new Result(true, StatusCode.OK,"添加成功");
    }

    @RequestMapping(method = RequestMethod.GET)
    public Result getAll(){
        return new Result(true,StatusCode.OK,"查询成功",peopleService.findAll());
    }

    @RequestMapping(method = RequestMethod.DELETE,value = "/{id}")
    public Result deleteById(@PathVariable String id){
        peopleService.deleteById(id);
        return new Result(true,StatusCode.OK,"删除成功");
    }


}
