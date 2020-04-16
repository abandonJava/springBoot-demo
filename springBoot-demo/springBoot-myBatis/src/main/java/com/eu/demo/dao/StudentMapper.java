package com.eu.demo.dao;

import com.eu.demo.pojo.Student;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentMapper {

    List<Student> findAll();
}
