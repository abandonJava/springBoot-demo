package com.eu.demo.dao;

import com.eu.demo.pojo.Student;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface StudentMapper {

    List<Student> findAll();

    Student getStudent(Integer id);

    void addStudent(Student student);

    void updateStudent(Student student);

    void deleteStudent(Integer id);

    Student getStudentBysexAndage(String sex,Integer age);

    List<Student> getStudentByAge(Integer age);

    Map<String,Object> getStu(Integer id);

    @MapKey("id")
    Map<Integer,Object> getStus(String stu_name);

}
