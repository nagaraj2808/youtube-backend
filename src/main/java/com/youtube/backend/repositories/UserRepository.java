package com.youtube.backend.repositories;

import com.youtube.backend.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface UserRepository extends MongoRepository<User,String> {

}
