package com.eu.demo.service;

import com.eu.demo.dao.StudentMapper;
import com.eu.demo.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

@Service
public class StudentService {

    @Autowired
    private StudentMapper studentMapper;

    public List<Student> findAll(){
        return studentMapper.findAll();
    }

    public Student getStudent(Integer id){
        return studentMapper.getStudent(id);
    }


    public void addStudent(Student student){
        studentMapper.addStudent(student);
    }

    public void deleteStudent(Integer id){
        studentMapper.deleteStudent(id);
    }

    public Student getStudentBysexAndage(String sex,Integer age){
        return studentMapper.getStudentBysexAndage(sex,age);
    }

    public List<Student> getStudentByAge(Integer age){
        return studentMapper.getStudentByAge(age);
    }

    public Map<String,Object> getStu(Integer id){
        return studentMapper.getStu(id);
    }

    public Map<Integer,Object> getStus(String stu_name){
        return studentMapper.getStus(stu_name);
    }
}
