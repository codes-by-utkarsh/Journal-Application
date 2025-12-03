package net.drizzlehx.journalApp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

@RestController
@RequestMapping("/journal")
public class JournalEntryController
{
    private Map<Long,JournalEntry> journalEntries = new HashMap<>();
    @GetMapping("/abc")
    public List<JournalEntry> getall()
    {
        return new ArrayList<>(journalEntries.values());
    }
    @GetMapping("/def")
    public List<JournalEntry> delall()
    {
        return new ArrayList<>(journalEntries.values());
    }


}
