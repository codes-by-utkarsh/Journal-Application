package net.drizzlehx.journalApp.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.NoHandlerFoundException;

@RestController
@ControllerAdvice
public class GlobalErrorHandler {

    @RequestMapping("/error")
    public ResponseEntity<String> error() {
        // Standard response for explicitly hitting /error
        return ResponseEntity.status(HttpStatus.NOT_FOUND)
                .body("Sample error endpoint");
    }

    @ExceptionHandler(NoHandlerFoundException.class)
    public ResponseEntity<String> handleNotFound(NoHandlerFoundException ex) {
        // Any unmapped path will land here
        return ResponseEntity.status(HttpStatus.NOT_FOUND)
                .body("Sample error endpoint");
    }
}

