package net.drizzlehx.journalApp.service;

import net.drizzlehx.journalApp.entity.journalEntry;
import net.drizzlehx.journalApp.repository.JournalEntryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;


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
}
