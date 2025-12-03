package net.drizzlehx.journalApp.controllers;

import net.drizzlehx.journalApp.entity.journalEntry;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

@RestController
@RequestMapping("/journal")
public class JournalEntryController
{
    private Map<Long,JournalEntry> journalEntries = new HashMap<>();
    @GetMapping
    public List<JournalEntry> getall()
    {
        return new ArrayList<>(journalEntries.values());
    }
    @PostMapping()
    public boolean create(@RequestBody journalEntry myEntry)
    {

    }


}
