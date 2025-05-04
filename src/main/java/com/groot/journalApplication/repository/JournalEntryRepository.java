package com.groot.journalApplication.repository;

import com.groot.journalApplication.entity.JournalEntry;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface JournalEntryRepository extends MongoRepository<JournalEntry, String> {


}
