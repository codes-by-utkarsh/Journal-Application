package net.drizzlehx.journalApp.controllers;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheck
{
    public String healthCheck()
    {
        return "OK";
    }
}
