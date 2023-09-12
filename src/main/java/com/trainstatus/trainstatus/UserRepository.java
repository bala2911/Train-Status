package com.trainstatus.trainstatus;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<UserSchema, String> {

}
