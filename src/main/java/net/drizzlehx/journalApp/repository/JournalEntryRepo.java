package net.drizzlehx.journalApp.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;

import net.drizzlehx.journalApp.entity.journalEntry;

@Component
public interface JournalEntryRepo extends MongoRepository<journalEntry,String>
{

}
        