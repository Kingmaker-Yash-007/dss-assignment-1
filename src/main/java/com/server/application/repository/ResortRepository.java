package com.server.application.repository;

import com.server.application.model.ResortData;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ResortRepository extends MongoRepository<ResortData,String> {

}

