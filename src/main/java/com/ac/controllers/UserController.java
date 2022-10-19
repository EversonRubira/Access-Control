package com.ac.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController    {
    
    @GetMapping("/users/v1/")
    public String create(Object o) {
        return "Creating user...";             
    }

    

    //localhost:8080/pong/Everson
}
git add