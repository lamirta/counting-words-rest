package com.example.countingwordsrest.controllers;

import com.example.countingwordsrest.services.WordFrequencyAnalyzerService;
import com.example.countingwordsrest.utils.WordFrequency;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class WordFrequencyClassController {

    @Autowired
    WordFrequencyAnalyzerService wfaService;


    @GetMapping("/")
    public String message() {
        return "This is my Counting Words Assessment with REST interface :)";
    }

    @PostMapping("/highestFrequency")
    public ResponseEntity<Object> calculateHighestFrequency(@RequestBody String text) {
        try {
            return ResponseEntity.ok(wfaService.calculateHighestFrequency(text));
        } catch (Exception ex) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Bad Request Error: wrong input");
        }
    }


    @PostMapping("/frequencyForWord")
    public int calculateFrequencyForWord(@RequestBody String text, String word) {

        return wfaService.calculateFrequencyForWord(text, word);

        //        return null; throw exception, bad request? // record not found exceptions
    }


    @PostMapping("/mostFrequentNWords")
    public List<WordFrequency> calculateMostFrequentNWords(@RequestBody String text, int n) {

        return wfaService.calculateMostFrequentNWords(text, n);

//        return null; throw exception, bad request?
    }



}


// Example from other REST project, for reference to self:
//    public ResponseEntity<UserDto> getUserByUsername(@PathVariable("username") String username) {
//        UserDto udto = service.getUserByUsername(username);
//        return ResponseEntity.ok().body(udto);
//    }
