package net.drizzlehx.journalApp.controllers;

import java.time.LocalDateTime;
import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.drizzlehx.journalApp.entity.journalEntry;
import net.drizzlehx.journalApp.service.JournalEntryService;

@RestController
@RequestMapping("/journal")
public class JournalEntryControllerv2
{
    @Autowired
    private JournalEntryService journalEntryService;

    @GetMapping
    public List<journalEntry> getAll()
    {
        return journalEntryService.getAll();
    }

    @PostMapping()
    public boolean create(@RequestBody journalEntry myEntry) {
        myEntry.setDate(LocalDateTime.now());
        journalEntryService.save(myEntry);
        return true;
    }

    @GetMapping("/id/{myId}")
    public journalEntry getJournalEntry(@PathVariable ObjectId myId) {
    return journalEntryService.getbyId(myId).orElse(null);
    }

    @DeleteMapping("/id/{myId}")
    public boolean delete(@PathVariable ObjectId myId) {
        JournalEntryService.deletebyId(myId);
    }

    @PutMapping("/id/{myId}")
    public journalEntry update(@PathVariable ObjectId myId, @RequestBody journalEntry myEntry) {
        return null;
    }
}

