package com.eilonwy.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.eilonwy.models.User;

public interface UserRepository extends MongoRepository<User, String>{

}
