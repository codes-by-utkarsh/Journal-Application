package net.drizzlehx.journalApp.repository;

import net.drizzlehx.journalApp.entity.journalEntry;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface JournalEntryRepo extends MongoRepository<journalEntry,String>
{

}
