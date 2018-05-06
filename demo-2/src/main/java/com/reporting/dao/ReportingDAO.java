package com.reporting.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.reporting.demo.Rq;

public interface ReportingDAO extends MongoRepository<Rq, Integer>{

}
