package com.example.demo;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface userRepository extends MongoRepository<UserModel,String>{
	
	UserModel findByUsername(String username);

}
