package com.codehunter.ssl.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/codehunter")
public class GreetingsController {
    @RequestMapping(value = "/greet", method = RequestMethod.GET)
    public ResponseEntity<?> registerUser() {
        return new ResponseEntity<>("Hello World", HttpStatus.OK);
    }

}
