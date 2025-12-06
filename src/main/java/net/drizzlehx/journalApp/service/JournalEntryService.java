package net.drizzlehx.journalApp.service;

import net.drizzlehx.journalApp.entity.journalEntry;
import net.drizzlehx.journalApp.repository.JournalEntryRepo;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;


@Component
public class JournalEntryService
{
    @Autowired
    private JournalEntryRepo journalEntryRepo;

    public void save(journalEntry je)
    {
        journalEntryRepo.save(je);
    }
    public List<journalEntry> getAll()
    {
        journalEntryRepo.findAll();
    }

    public Optional<journalEntry> getbyId(@PathVariable ObjectId myId)
    {
        return Optional.of(journalEntryRepo.findById(myId).get());

    }
}
