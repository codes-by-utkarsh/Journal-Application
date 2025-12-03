package net.drizzlehx.journalApp.controllers;

import net.drizzlehx.journalApp.entity.journalEntry;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/journal")
public class JournalEntryControllerv2
{
    @GetMapping
    public List<journalEntry> getall()

    {
        return null;
    }
    @PostMapping()
    public journalEntry create(@RequestBody journalEntry myEntry)
    {
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
