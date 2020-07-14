package com.eu.demo.service;

import com.eu.demo.dao.PeopleDao;
import com.eu.demo.pojo.People;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class PeopleService {

    @Autowired
    private PeopleDao peopleDao;

    public List<People> findAll(){
        return peopleDao.findAll();
    }

    public void add(People people){
        people.setId(UUID.randomUUID().toString());
        peopleDao.save(people);
    }

    public void deleteById(String id){
        peopleDao.deleteById(id);
    }

    public void updatePeople(People people){
        peopleDao.save(people);
    }
}
