package com.eu.demo.controller;

import com.eu.demo.pojo.Student;
import com.eu.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;


@RequestMapping("/students")
@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping
    public List<Student> getStudents(){
        return studentService.findAll();
    }

    @GetMapping(value = "/{id}")
    public Student getStudent(@PathVariable Integer id){
        return studentService.getStudent(id);
    }

    @PostMapping(value ="/add")
    public void addStudent(Student student){
        studentService.addStudent(student);
    }

    @DeleteMapping(value = "/delete/{id}")
    public void deleteStudent(@RequestParam Integer id){
        studentService.deleteStudent(id);
    }

    @GetMapping(value = "/{sex}/{age}")
    public Student getStudentBysexAndage(@PathVariable String sex,@PathVariable Integer age){
        return studentService.getStudentBysexAndage(sex,age);
    }

    @GetMapping(value = "/list/{age}")
    public List<Student> getStudentByAge(@PathVariable Integer age){
        return studentService.getStudentByAge(age);
    }

    @GetMapping(value = "/stu/{id}")
    public Map<String,Object> getStu(@PathVariable Integer id){
        return studentService.getStu(id);
    }

    @GetMapping(value = "/name/{stu_name}")
    public Map<Integer,Object> getStus(@PathVariable String stu_name){
        return studentService.getStus(stu_name);
    }

}
