package net.drizzlehx.journalApp.controllers;

import java.util.List;

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
    // @GetMapping("/error")
    // @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    // public String errorExample()
    // {
    //     return "Sample error endpoint";
    // }
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

