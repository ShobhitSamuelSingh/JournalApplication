package com.groot.journalApplication.repository;

import com.groot.journalApplication.entity.JournalEntry;
import com.groot.journalApplication.entity.User;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, ObjectId> {

    User findByUserName(String username);
}
