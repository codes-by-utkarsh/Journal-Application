package net.drizzlehx.journalApp.repository;

import net.drizzlehx.journalApp.entity.journalEntry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;

@Component
public interface JournalEntryRepo extends MongoRepository<journalEntry,String>
{

}
