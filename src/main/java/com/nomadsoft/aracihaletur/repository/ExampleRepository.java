package com.nomadsoft.aracihaletur.repository;



import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.nomadsoft.aracihaletur.entity.Examples;



@EnableMongoRepositories
public interface ExampleRepository extends MongoRepository<Examples, ObjectId> {

	
	
}
