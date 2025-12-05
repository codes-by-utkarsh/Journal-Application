package net.drizzlehx.journalApp.controllers;

import net.drizzlehx.journalApp.entity.journalEntry;
import net.drizzlehx.journalApp.service.JournalEntryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/journal")
public class JournalEntryControllerv2
{
    @Autowired
    private JournalEntryService journalEntryService;

    @GetMapping
    public List<journalEntry> getall()

    {
        return null;
    }
    @PostMapping()
    public journalEntry create(@RequestBody journalEntry myEntry)
    {
        journalEntryService.save(myEntry);
        return null;
    }
    @GetMapping("/id/{myId}")
    public journalEntry getJournalEntry(@PathVariable long myId)

    {
        return null;
    }
    @DeleteMapping("/id/{nyId}")
    public journalEntry delete(@PathVariable long myId)
    {
        return null;
    }

    @PutMapping("/id/{myId}")
    public journalEntry update(@PathVariable long myId, @RequestBody journalEntry myEntry)
    {
        return null;
    }

}
