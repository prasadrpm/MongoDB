package com.reporting.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.mongodb.MongoClient;

@Configuration
@EnableMongoRepositories(basePackages = "com.reporting.dao.*")
public class MongoConfig {
	
	 @Bean	
	 public  MongoClient mongoClient() {
	      return new MongoClient("localhost",27017);
	  }
	  @Bean
	  public  MongoTemplate mongoTemplate() {
	      return new MongoTemplate(mongoClient(), "test");
	  }

	
	
}
