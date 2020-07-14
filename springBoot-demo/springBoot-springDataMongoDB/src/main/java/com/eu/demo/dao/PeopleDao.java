package com.eu.demo.dao;

import com.eu.demo.pojo.People;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PeopleDao extends MongoRepository<People,String> {
}
